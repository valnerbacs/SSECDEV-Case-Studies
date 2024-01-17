package View;

import Controller.Main;
import Model.Logs;
import Model.User;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.WindowConstants;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

import Controller.SessionManager;


public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        HomePnl = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        Navigation = new javax.swing.JPanel();
        adminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        managerBtn = new javax.swing.JButton();
        staffBtn = new javax.swing.JButton();
        clientBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(800, 450));

        HomePnl.setBackground(new java.awt.Color(102, 102, 102));
        HomePnl.setPreferredSize(new java.awt.Dimension(801, 500));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Navigation.setBackground(new java.awt.Color(204, 204, 204));

        adminBtn.setBackground(new java.awt.Color(250, 250, 250));
        adminBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminBtn.setText("Admin Home");
        adminBtn.setFocusable(false);
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        managerBtn.setBackground(new java.awt.Color(250, 250, 250));
        managerBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        managerBtn.setText("Manager Home");
        managerBtn.setFocusable(false);
        managerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerBtnActionPerformed(evt);
            }
        });

        staffBtn.setBackground(new java.awt.Color(250, 250, 250));
        staffBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staffBtn.setText("Staff Home");
        staffBtn.setFocusable(false);
        staffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffBtnActionPerformed(evt);
            }
        });

        clientBtn.setBackground(new java.awt.Color(250, 250, 250));
        clientBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clientBtn.setText("Client Home");
        clientBtn.setFocusable(false);
        clientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(250, 250, 250));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setFocusable(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavigationLayout = new javax.swing.GroupLayout(Navigation);
        Navigation.setLayout(NavigationLayout);
        NavigationLayout.setHorizontalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(managerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NavigationLayout.setVerticalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(managerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HomePnlLayout = new javax.swing.GroupLayout(HomePnl);
        HomePnl.setLayout(HomePnlLayout);
        HomePnlLayout.setHorizontalGroup(
            HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePnlLayout.createSequentialGroup()
                .addComponent(Navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomePnlLayout.setVerticalGroup(
            HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Navigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HomePnl, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HomePnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        adminHomePnl.showPnl("home");
        contentView.show(Content, "adminHomePnl");
    }//GEN-LAST:event_adminBtnActionPerformed

    private void managerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerBtnActionPerformed
        managerHomePnl.showPnl("home");
        contentView.show(Content, "managerHomePnl");
    }//GEN-LAST:event_managerBtnActionPerformed

    private void staffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffBtnActionPerformed
        staffHomePnl.showPnl("home");
        contentView.show(Content, "staffHomePnl");
    }//GEN-LAST:event_staffBtnActionPerformed

    private void clientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientBtnActionPerformed
        clientHomePnl.showPnl("home");
        contentView.show(Content, "clientHomePnl");
    }//GEN-LAST:event_clientBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        frameView.show(Container, "loginPnl");
        loginPnl.loginClearFields();
        loginPnl.getIncorrectCredentialsComponent().setVisible(false);
        
    }//GEN-LAST:event_logoutBtnActionPerformed

    public Main main;
    public Login loginPnl = new Login();
    public Register registerPnl = new Register();

    //Password Reset Panels
    public RequestReset requestPnl = new RequestReset();
    public ResetPassword resetPnl = new ResetPassword();
    
    private AdminHome adminHomePnl = new AdminHome();
    private ManagerHome managerHomePnl = new ManagerHome();
    private StaffHome staffHomePnl = new StaffHome();
    private ClientHome clientHomePnl = new ClientHome();
    
    private CardLayout contentView = new CardLayout();
    private CardLayout frameView = new CardLayout();
    
    public void init(Main controller){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("CSSECDV - SECURITY Svcs");
        this.setLocationRelativeTo(null);
        
        this.main = controller;
        loginPnl.frame = this;
        registerPnl.frame = this;

        //Reset Password Panels
        requestPnl.frame = this;
        resetPnl.frame = this;
        
        adminHomePnl.init(main.sqlite);
        clientHomePnl.init(main.sqlite);
        managerHomePnl.init(main.sqlite);
        staffHomePnl.init(main.sqlite);
        
        Container.setLayout(frameView);
        Container.add(loginPnl, "loginPnl");
        Container.add(registerPnl, "registerPnl");
        Container.add(HomePnl, "homePnl");

        //Password Reset Panels
        Container.add(requestPnl, "requestPnl");
        Container.add(resetPnl, "resetPnl");

        frameView.show(Container, "loginPnl");
        
        Content.setLayout(contentView);
        Content.add(adminHomePnl, "adminHomePnl");
        Content.add(managerHomePnl, "managerHomePnl");
        Content.add(staffHomePnl, "staffHomePnl");
        Content.add(clientHomePnl, "clientHomePnl");
        
        this.setVisible(true);
    }
    
    public void mainNav(){
        frameView.show(Container, "homePnl");
    }
    
    public void loginNav(){
        frameView.show(Container, "loginPnl");
        
    }
    
    public void loginAction(String username, String password)   {
        User user = main.sqlite.getUser(username);
                
        if (username.isBlank() || password.isBlank()){
            loginPnl.getIncorrectCredentialsComponent().setVisible(true);
            return;
        }
        
        if(user == null){
            JOptionPane.showMessageDialog(null, "User not found!");
            loginPnl.loginClearFields(); 
            return;
        }
        
        boolean isPasswordCorrect = BCrypt.checkpw(password, user.getPassword());
        
        if (isPasswordCorrect){
                if (user.getLocked()==0){
                    SessionManager.getInstance().put("user", user);
                    this.username = user.getUsername();
                    main.sqlite.addLogs("NOTICE", this.username, "Login attempt successful", main.sqlite.getCurrentTimeStamp());
                    this.mainNav();
                    if (user.getRole() == 1){
                        clientHomePnl.showPnl("home");
                        contentView.show(Content, "clientHomePnl");
                        adminBtn.setVisible(false);
                        managerBtn.setVisible(false);
                        staffBtn.setVisible(false);
                        clientBtn.setVisible(false);
                    }
                    if (user.getRole() == 2){
                        clientHomePnl.showPnl("home");
                        contentView.show(Content, "clientHomePnl");
                        adminBtn.setVisible(false);
                        managerBtn.setVisible(false);
                        staffBtn.setVisible(false);
                        clientBtn.setVisible(false);
                    }
                    if (user.getRole() == 3){
                        staffHomePnl.showPnl("home");
                        contentView.show(Content, "staffHomePnl");
                        adminBtn.setVisible(false);
                        managerBtn.setVisible(false);
                        staffBtn.setVisible(false);
                        clientBtn.setVisible(false);
                    }
                    if (user.getRole() == 4){
                        managerHomePnl.showPnl("home");
                        contentView.show(Content, "managerHomePnl");
                        adminBtn.setVisible(false);
                        managerBtn.setVisible(false);
                        staffBtn.setVisible(false);
                        clientBtn.setVisible(false);
                    }
                    if (user.getRole() == 5){
                        adminHomePnl.showPnl("home");
                        contentView.show(Content, "adminHomePnl");
                        adminBtn.setVisible(false);
                        managerBtn.setVisible(false);
                        staffBtn.setVisible(false);
                        clientBtn.setVisible(false);
                    }
                } else {
                    main.sqlite.addLogs("NOTICE", username, "login attempt unsuccessful", new Timestamp(new Date().getTime()).toString());
                    JOptionPane.showMessageDialog(null, "Account locked due to multiple unsuccessful login attempts!");
                }
            
        } else {
                main.sqlite.addLogs("NOTICE", username, "login attempt unsuccessful", new Timestamp(new Date().getTime()).toString());
                ArrayList<Logs> unsuccessfulAttempts = main.sqlite.getUnsuccessfulAttempts(username);
                
                loginPnl.getIncorrectCredentialsComponent().setVisible(true);
                loginPnl.loginClearFields(); 
                if(unsuccessfulAttempts.size() >= 5){
                    user.setLocked(1);
                    main.sqlite.setUserLockedStatus(username, user.getLocked());
                    JOptionPane.showMessageDialog(null, "Account locked due to multiple unsuccessful login attempts!");
                }
        }
    }
    
    public void registerNav(){
        frameView.show(Container, "registerPnl");
        
    }
    
    public void registerAction(String username, String password, String confpass){
        
        if (username.isBlank() || password.isBlank() || confpass.isBlank()) {
            registerPnl.getPasswordMismatchComponent().setVisible(true);
            return;
        }
        
        if (password.equals(confpass))  {
            main.sqlite.addUser(username, password, 2);
            main.sqlite.addLogs("NOTICE", username, "User creation successful", main.sqlite.getCurrentTimeStamp());
            this.loginNav();
        } else    {
           registerPnl.getPasswordMismatchComponent().setVisible(true);
           registerPnl.registerClearFields();
           
        }
        
    }
    
    public void resetAction(String resetcode, String password, String confirm){
        int check = this.checkPassword(password);
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
                    resetPassword(this.username, password);
                    main.sqlite.addLogs("NOTICE", this.username, "Changed password", main.sqlite.getCurrentTimeStamp());
                    resetcode = null;
                    password = null;
                    confirm = null;
                    this.loginNav();
            }
    }
    
    //Sets username for Password Reset
    public void setUsername(String u){
        this.username = u;
    }

    //Gets username as a variable
    public String getUsername(){
        return this.username;
    }

     //Password Reset Request Page Navigation
     public void requestNav(){
        frameView.show(Container, "requestPnl");
    }

    //Password Reset Request Page Navigation
    public void resetNav(){
        frameView.show(Container, "resetPnl");
    }

    //Check Password Strength
    public int checkPassword(String p){
        return main.sqlite.isPasswordComplex(p);
    }

    //Reset Password Function
    public void resetPassword(String username, String newPassword){
        main.sqlite.modPassword(username, newPassword);
    }
    
    public void registerUser(String username, String password, String confpass){
        main.sqlite.addUser(username, password, 2);
    }

    //Finds User in Database
    public boolean findUser(String username){
        return main.sqlite.findUser(username);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel HomePnl;
    private javax.swing.JPanel Navigation;
    private javax.swing.JButton adminBtn;
    private javax.swing.JButton clientBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton managerBtn;
    private javax.swing.JButton staffBtn;
    // End of variables declaration//GEN-END:variables

    private String username;
}
