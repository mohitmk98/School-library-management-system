/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mohit
 */
public class issuereturn extends javax.swing.JFrame {

    /**
     * Creates new form issuereturn
     */
    public issuereturn() {
        initComponents();
    }
    
    void contain()
    {
     DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
     int a=model.getRowCount();
    jLabel17.setText("Contains "+a+" books!");
    }
    void clear()
    {
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField12.setText("");
    }
    void clear1()
    {
    jTextField4.setText("");
    jTextField7.setText("");
    jTextField8.setText("");
    jTextField9.setText("");
    jTextField10.setText("");
    jTextField11.setText("");
    }
    void visible1()
    {
    jLabel5.setVisible(true);
    jLabel6.setVisible(true);
    jTextField5.setVisible(true);
    jTextField6.setVisible(true);
    jButton6.setVisible(true);
    jButton4.setEnabled(false);
    jButton5.setEnabled(false);
    }
    
    void invisible1()
    {
    jLabel5.setVisible(false);
    jLabel6.setVisible(false);
    jTextField5.setVisible(false);
    jTextField6.setVisible(false);
    jButton6.setVisible(false);
    jButton4.setEnabled(true);
    jButton5.setEnabled(false);
    }
    
    void invisible2()
    {
         jLabel5.setVisible(false);
    jLabel6.setVisible(false);
    jTextField5.setVisible(false);
    jTextField6.setVisible(false);
    jButton6.setVisible(false);
    jButton5.setEnabled(true);
    jButton4.setEnabled(false);
    }
    
    void cleartable()
            {
      DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
      while(model.getRowCount() > 0)
      {
      model.removeRow(0);
      }
            }
    
    
    void showtable()
    {
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        
    try
         {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","mohit");
        Statement st=con.createStatement(); 
       ResultSet rs=st.executeQuery("Select * from book");
    while(rs.next())
        {
        
            model.addRow(new Object[] {rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getDate(5),rs.getInt(6)});
            
        }
         }
    catch(Exception E)
         {
         JOptionPane.showMessageDialog(null,"Connection error");
         }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Sawasdee", 0, 12)); // NOI18N
        setUndecorated(true);
        setOpacity(0.97F);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(93, 92, 99));
        jPanel1.setForeground(new java.awt.Color(93, 92, 99));

        jPanel2.setBackground(new java.awt.Color(70, 70, 70));

        jButton10.setBackground(new java.awt.Color(31, 169, 75));
        jButton10.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jButton10.setForeground(new java.awt.Color(8, 1, 1));
        jButton10.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Delete_2.png")); // NOI18N
        jButton10.setToolTipText("Exit");
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Sawasdee", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(254, 254, 254));
        jLabel15.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Businesswoman.png")); // NOI18N
        jLabel15.setText("LIBRARY DATABASE");

