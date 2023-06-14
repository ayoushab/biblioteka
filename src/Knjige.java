
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zen Pro
 */
public class Knjige extends javax.swing.JInternalFrame {

    /**
     * Creates new form Knjige
     */
    
    ConnectionBase _db = new ConnectionBase();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public Knjige() {
        initComponents();
        tabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        printajBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pretTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabK = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setText("Biblioteka");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 40));

        printajBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        printajBtn.setText("Printaj");
        getContentPane().add(printajBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Pretrazi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        pretTxt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pretTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretTxtActionPerformed(evt);
            }
        });
        pretTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pretTxtKeyReleased(evt);
            }
        });
        getContentPane().add(pretTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 190, 30));

        tabK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabK);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 920, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void tabela()
    {
        try{
            con = _db.ConnectBase();
            String sql = "SELECT `kid`, `naziv`, `sifra`, `kategorija`, `autor`, `godina`, `tip`, `cena`, `ozn` FROM `dodajknjigu` ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tabK.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }catch (Exception e) 
        {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    private void pretTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretTxtActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_pretTxtActionPerformed

    private void pretTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pretTxtKeyReleased
        // TODO add your handling code here:
          {
        try{
            con = _db.ConnectBase();
            String sql = "SELECT `kid`, `naziv`, `sifra`, `kategorija`, `autor`, `godina`, `tip`, `cena`, `ozn` FROM `dodajknjigu` where naziv like '%"+pretTxt.getText()+"%' ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tabK.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }catch (Exception e) 
        {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    } 
    }//GEN-LAST:event_pretTxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pretTxt;
    private javax.swing.JButton printajBtn;
    private javax.swing.JTable tabK;
    // End of variables declaration//GEN-END:variables
}
