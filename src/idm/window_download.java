package idm;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.PaintContext;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.plaf.nimbus.AbstractRegionPainter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Boody
 */
public class window_download extends javax.swing.JFrame {
  CardLayout homeCard;
    /**
     * Creates new form window_download
     */
    
 
    
    public window_download(int seq) {
        initComponents();
        jLabel_squ.setVisible(false);
       jLabel_squ.setText(String.valueOf(seq));
        jProgressBar2.setValue(0);
       jPanel4.setBackground(Color.white);
     setSize(580, 480);  
     homeCard = (CardLayout) jPanel6.getLayout();
     homeCard.show(jPanel6,"card2");
     jTextField_download_limiter.setEditable(false);
       // setSize(549, 432);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton_pause = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar7 = new javax.swing.JProgressBar();
        jProgressBar8 = new javax.swing.JProgressBar();
        jProgressBar9 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_download_limiter = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel_url = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_status = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_file_size = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_downloaded = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_transfer_rate = new javax.swing.JLabel();
        jLabel_squ = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_speed_limiter = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel_status_download = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jButton_pause.setText("Pause");
        jButton_pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pauseActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_pause);
        jButton_pause.setBounds(340, 230, 90, 23);

        jButton2.setText("Cancle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(440, 230, 75, 23);

        jProgressBar2.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar2.setValue(50);
        jProgressBar2.setStringPainted(true);
        jPanel2.add(jProgressBar2);
        jProgressBar2.setBounds(20, 200, 506, 20);

        jProgressBar4.setForeground(new java.awt.Color(0, 102, 204));
        jProgressBar4.setValue(50);
        jProgressBar4.setString("");
        jProgressBar4.setStringPainted(true);
        jPanel2.add(jProgressBar4);
        jProgressBar4.setBounds(20, 260, 90, 20);

        jProgressBar7.setForeground(new java.awt.Color(0, 102, 204));
        jProgressBar7.setValue(50);
        jProgressBar7.setString("");
        jProgressBar7.setStringPainted(true);
        jPanel2.add(jProgressBar7);
        jProgressBar7.setBounds(110, 260, 140, 20);

        jProgressBar8.setForeground(new java.awt.Color(0, 102, 204));
        jProgressBar8.setValue(50);
        jProgressBar8.setString("");
        jProgressBar8.setStringPainted(true);
        jPanel2.add(jProgressBar8);
        jProgressBar8.setBounds(420, 260, 100, 20);

        jProgressBar9.setForeground(new java.awt.Color(0, 102, 204));
        jProgressBar9.setValue(50);
        jProgressBar9.setString("");
        jProgressBar9.setStringPainted(true);
        jPanel2.add(jProgressBar9);
        jProgressBar9.setBounds(250, 260, 170, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N", "Download", "Status"
            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 290, 500, 110);

        jPanel6.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Download rate");

        jCheckBox1.setText("use speed limiter");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField_download_limiter, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jCheckBox1)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_download_limiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel5, "card3");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_url.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_url.setText("link");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("status");

        jLabel_status.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_status.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_status.setText("Connecting");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("File size");

        jLabel_file_size.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_file_size.setText("128.55");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Downloaded");

        jLabel_downloaded.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_downloaded.setText("128.55");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Transfer rate");

        jLabel_transfer_rate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_transfer_rate.setText("100");

        jLabel_squ.setText("jLabel11");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_url, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel_status))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel_file_size, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(150, 150, 150))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_transfer_rate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_downloaded, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))))
                .addComponent(jLabel_squ)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_url)
                    .addComponent(jLabel_squ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_status))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_file_size))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_downloaded))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_transfer_rate))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel3, "card2");

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 10, 510, 150);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 31, 529, 540);

        jLabel_speed_limiter.setText("Speed limiter");
        jLabel_speed_limiter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_speed_limiterMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_speed_limiter, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_speed_limiter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(140, 10, 130, 20);

        jLabel_status_download.setText("Download status");
        jLabel_status_download.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_status_downloadMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_status_download, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_status_download, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 10, 120, 20);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-570)/2, (screenSize.height-501)/2, 570, 501);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pauseActionPerformed
        // TODO add your handling code here:
        start_idm ob=new start_idm();
       if (jButton_pause.getText().equals("Pause"))
       {
           ob.ob_download.get(Integer.parseInt(jLabel_squ.getText())).pauseThread();
           jButton_pause.setText("Resume");
       }
       else
       {
            ob.ob_download.get(Integer.parseInt(jLabel_squ.getText())).resumeThread();
            jButton_pause.setText("Pause");
       }
        
    }//GEN-LAST:event_jButton_pauseActionPerformed

    private void jLabel_speed_limiterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_speed_limiterMouseReleased
        // TODO add your handling code here:
        jPanel1.setBackground(Color.white);
        jPanel4.setBackground(new Color(240,240,240));
         
              homeCard.show(jPanel6,"card3");
    }//GEN-LAST:event_jLabel_speed_limiterMouseReleased

    private void jLabel_status_downloadMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_status_downloadMouseReleased
        // TODO add your handling code here:
         jPanel4.setBackground(Color.white);
        jPanel1.setBackground(new Color(240,240,240));
        if (jCheckBox1.isSelected())
        {
            String rate=jTextField_download_limiter.getText();
         try{  
             int rate_int=Integer.parseInt(rate);
             start_idm ob=new start_idm();
             ob.ob_download.get(Integer.parseInt(jLabel_squ.getText())).tranfser_rate=rate_int;
              ob.ob_download.get(Integer.parseInt(jLabel_squ.getText())).buffer_decleare();
         
         }catch(Exception e){}
            
        }
        homeCard.layoutContainer(jPanel6);
         homeCard.show(jPanel6,"card2");
    }//GEN-LAST:event_jLabel_status_downloadMouseReleased

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
     if (jCheckBox1.isSelected())
     {
        jTextField_download_limiter.setEditable(true);
     }
     else
     {
          jTextField_download_limiter.setEditable(false);
     }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         start_idm ob=new start_idm();
      
           ob.ob_download.get(Integer.parseInt(jLabel_squ.getText())).flag_stop=true;
           setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        start_idm ob=new start_idm();
        ob.ob_download.get(Integer.parseInt(jLabel_squ.getText())).flag_stop=true;
           setVisible(false);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new window_download(8).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton_pause;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel_downloaded;
    public javax.swing.JLabel jLabel_file_size;
    private javax.swing.JLabel jLabel_speed_limiter;
    private javax.swing.JLabel jLabel_squ;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JLabel jLabel_status_download;
    public javax.swing.JLabel jLabel_transfer_rate;
    public javax.swing.JLabel jLabel_url;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JProgressBar jProgressBar2;
    public javax.swing.JProgressBar jProgressBar4;
    public javax.swing.JProgressBar jProgressBar7;
    public javax.swing.JProgressBar jProgressBar8;
    public javax.swing.JProgressBar jProgressBar9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_download_limiter;
    // End of variables declaration//GEN-END:variables
}
