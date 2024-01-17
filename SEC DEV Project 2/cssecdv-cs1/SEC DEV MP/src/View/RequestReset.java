package View;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This Class is used to send a reset code
//It is assumed that the server will send a code to the user's email
//IRL: Sends resetcode to dummy email linked to account
public class RequestReset extends javax.swing.JPanel {
    public Frame frame;

    public RequestReset() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new JLabel();
        inputFld = new JTextField();
        backBtn = new javax.swing.JButton();

        //Password Change Btn
        sendBtn = new javax.swing.JButton();

        jLabel1.setFont(new Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        inputFld.setBackground(new Color(240, 240, 240));
        inputFld.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        inputFld.setHorizontalAlignment(JTextField.CENTER);
        inputFld.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "ACCOUNT EMAIL", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 0, 12))); // NOI18N

        sendBtn.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        sendBtn.setText("SEND CODE");
        sendBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(24, 24, 24)
                                .addContainerGap(200, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(sendBtn, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputFld)
                                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(88, Short.MAX_VALUE)
                                .addComponent(backBtn)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(inputFld, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(sendBtn, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Reset Button's Functions
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        String email = inputFld.getText();
        inputFld.setText("");

        if(!(email.contains("@") && email.contains(".com"))){
            jLabel1.setText("Enter a valid username");  //Invalid Email
        }

        else{
            int pos = email.indexOf("@");
            String username = email.substring(0, pos);
            boolean exists = frame.findUser(username);      //Searches for user
            if(!exists){
                jLabel1.setText("Invalid Email");  //Invalid Username
            }
            else{            //Sets Username
                frame.setUsername(username);
                frame.resetNav();
            }
        }

    }//GEN-LAST:event_resetBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        inputFld.setText("");
        frame.loginNav();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField inputFld;
    // End of variables declaration//GEN-END:variables

    //Change Password Button
    private javax.swing.JButton sendBtn;
}
