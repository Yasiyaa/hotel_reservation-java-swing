/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HotelReservationSystem;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Chamod
 */
public class Signupform extends javax.swing.JFrame {

    /**
     * Creates new form Signupform
     */
    public Signupform() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        txt_add3 = new javax.swing.JTextField();
        btn_signup = new javax.swing.JButton();
        rbtn_male = new javax.swing.JRadioButton();
        txt_lastname = new javax.swing.JTextField();
        rbtn_female = new javax.swing.JRadioButton();
        txt_firstname = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        txt_confpass = new javax.swing.JPasswordField();
        btn_back = new javax.swing.JButton();
        txt_nic = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_add1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_add2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1110, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(246, 230, 134));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(246, 230, 134));
        jLabel10.setText("Gender");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 90, -1));

        txt_add3.setBackground(new java.awt.Color(51, 51, 51));
        txt_add3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 133, -1));

        btn_signup.setBackground(new java.awt.Color(246, 230, 134));
        btn_signup.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_signup.setText("Signup");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        getContentPane().add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 160, 40));

        buttonGroup1.add(rbtn_male);
        rbtn_male.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtn_male.setForeground(new java.awt.Color(246, 230, 134));
        rbtn_male.setText("Male");
        getContentPane().add(rbtn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 132, -1));

        txt_lastname.setBackground(new java.awt.Color(51, 51, 51));
        txt_lastname.setForeground(new java.awt.Color(255, 255, 255));
        txt_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_lastnameKeyPressed(evt);
            }
        });
        getContentPane().add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 134, -1));

        buttonGroup1.add(rbtn_female);
        rbtn_female.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtn_female.setForeground(new java.awt.Color(246, 230, 134));
        rbtn_female.setText("Female");
        getContentPane().add(rbtn_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 150, -1));

        txt_firstname.setBackground(new java.awt.Color(51, 51, 51));
        txt_firstname.setForeground(new java.awt.Color(255, 255, 255));
        txt_firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_firstnameKeyPressed(evt);
            }
        });
        getContentPane().add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 134, -1));

        txt_email.setBackground(new java.awt.Color(51, 51, 51));
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 134, -1));

        txt_pass.setBackground(new java.awt.Color(51, 51, 51));
        txt_pass.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 134, -1));

        txt_confpass.setBackground(new java.awt.Color(51, 51, 51));
        txt_confpass.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_confpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 133, -1));

        btn_back.setBackground(new java.awt.Color(255, 255, 255));
        btn_back.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 160, 40));

        txt_nic.setBackground(new java.awt.Color(51, 51, 51));
        txt_nic.setForeground(new java.awt.Color(255, 255, 255));
        txt_nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nicKeyPressed(evt);
            }
        });
        getContentPane().add(txt_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 134, -1));

        txt_contact.setBackground(new java.awt.Color(51, 51, 51));
        txt_contact.setForeground(new java.awt.Color(255, 255, 255));
        txt_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contactKeyPressed(evt);
            }
        });
        getContentPane().add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 134, -1));

        jLabel2.setBackground(new java.awt.Color(246, 230, 134));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(246, 230, 134));
        jLabel2.setText("First name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 110, -1));

        jLabel3.setBackground(new java.awt.Color(246, 230, 134));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(246, 230, 134));
        jLabel3.setText("Last name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 110, -1));

        jLabel4.setBackground(new java.awt.Color(246, 230, 134));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(246, 230, 134));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 80, -1));

        jLabel5.setBackground(new java.awt.Color(246, 230, 134));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(246, 230, 134));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 100, -1));

        jLabel6.setBackground(new java.awt.Color(246, 230, 134));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(246, 230, 134));
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 160, -1));

        jLabel7.setBackground(new java.awt.Color(246, 230, 134));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(246, 230, 134));
        jLabel7.setText("NIC");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 70, -1));

        jLabel8.setBackground(new java.awt.Color(246, 230, 134));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(246, 230, 134));
        jLabel8.setText("Contact number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 150, -1));

        txt_add1.setBackground(new java.awt.Color(51, 51, 51));
        txt_add1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 134, -1));

        jLabel9.setBackground(new java.awt.Color(246, 230, 134));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(246, 230, 134));
        jLabel9.setText("Address");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 90, -1));

        txt_add2.setBackground(new java.awt.Color(51, 51, 51));
        txt_add2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 119, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Signup page.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static Connection con;

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed

        try {

            Statement st = DBConnection.creatConnection().createStatement();

            String fname, lname, email, pw, confpw, nic, add1, add2, add3, gender = null, tele;

            fname = txt_firstname.getText();
            lname = txt_lastname.getText();
            email = txt_email.getText();
            pw = txt_pass.getText();
            confpw = txt_confpass.getText();
            nic = txt_nic.getText();
            add1 = txt_add1.getText();
            add2 = txt_add2.getText();
            add3 = txt_add3.getText();
            tele = txt_contact.getText();

            if (rbtn_male.isSelected()) {
                gender = "male";
            } else if (rbtn_female.isSelected()) {
                gender = "female";
            }else{
                JOptionPane.showMessageDialog(null, "Gender cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            String query = "INSERT INTO `customer` (`first_name`, `last_name`, `nic`, `address`, `address2`, `address3`, `gender`, `password`, `email`, `telephone`) VALUES ('" + fname + "', '" + lname + "', '" + nic + "', '" + add1 + "', '" + add2 + "', '" + add3 + "', '" + gender + "', '" + pw + "', '" + email + "', '" + tele + "');";

            //  System.out.println(query);
            if (fname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "First name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (lname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Last name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Email cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (pw.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Password cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (confpw.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Password is not matching.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (nic.isEmpty()) {
                JOptionPane.showMessageDialog(null, "NIC cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (add1.isEmpty() || add2.isEmpty() || add3.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Address  cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            }else if(nic.length() != 11){
                JOptionPane.showMessageDialog(null, "Enter valid NIC number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (tele.isEmpty() || tele.length() != 10) {
                JOptionPane.showMessageDialog(null, "Enter valid telephone number .", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (gender.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Gender cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else {

                if (pw.equalsIgnoreCase(confpw)) {
                    int count = st.executeUpdate(query);
                    if (count > 0) {
                        JOptionPane.showMessageDialog(null, "Registration successfully completed.", "Success", JOptionPane.INFORMATION_MESSAGE);

                    } else {

                        JOptionPane.showMessageDialog(null, "user name or password is wrong ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                     JOptionPane.showMessageDialog(null, "Password is not matching.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch(Exception e){
             JOptionPane.showMessageDialog(null, "Something went wrong !!.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.hide();
        Loginform obj = new Loginform();
        obj.show();
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_firstnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_firstnameKeyPressed
       char c = evt.getKeyChar();
        
        if(Character.isDigit(c))
        {
            txt_firstname.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter letters only","Error",JOptionPane.ERROR_MESSAGE);
            txt_firstname.setEditable(true);
            
        }
    }//GEN-LAST:event_txt_firstnameKeyPressed

    private void txt_lastnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lastnameKeyPressed
       char c = evt.getKeyChar();
        
        if(Character.isDigit(c))
        {
            txt_lastname.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter letters only","Error",JOptionPane.ERROR_MESSAGE);
            txt_lastname.setEditable(true);
            
        }
    }//GEN-LAST:event_txt_lastnameKeyPressed

    private void txt_nicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nicKeyPressed
      
    }//GEN-LAST:event_txt_nicKeyPressed

    private void txt_contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contactKeyPressed
       char c = evt.getKeyChar();
        
        if(Character.isLetter(c))
        {
            txt_contact.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter numbers only","Error",JOptionPane.ERROR_MESSAGE);
            txt_contact.setEditable(true);
            
        }
    }//GEN-LAST:event_txt_contactKeyPressed

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
            java.util.logging.Logger.getLogger(Signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signupform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_signup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JTextField txt_add1;
    private javax.swing.JTextField txt_add2;
    private javax.swing.JTextField txt_add3;
    private javax.swing.JPasswordField txt_confpass;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
