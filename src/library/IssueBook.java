/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cybotech
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("\\icons\\favicon.png")));
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        SecondryPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ml2 = new javax.swing.JLabel();
        ml3 = new javax.swing.JLabel();
        ml4 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        b1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ts1 = new javax.swing.JTextField();
        ts2 = new javax.swing.JTextField();
        ts4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        b2 = new javax.swing.JButton();
        ts3 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Issue Book");
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));
        MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 6, true));

        SecondryPanel.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons/issuebookicon.png"))); // NOI18N

        javax.swing.GroupLayout SecondryPanelLayout = new javax.swing.GroupLayout(SecondryPanel);
        SecondryPanel.setLayout(SecondryPanelLayout);
        SecondryPanelLayout.setHorizontalGroup(
            SecondryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondryPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SecondryPanelLayout.setVerticalGroup(
            SecondryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 5, true), " Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 40))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Book ID");

        ml2.setBackground(new java.awt.Color(255, 204, 204));
        ml2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ml2.setText("Title");

        ml3.setBackground(new java.awt.Color(255, 204, 204));
        ml3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ml3.setText("Author");

        ml4.setBackground(new java.awt.Color(255, 204, 204));
        ml4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ml4.setText("Cost");

        t2.setBackground(new java.awt.Color(255, 204, 204));
        t2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 50, 204));
        t2.setBorder(null);
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t1.setBackground(new java.awt.Color(255, 204, 204));
        t1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 50, 204));
        t1.setBorder(null);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t3.setBackground(new java.awt.Color(255, 204, 204));
        t3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 50, 204));
        t3.setBorder(null);
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        t4.setBackground(new java.awt.Color(255, 204, 204));
        t4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(0, 50, 204));
        t4.setBorder(null);
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        b1.setBackground(new java.awt.Color(238, 238, 238));
        b1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 153, 153));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons/search.PNG"))); // NOI18N
        b1.setText("Search");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ml4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ml3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ml2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(t3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(t4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(12, 12, 12)
                        .addComponent(b1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ml2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ml3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ml4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 5, true), "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 40))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Student ID");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Course");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Mobile No.");

        ts1.setBackground(new java.awt.Color(255, 204, 204));
        ts1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        ts1.setForeground(new java.awt.Color(0, 50, 204));
        ts1.setBorder(null);
        ts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts1ActionPerformed(evt);
            }
        });

        ts2.setBackground(new java.awt.Color(255, 204, 204));
        ts2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        ts2.setForeground(new java.awt.Color(0, 50, 204));
        ts2.setBorder(null);
        ts2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts2ActionPerformed(evt);
            }
        });

        ts4.setBackground(new java.awt.Color(255, 204, 204));
        ts4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        ts4.setForeground(new java.awt.Color(0, 50, 204));
        ts4.setBorder(null);
        ts4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts4ActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));

        b2.setBackground(new java.awt.Color(238, 238, 238));
        b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 153, 153));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons/search.PNG"))); // NOI18N
        b2.setText("Search");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        ts3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        ts3.setForeground(new java.awt.Color(0, 50, 204));
        ts3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Any One", "1.  BCA", "2.  BBM", "3.  B.Sc IT" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator9)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator6)
                    .addComponent(ts1)
                    .addComponent(ts2)
                    .addComponent(ts4)
                    .addComponent(ts3, 0, 173, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(b2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ts2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ts3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b2)))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ts4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 5, true), "Issue Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 40))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Date Of Issue");

        t8.setBackground(new java.awt.Color(255, 204, 204));
        t8.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        t8.setForeground(new java.awt.Color(0, 50, 204));
        t8.setBorder(null);
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator5)
                    .addComponent(t8, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        b3.setBackground(new java.awt.Color(238, 238, 238));
        b3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 153, 153));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons/issue.png"))); // NOI18N
        b3.setText("Issue");
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(238, 238, 238));
        b4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b4.setForeground(new java.awt.Color(0, 153, 153));
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons/displayissuedbook.png"))); // NOI18N
        b4.setText("Display All Issued Book");
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(238, 238, 238));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons/back.png"))); // NOI18N
        jButton4.setText("Back");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SecondryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(b3)
                                .addGap(95, 95, 95)
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(SecondryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b3)
                    .addComponent(b4))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(886, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        b1.setBackground(new Color(150,150,30));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setForeground(Color.WHITE);
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setBackground(new Color(238,238,238));
        b1.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_b1MouseExited

    private void ts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ts1ActionPerformed

    private void ts2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ts2ActionPerformed

    private void ts4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ts4ActionPerformed

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
        b2.setBackground(new Color(150,150,30));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setForeground(Color.WHITE);
    }//GEN-LAST:event_b2MouseEntered

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited
         b2.setBackground(new Color(238,238,238));
         b2.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_b2MouseExited

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
        b3.setBackground(new Color(150,150,30));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setForeground(Color.WHITE);
    }//GEN-LAST:event_b3MouseEntered

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
       b3.setBackground(new Color(238,238,238));
       b3.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_b3MouseExited

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        b4.setBackground(new Color(150,150,30));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setForeground(Color.WHITE);
    }//GEN-LAST:event_b4MouseEntered

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
       b4.setBackground(new Color(238,238,238));
       b4.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_b4MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new Color(150,150,30));
        jButton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton4.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new Color(238,238,238));
        jButton4.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new MainLibrary().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       if(t1.getText().trim().equals(""))
            JOptionPane.showMessageDialog(null,"Please Fill ID Of The Book","Error",JOptionPane.ERROR_MESSAGE);
            else
            {
                try
                {
                    String url="jdbc:oracle:thin:@localhost:1521:XE";
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection conn=DriverManager.getConnection(url,"Admin","abc12345");
                    PreparedStatement pst=conn.prepareStatement("select * from Book where ID=?");
                    pst.setInt(1,Integer.parseInt(t1.getText()));
                    ResultSet rs=pst.executeQuery();
                    PreparedStatement pst1=conn.prepareStatement("select * from ISSUEBook where BOOKID=?");
                    pst1.setInt(1,Integer.parseInt(t1.getText()));
                    ResultSet rs1=pst1.executeQuery();
                    if(rs1.next())
                    {
                      JOptionPane.showMessageDialog(null,"!! Sorry, Book ID "+t1.getText()+" is Already Issued To someone","Error",JOptionPane.ERROR_MESSAGE);
                      t1.setText("");
                      t1.grabFocus();
                    }
                    else
                     if(rs.next())
                       {
                        t2.setText(rs.getString(2));
                        t3.setText(rs.getString(3));
                        t4.setText(rs.getString(4));
                        t2.setEditable(false);
                        t3.setEditable(false);
                        t4.setEditable(false);
                        ts1.grabFocus();
                      }
                      else
                      {
                        JOptionPane.showMessageDialog(null,"!! Sorry, Book ID "+t1.getText()+" doesn't exist","Error",JOptionPane.ERROR_MESSAGE);
                      }
                    conn.close();
                }
                catch(ClassNotFoundException e)
                {
                    JOptionPane.showMessageDialog(null,"!! Driver Not Loaded, can't connect with database","Database Error",JOptionPane.ERROR_MESSAGE);
                }
                catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e.getMessage(),"SQL ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(ts1.getText().equals("") || ts3.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(null,"Please Fill Roll No. And Course Of the Student","Error",JOptionPane.ERROR_MESSAGE);
            else
            {
                try
                {
                    String url="jdbc:oracle:thin:@localhost:1521:XE";
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection conn=DriverManager.getConnection(url,"Admin","abc12345");
                    PreparedStatement pst=conn.prepareStatement("select * from student where roll=? AND Course=?");
                    pst.setInt(1,Integer.parseInt(ts1.getText()));
                    pst.setInt(2,(ts3.getSelectedIndex()));
                    ResultSet rs=pst.executeQuery();
                    if(rs.next())
                    {
                        ts2.setText(rs.getString(2));
                        ts3.setSelectedIndex(rs.getInt(3));
                        ts4.setText(rs.getString(4));
                        ts2.setEditable(false);
                        ts3.setEnabled(false);
                        ts4.setEditable(false);
                        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-YYYY");
		        Date today=new Date();
		        t8.setText(dateFormat.format(today));
                        t8.setEditable(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"!! Roll No. "+ts1.getText()+" in "+ts3.getSelectedItem()+" doesn't exist","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    conn.close();
                }
                catch(ClassNotFoundException e)
                {
                    JOptionPane.showMessageDialog(null,"!! Driver Not Loaded, can't connect with database","Database Error",JOptionPane.ERROR_MESSAGE);
                }
                catch(SQLException e)
                {
                    if(e.getErrorCode()==1)
                    {
                        JOptionPane.showMessageDialog(null,t1.getText()+" is Already Available","Error",JOptionPane.ERROR_MESSAGE);
                        ts1.setText("");
                    }
                    else
                    JOptionPane.showMessageDialog(null,e.getMessage(),"SQL ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
         if(t1.getText().trim().equals("") || ts1.getText().trim().equals("") || t8.getText().trim().equals(""))
            JOptionPane.showMessageDialog(null,"Please Fill Book ID, Roll No Of Student And Issue Date","Error",JOptionPane.ERROR_MESSAGE);
            else
            {
                try
                {
                    String url="jdbc:oracle:thin:@localhost:1521:XE";
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection conn=DriverManager.getConnection(url,"Admin","abc12345");
                    PreparedStatement pst=conn.prepareStatement("insert into issuebook values(?,?,?,?)");
                    pst.setInt(1,Integer.parseInt(t1.getText()));
                    pst.setInt(2,Integer.parseInt(ts1.getText()));
                    pst.setInt(3,(ts3.getSelectedIndex()));
                    
                    
                    SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		    java.util.Date today=dateFormat.parse(t8.getText());
		    java.sql.Date sqlDate=new java.sql.Date(today.getTime());
                    pst.setDate(4,sqlDate);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Book "+t2.getText()+" Issued To "+ts2.getText()+" Successfully\n Thank You !","Operation Successful",JOptionPane.INFORMATION_MESSAGE);
                    conn.close();
                    t1.setText(""); t2.setText(""); t3.setText(""); t4.setText(""); ts1.setText(""); ts2.setText(""); ts3.setSelectedIndex(0); ts4.setText(""); t8.setText("");
                    t1.setEditable(true); t2.setEditable(true); t3.setEditable(true); t4.setEditable(true); ts1.setEditable(true); ts2.setEditable(true); ts3.setEnabled(true); ts4.setEditable(true); t8.setEditable(true);
                }
                catch(ClassNotFoundException e)
                {
                    JOptionPane.showMessageDialog(null,"!! Driver Not Loaded, can't connect with database","Database Error",JOptionPane.ERROR_MESSAGE);
                }
                catch(SQLException e)
                {
                    if(e.getErrorCode()==1)
                    {
                        JOptionPane.showMessageDialog(null,t1.getText()+" is Already Available","Error",JOptionPane.ERROR_MESSAGE);
                        ts1.setText("");
                    }
                    else
                    JOptionPane.showMessageDialog(null,e.getMessage(),"SQL ERROR",JOptionPane.ERROR_MESSAGE);
                } catch (ParseException ex) {
                 Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
             }
            }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       new DisplayAllIssuedBook().setVisible(true);
    }//GEN-LAST:event_b4ActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SecondryPanel;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel ml2;
    private javax.swing.JLabel ml3;
    private javax.swing.JLabel ml4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField ts1;
    private javax.swing.JTextField ts2;
    private javax.swing.JComboBox<String> ts3;
    private javax.swing.JTextField ts4;
    // End of variables declaration//GEN-END:variables
}
