package br.com.tuctuc.telas;

import br.tuctuc.conexaoBancoDeDados.BD;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author toinh
 */
public class Login extends JDialog {

    public Login(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public boolean isLoginSuccessful() {
        return loginSuccessful;
    }

    private boolean loginSuccessful = false; // Adicione esta linha

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoUsuarioLogin = new javax.swing.JTextField();
        campoPassLogin = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        entrarSistema = new javax.swing.JButton();
        cadastrarUsuario = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(744, 501));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Usuário");

        campoUsuarioLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campoPassLogin.setToolTipText("");
        campoPassLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campoPassLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPassLoginKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Senha");

        entrarSistema.setBackground(new java.awt.Color(0, 255, 51));
        entrarSistema.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        entrarSistema.setText("Entrar");
        entrarSistema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        entrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarSistemaActionPerformed(evt);
            }
        });

        cadastrarUsuario.setBackground(new java.awt.Color(0, 255, 51));
        cadastrarUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cadastrarUsuario.setText("Cadastrar");
        cadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuarioActionPerformed(evt);
            }
        });

        Sair.setBackground(new java.awt.Color(204, 51, 0));
        Sair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 0));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 14)); // NOI18N
        jButton1.setText("Esqueci a senha");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(campoUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sair)
                    .addComponent(cadastrarUsuario))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(336, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // Fechar a janela completa do sistema.
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void cadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioActionPerformed
        //this.setVisible(true);
        // Passar uma instância de JFrame para PreCadastro se necessário
        PreCadastro1 precad = new PreCadastro1(this, true);
        precad.setVisible(true);
    }//GEN-LAST:event_cadastrarUsuarioActionPerformed

    private void entrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarSistemaActionPerformed
            this.login();

                    

    }//GEN-LAST:event_entrarSistemaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EsqueciSenha recpw = new EsqueciSenha(this, true);
        recpw.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void login() {
        // Verificar se os campos de login e senha estão preenchidos
        if (this.campoPassLogin.getPassword().length <= 0 || this.campoUsuarioLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe um usuário ou senha.");
            return;
        }

        // Obter os valores de usuário e senha digitados
        String usuario = this.campoUsuarioLogin.getText();
        char[] senha = this.campoPassLogin.getPassword();
        String senhaString = new String(senha); // Convertendo a senha de char[] para String

        // Conectar ao banco de dados usando a classe BD
        BD banco = new BD();
        boolean conectado = banco.conectaBD();

        if (!conectado) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados.");
            return;
        }

        // Preparar a consulta SQL para verificar se o usuário e a senha existem no banco
        String query = "SELECT * FROM cliente WHERE nome_usuario = ? AND senha_login = ?";

        try {
            PreparedStatement stmt = banco.getPreparedStatement(query);
            stmt.setString(1, usuario);
            stmt.setString(2, senhaString);

            ResultSet rs = stmt.executeQuery();

            // Verificar se o usuário e senha são válidos
            if (rs.next()) {
                loginSuccessful = true; // Define como verdadeiro se o login for bem-sucedido
                System.out.println("Login bem-sucedido!"); // Adicione esta linha para depuração
                this.setVisible(false);  // Fecha a tela de login se o login for bem-sucedido
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível realizar o login. Usuário/Senha incorretos.");
            }

            rs.close();  // Fechar o ResultSet

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao realizar a consulta no banco de dados." + e.getMessage());
            System.out.println("Erro: " + e.getMessage());
        } finally {
             banco.encerrarConexao();
        }

         // Fechar a conexão com o banco de dados
    }
    
    private void campoPassLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPassLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           this.login();
        }
    }//GEN-LAST:event_campoPassLoginKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair;
    private javax.swing.JButton cadastrarUsuario;
    private javax.swing.JPasswordField campoPassLogin;
    private javax.swing.JTextField campoUsuarioLogin;
    private javax.swing.JButton entrarSistema;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
