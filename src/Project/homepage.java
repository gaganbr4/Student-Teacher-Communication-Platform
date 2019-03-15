/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;


import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author GAGAN
 */
public class homepage extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
   
    Connection con=null;
    String regno;
    public homepage(String s) {
        initComponents();
        regno=s;
    }
    
    public void connect()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "ajay.1998");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
       
    }
    public void updateinfo(String subject)
    {
        connect();
        try {
            PreparedStatement ps= con.prepareStatement("select name,ph_no,email from teacher where subject='"+subject+"'");
            ResultSet rs= ps.executeQuery();
            rs.next();
            String n=rs.getString("name");
            
            String ph=rs.getString("ph_no");
            String mail=rs.getString("email");
            if(subject.equals("DBS"))
            {
            jLabel58.setText(n);
            jLabel59.setText(ph);
            jLabel56.setText(mail);
            }
            
            
            else
            {
            jLabel42.setText(n);
            jLabel43.setText(ph);
            jLabel40.setText(mail);
            }
                
            
            
            
            
        } catch (Exception e) 
        {
            System.out.println(e);
        }
        
        
        
        
    }
    public void populate(String s)
    {
        try
               {
                    connect();
                    PreparedStatement ps= con.prepareStatement("select ques_id,ques,answer,regno, id_no from question where subject='"+s+"'");
                    ResultSet rs= ps.executeQuery();
                    DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
                    model.setRowCount(0);
                    
                    while(rs.next())
                    {
                      
                    int id=rs.getInt("ques_id");
                    String iid= Integer.toString(id);
                    
                    String ques=rs.getString("ques");
                    
                    String ans=rs.getString("answer");
                    String regno=rs.getString("regno");
                    String idno=rs.getString("id_no");
                    model.insertRow(model.getRowCount(), new Object[]{iid,ques,ans,regno,idno});
                    
                    }
                }
               
               catch(Exception e)
                {
                   System.out.println(e);
                }
    }
    
    public void postquestion(String q,String sub)
    {
        connect();
        try
        {
            PreparedStatement ps= con.prepareStatement("insert into question(ques,regno,subject) values ('"+q+"','"+regno+"','"+sub+"')");
            ps.executeQuery();
            PreparedStatement pps= con.prepareStatement("commit");
            pps.executeQuery();
            populate(sub);
            
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Server error encountered","Error",1);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        jLabel5 = new javax.swing.JLabel();
        panel5 = new java.awt.Panel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        parentpanel = new java.awt.Panel();
        child1 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        child2 = new java.awt.Panel();
        resoursepanel = new javax.swing.JPanel();
        rp2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rp3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rp4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        rp5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        rp6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        rp1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        datapanel = new javax.swing.JPanel();
        dp1 = new javax.swing.JPanel();
        dp3 = new javax.swing.JPanel();
        dp6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        dp5 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        teacherpanel = new javax.swing.JPanel();
        tp3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        tp4 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        panel3.setBackground(new java.awt.Color(153, 153, 255));
        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CNW");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel5.setBackground(new java.awt.Color(255, 204, 204));
        panel5.setPreferredSize(new java.awt.Dimension(74, 31));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DBS");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jComboBox1.setBackground(new java.awt.Color(255, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "About", "Logout" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jComboBox1))
                .addGap(181, 181, 181))
        );

        parentpanel.setPreferredSize(new java.awt.Dimension(750, 407));
        parentpanel.setLayout(new java.awt.CardLayout());

        child1.setBackground(new java.awt.Color(36, 47, 65));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Question", "Answer", "Reg No", "Teacher ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel8.setForeground(new java.awt.Color(153, 255, 153));
        jLabel8.setText("Post a question (select tab first)");

        jButton1.setText("Post");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout child1Layout = new javax.swing.GroupLayout(child1);
        child1.setLayout(child1Layout);
        child1Layout.setHorizontalGroup(
            child1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, child1Layout.createSequentialGroup()
                .addGroup(child1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(child1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButton1))
                    .addGroup(child1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(child1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );
        child1Layout.setVerticalGroup(
            child1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(child1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(child1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        parentpanel.add(child1, "card2");

        child2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout child2Layout = new javax.swing.GroupLayout(child2);
        child2.setLayout(child2Layout);
        child2Layout.setHorizontalGroup(
            child2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        child2Layout.setVerticalGroup(
            child2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        parentpanel.add(child2, "card3");

        resoursepanel.setBackground(new java.awt.Color(204, 255, 204));
        resoursepanel.setPreferredSize(new java.awt.Dimension(220, 53));
        resoursepanel.setLayout(new java.awt.CardLayout());

        rp2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Resources");

        javax.swing.GroupLayout rp2Layout = new javax.swing.GroupLayout(rp2);
        rp2.setLayout(rp2Layout);
        rp2Layout.setHorizontalGroup(
            rp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        rp2Layout.setVerticalGroup(
            rp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        resoursepanel.add(rp2, "card3");

        rp3.setBackground(new java.awt.Color(0, 102, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Resources");

        javax.swing.GroupLayout rp3Layout = new javax.swing.GroupLayout(rp3);
        rp3.setLayout(rp3Layout);
        rp3Layout.setHorizontalGroup(
            rp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        rp3Layout.setVerticalGroup(
            rp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        resoursepanel.add(rp3, "card4");

        rp4.setBackground(new java.awt.Color(0, 255, 102));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Resources");

        javax.swing.GroupLayout rp4Layout = new javax.swing.GroupLayout(rp4);
        rp4.setLayout(rp4Layout);
        rp4Layout.setHorizontalGroup(
            rp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        rp4Layout.setVerticalGroup(
            rp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        resoursepanel.add(rp4, "card5");

        rp5.setBackground(new java.awt.Color(255, 204, 204));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Resources");

        javax.swing.GroupLayout rp5Layout = new javax.swing.GroupLayout(rp5);
        rp5.setLayout(rp5Layout);
        rp5Layout.setHorizontalGroup(
            rp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        rp5Layout.setVerticalGroup(
            rp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        resoursepanel.add(rp5, "card6");

        rp6.setBackground(new java.awt.Color(255, 255, 153));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Resources");

        javax.swing.GroupLayout rp6Layout = new javax.swing.GroupLayout(rp6);
        rp6.setLayout(rp6Layout);
        rp6Layout.setHorizontalGroup(
            rp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        rp6Layout.setVerticalGroup(
            rp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        resoursepanel.add(rp6, "card7");

        rp1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Resources");

        javax.swing.GroupLayout rp1Layout = new javax.swing.GroupLayout(rp1);
        rp1.setLayout(rp1Layout);
        rp1Layout.setHorizontalGroup(
            rp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        rp1Layout.setVerticalGroup(
            rp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rp1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        resoursepanel.add(rp1, "card2");

        datapanel.setBackground(new java.awt.Color(0, 51, 0));
        datapanel.setPreferredSize(new java.awt.Dimension(220, 564));
        datapanel.setLayout(new java.awt.CardLayout());

        dp1.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout dp1Layout = new javax.swing.GroupLayout(dp1);
        dp1.setLayout(dp1Layout);
        dp1Layout.setHorizontalGroup(
            dp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );
        dp1Layout.setVerticalGroup(
            dp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        datapanel.add(dp1, "card7");

        dp3.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout dp3Layout = new javax.swing.GroupLayout(dp3);
        dp3.setLayout(dp3Layout);
        dp3Layout.setHorizontalGroup(
            dp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );
        dp3Layout.setVerticalGroup(
            dp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        datapanel.add(dp3, "card3");

        dp6.setBackground(new java.awt.Color(255, 255, 153));

        jLabel17.setText("test file");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dp6Layout = new javax.swing.GroupLayout(dp6);
        dp6.setLayout(dp6Layout);
        dp6Layout.setHorizontalGroup(
            dp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dp6Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dp6Layout.setVerticalGroup(
            dp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dp6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel17)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        datapanel.add(dp6, "card6");

        dp5.setBackground(new java.awt.Color(255, 204, 204));

        jLabel45.setText("testing");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dp5Layout = new javax.swing.GroupLayout(dp5);
        dp5.setLayout(dp5Layout);
        dp5Layout.setHorizontalGroup(
            dp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dp5Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel45)
                .addContainerGap(372, Short.MAX_VALUE))
        );
        dp5Layout.setVerticalGroup(
            dp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dp5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel45)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        datapanel.add(dp5, "card5");

        teacherpanel.setPreferredSize(new java.awt.Dimension(750, 206));
        teacherpanel.setLayout(new java.awt.CardLayout());

        tp3.setBackground(new java.awt.Color(0, 102, 255));

        jLabel35.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Name");

        jLabel36.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Teacher Details");

        jLabel37.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Email Address");

        jLabel38.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Phone Number");

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Check Teacher Schedule");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jLabel40.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));

        jLabel42.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));

        jLabel43.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout tp3Layout = new javax.swing.GroupLayout(tp3);
        tp3.setLayout(tp3Layout);
        tp3Layout.setHorizontalGroup(
            tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp3Layout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 288, Short.MAX_VALUE))
            .addGroup(tp3Layout.createSequentialGroup()
                .addGroup(tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tp3Layout.createSequentialGroup()
                        .addGroup(tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tp3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(143, 143, 143)
                        .addGroup(tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        tp3Layout.setVerticalGroup(
            tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tp3Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tp3Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        teacherpanel.add(tp3, "card4");

        tp4.setBackground(new java.awt.Color(255, 204, 204));

        jLabel49.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Name");

        jLabel50.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Teacher Details");

        jLabel51.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Email Address");

        jLabel52.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Phone Number");

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Check Teacher Schedule");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jLabel56.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Name");

        jLabel58.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Name");

        jLabel59.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Name");

        javax.swing.GroupLayout tp4Layout = new javax.swing.GroupLayout(tp4);
        tp4.setLayout(tp4Layout);
        tp4Layout.setHorizontalGroup(
            tp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                    .addGroup(tp4Layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel56)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(tp4Layout.createSequentialGroup()
                .addGroup(tp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tp4Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tp4Layout.createSequentialGroup()
                        .addGroup(tp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166)
                        .addGroup(tp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel58))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tp4Layout.setVerticalGroup(
            tp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        teacherpanel.add(tp4, "card4");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IT Dept Announcements"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(parentpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addComponent(teacherpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resoursepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datapanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resoursepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datapanel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(teacherpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parentpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseClicked
               parentpanel.removeAll(); 
               parentpanel.add(child1);
               parentpanel.repaint();
               parentpanel.revalidate();
              
    }//GEN-LAST:event_panel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
           parentpanel.removeAll(); 
               parentpanel.add(child1);
               parentpanel.repaint();
               parentpanel.revalidate();
               
               teacherpanel.removeAll();
               teacherpanel.add(tp3);
               teacherpanel.repaint();
               teacherpanel.revalidate();
               
               resoursepanel.removeAll();
               resoursepanel.add(rp1);
               resoursepanel.repaint();
               resoursepanel.revalidate();
               
               datapanel.removeAll();
               datapanel.add(dp1);
               datapanel.repaint();
               datapanel.revalidate();
               
               populate("CNW");
               updateinfo("CNW");
               jLabel8.setText("Post a question in CNW");
               
               
               
               
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
      parentpanel.removeAll(); 
               parentpanel.add(child1);
               parentpanel.repaint();
               parentpanel.revalidate();
               
               teacherpanel.removeAll();
               teacherpanel.add(tp4);
               teacherpanel.repaint();
               teacherpanel.revalidate();
               
               resoursepanel.removeAll();
               resoursepanel.add(rp5);
               resoursepanel.repaint();
               resoursepanel.revalidate();
               
               datapanel.removeAll();
               datapanel.add(dp5);
               datapanel.repaint();
               datapanel.revalidate();
               
               updateinfo("DBS");
               populate("DBS");
               
               jLabel8.setText("Post a question in DBS");
               
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        try
       {
           Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Users\\GAGAN\\Desktop\\a.pptx");
       }
       catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, "check file");
               }
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                      
        Object selected=jComboBox1.getSelectedItem();
        
        
        if(selected.toString().equals("About"))
        {
            about obj= new about(regno);
            obj.setVisible(true);
        }
        if(selected.toString().equals("Logout"))
        {
            login obj1= new login();
            obj1.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String question=jTextArea1.getText();
        if(question.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid question","Error",0);
        }
        if(jLabel8.getText().equals("Post a question in CNW"))
        {
            postquestion(question,"CNW");
        }
        else if(jLabel8.getText().equals("Post a question in DBS"))
         {
              postquestion(question,"DBS");
         }
        jTextArea1.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Users\\GAGAN\\Desktop\\lab6.txt");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "check file");
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:rgb(127, 140, 141)
        
        panel3.setBackground(new Color(127, 140, 141));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:[153,153,255]
          panel3.setBackground(new Color(153,153,255));
        
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
         panel5.setBackground(new Color(127, 140, 141));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here: [255,204,204]
        panel5.setBackground(new Color(255,204,204));
    }//GEN-LAST:event_jLabel9MouseExited

   
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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel child1;
    private java.awt.Panel child2;
    private javax.swing.JPanel datapanel;
    private javax.swing.JPanel dp1;
    private javax.swing.JPanel dp3;
    private javax.swing.JPanel dp5;
    private javax.swing.JPanel dp6;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel3;
    private java.awt.Panel panel5;
    private java.awt.Panel parentpanel;
    private javax.swing.JPanel resoursepanel;
    private javax.swing.JPanel rp1;
    private javax.swing.JPanel rp2;
    private javax.swing.JPanel rp3;
    private javax.swing.JPanel rp4;
    private javax.swing.JPanel rp5;
    private javax.swing.JPanel rp6;
    private javax.swing.JPanel teacherpanel;
    private javax.swing.JPanel tp3;
    private javax.swing.JPanel tp4;
    // End of variables declaration//GEN-END:variables
}
