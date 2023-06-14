
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
public class IznajmitiKnjigu extends javax.swing.JInternalFrame {

    /**
     * Creates new form IznajmitiKnjigu
     */
      ConnectionBase _db = new ConnectionBase();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public IznajmitiKnjigu() {
        initComponents();
        ucitajNaslove();
        ucitajClanove();
        autoid();
       
        
        LocalDate today =LocalDate.now();
        LocalDate reday = today.plus(10, ChronoUnit.DAYS);
        iznTxt.setText(today.toString());
        povTxt.setText(reday.toString());
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

        izdatiBtn = new javax.swing.JButton();
        obrisiBtn = new javax.swing.JButton();
        knjigaTxt = new javax.swing.JTextField();
        clanTxt = new javax.swing.JTextField();
        nazivTxt = new javax.swing.JTextField();
        imeTxt = new javax.swing.JTextField();
        tipCTxt = new javax.swing.JTextField();
        tipKTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        povTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        iznaibrTxt = new javax.swing.JTextField();
        jcbClan = new javax.swing.JComboBox<>();
        jcbKnjige = new javax.swing.JComboBox<>();
        j = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        iznTxt = new javax.swing.JTextField();
        tabelaPane = new javax.swing.JScrollPane();
        tabelaIzna = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        izdatiBtn.setBackground(new java.awt.Color(255, 255, 255));
        izdatiBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        izdatiBtn.setText("Izdati");
        izdatiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izdatiBtnActionPerformed(evt);
            }
        });
        getContentPane().add(izdatiBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 80, 30));

        obrisiBtn.setBackground(new java.awt.Color(255, 255, 255));
        obrisiBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        obrisiBtn.setText("Obrisi");
        obrisiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisiBtnActionPerformed(evt);
            }
        });
        getContentPane().add(obrisiBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 80, 30));

        knjigaTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        knjigaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knjigaTxtActionPerformed(evt);
            }
        });
        knjigaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                knjigaTxtKeyReleased(evt);
            }
        });
        getContentPane().add(knjigaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, 40));

        clanTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clanTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clanTxtActionPerformed(evt);
            }
        });
        clanTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clanTxtKeyReleased(evt);
            }
        });
        getContentPane().add(clanTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 100, 40));

        nazivTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nazivTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazivTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nazivTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 250, 30));

        imeTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        imeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(imeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 250, 30));

        tipCTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(tipCTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 250, 30));

        tipKTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(tipKTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 250, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Knjiga ID");
        jLabel4.setPreferredSize(new java.awt.Dimension(850, 500));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Naziv");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 100, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Ime");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 100, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Iznajmljivanje");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 130, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Tip Knjige");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 100, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Tip Clana");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 100, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel3.setText("Iznajmljivanje");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 920, 50));
        getContentPane().add(povTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 200, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Povratak");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 100, 40));

        iznaibrTxt.setEditable(false);
        iznaibrTxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        iznaibrTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iznaibrTxtActionPerformed(evt);
            }
        });
        getContentPane().add(iznaibrTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 100, 30));

        jcbClan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izaberite id" }));
        jcbClan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClanActionPerformed(evt);
            }
        });
        getContentPane().add(jcbClan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        jcbKnjige.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Izaberite id" }));
        jcbKnjige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbKnjigeActionPerformed(evt);
            }
        });
        getContentPane().add(jcbKnjige, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        j.setText("jLabel10");
        getContentPane().add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Clan ID");
        jLabel12.setPreferredSize(new java.awt.Dimension(850, 500));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 100, 40));
        getContentPane().add(iznTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 200, 30));

        tabelaIzna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaIzna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaIznaMouseClicked(evt);
            }
        });
        tabelaPane.setViewportView(tabelaIzna);

        getContentPane().add(tabelaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 940, 210));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void autoid()
    {
        try {
            con = _db.ConnectBase();
            String sql = "SELECT `iznaid` FROM `iznajmljivanje` ORDER BY iznaid DESC LIMIT 1 ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           if(rs.next())
           {
               String rb = rs.getString("iznaid");
               int rac = rb.length();
               String t = rb.substring(0, 2);
               String b = rb.substring(2, rac);
               int br = Integer.parseInt(b);
               br++;
               String sb = Integer.toString(br);
               String txt = t+sb;
               iznaibrTxt.setText(txt);
               
           }
           else
           {
               iznaibrTxt.setText("IZ0000");
           }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
            
        }
    }
 
  private void tabela()
    {
        try{
            con = _db.ConnectBase();
            String sql = "SELECT `iznaid`, `cid`, `kid`, `datumuzimanje`, `datumvrac` FROM `iznajmljivanje` ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tabelaIzna.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }catch (Exception e) 
        {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
  String kid;
  String cid;
  
    private void izdatiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izdatiBtnActionPerformed
        // TODO add your handling code here:
        
        String iznaid=iznaibrTxt.getText();
        //String cid = clanTxt.getText();
//        String kid = dajIdKnjige(jcb.getSelectedItem().toString());
         //String kid = knjigaTxt.getText();
        String izn = iznTxt.getText();
        String pov = povTxt.getText();
        
        
        
         try {
           con = _db.ConnectBase();
            String sql="INSERT INTO `iznajmljivanje`(`iznaid`, `cid`, `kid`, `datumuzimanje`, `datumvrac`, ozn)  VALUES ('"+iznaid+"','"+cid+"','"+kid+"','"+izn+"','"+pov+"','0')";
             pst = con.prepareStatement(sql);
            pst.execute();
                JOptionPane.showMessageDialog(rootPane, "Uspesno ste uneli!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
         tabela();
         clear();
         autoid();
         update();
    }//GEN-LAST:event_izdatiBtnActionPerformed
    private void update()
    {
    try {
           con = _db.ConnectBase();
            String sql="UPDATE `dodajknjigu` SET `ozn`='1' WHERE kid='"+knjigaTxt.getText()+"'";
             pst =  con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Uspesno ste updateovali!");
            tabela();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    
    }
    private void clear()
    {
        clanTxt.setText("");
        knjigaTxt.setText("");
        imeTxt.setText("");
        nazivTxt.setText("");
        tipCTxt.setText("");
        tipKTxt.setText("");
       
    }
    private void obrisiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisiBtnActionPerformed
        // TODO add your handling code here:
        clear();

       

    }//GEN-LAST:event_obrisiBtnActionPerformed

    private void knjigaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knjigaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_knjigaTxtActionPerformed

    private void nazivTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazivTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazivTxtActionPerformed

    private void imeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imeTxtActionPerformed

    private void tabelaIznaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaIznaMouseClicked
        // TODO add your handling code here:
   
    }//GEN-LAST:event_tabelaIznaMouseClicked

    private void clanTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clanTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clanTxtActionPerformed

    private void iznaibrTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iznaibrTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iznaibrTxtActionPerformed

    private void clanTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clanTxtKeyReleased
        // TODO add your handling code here:
         try {
            con = _db.ConnectBase();
            String sql = "SELECT `ime`,`tip` FROM `dodajclan` WHERE cid='"+clanTxt.getText()+"' ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           if(rs.next())
           {
              imeTxt.setText(rs.getString("ime"));
              tipCTxt.setText(rs.getString("tip"));
           }
           else{
               imeTxt.setText("");
               tipCTxt.setText("");
           }
           
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }//GEN-LAST:event_clanTxtKeyReleased
    private void ucitajNaslove()
    {
        String sql = "SELECT * FROM `dodajknjigu`";
         try {
             con = _db.ConnectBase();
            
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           while(rs.next())
           {
               jcbKnjige.addItem(rs.getString("naziv"));
              }
           
           
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    private void ucitajClanove()
    {
        String sql = "SELECT * FROM `dodajclan`";
         try {
             con = _db.ConnectBase();
            
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           while(rs.next())
           {
               jcbClan.addItem(rs.getString("ime"));
              }
           
           
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    private String dajIdKnjige(String n)
    {
        String sql = "SELECT * FROM `dodajknjigu` where naziv = ? ";
        kid = "";
         try {
             con = _db.ConnectBase();
            
            pst = con.prepareStatement(sql);
            pst.setString(1, n);
            rs = pst.executeQuery();
           if(rs.next())
           {
               kid = rs.getString("kid");
           }
           
           
         } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
         return kid;
    }
    
     private String dajIdClana(String n)
    {
        String sql = "SELECT * FROM `dodajclan` where ime = ? ";
        cid = "";
         try {
             con = _db.ConnectBase();
            
            pst = con.prepareStatement(sql);
            pst.setString(1, n);
            rs = pst.executeQuery();
           if(rs.next())
           {
               cid = rs.getString("cid");
           }
           
           
         } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
         return cid;
    }
    
    private void knjigaTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_knjigaTxtKeyReleased
        // TODO add your handling code here:
        try {
             con = _db.ConnectBase();
            String sql = "SELECT `naziv`, `tip` FROM `dodajknjigu` WHERE kid='"+knjigaTxt.getText()+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           if(rs.next())
           {
              nazivTxt.setText(rs.getString("naziv"));
              tipKTxt.setText(rs.getString("tip"));
           }
           else{
               nazivTxt.setText("");
               tipKTxt.setText("");
           }
           
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }//GEN-LAST:event_knjigaTxtKeyReleased

    private void jcbKnjigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbKnjigeActionPerformed
        // TODO add your handling code here:
         kid = dajIdKnjige(jcbKnjige.getSelectedItem().toString());
         knjigaTxt.setText(kid);
    }//GEN-LAST:event_jcbKnjigeActionPerformed

    private void jcbClanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClanActionPerformed
        // TODO add your handling code here:
        cid = dajIdClana(jcbClan.getSelectedItem().toString());
         clanTxt.setText(cid);
    }//GEN-LAST:event_jcbClanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clanTxt;
    private javax.swing.JTextField imeTxt;
    private javax.swing.JButton izdatiBtn;
    private javax.swing.JTextField iznTxt;
    private javax.swing.JTextField iznaibrTxt;
    private javax.swing.JLabel j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcbClan;
    private javax.swing.JComboBox<String> jcbKnjige;
    private javax.swing.JTextField knjigaTxt;
    private javax.swing.JTextField nazivTxt;
    private javax.swing.JButton obrisiBtn;
    private javax.swing.JTextField povTxt;
    private javax.swing.JTable tabelaIzna;
    private javax.swing.JScrollPane tabelaPane;
    private javax.swing.JTextField tipCTxt;
    private javax.swing.JTextField tipKTxt;
    // End of variables declaration//GEN-END:variables
}