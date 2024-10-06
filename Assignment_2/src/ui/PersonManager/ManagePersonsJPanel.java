/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonManager;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author prach
 */
public class ManagePersonsJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    PersonDirectory personDirectory;

    /**
     * Creates new form ManagePersonsJPanel
     */
    public ManagePersonsJPanel(JPanel container,PersonDirectory directory) {
        initComponents();
        userProcessContainer=container;
        personDirectory=directory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearchBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersons = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(223, 223, 252));

        txtSearchBox.setText("Enter first/last name/Street Address");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        tblPersons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "FirstName", "LastName", "City", "Home Zip Code", "Work City", "Work Zip Code"
            }
        ));
        jScrollPane1.setViewportView(tblPersons);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("Person Details");

        btnSearch.setBackground(new java.awt.Color(204, 255, 204));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnViewDetails.setBackground(new java.awt.Color(204, 255, 204));
        btnViewDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 255, 204));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("Delete Person");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(566, 566, 566)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewDetails)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addGap(86, 86, 86)
                                .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDelete))))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTitle)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnViewDetails)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
  if(!txtSearchBox.getText().isBlank()){
            String personNumber = txtSearchBox.getText();
            Person foundPerson = personDirectory.searchPerson(personNumber);
            if(foundPerson != null){
                ViewPersonJPanel panel = new ViewPersonJPanel(userProcessContainer,personDirectory,foundPerson);
                userProcessContainer.add("ViewJPanel",panel);
                CardLayout layout= (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }else{
            JOptionPane.showMessageDialog(null,"Person not found , Please check the FirstName, LastName or Street name and try again","Warning",JOptionPane.WARNING_MESSAGE);
           
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please type the fields","Warning",JOptionPane.WARNING_MESSAGE);
           
}      
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed

 int selectedRow=tblPersons.getSelectedRow();
        if(selectedRow>=0){
             Person selectedPerson= (Person)tblPersons.getValueAt(selectedRow,0);
             ViewPersonJPanel panel=new ViewPersonJPanel(userProcessContainer,personDirectory,selectedPerson);
        userProcessContainer.add("ViewAccountJPanel Working",panel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else
            JOptionPane.showMessageDialog(null,"Please select an account from the list.","Warning",JOptionPane.WARNING_MESSAGE);        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

 int selectedRow=tblPersons.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton=JOptionPane.YES_NO_OPTION;
            int dialogResult=JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this person record","Warning",dialogButton);
            if(dialogResult==JOptionPane.YES_OPTION){
                Person selectedPerson= (Person)tblPersons.getValueAt(selectedRow,0);
                personDirectory.deletePerson(selectedPerson);
                populateTable();
                
                
            }
            
            
        }
        else
            JOptionPane.showMessageDialog(null,"Please select an amount from the list.","Warning",JOptionPane.WARNING_MESSAGE);        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPersons;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables
public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblPersons.getModel();
        model.setRowCount(0);
        
        for(Person a : personDirectory.getPerson()){
            Object[] row = new Object[6];
            row[0]= a;
            row[1] = String.valueOf(a.getLastName());
            Address homeAddress = a.getHomeAddress();
            row[2] = String.valueOf(homeAddress.getCity());
            row[3] = String.valueOf(homeAddress.getZipCode());
            
            Address workAddress = a.getWorkAddress();
            row[4] = String.valueOf(workAddress.getCity());
            row[5] = String.valueOf(workAddress.getZipCode());
            model.addRow(row);
        
        }

    
}
}
