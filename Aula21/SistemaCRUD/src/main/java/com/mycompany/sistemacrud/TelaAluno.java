package com.mycompany.sistemacrud;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TelaAluno extends JFrame {

    private AlunoDAO dao = new AlunoDAO();

    private JTextField txtId = new JTextField();
    private JTextField txtNome = new JTextField();
    private JTextField txtEmail = new JTextField();

    private JButton btnSalvar = new JButton("Salvar");
    private JButton btnAtualizar = new JButton("Atualizar");
    private JButton btnExcluir = new JButton("Excluir");
    private JButton btnLimpar = new JButton("Limpar");

    private DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Id", "Nome", "Email"}, 0);
    private JTable jTableDados = new JTable(modelo);

    public TelaAluno() {
        setTitle("Cadastro de Alunos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Campos
        JPanel campos = new JPanel(new GridLayout(3, 2));
        campos.add(new JLabel("Id:"));
        campos.add(txtId);
        campos.add(new JLabel("Nome:"));
        campos.add(txtNome);
        campos.add(new JLabel("Email:"));
        campos.add(txtEmail);
        txtId.setEditable(false);

        // Botões
        JPanel botoes = new JPanel(new GridLayout(1, 4));
        botoes.add(btnSalvar);
        botoes.add(btnAtualizar);
        botoes.add(btnExcluir);
        botoes.add(btnLimpar);

        JPanel topo = new JPanel(new BorderLayout());
        topo.add(campos, BorderLayout.CENTER);
        topo.add(botoes, BorderLayout.SOUTH);

        add(topo, BorderLayout.NORTH);
        add(new JScrollPane(jTableDados), BorderLayout.CENTER);

        // Ações dos botões
        btnSalvar.addActionListener(e -> salvar());
        btnAtualizar.addActionListener(e -> atualizar());
        btnExcluir.addActionListener(e -> excluir());
        btnLimpar.addActionListener(e -> limpar());

        // Clique em uma linha da tabela preenche os campos
        jTableDados.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                preencherCampos();
            }
        });

        setSize(500, 350);
        setLocationRelativeTo(null);
        listar();
    }

    // READ: mostra todos os alunos na tabela
    private void listar() {
        try {
            modelo.setRowCount(0);
            List<Object[]> alunos = dao.listar();
            for (Object[] linha : alunos) {
                modelo.addRow(linha);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao listar: " + e.getMessage());
        }
    }

    // Copia a linha clicada para os campos
    private void preencherCampos() {
        int linha = jTableDados.getSelectedRow();
        if (linha == -1) {
            return;
        }
        txtId.setText(modelo.getValueAt(linha, 0).toString());
        txtNome.setText(modelo.getValueAt(linha, 1).toString());
        txtEmail.setText(modelo.getValueAt(linha, 2).toString());
    }

    // CREATE
    private void salvar() {
        String nome = txtNome.getText();
        String email = txtEmail.getText();

        if (nome.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha nome e email.");
            return;
        }

        try {
            dao.inserir(nome, email);
            JOptionPane.showMessageDialog(this, "Aluno salvo!");
            limpar();
            listar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage());
        }
    }

    // UPDATE
    private void atualizar() {
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Clique em um aluno na tabela primeiro.");
            return;
        }

        String nome = txtNome.getText();
        String email = txtEmail.getText();

        try {
            dao.atualizar(Integer.parseInt(txtId.getText()), nome, email);
            JOptionPane.showMessageDialog(this, "Aluno atualizado!");
            limpar();
            listar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar: " + e.getMessage());
        }
    }

    // DELETE
    private void excluir() {
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Clique em um aluno na tabela primeiro.");
            return;
        }

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir este aluno?");
        if (resposta != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            dao.excluir(Integer.parseInt(txtId.getText()));
            JOptionPane.showMessageDialog(this, "Aluno excluído!");
            limpar();
            listar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
        }
    }

    // LIMPAR: esvazia os campos e desmarca a tabela
    private void limpar() {
        txtId.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        jTableDados.clearSelection();
    }
}
