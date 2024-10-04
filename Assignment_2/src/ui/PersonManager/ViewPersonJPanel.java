/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonManager;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author prach
 */
public class ViewPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPersonJPanel
     */
     private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private Person person;
    public ViewPersonJPanel(JPanel container,PersonDirectory directory,Person person) {
        initComponents();
        this.userProcessContainer=container;
        this.person=person;
        refreshTextFields();
        SetViewMode();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHPhoneNumber = new javax.swing.JLabel();
        txtHStreetAddress = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtWUnitNumber = new javax.swing.JTextField();
        txtWCity = new javax.swing.JTextField();
        txtWState = new javax.swing.JTextField();
        txtWZipCode = new javax.swing.JTextField();
        txtWPhoneNumber = new javax.swing.JTextField();
        lblWStreetAddress = new javax.swing.JLabel();
        lblWUnitNumber = new javax.swing.JLabel();
        lblWCity = new javax.swing.JLabel();
        lblWState = new javax.swing.JLabel();
        lblWZipCode = new javax.swing.JLabel();
        txtHUnitNumber = new javax.swing.JTextField();
        txtHCity = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtHState = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        txtHZipCode = new javax.swing.JTextField();
        txtHPhoneNumber = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblfname = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lblHomeAddress = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        lblWPhoneNumber = new javax.swing.JLabel();
        txtWStreetAddress = new javax.swing.JTextField();
        lbllname = new javax.swing.JLabel();
        lblWorkAddress = new javax.swing.JLabel();
        lblHStreetAddress = new javax.swing.JLabel();
        lblHUnitNumber = new javax.swing.JLabel();
        lblHCity = new javax.swing.JLabel();
        lblHState = new javax.swing.JLabel();
        lblHZipCode = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblHPhoneNumber.setText("Phone Number");

        txtHStreetAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHStreetAddressActionPerformed(evt);
            }
        });

        lblWStreetAddress.setText("Street Adrdress");

        lblWUnitNumber.setText("Unit Number");

        lblWCity.setText("City");

        lblWState.setText("State");

        lblWZipCode.setText("Zip Code");

        btnCreate.setBackground(new java.awt.Color(255, 153, 153));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreate.setText("Save");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTitle.setText("View Person Details");

        lblfname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblfname.setText("First Name");

        lblSSN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSSN.setText("SSN");

        lblage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblage.setText("Age");

        lblHomeAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblHomeAddress.setText("Home Address");

        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });

        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });

        lblWPhoneNumber.setText("Phone Number");

        txtWStreetAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWStreetAddressActionPerformed(evt);
            }
        });

        lbllname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbllname.setText("Last Name");

        lblWorkAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWorkAddress.setText("Work Address");

        lblHStreetAddress.setText("Street Adrdress");

        lblHUnitNumber.setText("Unit Number");

        lblHCity.setText("City");

        lblHState.setText("State");

        lblHZipCode.setText("Zip Code");

        btnUpdate.setBackground(new java.awt.Color(255, 153, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 153, 153));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnBack)
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(lblTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblfname)
                                    .addComponent(lblSSN)
                                    .addComponent(lblHomeAddress)
                                    .addComponent(lblHStreetAddress)
                                    .addComponent(lblHUnitNumber)
                                    .addComponent(lblHCity)
                                    .addComponent(lblHState)
                                    .addComponent(lblHZipCode)
                                    .addComponent(lblHPhoneNumber))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHStreetAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHUnitNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtHState)
                                            .addComponent(txtHZipCode)
                                            .addComponent(txtHPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbllname)
                                            .addComponent(lblage))
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblWorkAddress)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblWStreetAddress)
                                            .addComponent(lblWUnitNumber)
                                            .addComponent(lblWCity)
                                            .addComponent(lblWState)
                                            .addComponent(lblWZipCode)
                                            .addComponent(lblWPhoneNumber))
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtWStreetAddress)
                                            .addComponent(txtWUnitNumber)
                                            .addComponent(txtWCity)
                                            .addComponent(txtWState)
                                            .addComponent(txtWZipCode)
                                            .addComponent(txtWPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfname)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllname)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSSN)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblage)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHomeAddress)
                    .addComponent(lblWorkAddress))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHStreetAddress)
                            .addComponent(txtHStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHUnitNumber)
                            .addComponent(txtHUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHCity)
                            .addComponent(txtHCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHState)
                            .addComponent(txtHState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHZipCode)
                            .addComponent(txtHZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHPhoneNumber)
                            .addComponent(txtHPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWStreetAddress)
                            .addComponent(txtWStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWUnitNumber)
                            .addComponent(txtWUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWCity)
                            .addComponent(txtWCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWState)
                            .addComponent(txtWState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWZipCode)
                            .addComponent(txtWZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWPhoneNumber)
                            .addComponent(txtWPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(348, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHStreetAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHStreetAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHStreetAddressActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        String fname=txtfname.getText();
        String lname=txtlname.getText();
        String ssn=txtSSN.getText();
        int Age;
        String homestreet=txtHStreetAddress.getText();
        String homeUN=txtHUnitNumber.getText();
        String homecity=txtHCity.getText();
        String homestate=txtHState.getText();
        String homezip=txtHZipCode.getText();
        String homephone=txtHPhoneNumber.getText();
        String workstreet=txtWStreetAddress.getText();
        String workUN=txtWUnitNumber.getText();
        String workcity=txtWCity.getText();
        String workstate=txtWState.getText();
        String workzip=txtWZipCode.getText();
        String workphone=txtWPhoneNumber.getText();

        if(lname.isBlank()||fname.isBlank()||ssn.isBlank()||homestreet.isBlank()||homecity.isBlank()||homestate.isBlank()||homecity.isBlank()||homezip.isBlank()||homephone.isBlank()||workstreet.isBlank()||workUN.isBlank()||homeUN.isBlank()||workcity.isBlank()||workstate.isBlank()||workzip.isBlank()||workphone.isBlank()){
            JOptionPane.showMessageDialog(this,"All fields are mandatory","Error",JOptionPane.ERROR_MESSAGE);
            return;

        }
        try{
            Age=Integer.parseInt(txtAge.getText());
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(this,"  Please check the Age input","Error",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(this," Account details Successfully update","Error",JOptionPane.INFORMATION_MESSAGE);
        
        
        Address homeAddress = new Address(homestreet, homeUN, homecity,homestate,homezip,homephone);
        Address workAddress = new Address(workstreet, workUN, workcity,workstate,workzip,workphone);
        person.setFirstName(fname);
        person.setLastName(lname);
        person.setSSN(ssn);
        person.setAge(Age);
        person.setHomeAddress(homeAddress);
        person.setWorkAddress(workAddress);

        JOptionPane.showMessageDialog(this," Person Successfully saved","Error",JOptionPane.INFORMATION_MESSAGE);

        System.out.println(person.getFirstName());
        System.out.println(person.getAge());
        SetViewMode();

    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void txtWStreetAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWStreetAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWStreetAddressActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

   setEditMode();        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        Component[] panelStack = userProcessContainer.getComponents();
        JPanel lastPanel = (JPanel) panelStack[panelStack.length-1];
        ManagePersonsJPanel manageAcccountsJPanel = (ManagePersonsJPanel) lastPanel;
        manageAcccountsJPanel.populateTable();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblHCity;
    private javax.swing.JLabel lblHPhoneNumber;
    private javax.swing.JLabel lblHState;
    private javax.swing.JLabel lblHStreetAddress;
    private javax.swing.JLabel lblHUnitNumber;
    private javax.swing.JLabel lblHZipCode;
    private javax.swing.JLabel lblHomeAddress;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWCity;
    private javax.swing.JLabel lblWPhoneNumber;
    private javax.swing.JLabel lblWState;
    private javax.swing.JLabel lblWStreetAddress;
    private javax.swing.JLabel lblWUnitNumber;
    private javax.swing.JLabel lblWZipCode;
    private javax.swing.JLabel lblWorkAddress;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblfname;
    private javax.swing.JLabel lbllname;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHCity;
    private javax.swing.JTextField txtHPhoneNumber;
    private javax.swing.JTextField txtHState;
    private javax.swing.JTextField txtHStreetAddress;
    private javax.swing.JTextField txtHUnitNumber;
    private javax.swing.JTextField txtHZipCode;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtWCity;
    private javax.swing.JTextField txtWPhoneNumber;
    private javax.swing.JTextField txtWState;
    private javax.swing.JTextField txtWStreetAddress;
    private javax.swing.JTextField txtWUnitNumber;
    private javax.swing.JTextField txtWZipCode;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    // End of variables declaration//GEN-END:variables
private void refreshTextFields(){
    txtfname.setText(person.getFirstName());
    txtlname.setText(person.getLastName());
    txtSSN.setText(person.getSSN());
    String age=Integer.toString(person.getAge());
    txtAge.setText(age);
    txtHStreetAddress.setText(person.getHomeAddress().getStreetaddress());
    txtHUnitNumber.setText(person.getHomeAddress().getUnitno());
    txtHCity.setText(person.getHomeAddress().getCity());
    txtHState.setText(person.getHomeAddress().getState());
    txtHZipCode.setText(person.getHomeAddress().getZipCode());
    txtHPhoneNumber.setText(person.getHomeAddress().getPhoneno());
    txtWStreetAddress.setText(person.getWorkAddress().getStreetaddress());
    txtWUnitNumber.setText(person.getWorkAddress().getUnitno());
    txtWCity.setText(person.getWorkAddress().getCity());
    txtWState.setText(person.getWorkAddress().getState());
    txtWZipCode.setText(person.getWorkAddress().getZipCode());
    txtWPhoneNumber.setText(person.getWorkAddress().getPhoneno());
    
    
    
}
private void SetViewMode(){
    txtfname.setEnabled(false);
    txtlname.setEnabled(false);
    txtSSN.setEnabled(false);
    //String age=Integer.toString(person.getAge());
    txtAge.setEnabled(false);
    txtHStreetAddress.setEnabled(false);
    txtHUnitNumber.setEnabled(false);
    txtHCity.setEnabled(false);
    txtHState.setEnabled(false);
    txtHZipCode.setEnabled(false);
    txtHPhoneNumber.setEnabled(false);
    txtWStreetAddress.setEnabled(false);
    txtWUnitNumber.setEnabled(false);
    txtWCity.setEnabled(false);
    txtWState.setEnabled(false);
    txtWZipCode.setEnabled(false);
    txtWPhoneNumber.setEnabled(false);
    btnUpdate.setEnabled(true);
}
private void setEditMode(){
     txtfname.setEnabled(true);
    txtlname.setEnabled(true);
    txtSSN.setEnabled(true);
    //String age=Integer.toString(person.getAge());
    txtAge.setEnabled(true);
    txtHStreetAddress.setEnabled(true);
    txtHUnitNumber.setEnabled(true);
    txtHCity.setEnabled(true);
    txtHState.setEnabled(true);
    txtHZipCode.setEnabled(true);
    txtHPhoneNumber.setEnabled(true);
    txtWStreetAddress.setEnabled(true);
    txtWUnitNumber.setEnabled(true);
    txtWCity.setEnabled(true);
    txtWState.setEnabled(true);
    txtWZipCode.setEnabled(true);
    txtWPhoneNumber.setEnabled(true);
    btnUpdate.setEnabled(false);
}
}