        jButton11.setBackground(new java.awt.Color(156, 156, 156));
        jButton11.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(254, 254, 254));
        jButton11.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Back Arrow Filled.png")); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 1, 1));
        jLabel16.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/pics/Flatjoy Circle Icons 128px DEMO/Books.png")); // NOI18N

        jButton21.setBackground(new java.awt.Color(13, 70, 1));
        jButton21.setFont(new java.awt.Font("Sawasdee", 1, 16)); // NOI18N
        jButton21.setForeground(new java.awt.Color(254, 254, 254));
        jButton21.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-New Topic.png")); // NOI18N
        jButton21.setText("HOME");
        jButton21.setToolTipText("Login Home");
        jButton21.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton21MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton21MouseEntered(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(52, 52, 52)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton21)
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(70, 70, 70));

        jPanel4.setBackground(new java.awt.Color(156, 156, 156));
        jPanel4.setForeground(new java.awt.Color(254, 254, 254));

        jLabel1.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("ISBN CODE");

        jLabel2.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("BOOK NAME");

        jLabel3.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("AUTHOR");

        jTextField1.setBackground(new java.awt.Color(93, 92, 99));
        jTextField1.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(254, 254, 254));
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.setOpaque(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(93, 92, 99));
        jTextField2.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(254, 254, 254));
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField2.setOpaque(false);

        jTextField3.setBackground(new java.awt.Color(93, 92, 99));
        jTextField3.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(254, 254, 254));
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField3.setOpaque(false);

        jButton4.setBackground(new java.awt.Color(156, 156, 156));
        jButton4.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Hospital Filled.png")); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(156, 156, 156));
        jButton5.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Delete.png")); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sawasdee", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(156, 156, 156));
        jTextField12.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(156, 156, 156));
        jTextField12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField12.setOpaque(false);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                                    .addComponent(jButton5))))
                        .addComponent(jTextField2)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jButton4.setEnabled(false);
        jButton5.setEnabled(false);

        jPanel5.setBackground(new java.awt.Color(156, 156, 156));
        jPanel5.setForeground(new java.awt.Color(254, 254, 254));

        jLabel5.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setText("RENAME BOOK");

        jLabel6.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("RENAME AUTHOR");

        jTextField5.setBackground(new java.awt.Color(93, 92, 99));
        jTextField5.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(254, 254, 254));
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField5.setOpaque(false);

        jTextField6.setBackground(new java.awt.Color(93, 92, 99));
        jTextField6.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(254, 254, 254));
        jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField6.setOpaque(false);

        jButton6.setBackground(new java.awt.Color(156, 156, 156));
        jButton6.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Life Cycle Filled.png")); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(254, 254, 254));
        jButton14.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Rotate Left Filled.png")); // NOI18N
        jButton14.setText("CLEAR FIELDS");
        jButton14.setToolTipText("Clear Fields");
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton14MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton14MouseEntered(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jTextField13.setBackground(new java.awt.Color(156, 156, 156));
        jTextField13.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(254, 254, 254));
        jTextField13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField13.setOpaque(false);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jButton6.setVisible(false);

        jPanel6.setBackground(new java.awt.Color(140, 140, 140));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setText("ISSUE A BOOK");
        jLabel4.setBorder(null);

        jTextField4.setBackground(new java.awt.Color(93, 92, 99));
        jTextField4.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(254, 254, 254));
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField4.setOpaque(false);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 1, 1));
        jLabel8.setText("ISBN CODE");

        jDateChooser1.setBackground(new java.awt.Color(156, 156, 156));
        jDateChooser1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jDateChooser1.setForeground(new java.awt.Color(1, 1, 1));
        jDateChooser1.setToolTipText("CHOOSE DATE");
        jDateChooser1.setFont(new java.awt.Font("Sawasdee", 0, 12)); // NOI18N

        jDateChooser2.setBackground(new java.awt.Color(156, 156, 156));
        jDateChooser2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jDateChooser2.setForeground(new java.awt.Color(1, 1, 1));
        jDateChooser2.setToolTipText("CHOOSE DATE");
        jDateChooser2.setFont(new java.awt.Font("Sawasdee", 0, 12)); // NOI18N

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(93, 92, 99));
        jTextField7.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(254, 254, 254));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField7.setOpaque(false);

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(93, 92, 99));
        jTextField8.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(254, 254, 254));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField8.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 1, 1));
        jLabel11.setText("BOOK NAME");

        jTextField9.setBackground(new java.awt.Color(93, 92, 99));
        jTextField9.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(254, 254, 254));
        jTextField9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField9.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 1, 1));
        jLabel12.setText("AUTHOR");

        jTextField10.setBackground(new java.awt.Color(93, 92, 99));
        jTextField10.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(254, 254, 254));
        jTextField10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField10.setOpaque(false);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(1, 1, 1));
        jLabel13.setText("ISSUE/RETURN STUDENT ID");

        jTextField11.setBackground(new java.awt.Color(93, 92, 99));
        jTextField11.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(254, 254, 254));
        jTextField11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField11.setOpaque(false);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(156, 156, 156));
        jButton7.setFont(new java.awt.Font("Sawasdee", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(1, 1, 1));
        jButton7.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/pics/icons8-Package.png")); // NOI18N
        jButton7.setText("ISSUE");
        jButton7.setToolTipText("ISSUE A BOOK");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(156, 156, 156));
        jButton12.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(254, 254, 254));
        jButton12.setText("CHOOSE ISSUE DATE");
        jButton12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(156, 156, 156));
        jButton13.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(254, 254, 254));
        jButton13.setText("CHOOSE RETURN DATE");
        jButton13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton13MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton13MouseEntered(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(156, 156, 156));
        jButton16.setFont(new java.awt.Font("Sawasdee", 1, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(254, 254, 254));
        jButton16.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Package.png")); // NOI18N
        jButton16.setText("RETURN");
        jButton16.setToolTipText("RETURN A BOOK");
        jButton16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton16MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton16MouseEntered(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(254, 254, 254));
        jButton17.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Rotate Left Filled.png")); // NOI18N
        jButton17.setToolTipText("Clear the Field");
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton17MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton17MouseEntered(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(254, 254, 254));
        jButton18.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Rotate Left Filled.png")); // NOI18N
        jButton18.setToolTipText("Clear the Field");
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton18MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton18MouseEntered(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(254, 254, 254));
        jButton19.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Rotate Left Filled.png")); // NOI18N
        jButton19.setToolTipText("Clear the Field");
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton19MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton19MouseEntered(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(156, 156, 156));
        jButton20.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(254, 254, 254));
        jButton20.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Briefcase.png")); // NOI18N
        jButton20.setText("CHECK");
        jButton20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel11)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton20)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16)
                        .addGap(25, 25, 25))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton20))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton7)
                                .addComponent(jButton16))
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN CODE", "BOOK NAME", "AUTHOR", "DATE OF ISSUE", "DATE OF RETURN", "ISSUED BY ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(156, 156, 156));
        jButton1.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Hospital.png")); // NOI18N
        jButton1.setText("ADD NEW BOOK");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(156, 156, 156));
        jButton2.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(254, 254, 254));
        jButton2.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Delete.png")); // NOI18N
        jButton2.setText("DELETE A BOOK");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(156, 156, 156));
        jButton3.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(254, 254, 254));
        jButton3.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Life Cycle Filled.png")); // NOI18N
        jButton3.setText("UPDATE BOOK INFO");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(156, 156, 156));
        jButton8.setFont(new java.awt.Font("Sawasdee", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(254, 254, 254));
        jButton8.setText("CLEAR TABLE");
        jButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(156, 156, 156));
        jButton9.setFont(new java.awt.Font("Sawasdee", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(254, 254, 254));
        jButton9.setText("SHOW DATABASE");
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 254, 254));
        jLabel14.setText("LIBRARY BOOK RECORDS");

        jButton15.setFont(new java.awt.Font("Sawasdee", 0, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(254, 254, 254));
        jButton15.setIcon(new javax.swing.ImageIcon("/home/mohit/Desktop/New pics/icons8-Rotate Left Filled.png")); // NOI18N
        jButton15.setText("CLEAR FIELDS");
        jButton15.setToolTipText("Clear Fields");
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton15MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton15MouseEntered(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Sawasdee", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addGap(43, 43, 43)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Academics a=new Academics();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date=dFormat.format(jDateChooser1.getDate());
        jTextField7.setText(date);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date=dFormat.format(jDateChooser2.getDate());
        jTextField8.setText((date));
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseExited
        // TODO add your handling code here:
        jButton14.setForeground(Color.white);
    }//GEN-LAST:event_jButton14MouseExited

    private void jButton14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseEntered
        // TODO add your handling code here:
        jButton14.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jButton14MouseEntered

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
       clear();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseExited
        // TODO add your handling code here:
        jButton15.setForeground(Color.white);
    }//GEN-LAST:event_jButton15MouseExited

    private void jButton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseEntered
        // TODO add your handling code here:
        jButton15.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jButton15MouseEntered

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        clear1();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        invisible1();
        jButton4.setEnabled(true);
        clear();
        jLabel7.setText("Add A New Book");
        jButton1.setForeground(Color.ORANGE);
        jButton2.setForeground(Color.white);
        jButton3.setForeground(Color.white);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        invisible2();
        jButton5.setEnabled(true);
        jLabel7.setText("Delete A Book");
        clear();
        jButton1.setForeground(Color.white);
        jButton2.setForeground(Color.ORANGE);
        jButton3.setForeground(Color.white);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        visible1();
        jLabel7.setText("Update Book Info");
        clear();
        jButton3.setForeground(Color.ORANGE);
        jButton2.setForeground(Color.white);
        jButton1.setForeground(Color.white);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setText("[ADD A NEW BOOK]");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
         jButton1.setText("ADD A NEW BOOK");
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
          jButton2.setText("[DELETE A BOOK]");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setText("DELETE A BOOK");
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setText("[UPDATE BOOK INFO]");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setText("UPDATE BOOK INFO");
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        cleartable();
        if(jTextField1.getText().equals("")==true || jTextField2.getText().equals("")==true || jTextField3.getText().equals("")==true)
        {JOptionPane.showMessageDialog(null, "Please enter Book information!");}
        
        int a=Integer.parseInt(jTextField1.getText());
        String b=jTextField2.getText();
        String c=jTextField3.getText();
        try
         {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","mohit");
        Statement st=con.createStatement();
        st.executeUpdate("insert into book values("+a+",'"+b+"','"+c+"',null,null,null)");
        JOptionPane.showMessageDialog(null,"Successfully added the book!");
        cleartable();
        clear1();
        showtable();
        contain();
         }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null,"Either Book isbn already exists or Connection Error!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        cleartable();
        showtable();
        contain();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        cleartable();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
        jButton8.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        // TODO add your handling code here:
         jButton8.setForeground(Color.white);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        // TODO add your handling code here:
         jButton9.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
         jButton9.setForeground(Color.white);
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals("")==true)
        {JOptionPane.showMessageDialog(null, "Please enter book information!");}
         
        else{ 
            
            int a=Integer.parseInt(jTextField1.getText());
       
            try
         {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","mohit"); Statement st1=con.createStatement();
       
        if(jTextField12.getText().equals("null")==true)
        {int b=JOptionPane.showConfirmDialog(null, "Are You sure You Want to delete this book?","Sure Delete?",2);
            if(JOptionPane.YES_OPTION==b)
            {st1.executeUpdate("delete from book where isbn="+a+"");
        JOptionPane.showMessageDialog(null,"Book Successfully Deleted!");}
        clear();
        cleartable();
        clear1();
        showtable();
        contain();
         }
        else 
        { JOptionPane.showMessageDialog(null,"Either A Book is issued on this record\nor the book does not exist!","CANNOT DELETE BOOK",1);
        clear();
        }
        
        }
          catch(Exception ee)
          {
          JOptionPane.showMessageDialog(null,"Unexpected Error!");
          }
       
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        jTextField2.setText(""); 
        jTextField3.setText(""); 
        jTextField12.setText(""); 
        int a=Integer.parseInt(jTextField1.getText());
        try
         {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","mohit");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from book where isbn="+a+"");
         while(rs.next())
         {
         jTextField2.setText(""+rs.getString("bookname"));
         jTextField3.setText(""+rs.getString("author"));
         jTextField12.setText(""+rs.getString("id"));
         }
         }
        catch(Exception c)
        {
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        int a=Integer.parseInt(jTextField4.getText());
        String b=jTextField9.getText();
        String c=jTextField10.getText();
        String d=jTextField7.getText();
        String e=jTextField8.getText();
         int f=Integer.parseInt(jTextField11.getText());
        
         if(b.isEmpty()==true || c.isEmpty()==true || d.isEmpty()==true || e.isEmpty()==true)
         {
         JOptionPane.showMessageDialog(null, "Enter Book name please!");
         }
         
         else{try
         {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","mohit");
        Statement st=con.createStatement();
        Statement s1=con.createStatement();
        Statement s2=con.createStatement();
        Statement s3=con.createStatement();
        Statement s4=con.createStatement();
        Statement s5=con.createStatement();
        int xx=JOptionPane.showConfirmDialog(null, "Sure Issue this book?");
        if(JOptionPane.YES_OPTION==xx)
        {
        s2.executeUpdate("update book set doi='"+d+"' where isbn="+a+"");
        s3.executeUpdate("update book set dor='"+e+"' where isbn="+a+"");
        s4.executeUpdate("update book set id='"+f+"' where isbn="+a+"");
        }
        
        cleartable();
        showtable();
        JOptionPane.showMessageDialog(null,"Issued Book on STUDENT ID-"+f);
         }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null, "Error while Issuing book!");
        }
         }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int a=Integer.parseInt(jTextField1.getText());
        String b=jTextField2.getText();
        String c=jTextField3.getText();
        String d=jTextField5.getText();
        String e=jTextField6.getText();
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        cleartable();
        if(jTextField5.getText().equals("")==true || jTextField6.getText().equals("")==true)
             {JOptionPane.showMessageDialog(null, "Please enter book information!");}
        
        else{ try
         {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","mohit");
        Statement st=con.createStatement();
        Statement st1=con.createStatement();
        st.executeUpdate("update book set bookname='"+d+"' where isbn="+a+"");
        st1.executeUpdate("update book set author='"+e+"' where isbn="+a+"");
        cleartable();
        clear();
        clear1();
        showtable();
         JOptionPane.showMessageDialog(null, "Successfully updated book record!");
         }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null, "Error In Fetching Record");
        }}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
       jTextField9.setText("");
       jTextField10.setText("");
       jTextField8.setText("");
       jTextField7.setText("");
       jTextField11.setText("");
        int a=Integer.parseInt(jTextField4.getText());
        if(jTextField4.getText().equals("")==true)
         {
         JOptionPane.showMessageDialog(null,"Enter Book name please!");
         }
         
         try
         {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","mohit");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from book where isbn="+a+"");
        while(rs.next())
         {
         jTextField9.setText(""+rs.getString("bookname"));
         jTextField10.setText(""+rs.getString("author"));
         jTextField7.setText(""+rs.getString("doi"));
         jTextField8.setText(""+rs.getString("dor"));
         jTextField11.setText(""+rs.getString("id"));
         }
         }
        catch(Exception E)
        {
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
       
        int a=Integer.parseInt(jTextField4.getText());
        String b=jTextField9.getText();
        String c=jTextField10.getText();
        String d=jTextField7.getText();
        String e=jTextField8.getText();
         int f=Integer.parseInt(jTextField11.getText());
        int mm=0;
         if(jTextField4.getText().equals("")==true)
         {
         JOptionPane.showMessageDialog(null,"Enter Book name please!");
         }
         
         try
         {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","mohit");
        Statement s2=con.createStatement();
        Statement s3=con.createStatement();
        Statement s4=con.createStatement();
        int xx=JOptionPane.showConfirmDialog(null, "Sure Return this book?");
        if(JOptionPane.YES_OPTION==xx)
        {
        s2.executeUpdate("update book set doi="+null+" where isbn="+a+"");
        s3.executeUpdate("update book set dor="+null+" where isbn="+a+"");
        s4.executeUpdate("update book set id="+null+" where isbn="+a+"");
        cleartable();
        showtable();
        JOptionPane.showMessageDialog(null,"Returned Book from STUDENT ID-"+f);
        }
         }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null, "Error while Returning book!");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17MouseExited

    private void jButton17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17MouseEntered

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        jTextField7.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18MouseExited

    private void jButton18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18MouseEntered

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        jTextField8.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19MouseExited

    private void jButton19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19MouseEntered

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        jTextField11.setText("");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        // TODO add your handling code here:
         jButton12.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        // TODO add your handling code here:
         jButton12.setForeground(Color.white);
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseEntered
        // TODO add your handling code here:
         jButton13.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jButton13MouseEntered

    private void jButton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseExited
        // TODO add your handling code here:
         jButton13.setForeground(Color.white);
    }//GEN-LAST:event_jButton13MouseExited

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        jTextField9.setText("");
       jTextField10.setText("");
       jTextField8.setText("");
       jTextField7.setText("");
       jTextField11.setText("");
        int a=Integer.parseInt(jTextField4.getText());
       
         
       try
         {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","mohit");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from book where isbn="+a+"");
        while(rs.next())
         {
         jTextField9.setText(""+rs.getString("bookname"));
         jTextField10.setText(""+rs.getString("author"));
         jTextField7.setText(""+rs.getString("doi"));
         jTextField8.setText(""+rs.getString("dor"));
         jTextField11.setText(""+rs.getString("id"));
         }
        if(jTextField9.getText().isEmpty()==true)
        {JOptionPane.showMessageDialog(null, "No Book Found");}
         }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null,"Connection Error");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        jButton7.setForeground(Color.white);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
        jButton7.setForeground(Color.black);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseEntered
        // TODO add your handling code here:
        jButton16.setForeground(Color.black);
    }//GEN-LAST:event_jButton16MouseEntered

    private void jButton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseExited
        // TODO add your handling code here:
        jButton16.setForeground(Color.white);
    }//GEN-LAST:event_jButton16MouseExited

    private void jButton21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseExited
        // TODO add your handling code here:
         jButton21.setForeground(Color.white);
    }//GEN-LAST:event_jButton21MouseExited

    private void jButton21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseEntered
        // TODO add your handling code here:
       jButton21.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jButton21MouseEntered

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "You Are About To Log-Out Current Session!\nSure Proceed?","Sure Log-Out?",1);
        if(JOptionPane.YES_OPTION==a)
        {LOGIN l=new LOGIN();
            l.setVisible(true);
            this.dispose();}
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(issuereturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issuereturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issuereturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issuereturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issuereturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
