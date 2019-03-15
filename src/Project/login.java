
package Project;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;


public  class login extends javax.swing.JFrame {

    Connection con;
    
    public login() {
        initComponents();
        
    }
    
    public void connect()
    {
        try 
        {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "ajay.1998"); 
        } 
        
        catch (Exception e) 
        {
            System.out.println(e);
        }
        
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFocusCycleRoot(false);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Teacher");

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Login");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Teacher ID:");

        jTextField6.setBackground(new java.awt.Color(153, 255, 153));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Password:");

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPasswordField2.setBackground(new java.awt.Color(153, 255, 153));
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(33, 33, 33)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -30, 410, 570);

        jPanel4.setBackground(new java.awt.Color(36, 47, 65));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Login");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password:");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Student");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Registration Number:");

        jTextField7.setBackground(new java.awt.Color(36, 47, 65));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));

        panel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPasswordField1.setBackground(new java.awt.Color(36, 47, 65));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(340, 0, 480, 540);

        setSize(new java.awt.Dimension(845, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         
        
        try

        {

            String str1 = jTextField7.getText();

            char[] p = jPasswordField1.getPassword();

            String str2 = new String(p);
            if(str1.isEmpty()||str2.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Please fill in all the entries","Error Encountered",0);
            }
            else
            {
            
            connect();
            PreparedStatement ps = con.prepareStatement("select regno from signedup where regno=? and password=?");
            
             

            ps.setString(1, str1);

            ps.setString(2, str2);
            
            

            ResultSet rs = ps.executeQuery();

            if (rs.next())

            {

                PreparedStatement pps= con.prepareStatement("select dept,name from student where regno='"+str1+"'");
                ResultSet rrs= pps.executeQuery();
                rrs.next();
                String branch= rrs.getString("dept");
                String name= rrs.getString("name");
                if(branch.equals("IT"))
                {
                homepage home= new homepage(str1);
                home.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                }
                else if(branch.equals("CCE"))
                {
                homepageCCE home1= new homepageCCE(str1);
                home1.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                
                }
                else
                {
                  homepageCS home2= new homepageCS(str1);
                  home2.setVisible(true);
                  this.dispose();
                  JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                  
                }
 

            } 
            else

            {

                JOptionPane.showMessageDialog(null,

                   "Incorrect details entered.");

            }
        }

        }

        catch (Exception ex)

        {

            JOptionPane.showMessageDialog(null,

                   "Server error");

        }
        
        
         
        
         
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         try

        {

            String str1 = jTextField6.getText();

            char[] p = jPasswordField2.getPassword();

            String str2 = new String(p);
            if(str1.isEmpty()||str2.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Please fill in all the entries","Error Encountered",0);
            }
            else
            {
            
            connect();
            PreparedStatement ps = con.prepareStatement("select id_no from teacher where id_no=? and password=?");
            
             

            ps.setString(1, str1);

            ps.setString(2, str2);
            
            

            ResultSet rs = ps.executeQuery();

            if (rs.next())

            {

                PreparedStatement pps= con.prepareStatement("select dept_name,name from teacher where id_no='"+str1+"'");
                ResultSet rrs= pps.executeQuery();
                rrs.next();
                String branch= rrs.getString("dept_name");
                String name= rrs.getString("name");
                if(branch.equals("IT"))
                {
                teacherhomepageIT home= new teacherhomepageIT(str1);
                home.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                }
                else if(branch.equals("CCE"))
                {
                teacherhomepageIT home1= new teacherhomepageIT(str1);
                home1.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                
                }
                else
                {
                  teacherhomepageCSE home2= new teacherhomepageCSE(str1);
                  home2.setVisible(true);
                  this.dispose();
                  JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                  
                }
 

            } 
            else

            {

                JOptionPane.showMessageDialog(null,

                   "Incorrect details entered.");

            }
        }

        }

        catch (Exception ex)

        {

            JOptionPane.showMessageDialog(null,

                   "Server error");

        }
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER )
        {
              try

        {

            String str1 = jTextField7.getText();

            char[] p = jPasswordField1.getPassword();

            String str2 = new String(p);
            if(str1.isEmpty()||str2.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Please fill in all the entries","Error Encountered",0);
            }
            else
            {
            
            connect();
            PreparedStatement ps = con.prepareStatement("select regno from signedup where regno=? and password=?");
            
             

            ps.setString(1, str1);

            ps.setString(2, str2);
            
            

            ResultSet rs = ps.executeQuery();

            if (rs.next())

            {

                PreparedStatement pps= con.prepareStatement("select dept,name from student where regno='"+str1+"'");
                ResultSet rrs= pps.executeQuery();
                rrs.next();
                String branch= rrs.getString("dept");
                String name= rrs.getString("name");
                if(branch.equals("IT"))
                {
                homepage home= new homepage(str1);
                home.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                }
                else if(branch.equals("CCE"))
                {
                homepageCCE home1= new homepageCCE(str1);
                home1.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                
                }
                else
                {
                  homepageCS home2= new homepageCS(str1);
                  home2.setVisible(true);
                  this.dispose();
                  JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                  
                }
 

            } 
            else

            {

                JOptionPane.showMessageDialog(null,

                   "Incorrect details entered.");

            }
        }

        }

        catch (Exception ex)

        {

            JOptionPane.showMessageDialog(null,

                   "Server error");

        }
        
        
         
        
         
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
       panel1.setBackground(new Color(46, 204, 113));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
       panel1.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER )
        {
            try

        {

            String str1 = jTextField6.getText();

            char[] p = jPasswordField2.getPassword();

            String str2 = new String(p);
            if(str1.isEmpty()||str2.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Please fill in all the entries","Error Encountered",0);
            }
            else
            {
            
            connect();
            PreparedStatement ps = con.prepareStatement("select id_no from teacher where id_no=? and password=?");
            
             

            ps.setString(1, str1);

            ps.setString(2, str2);
            
            

            ResultSet rs = ps.executeQuery();

            if (rs.next())

            {

                PreparedStatement pps= con.prepareStatement("select dept_name,name from teacher where id_no='"+str1+"'");
                ResultSet rrs= pps.executeQuery();
                rrs.next();
                String branch= rrs.getString("dept_name");
                String name= rrs.getString("name");
                if(branch.equals("IT"))
                {
                teacherhomepageIT home= new teacherhomepageIT(str1);
                home.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                }
                else if(branch.equals("CCE"))
                {
                teacherhomepageCCE home1= new teacherhomepageCCE(str1);
                home1.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                
                }
                else
                {
                  teacherhomepageCSE home2= new teacherhomepageCSE(str1);
                  home2.setVisible(true);
                  this.dispose();
                  JOptionPane.showMessageDialog(null,"Welcome, "+name,"Portal",1);
                  
                }
 

            } 
            else

            {

                JOptionPane.showMessageDialog(null,

                   "Incorrect details entered.");

            }
        }

        }

        catch (Exception ex)

        {

            JOptionPane.showMessageDialog(null,

                   "Server error");

        }
        }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here: rgb(99, 110, 114)
         jPanel2.setBackground(new Color(99, 110, 114));
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:36,47,65
         jPanel2.setBackground(new Color(36,47,65));
        
    }//GEN-LAST:event_jLabel2MouseExited

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
