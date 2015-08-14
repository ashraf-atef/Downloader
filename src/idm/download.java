/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package idm;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.omg.CORBA.PRIVATE_MEMBER;


/**
 *
 * @author Ashraf
 */
public class download implements Runnable {

  
    URL url = null;
    String name = null;
    int seq = 0;
    public int tranfser_rate = 1;
    byte[] buffer;
      DefaultTableModel model ;
      // DefaultTableModel model_start_idm ;
       
       boolean flag_stop=false;
    public download(String u, String n, int s)  {
        try {
            url = new URL(u);
        } catch (MalformedURLException ex) {
            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
        }
        name = n;
        seq = s;
        buffer = new byte[tranfser_rate];
       real_seq=seq;
    }
 //   int real_seq=seq;
    int real_seq;
    void set_real_seq()
    {
        start_idm ob=new start_idm();
         
                    for (int f=0 ; f<ob.ob_start.get(0).model_start_idm.getRowCount() ; f++)
                    {
                        if ((int)ob.ob_start.get(0).model_start_idm.getValueAt(f, 0)==seq)
                        {
                            real_seq=f;
                        }
                    }
    }
    void buffer_decleare()
    {
          start_idm ob=new start_idm();
        buffer= new byte[tranfser_rate];
        ob.model_start_idm.setValueAt(tranfser_rate, seq, 5);
    }
    //How to calculate a file size from URL in java

    public int getFileSize() {
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("HEAD");
            conn.getInputStream();
          
            return conn.getContentLength();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"fail to get size");
            return -1;
           
        } finally {
            conn.disconnect();
        }
    }

    void downloadFromUrl(URL url, String localFilename) throws IOException {
    //   try {
       // window_download ggg=new window_download(seq);
        InputStream is = null;
        FileOutputStream fos = null;
        
    
       long downloaded=0 ;
        
        try {
            URLConnection urlConn = url.openConnection();//connect

            is = urlConn.getInputStream();               //get connection inputstream
            fos = new FileOutputStream(localFilename);   //open outputstream to local file
            // Vector buffer = new Vector(tranfser_rate);
           // byte buffer=Byte.valueOf(String.valueOf(tranfser_rate));
                   //declare 4KB buffer
            
            int len=0;
            int gg = 0;
            long size=urlConn.getContentLengthLong();
            //while we have availble data, continue downloading and storing to local file
                start_idm ob=new start_idm();
          ob.ob_window_download.get(seq).jLabel_file_size.setText(String.valueOf(size));
             
          ob.ob_window_download.get(seq).jLabel_url.setText(String.valueOf(url));
           
        //  ob.setVisible(false);
          int row=1 ;
           
           //ob.model_start_idm=(DefaultTableModel)ob.jTable_start_idm.getModel();
          // ob.ob_start.get(0).model_start_idm.setRowCount(0);
        ob.ob_start.get(0).model_start_idm.addRow(new Object[]{seq,String.valueOf(url),localFilename,size,"Running",tranfser_rate,0,0});;
           //ob.model_start_idm.addRow(new Object[]{seq,String.valueOf(url),localFilename,size,"Running",tranfser_rate});
           
           
           
          model=(DefaultTableModel)ob.ob_window_download.get(seq).jTable1.getModel();
          
          model.setRowCount(0);
          
          
         
            while ((len = is.read(buffer)) > 0) {
                
                if (flag_stop==true)
                {
//                    int real_seq=-1;
//                    for (int f=0 ; f<ob.ob_start.get(0).model_start_idm.getRowCount() ; f++)
//                    {
//                        if ((int)ob.ob_start.get(0).model_start_idm.getValueAt(f, 0)==seq)
//                        {
//                            real_seq=f;
//                        }
//                    }
                    ob.ob_start.get(0).model_start_idm.setValueAt("Stoped", real_seq, 4);
                    break ;
                }
               synchronized (this)
                   
               {
                   if (flag)
                {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
               }
                
                System.out.println("len : "+len);
                fos.write(buffer, 0, len);
                downloaded += len;
                 ob.ob_window_download.get(seq).jLabel_transfer_rate.setText(String.valueOf(len));
                 ob.ob_window_download.get(seq).jLabel_downloaded.setText(String.valueOf(downloaded));
                System.out.println(downloaded+" "+size);
                System.out.println(downloaded*100/size);
                ob.ob_window_download.get(seq).jProgressBar2.setValue((int)(downloaded*100/size)  )   ; 
                 ob.ob_window_download.get(seq).jProgressBar4.setValue((int)(downloaded*100/size)  )   ; 
                  ob.ob_window_download.get(seq).jProgressBar7.setValue((int)(downloaded*100/size)  )   ; 
                   ob.ob_window_download.get(seq).jProgressBar8.setValue((int)(downloaded*100/size)  )   ; 
                    ob.ob_window_download.get(seq).jProgressBar9.setValue((int)(downloaded*100/size)  )   ; 
               model.addRow(new Object[]{row++,len,"Done!"});
               ob.ob_start.get(0).model_start_idm.setValueAt(downloaded, real_seq, 6);
               ob.ob_start.get(0).model_start_idm.setValueAt((int)(downloaded*100/size), real_seq, 7);
            }
           // System.out.println(gg);

        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } finally {
                if (fos != null) {
                    fos.close();
                }
            }
        }
        
//       }
//       catch (Exception e)
//       {
//           JOptionPane.showMessageDialog(null,"error for comminication :(");
//       }
//        
    }
    boolean flag = false;

    @Override
    public void run() {
        try {
            //while(true)
            {


                this.downloadFromUrl(url, name);
            }

        } catch (IOException ex) {
            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pauseThread() {
              start_idm ob=new start_idm();
//              int real_seq=-1;
//                    for (int f=0 ; f<ob.ob_start.get(0).model_start_idm.getRowCount() ; f++)
//                    {
//                        if ((int)ob.ob_start.get(0).model_start_idm.getValueAt(f, 0)==seq)
//                        {
//                            real_seq=f;
//                        }
//                    }
      //  JOptionPane.showMessageDialog(null, real_seq);
              flag = true;
         ob.ob_start.get(0).model_start_idm.setValueAt("Pause", real_seq, 4);
    }

    public synchronized  void  resumeThread() {
               start_idm ob=new start_idm();
        flag = false;
        notify();
//        int real_seq=-1;
//                    for (int f=0 ; f<ob.ob_start.get(0).model_start_idm.getRowCount() ; f++)
//                    {
//                        if ((int)ob.ob_start.get(0).model_start_idm.getValueAt(f, 0)==seq)
//                        {
//                            real_seq=f;
//                        }
//                    }
         ob.ob_start.get(0).model_start_idm.setValueAt("Running", real_seq, 4);
    }
}
