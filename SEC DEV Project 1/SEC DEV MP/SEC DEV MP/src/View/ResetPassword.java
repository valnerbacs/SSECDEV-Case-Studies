package View;

import Controller.SQLite;
import javax.swing.JOptionPane;

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

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "NEW PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        resetcodeFld.setBackground(new java.awt.Color(240, 240, 240));
        resetcodeFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resetcodeFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resetcodeFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "RESET CODE SENT TO EMAIL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        confpassFld.setBackground(new java.awt.Color(240, 240, 240));
        confpassFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpassFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confpassFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM NEW PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

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
        }

        //If username is taken
        if (!resetcode.equals("resetcode")) {       //Reset code is dummied for Demo Purposes
            jLabel1.setText("Incorrect code");
            resetcode = null;
            password = null;
            confirm = null;
        } else {
            //If password is empty
            if (password.isEmpty()) {
                jLabel1.setText("Enter a new password");
                resetcode = null;
                password = null;
                confirm = null;
            }

            else{
                int check = frame.checkPassword(password);

                //If confirmation is empty
                switch(check){
                    case 1: 
                        JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
                        resetcode = null;
                        password = null;
                        confirm = null;
                        break;
                    case 2: 
                        JOptionPane.showMessageDialog(null, "Password should contain at least one uppercase letter"); 
                        resetcode = null;
                        password = null;
                        confirm = null;
                        break;
                    case 3: 
                       JOptionPane.showMessageDialog(null, "Password should contain at least one lowercase letter"); 
                        resetcode = null;
                        password = null;
                        confirm = null;
                        break;
                    case 4: 
                        JOptionPane.showMessageDialog(null, "Password should contain at least one numerical digit"); 
                        resetcode = null;
                        password = null;
                        confirm = null;
                        break;
                    case 5: 
                        JOptionPane.showMessageDialog(null, "Password should contain at least one special character"); 
                        resetcode = null;
                        password = null;
                        confirm = null;
                        break;
                    case 6:
                        if(confirm.isEmpty() || !(password.equals(confirm))){
                            JOptionPane.showMessageDialog(null, "Confirm Password"); 
                        }
                        else{
                        resetcodeFld.setText("");
                        passwordFld.setText("");
                        confpassFld.setText("");
                        frame.resetPassword(frame.getUsername(), password);
                        resetcode = null;
                        password = null;
                        confirm = null;
                        frame.loginNav();
                        }
                }

                
            }
        }

    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        //Deletes all fields
        resetcodeFld.setText("");
        passwordFld.setText("");
        confpassFld.setText("");
        frame.setUsername("");
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPasswordField confpassFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JPasswordField resetcodeFld;    //Reset code

}
// End of variables declaration//GEN-END:variables
