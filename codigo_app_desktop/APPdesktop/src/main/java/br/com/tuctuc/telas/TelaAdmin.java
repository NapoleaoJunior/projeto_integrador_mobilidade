/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.tuctuc.telas;

import br.com.tuctuc.appdesktop.Main;
import br.tuctuc.conexaoBancoDeDados.BD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaAdmin extends javax.swing.JInternalFrame {

    private Main parent;

    public TelaAdmin(Main parent) {
        this.parent = parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        UserPesquisa = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaViagensRealizadas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        ExcluirDados1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaViagensCanceladas = new javax.swing.JTable();
        jButton19 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        ExclirDados3 = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        UsercampoCpfConsulta = new javax.swing.JFormattedTextField();
        Servico = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoNomeServico = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoValor = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoNomeMotorista = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        campoStatusColaborador = new javax.swing.JTextField();
        CadastrarSv = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaServicoAtivo = new javax.swing.JTable();
        butSvAtCarregarDados = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaServicoPausasdos = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TabelaPagamento = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        Ativos = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TabelaColaboradoresAtivos = new javax.swing.JTable();
        CarregarDadosCol = new javax.swing.JButton();
        EditarCol = new javax.swing.JButton();
        DeletarCola = new javax.swing.JButton();
        Inativos = new javax.swing.JPanel();
        ColabCanButCarragaDados = new javax.swing.JButton();
        DeletarCola1 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        TabelaCanceladaColaborador = new javax.swing.JTable();
        Financeiro = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TabelaComissaoColaborador = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        CadastrarColab = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Administrador");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Buscar usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("CPF");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Dados");

        UserPesquisa.setBackground(new java.awt.Color(0, 255, 51));
        UserPesquisa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UserPesquisa.setText("Pesquisar");
        UserPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserPesquisaActionPerformed(evt);
            }
        });

        jTabbedPane2.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), java.awt.Color.white));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        TabelaViagensRealizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Data", "Tipo", "Valor", "Horario"
            }
        ));
        jScrollPane1.setViewportView(TabelaViagensRealizadas);

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Carregar Dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ExcluirDados1.setBackground(new java.awt.Color(204, 51, 0));
        ExcluirDados1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ExcluirDados1.setText("Deletar");
        ExcluirDados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirDados1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(31, 31, 31)
                        .addComponent(ExcluirDados1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExcluirDados1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Viagens realizadas", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        TabelaViagensCanceladas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Motorista", "Data", "Motivo-status"
            }
        ));
        jScrollPane2.setViewportView(TabelaViagensCanceladas);

        jButton19.setBackground(new java.awt.Color(0, 204, 102));
        jButton19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton19.setText("Carregar Dados");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton19)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Viagens canceladas", jPanel6);

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "CPF", "Situacao"
            }
        ));
        jScrollPane9.setViewportView(tabelaUsuario);

        jButton15.setBackground(new java.awt.Color(0, 255, 51));
        jButton15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton15.setText("CARREGAR DADOS");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        ExclirDados3.setBackground(new java.awt.Color(204, 51, 0));
        ExclirDados3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ExclirDados3.setText("Excluir Dados");
        ExclirDados3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExclirDados3ActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(255, 255, 0));
        editar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        editar.setText("EDITAR");
        editar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton15)
                .addGap(39, 39, 39)
                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(ExclirDados3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExclirDados3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addContainerGap(66, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Usuarios ", jPanel13);

        jButton2.setBackground(new java.awt.Color(0, 204, 102));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("EDITAR");

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setText("BLOQUEAR");

        jButton4.setBackground(new java.awt.Color(204, 51, 0));
        jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton4.setText("DELETAR");

        jButton13.setBackground(new java.awt.Color(0, 255, 51));
        jButton13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton13.setText("CADASTRAR");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        try {
            UsercampoCpfConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        UsercampoCpfConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsercampoCpfConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGap(132, 132, 132))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(419, 419, 419)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(UsercampoCpfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(UserPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jButton3)
                        .addGap(66, 66, 66)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UsercampoCpfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserPesquisa)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Usuarios", jPanel2);

        Servico.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Cadastrar Serviços");

        jLabel9.setText("Nome Serviço");

        jLabel10.setText("Valor");

        campoValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Colaborador responsavel pelo percuso");

        jLabel12.setText("Nome Motorista");

        campoNomeMotorista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        campoNomeMotorista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNomeMotoristaFocusGained(evt);
            }
        });
        campoNomeMotorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoNomeMotoristaMouseClicked(evt);
            }
        });

        jLabel13.setText("Status do Colaborador");

        CadastrarSv.setBackground(new java.awt.Color(0, 255, 51));
        CadastrarSv.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CadastrarSv.setText("Cadastrar");
        CadastrarSv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarSvActionPerformed(evt);
            }
        });

        jTabbedPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.white));

        TabelaServicoAtivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome"
            }
        ));
        jScrollPane3.setViewportView(TabelaServicoAtivo);

        butSvAtCarregarDados.setBackground(new java.awt.Color(0, 255, 51));
        butSvAtCarregarDados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        butSvAtCarregarDados.setText("Carregar dados");
        butSvAtCarregarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSvAtCarregarDadosActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 0));
        jButton11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton11.setText("Editar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 153, 51));
        jButton12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton12.setText("Bloquear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(butSvAtCarregarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1203, 1203, 1203))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSvAtCarregarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane3.addTab("Ativos", jPanel7);

        TabelaServicoPausasdos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "Nome"
            }
        ));
        jScrollPane4.setViewportView(TabelaServicoPausasdos);

        jButton8.setBackground(new java.awt.Color(0, 255, 51));
        jButton8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton8.setText("Carregar dados");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 0));
        jButton9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton9.setText("Editar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 153, 51));
        jButton10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton10.setText("Desbloquear");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(29, 29, 29)
                        .addComponent(jButton9)
                        .addGap(48, 48, 48)
                        .addComponent(jButton10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Pausados", jPanel8);

        jButton7.setBackground(new java.awt.Color(0, 255, 51));
        jButton7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServicoLayout = new javax.swing.GroupLayout(Servico);
        Servico.setLayout(ServicoLayout);
        ServicoLayout.setHorizontalGroup(
            ServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(ServicoLayout.createSequentialGroup()
                        .addGroup(ServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(ServicoLayout.createSequentialGroup()
                                .addGroup(ServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ServicoLayout.createSequentialGroup()
                                        .addComponent(campoNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7))))
                            .addComponent(jLabel11)
                            .addGroup(ServicoLayout.createSequentialGroup()
                                .addGroup(ServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ServicoLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNomeMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CadastrarSv, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoStatusColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 289, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ServicoLayout.setVerticalGroup(
            ServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(ServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoNomeMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(campoStatusColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(CadastrarSv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane3)
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Servicos", Servico);

        jPanel1.setLayout(null);

        TabelaPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Credito", "Debito", "Pix", "desconto"
            }
        ));
        jScrollPane11.setViewportView(TabelaPagamento);

        jButton17.setBackground(new java.awt.Color(0, 255, 51));
        jButton17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton17.setText("Carregar Dados");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jButton17)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel14);
        jPanel14.setBounds(6, 6, 937, 526);

        jTabbedPane1.addTab("Pagamento", jPanel1);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Buscar informações");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setText("CPF");

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton6.setBackground(new java.awt.Color(0, 255, 51));
        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setText("Pesquisar");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Dados do colaborador");

        jLabel17.setText("Nome");

        jLabel18.setText("CNH");

        jLabel19.setText("Data de Vencimento");

        jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel20.setText("Data de início contrato");

        try {
            jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel21.setText("Data fim do contrato");

        try {
            jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTabbedPane4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jTabbedPane4.setForeground(new java.awt.Color(153, 153, 153));

        Ativos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        TabelaColaboradoresAtivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome completo", "Data Fim Contrato", "situacao"
            }
        ));
        jScrollPane5.setViewportView(TabelaColaboradoresAtivos);

        CarregarDadosCol.setBackground(new java.awt.Color(0, 204, 51));
        CarregarDadosCol.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CarregarDadosCol.setText("Atualizar lista");
        CarregarDadosCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarDadosColActionPerformed(evt);
            }
        });

        EditarCol.setBackground(new java.awt.Color(255, 255, 0));
        EditarCol.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        EditarCol.setText("Editar");
        EditarCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarColActionPerformed(evt);
            }
        });

        DeletarCola.setBackground(new java.awt.Color(255, 153, 51));
        DeletarCola.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DeletarCola.setText("Bloquear");
        DeletarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarColaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AtivosLayout = new javax.swing.GroupLayout(Ativos);
        Ativos.setLayout(AtivosLayout);
        AtivosLayout.setHorizontalGroup(
            AtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtivosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                    .addGroup(AtivosLayout.createSequentialGroup()
                        .addComponent(CarregarDadosCol)
                        .addGap(18, 18, 18)
                        .addComponent(EditarCol, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(DeletarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AtivosLayout.setVerticalGroup(
            AtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AtivosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarregarDadosCol)
                    .addComponent(EditarCol)
                    .addComponent(DeletarCola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane4.addTab("Ativos", Ativos);

        ColabCanButCarragaDados.setBackground(new java.awt.Color(0, 204, 51));
        ColabCanButCarragaDados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ColabCanButCarragaDados.setText("Carregar Dados");
        ColabCanButCarragaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColabCanButCarragaDadosActionPerformed(evt);
            }
        });

        DeletarCola1.setBackground(new java.awt.Color(255, 153, 51));
        DeletarCola1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DeletarCola1.setText("Desbloquear");
        DeletarCola1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarCola1ActionPerformed(evt);
            }
        });

        TabelaCanceladaColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nome completo"
            }
        ));
        jScrollPane7.setViewportView(TabelaCanceladaColaborador);

        javax.swing.GroupLayout InativosLayout = new javax.swing.GroupLayout(Inativos);
        Inativos.setLayout(InativosLayout);
        InativosLayout.setHorizontalGroup(
            InativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InativosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InativosLayout.createSequentialGroup()
                        .addComponent(ColabCanButCarragaDados)
                        .addGap(18, 18, 18)
                        .addComponent(DeletarCola1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE))
                .addContainerGap())
        );
        InativosLayout.setVerticalGroup(
            InativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InativosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColabCanButCarragaDados)
                    .addComponent(DeletarCola1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Inativos", Inativos);

        TabelaComissaoColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Valor da corrida ", "Porcetagem de 80% da corrida"
            }
        ));
        jScrollPane8.setViewportView(TabelaComissaoColaborador);

        jButton16.setBackground(new java.awt.Color(0, 204, 51));
        jButton16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton16.setText("Carregar Dados");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FinanceiroLayout = new javax.swing.GroupLayout(Financeiro);
        Financeiro.setLayout(FinanceiroLayout);
        FinanceiroLayout.setHorizontalGroup(
            FinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinanceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                    .addGroup(FinanceiroLayout.createSequentialGroup()
                        .addComponent(jButton16)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FinanceiroLayout.setVerticalGroup(
            FinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FinanceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Valores a receber", Financeiro);

        CadastrarColab.setBackground(new java.awt.Color(0, 204, 102));
        CadastrarColab.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CadastrarColab.setText("Cadastrar");
        CadastrarColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarColabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton6)
                                .addGap(283, 283, 283)
                                .addComponent(jLabel20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(456, 456, 456)
                                .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(272, 272, 272)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTabbedPane4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CadastrarColab, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastrarColab)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Colaboradores", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        int linhaSelecionada = this.tabelaUsuario.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Favor selecionar um registro para editar!");
            return;
        }

        // Supondo que a tabela tenha uma coluna 'id_cliente' para identificar unicamente o cliente
        String idCliente = (String) this.tabelaUsuario.getValueAt(linhaSelecionada, 0); // Ajuste o índice de coluna conforme necessário
        CompletarCadCli editar = new CompletarCadCli(Integer.parseInt(idCliente));
        this.parent.getDesktopPane().add(editar);
        editar.setVisible(true);

    }//GEN-LAST:event_editarActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        PreCadastro1 preCadastro1 = new PreCadastro1();
        preCadastro1.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void CadastrarSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarSvActionPerformed
        // salvar dados
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado) {
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                String motorista = (String) this.campoNomeMotorista.getSelectedItem();

                //Consulta do ID do motorista no banco de dados
                String query = "SELECT id_colaborador, nome FROM colaborador WHERE nome like ?;";
                ps = banco.getPreparedStatement(query);
                ps.setString(1, "%" + motorista + "%");

                // Armazenando o ID do motorista
                rs = ps.executeQuery();
                rs.next();

                query = "INSERT INTO servico(tipo,valor_servico,id_colaborador, status)VALUES (?,?,?, 'Ativo');";
                ps = banco.getPreparedStatement(query);

                ps.setString(1, campoNomeServico.getText());
                ps.setFloat(2, Float.parseFloat(campoValor.getText().replace(',', '.')));
                ps.setInt(3, rs.getInt("id_colaborador"));
                ps.execute();
                JOptionPane.showMessageDialog(this, "Servico inserido");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Houve um erro ao salvar os Dados. " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_CadastrarSvActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {

            String query = "SELECT * FROM forma_pagamento;";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {

                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.TabelaPagamento.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("credito"),
                        rs.getString("debito"),
                        rs.getString("pix"),
                        rs.getString("desconto")};

                    model.addRow(dados);

                } //fim WHILE
                this.TabelaPagamento.setModel(model);
                rs.close();
                ps.close();
                banco.encerrarConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Não foi possível realizar a consulta no BD. Erro: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Se esse erro apareceu, e pq nada para pesquisar, ou deu erro: ");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {

            String query = "SELECT id_cliente, nome_completo, cpf, situacao FROM cliente";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {

                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.tabelaUsuario.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("id_cliente"),
                        rs.getString("nome_completo"),
                        rs.getString("cpf"),
                        rs.getString("situacao")};

                    model.addRow(dados);

                } //fim WHILE
                this.tabelaUsuario.setModel(model);
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


    }//GEN-LAST:event_jButton15ActionPerformed

    private void butSvAtCarregarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSvAtCarregarDadosActionPerformed
        //servico - ativos
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {
            String query = "SELECT id_servico, tipo FROM servico WHERE status = 'Ativo'; ";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {
                // Executar a consulta
                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.TabelaServicoAtivo.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }
                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("id_servico"),
                        rs.getString("tipo")};

                    model.addRow(dados);
                } //fim WHILE
                this.TabelaServicoAtivo.setModel(model);
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
    }//GEN-LAST:event_butSvAtCarregarDadosActionPerformed

    private void UserPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserPesquisaActionPerformed
        // pesquisa cliente
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {

            //String query = "SELECT * FROM usuario WHERE id = ?";
            String query = "select nome_completo, cpf, situacao from cliente where cpf like ?";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {
                String cpf = this.UsercampoCpfConsulta.getText();

                cpf = cpf.replace(".", "");
                cpf = cpf.replace("-", "");

                ps.setString(1, '%' + cpf + '%');
                // Executar a consulta
                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.tabelaUsuario.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {
                        rs.getString("nome_completo"),
                        rs.getString("cpf"),
                        rs.getString("situacao")
                    };

                    model.addRow(dados);

                } //fim WHILE
                this.tabelaUsuario.setModel(model);
                rs.close();
                ps.close();
                banco.encerrarConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Não foi possível realizar a consulta no BD. Erro: " + ex.getMessage());
            }

        } else {

        }

    }//GEN-LAST:event_UserPesquisaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // pesquisa servico

        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {

            //String query = "SELECT * FROM usuario WHERE id = ?";
            String query = "SELECT tipo, valor_servico FROM servico WHERE tipo LIKE ?";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {
                ps.setString(1, '%' + this.campoNomeServico.getText() + '%');
                // Executar a consulta
                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.TabelaServicoAtivo.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {
                        rs.getString("tipo"),
                        String.valueOf(rs.getFloat("valor_servico"))
                    };

                    model.addRow(dados);

                    /*  this.jTextArea1.append(rs.getString("nome") + "  |  " + 
                                        rs.getDate("data_nascimento").toString() + "  |  " +
                                        rs.getString("endereco") + "  |  " + 
                                        rs.getString("cpf") + "\n");*/
                } //fim WHILE
                this.TabelaServicoAtivo.setModel(model);
                rs.close();
                ps.close();
                banco.encerrarConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Não foi possível realizar a consulta no BD. Erro: " + ex.getMessage());
            }

        } else {

        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void UsercampoCpfConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsercampoCpfConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsercampoCpfConsultaActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {

            String query = "SELECT\n"
                    + "sv.id_veiculo,\n"
                    + "sv.data,\n"
                    + "sv.status\n"
                    + "FROM \n"
                    + "colaborador cb\n"
                    + "INNER JOIN veiculo vc ON vc.id_colaborador = cb.id_colaborador\n"
                    + "INNER JOIN servico sv ON sv.id_veiculo = vc.id_veiculo;";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {

                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.TabelaViagensCanceladas.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {String.valueOf(rs.getInt("sv.id_veiculo")),
                        rs.getString("sv.data"),
                        rs.getString("sv.status")};
                    model.addRow(dados);

                } //fim WHILE
                this.TabelaViagensCanceladas.setModel(model);
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
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Carregar dados
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {

            String query = "SELECT id_servico, data, tipo, valor_servico, horario_inicial FROM servico;";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {

                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.TabelaViagensRealizadas.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("id_servico"),
                        rs.getString("data"),
                        rs.getString("tipo"),
                        String.valueOf(rs.getFloat("valor_servico")),
                        rs.getString("horario_inicial")};
                    model.addRow(dados);

                } //fim WHILE
                this.TabelaViagensRealizadas.setModel(model);
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atualizaTabela() {
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {

            String query = "SELECT id_servico, data, tipo, valor_servico, horario_inicial FROM servico;";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {

                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.TabelaViagensRealizadas.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("id_servico"),
                        rs.getString("data"),
                        rs.getString("tipo"),
                        String.valueOf(rs.getFloat("valor_servico")),
                        rs.getString("horario_inicial")};
                    model.addRow(dados);

                } //fim WHILE
                this.TabelaViagensRealizadas.setModel(model);
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
    }


    private void ExcluirDados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirDados1ActionPerformed
        // Excluir dados
        int linhaSelecionada = this.TabelaViagensRealizadas.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Favor selecionar um registro para excluir!");
            return;
        }
        String idUsuario = (String) this.TabelaViagensRealizadas.getValueAt(linhaSelecionada, 0);
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o ID" + idUsuario + "?", "Excluir", JOptionPane.OK_CANCEL_OPTION);
        if (opcao == JOptionPane.OK_OPTION) {
            BD banco = new BD();
            boolean resultado = banco.conectaBD();
            if (resultado) {

                //////// exclui o registro do BD                
                String query = "DELETE FROM servico WHERE id_servico = ?;";
                try (PreparedStatement ps = banco.getPreparedStatement(query)) {
                    ps.setString(1, idUsuario);
                    int rowsAffected = ps.executeUpdate();
                    if (rowsAffected > 0) {
                        DefaultTableModel model = (DefaultTableModel) this.TabelaViagensRealizadas.getModel();
                        model.setRowCount(0); // Limpa a tabela
                        JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir registro: " + ex.getMessage());
                } finally {
                    banco.encerrarConexao();
                }
                /////////////////////////////

                //////// atualiza a tabela
                atualizaTabela();

                ///////////////////////////////
            }
        }
    }//GEN-LAST:event_ExcluirDados1ActionPerformed

    private void ExclirDados3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExclirDados3ActionPerformed
        int linhaSelecionada = this.tabelaUsuario.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showConfirmDialog(this, "Favar selecionar um registro para exclir!");
            return;
        }
        String idUsuario = (String) this.tabelaUsuario.getValueAt(linhaSelecionada, 0);
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o ID" + idUsuario + "?", "Excluir", JOptionPane.OK_CANCEL_OPTION);
        if (opcao == 0) {
            BD banco = new BD();
            boolean resultado = banco.conectaBD();
            if (resultado == true) {

                try {
                    String query = "DELETE FROM pagamento WHERE id_servico = ?";
                    PreparedStatement ps = banco.getPreparedStatement(query);
                    ps.setString(1, idUsuario);
                    ps.execute();

                    query = "DELETE FROM servico WHERE id_cliente = ?";
                    ps = banco.getPreparedStatement(query);
                    ps.setString(1, idUsuario);
                    ps.execute();

                    query = "DELETE FROM endereco WHERE id_cliente = ?";
                    ps = banco.getPreparedStatement(query);
                    ps.setString(1, idUsuario);
                    ps.execute();

                    query = "DELETE FROM cliente WHERE id_cliente = ?";
                    ps = banco.getPreparedStatement(query);
                    ps.setString(1, idUsuario);
                    ps.execute();

                    DefaultTableModel model = (DefaultTableModel) this.tabelaUsuario.getModel();
                    if (model.getRowCount() > 0) {
                        model.setNumRows(0);
                    }

                    //carregar dados apos a exclusao
                    query = "SELECT id_cliente, nome_completo, cpf, situacao FROM cliente";
                    ps = banco.getPreparedStatement(query);
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        String[] dados = {rs.getString("id_cliente"),
                            rs.getString("nome_completo"),
                            rs.getString("cpf"),
                            rs.getString("situacao")};

                        model.addRow(dados);
                    } //fim WHILE                    
                    this.tabelaUsuario.setModel(model);

                    rs.close();
                    ps.close();
                    banco.encerrarConexao();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Houve um erro ao excluir o registro! Erro " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_ExclirDados3ActionPerformed

    private void InserirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirDadosActionPerformed

    }//GEN-LAST:event_InserirDadosActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int linhaSelecionada = this.TabelaServicoAtivo.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showConfirmDialog(this, "Favar selecionar um registro para Bloquear!");
            return;
        }
        String idServico = (String) this.TabelaServicoAtivo.getValueAt(linhaSelecionada, 0);
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente Bloquear o ID" + idServico + "?", "Bloquear", JOptionPane.OK_CANCEL_OPTION);
        if (opcao == 0) {
            BD banco = new BD();
            boolean resultado = banco.conectaBD();
            if (resultado == true) {

                try {
                    String query = "UPDATE servico SET status = 'Bloqueado' WHERE id_servico = ?";
                    PreparedStatement ps = banco.getPreparedStatement(query);
                    ps.setString(1, idServico);
                    ps.execute();

                    query = "SELECT id_servico, tipo FROM servico WHERE status = 'Ativo'; ";
                    ps = banco.getPreparedStatement(query);
                    ResultSet rs = ps.executeQuery();

                    DefaultTableModel model = (DefaultTableModel) this.TabelaServicoAtivo.getModel();
                    if (model.getRowCount() > 0) {
                        model.setNumRows(0);
                    }

                    // Processar os resultados
                    while (rs.next()) {
                        String[] dados = {rs.getString("id_servico"),
                            String.valueOf(rs.getFloat("tipo"))};

                        model.addRow(dados);

                    } //fim WHILE
                    this.TabelaServicoAtivo.setModel(model);
                    rs.close();
                    ps.close();
                    banco.encerrarConexao();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Houve um erro ao excluir o registro! Erro " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int linhaSelecionada = this.TabelaServicoAtivo.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Favor selecionar um registro para editar!");
            return;
        }

        // Supondo que a tabela tenha uma coluna 'id_cliente' para identificar unicamente o cliente
        int idCliente = (Integer) this.TabelaServicoAtivo.getValueAt(linhaSelecionada, 0); // Ajuste o índice de coluna conforme necessário
        CompletarCadCli editar = new CompletarCadCli(idCliente);
        editar.setVisible(true);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void CadastrarColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarColabActionPerformed
        int linhaSelecionada = this.TabelaColaboradoresAtivos.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Favor selecionar um registro para editar!");
            return;
        }

        // Supondo que a tabela tenha uma coluna 'id_cliente' para identificar unicamente o cliente
        int idColaborador = (Integer) this.TabelaColaboradoresAtivos.getValueAt(linhaSelecionada, 0); // Ajuste o índice de coluna conforme necessário
        CompletarCadCola cadastrar = new CompletarCadCola(idColaborador);
        cadastrar.setVisible(true);

    }//GEN-LAST:event_CadastrarColabActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {

            String query = "SELECT valor_servico FROM servico;";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {

                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.TabelaComissaoColaborador.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("valor_servico")};
                    model.addRow(dados);

                } //fim WHILE
                this.TabelaComissaoColaborador.setModel(model);
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
    }//GEN-LAST:event_jButton16ActionPerformed

    private void ColabCanButCarragaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColabCanButCarragaDadosActionPerformed
       BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado) {
            String query = "SELECT id_colaborador AS id, nome AS nome FROM colaborador WHERE situacao = 'Bloqueado';"; 
            try {PreparedStatement ps = banco.getPreparedStatement(query);
                ResultSet rs = ps.executeQuery();
                DefaultTableModel model = (DefaultTableModel) this.TabelaCanceladaColaborador.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }
                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("id"),
                        rs.getString("nome")};
                    model.addRow(dados);
                } //fim WHILE
                this.TabelaCanceladaColaborador.setModel(model);
                rs.close();
                ps.close();
                banco.encerrarConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                        "Não foi possível realizar a consulta no BD. Erro: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Se esse erro apareceu, e porque nao tem nada para pesquisar, ou deu erro: ");
        }
    }//GEN-LAST:event_ColabCanButCarragaDadosActionPerformed

    private void CarregarDadosColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarDadosColActionPerformed

        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {

            String query = "SELECT cb.id_colaborador AS id, cb.nome AS nome, cb.data_fimcontrato AS data_fimcontrato, COUNT(sv.id_servico) AS realizadas FROM colaborador cb INNER JOIN veiculo vt ON vt.id_colaborador = cb.id_colaborador INNER JOIN servico sv ON sv.id_veiculo = vt.id_veiculo GROUP BY cb.id_colaborador, cb.nome, cb.data_fimcontrato;";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {

                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.TabelaColaboradoresAtivos.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("id"),
                        rs.getString("nome"),
                        rs.getString("data_fimcontrato"),
                        rs.getString("realizadas")};

                    model.addRow(dados);

                } //fim WHILE
                this.TabelaColaboradoresAtivos.setModel(model);
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
    }//GEN-LAST:event_CarregarDadosColActionPerformed

    private void EditarColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarColActionPerformed
        int linhaSelecionada = this.TabelaColaboradoresAtivos.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Favor selecionar um registro para editar!");
            return;
        }

        // Supondo que a tabela tenha uma coluna 'id_cliente' para identificar unicamente o cliente
        String idColaborador = (String) this.TabelaColaboradoresAtivos.getValueAt(linhaSelecionada, 0); // Ajuste o índice de coluna conforme necessário
        CompletarCadCola editar = new CompletarCadCola(Integer.parseInt(idColaborador));
        this.parent.getDesktopPane().add(editar);
        editar.setVisible(true);
    }//GEN-LAST:event_EditarColActionPerformed

    private void DeletarCola1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarCola1ActionPerformed
        // SELECIONANDO 
        int linhaSelecionada = this.TabelaCanceladaColaborador.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Favor selecionar um registro para editar!");
            return;
        }

        // Supondo que a tabela tenha uma coluna 'id_cliente' para identificar unicamente o cliente
        String idColaborador = (String) this.TabelaCanceladaColaborador.getValueAt(linhaSelecionada, 0); // Ajuste o índice de coluna conforme necessário

        // Conectar ao banco de dados
        BD banco = new BD();
        boolean resultado = banco.conectaBD();

        //String para Atualizar os dados
        try {
            // Realizar o update
            String query = "UPDATE colaborador SET situacao = 'Ativo' WHERE id_colaborador = " + idColaborador;
            PreparedStatement ps = banco.getPreparedStatement(query);
            ps.execute();
            ps.close();

            banco.encerrarConexao();

            JOptionPane.showMessageDialog(this, "Usuário Desbloqueado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar com Banco de dados. Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_DeletarCola1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {

            String query = "SELECT cb.id_colaborador AS id, cb.nome AS nome, cb.data_fimcontrato AS data_fimcontrato, COUNT(sv.id_servico) AS realizadas FROM colaborador cb INNER JOIN veiculo vt ON vt.id_colaborador = cb.id_colaborador INNER JOIN servico sv ON sv.id_veiculo = vt.id_veiculo GROUP BY cb.id_colaborador, cb.nome, cb.data_fimcontrato;";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {

                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.TabelaColaboradoresAtivos.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }

                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("id"),
                        rs.getString("nome"),
                        rs.getString("data_fimcontrato"),
                        rs.getString("realizadas")};

                    model.addRow(dados);

                } //fim WHILE
                this.TabelaColaboradoresAtivos.setModel(model);
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
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void campoNomeMotoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoNomeMotoristaMouseClicked

    }//GEN-LAST:event_campoNomeMotoristaMouseClicked

    private void campoNomeMotoristaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeMotoristaFocusGained
        // Conectar ao banco de dados
        BD banco = new BD();
        boolean resultado = banco.conectaBD();

        if (resultado == true) {

            String query = "SELECT nome FROM colaborador;";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {

                ResultSet rs = ps.executeQuery();

                campoNomeMotorista.removeAllItems();

                // Processar os resultados
                while (rs.next()) {

                    campoNomeMotorista.addItem(rs.getString("nome"));

                } //fim WHILE
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
    }//GEN-LAST:event_campoNomeMotoristaFocusGained

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //servico - ativos
        BD banco = new BD();
        boolean resultado = banco.conectaBD();
        if (resultado == true) {
            //String query = "SELECT * FROM usuario WHERE id = ?";
            String query = "SELECT id_servico, tipo FROM servico WHERE status = 'Bloqueado';";
            PreparedStatement ps = banco.getPreparedStatement(query);
            try {
                // Executar a consulta
                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) this.TabelaServicoPausasdos.getModel();
                if (model.getRowCount() > 0) {
                    model.setNumRows(0);
                }
                // Processar os resultados
                while (rs.next()) {
                    String[] dados = {rs.getString("id_servico"),
                        rs.getString("tipo")};
                    model.addRow(dados);
                } //fim WHILE
                this.TabelaServicoPausasdos.setModel(model);
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
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int linhaSelecionada = this.TabelaServicoPausasdos.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Favor selecionar um registro para editar!");
            return;
        }
        // Supondo que a tabela tenha uma coluna 'id_cliente' para identificar unicamente o cliente
        int idCliente = (Integer) this.TabelaServicoPausasdos.getValueAt(linhaSelecionada, 0); // Ajuste o índice de coluna conforme necessário
        CompletarCadCli editar = new CompletarCadCli(idCliente);
        editar.setVisible(true);

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int linhaSelecionada = this.TabelaServicoPausasdos.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showConfirmDialog(this, "Favor selecionar um registro para Desbloquear!");
            return;
        }
        String idServico = (String) this.TabelaServicoPausasdos.getValueAt(linhaSelecionada, 0);
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente Desbloquear o ID" + idServico + "?", "Bloquear", JOptionPane.OK_CANCEL_OPTION);
        if (opcao == 0) {
            BD banco = new BD();
            boolean resultado = banco.conectaBD();
            if (resultado == true) {

                try {
                    String query = "UPDATE servico SET status = 'Ativo' WHERE id_servico = ?";
                    PreparedStatement ps = banco.getPreparedStatement(query);
                    ps.setString(1, idServico);
                    ps.execute();

                    query = "SELECT id_servico, tipo FROM servico WHERE status = 'Bloqueado'; ";
                    ps = banco.getPreparedStatement(query);
                    ResultSet rs = ps.executeQuery();

                    DefaultTableModel model = (DefaultTableModel) this.TabelaServicoPausasdos.getModel();
                    if (model.getRowCount() > 0) {
                        model.setNumRows(0);
                    }

                    // Processar os resultados
                    while (rs.next()) {
                        String[] dados = {rs.getString("id_servico"),
                            String.valueOf(rs.getFloat("tipo"))};

                        model.addRow(dados);

                    } //fim WHILE
                    this.TabelaServicoPausasdos.setModel(model);
                    rs.close();
                    ps.close();
                    banco.encerrarConexao();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Houve um erro ao excluir o registro! Erro " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed


    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
           int linhaSelecionada = this.TabelaPagamento.getSelectedRow();
    }

    private void campoNomeMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeMotoristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeMotoristaActionPerformed

    private void DeletarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarColaActionPerformed
        // SELECIONANDO 
        int linhaSelecionada = this.TabelaColaboradoresAtivos.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Favor selecionar um registro para editar!");
            return;
        }

        // Supondo que a tabela tenha uma coluna 'id_cliente' para identificar unicamente o cliente
        String idColaborador = (String) this.TabelaColaboradoresAtivos.getValueAt(linhaSelecionada, 0); // Ajuste o índice de coluna conforme necessário

        // Conectar ao banco de dados
        BD banco = new BD();
        boolean resultado = banco.conectaBD();

        //String para Atualizar os dados
        try {
            // Realizar o update
            String query = "UPDATE colaborador SET situacao = 'Bloqueado' WHERE id_colaborador = " + idColaborador;
            PreparedStatement ps = banco.getPreparedStatement(query);
            ps.execute();
            ps.close();

            banco.encerrarConexao();

            JOptionPane.showMessageDialog(this, "Usuário Bloqueado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar com Banco de dados. Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_DeletarColaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ativos;
    private javax.swing.JButton CadastrarColab;
    private javax.swing.JButton CadastrarSv;
    private javax.swing.JButton CarregarDadosCol;
    private javax.swing.JButton ColabCanButCarragaDados;
    private javax.swing.JButton DeletarCola;
    private javax.swing.JButton DeletarCola1;
    private javax.swing.JButton EditarCol;
    private javax.swing.JButton ExclirDados3;
    private javax.swing.JButton ExcluirDados1;
    private javax.swing.JPanel Financeiro;
    private javax.swing.JPanel Inativos;
    private javax.swing.JPanel Servico;
    private javax.swing.JTable TabelaCanceladaColaborador;
    private javax.swing.JTable TabelaColaboradoresAtivos;
    private javax.swing.JTable TabelaComissaoColaborador;
    private javax.swing.JTable TabelaPagamento;
    private javax.swing.JTable TabelaServicoAtivo;
    private javax.swing.JTable TabelaServicoPausasdos;
    private javax.swing.JTable TabelaViagensCanceladas;
    private javax.swing.JTable TabelaViagensRealizadas;
    private javax.swing.JButton UserPesquisa;
    private javax.swing.JFormattedTextField UsercampoCpfConsulta;
    private javax.swing.JButton butSvAtCarregarDados;
    private javax.swing.JComboBox<String> campoNomeMotorista;
    private javax.swing.JTextField campoNomeServico;
    private javax.swing.JTextField campoStatusColaborador;
    private javax.swing.JFormattedTextField campoValor;
    private javax.swing.JButton editar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable tabelaUsuario;
    // End of variables declaration//GEN-END:variables
}
