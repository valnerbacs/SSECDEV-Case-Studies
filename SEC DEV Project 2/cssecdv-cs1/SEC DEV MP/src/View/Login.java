
package View;

public class Login extends javax.swing.JPanel {

    public Frame frame;
    
    public Login() {
        initComponents();
        incorrectCredentials.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        passwordFld = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        changeBtn = new javax.swing.JButton();			//Password Change Btn
        incorrectCredentials = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
	usernameFld.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {

            }
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {

            }
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CheckUsername(evt);
            }

        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
	passwordFld.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {

            }
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {

            }
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CheckPassword(evt);
            }

        });

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        changeBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        changeBtn.setText("FORGOT");
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });

        incorrectCredentials.setForeground(new java.awt.Color(255, 51, 51));
        incorrectCredentials.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        incorrectCredentials.setText("Username or password is incorrect.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(incorrectCredentials, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameFld)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(incorrectCredentials)
                .addGap(16, 16, 16)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
//      frame.mainNav();
        String username = usernameFld.getText();
        String password = passwordFld.getText();
        frame.loginAction(username, password);
        getIncorrectCredentialsComponent().setVisible(true);
    }//GEN-LAST:event_loginBtnActionPerformed

    //Username Character Counter
    private void CheckUsername(java.awt.event.KeyEvent evt) {
        //Getting text from Username Field
        String txt = usernameFld.getText().toLowerCase();
        //Counting Characters and Checking for SQL Statements
        boolean lock = false;
        if(txt.length() > 21 || txt .contains("select ") || txt.contains( "insert " ) || txt.contains( "delete " ) || 
                txt.contains( "update " ) || txt.contains( "create " ) || txt.contains( "drop " ) || 
                txt.contains( "alter " ) || txt.contains( "truncate " ) || txt.contains( "merge " ) ||  
                txt.contains( "grant " ) || txt.contains( "revoke " ) || txt.contains( "commit " ) || 
                txt.contains( "union " ) || txt.contains( "post " ) || txt.contains( "=" ) || 
                txt.contains( ";--" ) || txt.contains( "\" or" ) || txt.contains( "\' or" ) || 
                txt.contains( "char%" ) || txt.contains( "&quot" ) || txt.contains( "&apos" ) || 
                txt.contains( " " ) || txt.contains( " \" or \"\"=\" " ))
            lock = true;
        if (lock){
            //Disable Login Button
            incorrectCredentials.setText("Username or password is incorrect.");
            incorrectCredentials.setVisible(true);
            loginBtn.setEnabled(false);
        }
        else{
            //Enable Login Button
            incorrectCredentials.setVisible(false);
            loginBtn.setEnabled(true);
        }
    }   
    
    //Password Character Counter
    private void CheckPassword(java.awt.event.KeyEvent evt) {
        //Getting text from Password Field
        String txt = passwordFld.getText().toLowerCase();
        //Counting Characters and Checking for SQL Statements
        boolean lock = false;
        if(txt.length() > 21 || txt .contains("select ") || txt.contains( "insert " ) || txt.contains( "delete " ) || 
                txt.contains( "update " ) || txt.contains( "create " ) || txt.contains( "drop " ) || 
                txt.contains( "alter " ) || txt.contains( "truncate " ) || txt.contains( "merge " ) ||  
                txt.contains( "grant " ) || txt.contains( "revoke " ) || txt.contains( "commit " ) || 
                txt.contains( "union " ) || txt.contains( "post " ) || txt.contains( "=" ) || 
                txt.contains( ";--" ) || txt.contains( "\" or" ) || txt.contains( "\' or" ) || 
                txt.contains( "char%" ) || txt.contains( "&quot" ) || txt.contains( "&apos" ) || 
                txt.contains( " " ) || txt.contains( " \" or \"\"=\" " ))
            lock = true;
        if (lock){
            //Disable Login Button
            incorrectCredentials.setText("Username or password is incorrect.");
            incorrectCredentials.setVisible(true);
            loginBtn.setEnabled(false);
        }
        else{
            //Enable Login Button
            incorrectCredentials.setVisible(false);
            loginBtn.setEnabled(true);
        }
    }   
    
    
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        frame.registerNav();
        incorrectCredentials.setVisible(false);
        loginClearFields();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        usernameFld.setText("");
        passwordFld.setText("");
        getIncorrectCredentialsComponent().setVisible(false);
        frame.requestNav();
    }//GEN-LAST:event_resetBtnActionPerformed

    javax.swing.JLabel getIncorrectCredentialsComponent()   {
        return this.incorrectCredentials;
    }
    
    public void loginClearFields() {
        this.usernameFld.setText(null);
        this.passwordFld.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel incorrectCredentials;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables

    //Change Password Button
    private javax.swing.JButton changeBtn;
}
