/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.tuctuc.telas;

import br.com.tuctuc.appdesktop.Main;
import br.tuctuc.conexaoBancoDeDados.BD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emerson51706716
 */
public class TelaUsuario extends javax.swing.JInternalFrame {

    private Main parent;
    private Object servico;
    private Object pagamento;
    
    public TelaUsuario(Main parent) {
        this.parent = parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbxServico = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbxValor = new javax.swing.JTextField();
        cbxMotorista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxVeiculo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxFormaPagamento = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Realizadas = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelahistoricoRel = new javax.swing.JTable();
        carregarDadosRel = new javax.swing.JToggleButton();
        excluirDadosRel = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelahistoricoCan = new javax.swing.JTable();
        carregarDadosCan = new javax.swing.JToggleButton();
        excluirDadosCan = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("Editar Cadastro");

        jButton2.setBackground(new java.awt.Color(204, 51, 0));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("Cancelar servico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Servico");

        cbxServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxServico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbxServicoFocusGained(evt);
            }
        });

        jLabel1.setText("Valor");

        jLabel2.setText("Motorista");

        jLabel3.setText("Veiculo");

        jButton3.setBackground(new java.awt.Color(0, 255, 51));
        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setText("Iniciar servico");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Forma de Pagamento");

        cbxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", " " }));
        cbxFormaPagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbxFormaPagamentoFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxServico, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(cbxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(220, 220, 220)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(cbxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(50, 50, 50)
                        .addComponent(jButton2))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxServico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("SERVIÇO", jPanel1);

        tabelahistoricoRel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo de Serviço", "Preço", "Data", "Horário Inicial", "Horário Final"
            }
        ));
        jScrollPane1.setViewportView(tabelahistoricoRel);

        carregarDadosRel.setBackground(new java.awt.Color(0, 255, 51));
        carregarDadosRel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        carregarDadosRel.setText("CARREGA DADOS");
        carregarDadosRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarDadosRelActionPerformed(evt);
            }
        });

        excluirDadosRel.setBackground(new java.awt.Color(204, 51, 0));
        excluirDadosRel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        excluirDadosRel.setText("ESCLUIR DADOS");
        excluirDadosRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirDadosRelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(carregarDadosRel)
                        .addGap(43, 43, 43)
                        .addComponent(excluirDadosRel)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carregarDadosRel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirDadosRel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Realizadas.addTab("Realizadas", jPanel4);

        tabelahistoricoCan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo de Serviço", "Data", "Horário Inicial", "Horário Final"
            }
        ));
        jScrollPane2.setViewportView(tabelahistoricoCan);

        carregarDadosCan.setBackground(new java.awt.Color(0, 255, 51));
        carregarDadosCan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        carregarDadosCan.setText("CARREGA DADOS");
        carregarDadosCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarDadosCanActionPerformed(evt);
            }
        });

        excluirDadosCan.setBackground(new java.awt.Color(204, 51, 0));
        excluirDadosCan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        excluirDadosCan.setText("ESCLUIR DADOS");
        excluirDadosCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirDadosCanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carregarDadosCan)
                .addGap(39, 39, 39)
                .addComponent(excluirDadosCan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(carregarDadosCan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirDadosCan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 613, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Realizadas.addTab("Canceladas", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Realizadas))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Realizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("HISTÓRICO", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // Conectar ao banco de dados
    BD banco = new BD();
    boolean resultado = banco.conectaBD();
    if (resultado) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Consulta do ID do Serviço no banco de dados
            String servico = (String) this.cbxServico.getSelectedItem();
            String query = "SELECT id_servico FROM servico WHERE tipo LIKE ?;";            
            ps = banco.getPreparedStatement(query);
            ps.setString(1, "%" + servico + "%");
           
            /*
            // trazer valor
            query = "SELECT valor_servico FROM servico WHERE id_servico LIKE ?;";            
            ps = banco.getPreparedStatement(query);
            ps.setString(1, "%" + servico + "%");
*/
            // Armazenando o ID do Serviço
            rs = ps.executeQuery();
            if (rs.next()) {query = "INSERT INTO servico_inicializados(id_svinicializados, id_servico, id_colaborador, id_veiculo, id_pagamento) VALUES (?, ?, ?, ?, ?);";
                ps = banco.getPreparedStatement(query);
                
                int gerarNovoIdSvinicializados = 0;

               
                ps.setInt(1,gerarNovoIdSvinicializados);

                String valorTexto = cbxValor.getText().replace(',', '.');
                if (valorTexto.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, insira um valor.");
                    return; // Encerra o método se o valor estiver vazio
                }
                ps.setFloat(2, Float.parseFloat(valorTexto));
                ps.setInt(3, rs.getInt("id_colaborador"));
                int idMotorista = 0;
                
                ps.setInt(4, idMotorista); // Usa o ID do motorista armazenado

                ps.execute();
                JOptionPane.showMessageDialog(this, "Serviço inserido");
            } else {
                JOptionPane.showMessageDialog(this, "Serviço não encontrado.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Houve um erro ao salvar os Dados. " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /* int linhaSelecionada = this.tabelaUsuario.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Favor selecionar um registro para excluir!");
            return;
        }
        String idUsuario
                = (String) this.tabelaUsuario.getValueAt(linhaSelecionada, 0);

        int opcao = JOptionPane.showConfirmDialog(this,
                "Deseja realmente excluir o ID " + idUsuario + "?",
                "Excluir", JOptionPane.OK_CANCEL_OPTION);

        if (opcao == 0) {
            //1 - excluir o registro da base de dados
            //conectar no banco de dados
            //getPreparedStatement
            //executa a query (DELETE)
            //fecha a conexao

            //2 - realizar uma consulta SELECT
            //conectar no banco de dados
            //getPreparedStatement
            //executa a query (SELECT)
            //pegar os novos dados e atualizar a JTable
            //fecha a conexao
            JOptionPane.showMessageDialog(this,
                    "Registro excluido!");
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void excluirDadosRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirDadosRelActionPerformed
        //EXCLUI DADOS - HISTÓRICO DE SERVIÇO REALIZADOS
        int linhaSelecionada = this.tabelahistoricoRel.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showConfirmDialog(this, "Por favor selecionar um registro para excluir!");
            return;
        }
        String idUsuario = (String) this.tabelahistoricoRel.getValueAt(linhaSelecionada, 0);
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o ID" + idUsuario + "?", "Excluir", JOptionPane.OK_CANCEL_OPTION);
        if (opcao == 0) {
            BD banco = new BD();
            boolean resultado = banco.conectaBD();
            if (resultado == true) {
                //String query = "SELECT * FROM usuario WHERE id = ?";
                String query = "DELETE FROM servico WHERE id_servico = (SELECT id_servico FROM servico WHERE id_cliente = 1);"
                        + "DELETE FROM servico WHERE id_cliente = 1;";

                PreparedStatement ps = banco.getPreparedStatement(query);
                try {
                    //ps.setString(1, '%'+this.jTextField5.getText()+'%');
                    // Executar a consulta
                    ResultSet rs = ps.executeQuery();

                    DefaultTableModel model = (DefaultTableModel) this.tabelahistoricoRel.getModel();
                    if (model.getRowCount() > 0) {
                        model.setNumRows(0);
                    }

                    // Processar os resultados
                    while (rs.next()) {
                        String[] dados = {rs.getString("id_servico"),
                            rs.getString("id"),
                            rs.getString("tipo"),
                            String.valueOf(rs.getFloat("preco")),
                            rs.getDate("data").toString(),
                            rs.getString("horario_inicial"),
                            rs.getString("horario_fim")};

                        model.addRow(dados);

                        /*this.jTextArea1.append(rs.getString("nome") + "  |  " + 
                                            rs.getDate("data_nascimento").toString() + "  |  " +
                                            rs.getString("endereco") + "  |  " + 
                                            rs.getString("cpf") + "\n");;;;*/
                    } //fim WHILE
                    this.tabelahistoricoRel.setModel(model);
                    rs.close();
                    ps.close();
                    banco.encerrarConexao();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Registro excluido");
                }
            }
        }
    }//GEN-LAST:event_excluirDadosRelActionPerformed

    private void carregarDadosRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarDadosRelActionPerformed
        //CONECTA AO BANCO DE DADOS - HISTÓRICO DE SERVIÇO REALIZADOS
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {
            //String query = "SELECT * FROM usuario WHERE id = ?";
            String query = "SELECT id_servico, id, tipo, preco, data, horario_inicial, horario_fim FROM servico";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {
                //ps.setInt(1, 1);
                // Executar a consulta
                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.tabelahistoricoRel.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("id_servico"),
                        rs.getString("id"),
                        rs.getString("tipo"),
                        String.valueOf(rs.getFloat("preco")),
                        rs.getDate("data").toString(),
                        rs.getString("horario_inicial"),
                        rs.getString("horario_fim")};

                    model.addRow(dados);

                    /*this.jTextArea1.append(rs.getString("nome") + "  |  " + 
                                            rs.getDate("data_nascimento").toString() + "  |  " +
                                            rs.getString("endereco") + "  |  " + 
                                            rs.getString("cpf") + "\n");;;;*/
                } //fim WHILE
                this.tabelahistoricoRel.setModel(model);
                rs.close();
                ps.close();
                banco.encerrarConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Não foi possível realizar a consulta no BD. Erro: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Se esse erro apareceyu, e pq nada para pesquisar, ou deu erro: ");
        }
    }//GEN-LAST:event_carregarDadosRelActionPerformed

    private void carregarDadosCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarDadosCanActionPerformed
        //CONECTA AO BANCO DE DADOS - HISTÓRICO DE SERVIÇO CANCELADOS
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {
            //String query = "SELECT * FROM usuario WHERE id = ?";
            String query = "SELECT id_servico, id, tipo, data, horario_inicial, horario_fim FROM servico";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {
                //ps.setInt(1, 1);
                // Executar a consulta
                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.carregarDadosCan.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("id_servico"),
                        rs.getString("id"),
                        rs.getString("tipo"),
                        rs.getDate("data").toString(),
                        rs.getString("horario_inicial"),
                        rs.getString("horario_fim")};

                    model.addRow(dados);

                    /*this.jTextArea1.append(rs.getString("nome") + "  |  " + 
                                            rs.getDate("data_nascimento").toString() + "  |  " +
                                            rs.getString("endereco") + "  |  " + 
                                            rs.getString("cpf") + "\n");;;;*/
                } //fim WHILE
                this.carregarDadosCan.setModel((ButtonModel) model);
                rs.close();
                ps.close();
                banco.encerrarConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Não foi possível realizar a consulta no BD. Erro: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Se esse erro apareceyu, e pq nada para pesquisar, ou deu erro: ");
        }
    }//GEN-LAST:event_carregarDadosCanActionPerformed

    private void excluirDadosCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirDadosCanActionPerformed
        //EXCLUI DADOS - HISTÓRICO DE SERVIÇO CANCELADOS
        int linhaSelecionada = this.tabelahistoricoCan.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showConfirmDialog(this, "Por favor selecionar um registro para excluir!");
            return;
        }
        String idUsuario = (String) this.tabelahistoricoCan.getValueAt(linhaSelecionada, 0);
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o ID" + idUsuario + "?", "Excluir", JOptionPane.OK_CANCEL_OPTION);
        if (opcao == 0) {
            BD banco = new BD();
            boolean resultado = banco.conectaBD();
            if (resultado == true) {
                //String query = "SELECT * FROM usuario WHERE id = ?";
                String query = "DELETE FROM servico WHERE id_servico = (SELECT id_servico FROM servico WHERE id_cliente = 1);"
                        + "DELETE FROM servico WHERE id_cliente = 1;";

                PreparedStatement ps = banco.getPreparedStatement(query);
                try {
                    //ps.setString(1, '%'+this.jTextField5.getText()+'%');
                    // Executar a consulta
                    ResultSet rs = ps.executeQuery();

                    DefaultTableModel model = (DefaultTableModel) this.tabelahistoricoCan.getModel();
                    if (model.getRowCount() > 0) {
                        model.setNumRows(0);
                    }

                    // Processar os resultados
                    while (rs.next()) {
                        String[] dados = {rs.getString("id_servico"),
                            rs.getString("id"),
                            rs.getString("tipo"),
                            rs.getDate("data").toString(),
                            rs.getString("horario_inicial"),
                            rs.getString("horario_fim")};

                        model.addRow(dados);

                        /*this.jTextArea1.append(rs.getString("nome") + "  |  " + 
                                            rs.getDate("data_nascimento").toString() + "  |  " +
                                            rs.getString("endereco") + "  |  " + 
                                            rs.getString("cpf") + "\n");;;;*/
                    } //fim WHILE
                    this.tabelahistoricoCan.setModel(model);
                    rs.close();
                    ps.close();
                    banco.encerrarConexao();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Registro excluido");
                }
            }
        }
    }//GEN-LAST:event_excluirDadosCanActionPerformed

    private void cbxServicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxServicoFocusGained
        BD banco = new BD();
        boolean resultado = banco.conectaBD();

        if (resultado == true) {

            String query = "SELECT tipo FROM servico;";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {
                ResultSet rs = ps.executeQuery();

                cbxServico.removeAllItems(); // Limpa itens existentes

                while (rs.next()) {
                    cbxServico.addItem(rs.getString("tipo")); // Adiciona cada serviço à ComboBox
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Erro ao carregar serviços: " + ex.getMessage());
            } finally {
                banco.encerrarConexao(); // Garante que a conexão é fechada
            }
        } else {
            JOptionPane.showMessageDialog(this, "Serviço indisponível");
        }


    }//GEN-LAST:event_cbxServicoFocusGained

    private void cbxFormaPagamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxFormaPagamentoFocusGained
        BD banco = new BD();
        boolean resultado = banco.conectaBD();

        if (resultado == true) {

            String query = "SELECT nome FROM pagamento;";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {
                ResultSet rs = ps.executeQuery();

                cbxFormaPagamento.removeAllItems(); // Limpa itens existentes

                while (rs.next()) {
                    cbxFormaPagamento.addItem(rs.getString("nome")); // Adiciona cada serviço à ComboBox
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Erro ao carregar serviços: " + ex.getMessage());
            } finally {
                banco.encerrarConexao(); // Garante que a conexão é fechada
            }
        } else {
            JOptionPane.showMessageDialog(this, "Serviço indisponível");
        }


    }//GEN-LAST:event_cbxFormaPagamentoFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Realizadas;
    private javax.swing.JToggleButton carregarDadosCan;
    private javax.swing.JToggleButton carregarDadosRel;
    private javax.swing.JComboBox<String> cbxFormaPagamento;
    private javax.swing.JTextField cbxMotorista;
    private javax.swing.JComboBox<String> cbxServico;
    private javax.swing.JTextField cbxValor;
    private javax.swing.JTextField cbxVeiculo;
    private javax.swing.JToggleButton excluirDadosCan;
    private javax.swing.JToggleButton excluirDadosRel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelahistoricoCan;
    private javax.swing.JTable tabelahistoricoRel;
    // End of variables declaration//GEN-END:variables

    // classes complementares

    
    
}
