/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package protopatientchec;
import java.io.File;
 //Liquify.aex
  import java.security.MessageDigest;
import java.io.*; 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.security.MessageDigest;
import java.util.Scanner;
import java.util.zip.CRC32;

/*
*
 *
 * @author Ben struhl
 */
public class javaDoctor extends javax.swing.JFrame {

    /**
     * Creates new form javaDoctor
     */
    public javaDoctor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Result4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        Result6 = new javax.swing.JLabel();
        Result9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Result2 = new javax.swing.JLabel();
        spaceCheck = new javax.swing.JButton();
        Result1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Result3 = new javax.swing.JLabel();
        fileCheck = new javax.swing.JButton();
        deleteFile = new javax.swing.JButton();
        Result5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Result7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        Result10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        Result8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        Result4.setBackground(new java.awt.Color(0, 0, 0));
        Result4.setText(" Result");
        Result4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Result6.setBackground(new java.awt.Color(0, 0, 0));
        Result6.setText(" Result");
        Result6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        Result9.setBackground(new java.awt.Color(0, 0, 0));
        Result9.setText(" Result");
        Result9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setText("Test Processer Speed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                process(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 53, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 69, -1, -1));

        Result2.setBackground(new java.awt.Color(0, 0, 0));
        Result2.setText(" Result");
        Result2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.add(Result2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 218, 385, -1));

        spaceCheck.setBackground(new java.awt.Color(204, 204, 255));
        spaceCheck.setText("Get Usable Space");
        spaceCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaceCheckActionPerformed(evt);
            }
        });
        jPanel1.add(spaceCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 125, 146, -1));

        Result1.setBackground(new java.awt.Color(0, 0, 0));
        Result1.setText(" Result");
        Result1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.add(Result1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 385, -1));

        jLabel4.setText("*in Gigabytes ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 129, -1, -1));

        Result3.setBackground(new java.awt.Color(0, 0, 0));
        Result3.setText(" Result");
        Result3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.add(Result3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 154, 385, -1));

        fileCheck.setBackground(new java.awt.Color(255, 102, 255));
        fileCheck.setText("check files existence ");
        fileCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileCheckActionPerformed(evt);
            }
        });
        jPanel1.add(fileCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        deleteFile.setBackground(new java.awt.Color(255, 0, 51));
        deleteFile.setText("Delete File");
        deleteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFileActionPerformed(evt);
            }
        });
        jPanel1.add(deleteFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 251, -1, -1));

        Result5.setBackground(new java.awt.Color(0, 0, 0));
        Result5.setText(" Result");
        Result5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.add(Result5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 293, 378, 26));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Java Doctor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 1)); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 10, 33, 25));

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setText("Set Benchmark");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 102, 51));
        jButton3.setText("Trace IP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 220, -1));

        Result7.setBackground(new java.awt.Color(0, 0, 0));
        Result7.setText(" Result");
        Result7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.add(Result7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 385, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 185, 178, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 252, 178, -1));

        jButton4.setBackground(new java.awt.Color(102, 255, 51));
        jButton4.setText("password maker");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 331, 152, -1));

        Result10.setBackground(new java.awt.Color(0, 0, 0));
        Result10.setText(" Result");
        Result10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.add(Result10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 385, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "c:\\\\", "e:\\\\" }));
            jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox2ActionPerformed(evt);
                }
            });
            jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 184, -1, -1));

            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "c:\\\\", "e:\\\\" }));
                jComboBox3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jComboBox3ActionPerformed(evt);
                    }
                });
                jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 251, -1, -1));

                Result8.setBackground(new java.awt.Color(0, 0, 0));
                Result8.setText(" Result");
                Result8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

                jButton5.setBackground(new java.awt.Color(255, 204, 0));
                jButton5.setText("Defragger");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton5ActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Result8, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jButton5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(7, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Result8))
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // set varable would be 1 2 or 3
    }//GEN-LAST:event_jComboBox1ActionPerformed
    public static void benchmark(){
        
        long startTime = System.currentTimeMillis();
        long endtime = startTime + 600;
        int index = 0;
        while (true) {
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if (now > endtime){
                break;
            }
            index++;
        }
       
        Properties prop = new Properties();
	OutputStream output = null;
        String indexString = "" + index;
	try {
 
		output = new FileOutputStream("config.properties");
 
		
		prop.setProperty("benchmark",indexString );
		prop.store(output, null);
                     
	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
                                System.out.println("check2");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
 
	}
        
    }
    public void process(){
     String testBench = "" ;
	Properties prop = new Properties();
	InputStream input = null;
 
	try {
 
		input = new FileInputStream("config.properties");
		prop.load(input);
		testBench = prop.getProperty("benchmark");
 
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
       long foo = Integer.parseInt(testBench);
        this.Result1.setText("Running...");
        long startTime = System.currentTimeMillis();
        long endtime = startTime + 600;
        double index = 0;
        while (true) {
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if (now > endtime){
                break;
            }
            index++;
        }
       double percent = (index/foo) * 100 ;
        if(percent > 100){
        this.Result1.setText("your proccesor is working better or at its benchmark");
        }
        else{
        this.Result1.setText("your proccesor is working at " + percent + " %");
    }
    }
    private void deleteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFileActionPerformed
       Result5.setText("running");
        
        File[] roots = File.listRoots();
       
    
    for(int i = 0; i < roots.length ; i++)
        {
            
        System.out.println("Root["+i+"]:" + roots[i]);
           // fw.walk(roots[i].getAbsolutePath(),"1193.idrc");
        //walk(roots[i].getAbsolutePath(),jTextField4.getText());
             walk((String)jComboBox3.getSelectedItem(),jTextField4.getText());
        }
             
       /* try{
            String s = "h";
            String path = "";
        this.Result2.setText("Running..."); 
            String lo = this.jTextField4.getText();
         
      Process p =  Runtime.getRuntime().exec("del /p" + lo);
         this.Result5.setText("running......");  
         p.waitFor();      
         this.Result5.setText("finshed proccess");
        }
        catch(Exception e){
           e.printStackTrace();
            this.Result5.setText("error deleting"); 
         
        }
        */
    }//GEN-LAST:event_deleteFileActionPerformed

    private void fileCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileCheckActionPerformed
      this.Result2.setText("Running...");
 
        File[] roots = File.listRoots();
       
    
    for(int i = 0; i < roots.length ; i++)
        {
            
        System.out.println("Root["+i+"]:" + roots[i]);
           // fw.walk(roots[i].getAbsolutePath(),"1193.idrc");
     // find(roots[i].getAbsolutePath(),jTextField4.getText());
       find((String)jComboBox2.getSelectedItem(),jTextField3.getText());
        }
               
