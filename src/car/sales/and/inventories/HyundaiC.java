package car.sales.and.inventories;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class HyundaiC extends javax.swing.JFrame {
 Connection conn=null;
    Statement stmt= null;
    ResultSet rs= null;
    public HyundaiC() {
       initComponents();
      conn= databaseconnection.connection();
      showHyundaiC();
    }
    public void showHyundaiC(){
    try{
        stmt=conn.createStatement();
        String sql=("select *from CARSALE.IONIQ");
        ResultSet res=stmt.executeQuery(sql);
         jTable3.setModel(DbUtils.resultSetToTableModel(res));
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e );
    }
    try{
        stmt=conn.createStatement();
        String sql=("select *from CARSALE.KONA");
        ResultSet res=stmt.executeQuery(sql);
         jTable4.setModel(DbUtils.resultSetToTableModel(res));
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e );
    }
    try{
        stmt=conn.createStatement();
        String sql=("select *from CARSALE.PALISADE");
        ResultSet res=stmt.executeQuery(sql);
         jTable5.setModel(DbUtils.resultSetToTableModel(res));
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e );
    }
    try{
        stmt=conn.createStatement();
        String sql=("select *from CARSALE.ACCENT");
        ResultSet res=stmt.executeQuery(sql);
         jTable2.setModel(DbUtils.resultSetToTableModel(res));
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e );
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel65 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jTextField49 = new javax.swing.JTextField();
        jButton71 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jTextField51 = new javax.swing.JTextField();
        jButton73 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jButton75 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jTextField53 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jTextField54 = new javax.swing.JTextField();
        jButton77 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jTextField55 = new javax.swing.JTextField();
        jButton79 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jButton81 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jTextField58 = new javax.swing.JTextField();
        jButton83 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jTextField59 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jTextField60 = new javax.swing.JTextField();
        jButton85 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 0, 0));
        jLabel65.setText("       Hyundai Ioniq");
        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 3));
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 230, 40));

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(102, 0, 0));
        jLabel69.setText("        Hyundai Kona");
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 3));
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 210, 40));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 0, 0));
        jLabel66.setText("Purchased");
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jTextField49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField49ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 170, 40));

        jButton71.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton71.setForeground(new java.awt.Color(102, 0, 0));
        jButton71.setText("Add");
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 120, 40));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 0, 0));
        jLabel67.setText("Stock");
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jTextField50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField50ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 170, 40));

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(102, 0, 0));
        jLabel68.setText("Sold");
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        getContentPane().add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 170, 40));

        jButton73.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton73.setForeground(new java.awt.Color(102, 0, 0));
        jButton73.setText("Delete");
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton73, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 120, 40));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(102, 0, 0));
        jLabel70.setText("Purchased");
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jTextField52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField52ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 170, 40));

        jButton75.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton75.setForeground(new java.awt.Color(102, 0, 0));
        jButton75.setText("Add");
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 120, 40));

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(102, 0, 0));
        jLabel71.setText("Stock");
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jTextField53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField53ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 170, 40));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(102, 0, 0));
        jLabel72.setText("Sold");
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));
        getContentPane().add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 170, 40));

        jButton77.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton77.setForeground(new java.awt.Color(102, 0, 0));
        jButton77.setText("Delete");
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 120, 40));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(102, 0, 0));
        jLabel73.setText("       Hyundai Palisade");
        jLabel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 3));
        getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 210, 40));

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(102, 0, 0));
        jLabel74.setText("Purchased");
        getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        jTextField55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField55ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField55, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 170, 40));

        jButton79.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton79.setForeground(new java.awt.Color(102, 0, 0));
        jButton79.setText("Add");
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton79, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 120, 40));

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(102, 0, 0));
        jLabel75.setText("Stock");
        getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        jTextField56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField56ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField56, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 170, 40));
        getContentPane().add(jTextField57, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, 170, 40));

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(102, 0, 0));
        jLabel76.setText("Sold");
        getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, -1, -1));

        jButton81.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton81.setForeground(new java.awt.Color(102, 0, 0));
        jButton81.setText("Delete");
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 120, 40));

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(102, 0, 0));
        jLabel78.setText("Purchased");
        getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, -1, -1));

        jTextField58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField58ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField58, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 170, 40));

        jButton83.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton83.setForeground(new java.awt.Color(102, 0, 0));
        jButton83.setText("Add");
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton83, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 120, 40));

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(102, 0, 0));
        jLabel79.setText("Stock");
        getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, -1, -1));

        jTextField59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField59ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField59, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 170, 40));

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(102, 0, 0));
        jLabel80.setText("Sold");
        getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 660, -1, -1));
        getContentPane().add(jTextField60, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, 170, 40));

        jButton85.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton85.setForeground(new java.awt.Color(102, 0, 0));
        jButton85.setText("Delete");
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 590, 120, 40));

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(102, 0, 0));
        jLabel77.setText("       Hyundai Accent");
        jLabel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 3));
        getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 210, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, -1, 50));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchased", "Stock", "Sold"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 380, 140));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchased", "Stock", "Sold"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 380, 150));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchased", "Stock", "Sold"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, 380, 160));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchased", "Stock", "Sold"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 710, 380, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField49ActionPerformed

    private void jTextField50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField50ActionPerformed

    private void jTextField52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField52ActionPerformed

    private void jTextField53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField53ActionPerformed

    private void jTextField55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField55ActionPerformed

    private void jTextField56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField56ActionPerformed

    private void jTextField58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField58ActionPerformed

    private void jTextField59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField59ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            this.hide();
            CarCollection Info = new CarCollection();
            Info.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        try{
           stmt = conn.createStatement();
           String Purchased=jTextField49.getText();
           String Stock=jTextField50.getText();
           String Sold=jTextField51.getText();
           String sql="insert into CARSALE.IONIQ(PURCHASED,STOCK,SOLD) VALUES('"+Purchased+"','"+Stock+"','"+Sold+"') ";
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521","CARSALE","123");
            stmt.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Data is successfully added" );
        jTextField49.setText("");
        jTextField50.setText("");
        jTextField51.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e );
        } 
        showHyundaiC();
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        try{
           stmt = conn.createStatement();
            String Purchased=jTextField49.getText();
           String Stock=jTextField50.getText();
           String Sold=jTextField51.getText();
           String sql="delete from CARSALE.IONIQ where STOCK='"+Stock+"'";
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521","CARSALE","123");
            stmt.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Data is successfully deleted" );
         jTextField49.setText("");
        jTextField50.setText("");
        jTextField51.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e );
        } 
       showHyundaiC();
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        try{
           stmt = conn.createStatement();
          String Purchased=jTextField52.getText();
           String Stock=jTextField53.getText();
           String Sold=jTextField54.getText();
           String sql="insert into CARSALE.KONA(PURCHASED,STOCK,SOLD) VALUES('"+Purchased+"','"+Stock+"','"+Sold+"') ";
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521","CARSALE","123");
            stmt.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Data is successfully added" );
        jTextField52.setText("");
        jTextField53.setText("");
        jTextField54.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e );
        } 
        showHyundaiC();
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
         try{
           stmt = conn.createStatement();
          String Purchased=jTextField52.getText();
           String Stock=jTextField53.getText();
           String Sold=jTextField54.getText();
           String sql="delete from CARSALE.KONA where STOCK='"+Stock+"'";
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521","CARSALE","123");
            stmt.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Data is successfully deleted" );
        jTextField52.setText("");
        jTextField53.setText("");
        jTextField54.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e );
        } 
       showHyundaiC();
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
       try{
           stmt = conn.createStatement();
          String Purchased=jTextField55.getText();
           String Stock=jTextField56.getText();
           String Sold=jTextField57.getText();
           String sql="insert into CARSALE.PALISADE(PURCHASED,STOCK,SOLD) VALUES('"+Purchased+"','"+Stock+"','"+Sold+"') ";
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521","CARSALE","123");
            stmt.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Data is successfully added" );
        jTextField55.setText("");
        jTextField56.setText("");
        jTextField57.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e );
        } 
        showHyundaiC();
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        try{
           stmt = conn.createStatement();
          String Purchased=jTextField55.getText();
           String Stock=jTextField56.getText();
           String Sold=jTextField57.getText();
           String sql="delete from CARSALE.PALISADE where STOCK='"+Stock+"'";
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521","CARSALE","123");
            stmt.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Data is successfully deleted" );
        jTextField55.setText("");
        jTextField56.setText("");
        jTextField57.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e );
        } 
       showHyundaiC();
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        try{
           stmt = conn.createStatement();
          String Purchased=jTextField58.getText();
           String Stock=jTextField59.getText();
           String Sold=jTextField60.getText();
           String sql="insert into CARSALE.ACCENT(PURCHASED,STOCK,SOLD) VALUES('"+Purchased+"','"+Stock+"','"+Sold+"') ";
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521","CARSALE","123");
            stmt.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Data is successfully added" );
        jTextField58.setText("");
        jTextField59.setText("");
        jTextField60.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e );
        } 
        showHyundaiC();
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        try{
           stmt = conn.createStatement();
         String Purchased=jTextField58.getText();
           String Stock=jTextField59.getText();
           String Sold=jTextField60.getText();
           String sql="delete from CARSALE.ACCENT where STOCK='"+Stock+"'";
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521","CARSALE","123");
            stmt.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Data is successfully deleted" );
        jTextField58.setText("");
        jTextField59.setText("");
        jTextField60.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e );
        } 
       showHyundaiC();
    }//GEN-LAST:event_jButton85ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HyundaiC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HyundaiC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HyundaiC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HyundaiC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HyundaiC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton85;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField60;
    // End of variables declaration//GEN-END:variables
}
