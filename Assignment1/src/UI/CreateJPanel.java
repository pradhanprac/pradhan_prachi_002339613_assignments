/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Person;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author prach
 */
public class CreateJPanel extends javax.swing.JPanel {

    Person person;
    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(Person p) {
        person=p;
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

        jLabel1 = new javax.swing.JLabel();
        lblfname = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblProfession = new javax.swing.JLabel();
        lblDriversLicenseNumber = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblQualification = new javax.swing.JLabel();
        lblOrg = new javax.swing.JLabel();
        lblAddr1 = new javax.swing.JLabel();
        lblAddr2 = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZIP = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        lblFaxno = new javax.swing.JLabel();
        lblDriversLicenseState = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtProfession = new javax.swing.JTextField();
        txtDriversLicenseNumber = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtPhoneno = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtQualification = new javax.swing.JTextField();
        txtOrganization = new javax.swing.JTextField();
        txtDriversLicenseState = new javax.swing.JTextField();
        txtAddr2 = new javax.swing.JTextField();
        txtAddr1 = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZIP = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        jLabel1.setText("Create Person");

        lblfname.setText("Firstname");

        lblEmail.setText("Email");

        lblGender.setText("Gender");

        lblAge.setText("Age");

        lblProfession.setText("Profession");

        lblDriversLicenseNumber.setText("Drivers License Number");

        lblSSN.setText("SSN");

        lblname.setText("Lastname");

        lblPhone.setText("Phone no");

        lblDob.setText("DOB");

        lblQualification.setText("Qualification");

        lblOrg.setText("Organizatiion");

        lblAddr1.setText("Address 1");

        lblAddr2.setText("Address 2");

        lblCity.setText("City");

        lblState.setText("State");

        lblZIP.setText("ZIP");

        lblTelephone.setText("Telephone no:");

        lblFaxno.setText("Fax Number");

        lblDriversLicenseState.setText("Drivers License State");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        txtAddr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddr2ActionPerformed(evt);
            }
        });

        txtZIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZIPActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail)
                            .addComponent(lblfname)
                            .addComponent(lblGender)
                            .addComponent(lblAge)
                            .addComponent(lblProfession)
                            .addComponent(lblDriversLicenseNumber)
                            .addComponent(lblSSN)
                            .addComponent(lblAddr1)
                            .addComponent(lblAddr2)
                            .addComponent(lblCity)
                            .addComponent(lblState)
                            .addComponent(lblZIP)
                            .addComponent(lblTelephone)
                            .addComponent(lblFaxno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(lblname))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(txtDriversLicenseNumber)
                                    .addComponent(txtProfession)
                                    .addComponent(txtAge)
                                    .addComponent(txtGender)
                                    .addComponent(txtEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDob, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblQualification, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblOrg, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDriversLicenseState, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAddr1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTelephone)
                                    .addComponent(txtZIP)
                                    .addComponent(txtState)
                                    .addComponent(txtCity)
                                    .addComponent(txtAddr2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFax, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDriversLicenseState)
                                .addComponent(txtOrganization)
                                .addComponent(txtQualification)
                                .addComponent(txtDOB)
                                .addComponent(txtPhoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnSave)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDriversLicenseState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfname)
                            .addComponent(lblname)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(lblPhone)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(lblDob)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(lblQualification)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrg)
                            .addComponent(lblProfession, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDriversLicenseState)
                            .addComponent(lblDriversLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDriversLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSSN)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAddr1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAddr2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAddr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCity)
                                    .addComponent(btnSave))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblState))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblZIP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelephone))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFaxno)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtAddr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddr2ActionPerformed

    private void txtZIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZIPActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
      
        String fname=txtFname.getText();
        String lname=txtLname.getText();
        String Gender=txtGender.getText();
        String email=txtEmail.getText();
        String phone=txtPhoneno.getText();
        String DOB=txtDOB.getText();
        String age=txtAge.getText();
        String Qualification=txtQualification.getText();
        String Profession=txtProfession.getText();
        String Organization=txtOrganization.getText();
        String DriversLicenseno=txtDriversLicenseNumber.getText();
        String DriversLicensestate=txtDriversLicenseState.getText();
        String SSN=txtSSN.getText();
        String addr1=txtAddr1.getText();
        String addr2=txtAddr2.getText();
        String City=txtAge.getText();
        String State=txtState.getText();
        String ZIP=txtZIP.getText();
        String telephone=txtTelephone.getText();
        String Fax=txtFax.getText();
        person.setFirstname(fname);
        person.setLastname(lname);
        person.setOrganization(Organization);
        person.setPhone(phone);
        person.setAadr2(addr2);
        person.setAddr1(addr1);
        person.setAge(age);
        person.setCity(City);
        person.setDOB(DOB);
        person.setDriversLicenseno(DriversLicenseno);
        person.setDriversLicensestate(DriversLicensestate);
        person.setEmail(email);
        person.setFax(Fax);
        person.setGender(Gender);
        person.setProfession(Profession);
        person.setQualification(Qualification);
        person.setSSN(SSN);
        person.setState(State);
        person.setTelephone(telephone);
        person.getZIP();
        JOptionPane.showMessageDialog(this,"Person Details Saved","Success",JOptionPane.PLAIN_MESSAGE);
        
         txtFname.setText("");
         txtLname.setText("");
         txtGender.setText("");
         txtEmail.setText("");
         txtPhoneno.setText("");
         txtDOB.setText("");
         txtAge.setText("");
         txtQualification.setText("");
         txtProfession.setText("");
         txtOrganization.setText("");
         txtDriversLicenseNumber.setText("");
         txtDriversLicenseState.setText("");
         txtSSN.setText("");
         txtAddr1.setText("");
         txtAddr2.setText("");
         txtCity.setText("");
         txtAge.setText("");
         txtState.setText("");
         txtZIP.setText("");
         txtTelephone.setText("");
         txtFax.setText("");
         
         
         
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddr1;
    private javax.swing.JLabel lblAddr2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblDriversLicenseNumber;
    private javax.swing.JLabel lblDriversLicenseState;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFaxno;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblProfession;
    private javax.swing.JLabel lblQualification;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblZIP;
    private javax.swing.JLabel lblfname;
    private javax.swing.JLabel lblname;
    private javax.swing.JTextField txtAddr1;
    private javax.swing.JTextField txtAddr2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDriversLicenseNumber;
    private javax.swing.JTextField txtDriversLicenseState;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtOrganization;
    private javax.swing.JTextField txtPhoneno;
    private javax.swing.JTextField txtProfession;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtZIP;
    // End of variables declaration//GEN-END:variables
}