//  File f = null;
    //  f = new File(  "c:\\" + this.jTextField3.getText());
            /*    if(f.exists() && !f.isDirectory()){
            this.Result2.setText("HES AT THE FORTY THE FIFITY TOUCHDOWN");
            }
            else{
            this.Result2.setText("epic fail lolz");
            }
        */   
  /*  Scanner scanner = new Scanner(new InputStreamReader(System.in));
        
        try {
            Process p =  Runtime.getRuntime().exec("IF EXISTS " + this.jTextField3.getText() + " echo g");
            String input = scanner.nextLine();
            if(input == "g"){
              this.Result2.setText("file has been found");
            }
            else{
                this.Result2.setText("file cannot be found");
            }
        } catch (IOException ex) {
            Logger.getLogger(javaDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    */      
     
    }//GEN-LAST:event_fileCheckActionPerformed

    private void spaceCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceCheckActionPerformed
        this.Result3.setText("Running...");
        File file = new File("c:");
        long Freespace = file.getUsableSpace();

        this.Result3.setText((Freespace/1073741824) + " Gigabytes of usable space");
        
    }//GEN-LAST:event_spaceCheckActionPerformed

    private void process(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_process
        process();
    }//GEN-LAST:event_process
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   	      this.Result1.setText("Running...");
        long startTime = System.currentTimeMillis();
        long endtime = startTime + 600;
        int index = 0;
        while (true) {
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if (now > endtime){
                break;
            }
            index++;
        }
       
        Properties prop = new Properties();
	OutputStream output = null;
        String indexString = "" + index;
	try {
 
		output = new FileOutputStream("config.properties");
 
		
		prop.setProperty("benchmark",indexString );
		prop.store(output, null);
                     this.Result1.setText("benchmark set"); 
	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
                                 this.Result1.setText("benchmark set"); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
 
	}
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 String s = null;
 String ip = jTextField2.getText();
        try {
             
       
            Process p = Runtime.getRuntime().exec("ps -ef");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(p.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(p.getErrorStream()));
 
           
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
             
          
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
             
            System.exit(0);
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  /* 
        Result7.setText("running");
        String checksum = null;
        File[] roots = File.listRoots();
        try {
           checksum = getMD5Checksum(jTextField2.getText());
        } catch (Exception ex) {
            Logger.getLogger(javaDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    for(int i = 0; i < roots.length ; i++)
        {
            
        System.out.println("Root["+i+"]:" + roots[i]);
     try {
         // fw.walk(roots[i].getAbsolutePath(),"1193.idrc");
         //walk(roots[i].getAbsolutePath(),jTextField4.getText());
         dupDestory("c;\\",checksum);
     } catch (Exception ex) {
         Logger.getLogger(javaDoctor.class.getName()).log(Level.SEVERE, null, ex);
     }
        }
        */
//         String fileName = this.jTextField1.getText();
   /*   FileInputStream fis = new FileInputStream(File(fileName));
String orgianl = org.apache.commons.codec.digest.DigestUtils.md5Hex(fis);
       File f = new File(fileName);
       boolean skip = true;
         this.Result7.setText("Running... this may take a while");

       File[] files = f.listFiles();
   /*   for(int i = 0; i < files.length; i++){
    //  FileInputStream fis = new FileInputStream(File(files[i]));
//String test = DigestUtils.md5Hex(fis)
        
       if(test == orginal && skip == true){
       skip = false;
       continue;
       }
       else if(test == orginal){
       files[i].delete();
       }
      }
      this.Result7.setText("done");
          /* 
          Start Bat File
            Collection<File> files = FileUtils.listFiles(fileName, new String[]{"xlxs"}, true);
         v          Runtime.getRuntime().exec("cmd /c start build.bat");
          Usefull bat File
           useful when making program: http://superuser.com/questions/539416/removing-duplicate-files-through-batch-files-or-windows-7
          */
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    this.Result10.setText("running");
     String[] letterZ = {"error","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
       double x = Math.sqrt(Math.sin(Math.tan(Math.cos(Math.random())))) - Math.random() ;
       String password = String.valueOf(x);
       int rando = (int) Math.floor((Math.random() * 26));
       int randoTwo = (int) Math.floor((Math.random() * 26));
     this.Result10.setText( password.substring(2) + letterZ[rando].toUpperCase() + letterZ[randoTwo]);


          
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      this.Result8.setText("running..........");
      /* 
      C:\Apps\protopatientchec\src\hunterKillerDrone.bat
      */
          try {
Process p = Runtime.getRuntime().exec("cmd /c start H:\\NetBeansProjects\\Javadoctor without makeup\\src\\test.bat");
this.Result8.setText("running......");  
p.waitFor();      
this.Result8.setText("finshed proccess");
          }  catch (Exception ex) {
         this.Result8.setText("error");
              ex.printStackTrace();
      }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static byte[] createChecksum(String filename) throws Exception {
       InputStream fis =  new FileInputStream(filename);

       byte[] buffer = new byte[1024];
       MessageDigest complete = MessageDigest.getInstance("MD5");
       int numRead;

       do {
           numRead = fis.read(buffer);
           if (numRead > 0) {
               complete.update(buffer, 0, numRead);
           }
       } while (numRead != -1);

       fis.close();
       return complete.digest();
   }
     public static String getMD5Checksum(String filename) throws Exception {
       byte[] b = createChecksum(filename);
       String result = "";

       for (int i=0; i < b.length; i++) {
           result += Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
       }
       return result;
   }
     public void dupDestory( String path, String target ) throws Exception {
  System.out.println( "check");
           int i = 0;
            File root = new File( path );
            File[] list = root.listFiles();
            boolean toDo = true; 
            if (list == null) return;
 
            for ( File f : list ) {
                String ext = f.getName();
                String checksum = getMD5Checksum(ext);
                System.out.println(ext);
                if ( f.isDirectory() ) {
                    dupDestory( f.getAbsolutePath(),target);
                    System.out.println( "Dir:" + f.getAbsoluteFile() );
                   
                }
                else {
                    if(toDo == true && checksum == target){
                     toDo = false;
                     Result7.setText("Path: " + f.getPath());
                    }
                    else if(toDo == false && checksum == target){
                    System.out.println("delted");
                    }
                    System.out.println( "File:" + f.getAbsoluteFile() );
                }
            }
            i = 1;
            if(i == 0){
            Result5.setText("Process could not be completed");
            }
        }
   public void walk( String path, String target ) {
  System.out.println( "check");
           int i = 0;
            File root = new File( path );
            File[] list = root.listFiles();
 
            if (list == null) return;
 
            for ( File f : list ) {
                String ext = f.getName();
                System.out.println(ext);
                if ( f.isDirectory() ) {
                    walk( f.getAbsolutePath(),target);
                    System.out.println( "Dir:" + f.getAbsoluteFile() );
                    i = 1;
                }
                else {
                    if(ext.equals(target)){
                     Result5.setText("file does exist!");
                   //  f.delete();
                    }
                    System.out.println( "File:" + f.getAbsoluteFile() );
                }
            }
            if(i == 0){
            Result5.setText("file cannot be found");
            }
        }
public void find ( String path, String target ) {
  System.out.println( "check");
             int i = 0;
            File root = new File( path );
            File[] list = root.listFiles();
 
            if (list == null) return;
 
            for ( File f : list ) {
                String ext = f.getName();
                System.out.println(ext);
                if ( f.isDirectory() ) {
                    find( f.getAbsolutePath(),target);
                    System.out.println( "Dir: " + f.getAbsoluteFile() );
                }
                else {
                    if(ext.equals(target)){
                    System.out.println("found it");
                    Result2.setText("file deleted!");
                     i = 1;
                    //  f.delete();
                    }
                    System.out.println( "File: " + f.getAbsoluteFile() );
                }
            }
            if(i == 0){
            Result2.setText("file cannot be found");
            }
        
        }
        
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
            java.util.logging.Logger.getLogger(javaDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(javaDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(javaDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(javaDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
          System.out.println("check1");
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javaDoctor().setVisible(true);
                benchmark();
            }
        });
                
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Result1;
    private javax.swing.JLabel Result10;
    private javax.swing.JLabel Result2;
    private javax.swing.JLabel Result3;
    private javax.swing.JLabel Result4;
    private javax.swing.JLabel Result5;
    private javax.swing.JLabel Result6;
    private javax.swing.JLabel Result7;
    private javax.swing.JLabel Result8;
    private javax.swing.JLabel Result9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton deleteFile;
    private javax.swing.JButton fileCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton spaceCheck;
    // End of variables declaration//GEN-END:variables

 
}
