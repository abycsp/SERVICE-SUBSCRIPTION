package FinalProject;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    //ArrayList for Netflix
    ArrayList<String> basicNetflix = new ArrayList<>();
    ArrayList<String> standardNetflix = new ArrayList<>(); 
    ArrayList<String> premiumNetflix = new ArrayList<>(); 	  
    
    //Arraylist for HBO
    ArrayList<String> Hboplan1 = new ArrayList<>();
    ArrayList<String> HBOplan2 = new ArrayList<>(); 	
    ArrayList<String> HBOplan3 = new ArrayList<>();
    
    //Arraylist for Amazon Prime Videos
    ArrayList<String> BasicPrimeMembership = new ArrayList<>();
    ArrayList<String> StandardPrimeMembership = new ArrayList<>();
    ArrayList<String> PrimeMembershipGold = new ArrayList<>(); 
    
    public login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("NETFLIX");

        jButton1.setText("See Plan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setText("amazon");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("prime");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel6.setText("video");

        jButton3.setText("See Plan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(0, 51, 102));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DETAILS");

        jButton2.setText("Subscribe");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Resolution");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quality");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("code");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Enter Code:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel7)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel8))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(code)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(133, 133, 133))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("HBO");

        jButton5.setText("See Plan");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method for basic netflix-------------------------------------------------------
    public void basicNetFlix(){
            	  
	basicNetflix.add("BNF01"); 
        basicNetflix.add("450"); 
	basicNetflix.add("Good"); 
	basicNetflix.add("480p");
        display.setText("");
                
        String details;
        for(int i = 0; i <4; i++){
            details = basicNetflix.get(i).toString();
            display.append(details+ "\t");
        }
    }
    //setter
    public void setbasicNetflix(ArrayList basicNetflix) {
        this.basicNetflix = basicNetflix;
    }
 
    //getter
    public ArrayList getbasicNetflix() {
        return basicNetflix;
    }
    
    //method for standard netflix-------------------------------------------------------
    public void standardNetFlix(){
    	  
	standardNetflix.add("SNF02"); 
        standardNetflix.add("600"); 
	standardNetflix.add("Better"); 
	standardNetflix.add("1080p");
               
                
        display.append("\n");
        String details1;
        for(int i = 0; i <4; i++){
            details1 = standardNetflix.get(i).toString();
            display.append(details1+ "\t");
        }
    }
    //setter
    public void setstandardNetflix(ArrayList standardNetflix) {
        this.standardNetflix = standardNetflix;
    }
 
    //getter
    public ArrayList getstandardNetflix() {
        return standardNetflix;
    }
    
    //method for premium netflix-------------------------------------------------------
    public void premiumNetFlix(){
        
	premiumNetflix.add("PNF03"); 
        premiumNetflix.add("900"); 
	premiumNetflix.add("Best"); 
	premiumNetflix.add("4K + HDR");
        display.append("\n");
        String details2;
        for(int i = 0; i <4; i++){
            details2 = premiumNetflix.get(i).toString();
            display.append(details2+ "\t");
        }
    }
    //setter
    public void setpremiumNetFlix(ArrayList premiumNetflix) {
        this.premiumNetflix = premiumNetflix;
    }
 
    //getter
    public ArrayList getpremiumNetflix() {
        return premiumNetflix;
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        basicNetFlix();
        standardNetFlix();
        premiumNetFlix();
        
                
    }//GEN-LAST:event_jButton1ActionPerformed

    //method for HBOP1-------------------------------------------------------
    public void HBOP1(){
        
		  
	Hboplan1.add("HBOP1"); 
        Hboplan1.add("375"); 
	Hboplan1.add("Good"); 
	Hboplan1.add("240p");
                
        display.setText("");
                
        String details;
        for(int i = 0; i <4; i++){
            details = Hboplan1.get(i).toString();
            display.append(details+ "\t");
        }
    }
    //setter
    public void setHBOP1(ArrayList Hboplan1) {
        this.Hboplan1 = Hboplan1;
    }
 
    //getter
    public ArrayList getHBOP1() {
        return Hboplan1;
    }
    
    //method for HBOP2-------------------------------------------------------
    public void HBOP2(){
          
	HBOplan2.add("HBOP2"); 
        HBOplan2.add("525"); 
	HBOplan2.add("Better"); 
	HBOplan2.add("720p"); 
                
        display.append("\n");
        String details1;
            for(int i = 0; i <4; i++){
            details1 = HBOplan2.get(i).toString();
            display.append(details1+ "\t");
        }
    }
    //setter
    public void setHBOP2(ArrayList HBOplan2) {
        this.HBOplan2 = HBOplan2;
    }
 
    //getter
    public ArrayList getHBOP2() {
        return HBOplan2;
    }
    
        //method for HBOP3-------------------------------------------------------
    public void HBOP3(){
           	  
	HBOplan3.add("HBOp3"); 
        HBOplan3 .add("850"); 
	HBOplan3 .add("Best"); 
	HBOplan3 .add("1080p HD");
        display.append("\n");
        String details2;
        for(int i = 0; i <4; i++){
            details2 = HBOplan3 .get(i).toString();
            display.append(details2+ "\t");
        }
    }
    //setter
    public void setHBOP3(ArrayList HBOplan3) {
        this.HBOplan3 = HBOplan3;
    }
 
    //getter
    public ArrayList getHBOP3() {
        return HBOplan3;
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        BPM();
        SPM();
        PMG();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    //method for Amazon Prime Videos-------------------------------------------------------
    public void BPM(){
           	  
	BasicPrimeMembership.add("ABPM480"); 
        BasicPrimeMembership.add("425"); 
	BasicPrimeMembership.add("Good"); 
	BasicPrimeMembership.add("480p");
                
        display.setText("");
                
        String details;
        for(int i = 0; i <4; i++){
            details = BasicPrimeMembership.get(i).toString();
            display.append(details+ "\t");
        }
    }
    //setter
    public void setBPM(ArrayList BasicPrimeMembership) {
        this.BasicPrimeMembership = BasicPrimeMembership;
    }
 
    //getter
    public ArrayList getBPM() {
        return BasicPrimeMembership;
    }
    
    //method for Standard Amazon Prime Videos-------------------------------------------------------
    public void SPM(){
           	  
	StandardPrimeMembership.add("ABPM720"); 
        StandardPrimeMembership.add("625"); 
	StandardPrimeMembership.add("Better"); 
	StandardPrimeMembership.add("720p"); 
                
        display.append("\n");
        String details1;
        for(int i = 0; i <4; i++){
            details1 = StandardPrimeMembership.get(i).toString();
            display.append(details1+ "\t");
        }
    }
    //setter
    public void setSPM(ArrayList StandardPrimeMembership) {
        this.StandardPrimeMembership = StandardPrimeMembership;
    }
 
    //getter
    public ArrayList getSPM() {
        return StandardPrimeMembership;
    }
    
    //method for Amazon Prime Videos-------------------------------------------------------
    public void PMG(){
           	  
        PrimeMembershipGold.add("APMG1K"); 
        PrimeMembershipGold.add("999"); 
	PrimeMembershipGold.add("Best"); 
	PrimeMembershipGold.add("1080p HD");
        display.append("\n");
        String details2;
        for(int i = 0; i <4; i++){
            details2 = PrimeMembershipGold.get(i).toString();
            display.append(details2+ "\t");
        }
    }
    //setter
    public void setPMG(ArrayList PrimeMembershipGold) {
        this.PrimeMembershipGold = PrimeMembershipGold;
    }
 
    //getter
    public ArrayList getPMG() {
        return PrimeMembershipGold;
    }
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        HBOP1();
        HBOP2();
        HBOP3();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String plan = code.getText();
        Registration reg = new Registration();
        reg.code1.setText(plan);
        
        if(plan.equals("BNF01") || plan.equals("SNF02") || plan.equals("PNF03")){
            
            
            setVisible(false);
            reg.logopanel.setBackground(Color.black);
            reg.logo.setText("NETFLIX");
            reg.logo.setFont(new Font("Arial", Font.BOLD, 28));
            reg.logo.setForeground(Color.red);
            reg.setVisible(true);
            
        }
        
        else if(plan.equals("HBOP1") || plan.equals("HBOP2") || plan.equals("HBOP3")){
            
            
            setVisible(false);
            reg.logopanel.setBackground(Color.black);
            reg.logo.setText("HBO");
            reg.logo.setFont(new Font("Berlin Sans FB", Font.BOLD, 28));
            reg.logo.setForeground(Color.white);
            reg.setVisible(true);
            
        }
        
        else if(plan.equals("ABPM480") || plan.equals("ABPM720") || plan.equals("APMG1K")){
            
            
            setVisible(false);
            reg.logopanel.setBackground(new Color(255,153,0));
            reg.logo.setText("amazon prime videos");
            reg.logo.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 28));
            reg.logo.setForeground(Color.black);
            reg.setVisible(true);
            
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Code!");
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
    
    
    
    public static void main(String args[]) {
       
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField code;
    private javax.swing.JTextArea display;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
