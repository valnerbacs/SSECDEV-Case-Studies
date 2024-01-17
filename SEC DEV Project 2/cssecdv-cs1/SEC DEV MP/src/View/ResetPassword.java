package View;

import Controller.SQLite;
import javax.swing.JOptionPane;
import Controller.SQLite;

//This class is where the user can reset their password
//It is assumed they gained the code from their email
public class ResetPassword extends javax.swing.JPanel {

    public Frame frame;

    public ResetPassword() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        resetcodeFld = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        confpassFld = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();

        confirmBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        confirmBtn.setText("CONFIRM");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        resetcodeFld.setBackground(new java.awt.Color(240, 240, 240));
        resetcodeFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resetcodeFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resetcodeFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "RESET CODE SENT TO EMAIL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        resetcodeFld.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {

            }
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {

            }
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CheckResetcode(evt);
            }

        });
        
        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "NEW PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
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
        
        confpassFld.setBackground(new java.awt.Color(240, 240, 240));
        confpassFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpassFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confpassFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM NEW PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        confpassFld.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {

            }
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {

            }
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CheckConfirm(evt);
            }
        });
              
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(200, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(resetcodeFld)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(confpassFld, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(200, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backBtn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backBtn)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(resetcodeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confpassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        //Getting Credentials
        String resetcode = resetcodeFld.getText();
        String password = passwordFld.getText();
        String confirm = confpassFld.getText();
        
        //If username is empty
        if (resetcode.isEmpty()) {
            jLabel1.setText("Enter reset code sent to your email");
            resetcode = null;
            password = null;
            confirm = null;
        }
        
        //If password is empty
        if (password.isEmpty()) {
            jLabel1.setText("Enter a new password");
            resetcode = null;
            password = null;
            confirm = null;
        }
        
        //If password is empty
        if (confirm.isEmpty() || !password.equals(confirm)) {
            jLabel1.setText("Confirm new password");
            resetcode = null;
            password = null;
            confirm = null;
        }        
        
        //If username is taken
        if (!resetcode.equals("resetcode")) {       //Reset code is dummied for Demo Purposes
            jLabel1.setText("Incorrect code");
            resetcode = null;
            password = null;
            confirm = null;
        } 
        
        if(resetcode.equals("resetcode") && password.equals(confirm)){
            resetcodeFld.setText("");
            passwordFld.setText("");
            confpassFld.setText("");
            frame.resetAction(resetcode, password, confirm);
        }        
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        //Deletes all fields
        resetcodeFld.setText("");
        passwordFld.setText("");
        confpassFld.setText("");
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed

    //Username Character Counter
    private void CheckResetcode(java.awt.event.KeyEvent evt) {
        //Getting text from Username Field
        String txt = resetcodeFld.getText().toLowerCase();
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
            //Disable Confirm Button
            jLabel1.setToolTipText("Invalid Input!");
            confirmBtn.setEnabled(false);
        }
        
        else{
            //Enable Confirm Button
            jLabel1.setToolTipText("");
            confirmBtn.setEnabled(true);
        }
    }
    
    //Username Character Counter
    private void CheckPassword(java.awt.event.KeyEvent evt) {
        //Getting text from Username Field
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
            //Disable Confirm Button
            jLabel1.setToolTipText("Invalid Input!");
            confirmBtn.setEnabled(false);
        }
        
        else{
            //Enable Confirm Button
            jLabel1.setToolTipText("");
            confirmBtn.setEnabled(true);
        }
    }
    
    //Username Character Counter
    private void CheckConfirm(java.awt.event.KeyEvent evt) {
        //Getting text from Username Field
        String txt = confpassFld.getText().toLowerCase();
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
            //Disable Confirm Button
            jLabel1.setToolTipText("Invalid Input!");
            confirmBtn.setEnabled(false);
        }
        
        else{
            //Enable Confirm Button
            jLabel1.setToolTipText("");
            confirmBtn.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPasswordField confpassFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JPasswordField resetcodeFld;    //Reset code

}
// End of variables declaration//GEN-END:variables
