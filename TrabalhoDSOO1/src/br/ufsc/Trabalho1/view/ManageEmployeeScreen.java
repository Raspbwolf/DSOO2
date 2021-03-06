/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.Trabalho1.view;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.ufsc.Trabalho1.control.PersistanceCtrl;
import br.ufsc.Trabalho1.control.ScreenCtrl;
import br.ufsc.Trabalho1.model.Staff;

/**
 *
 * @author Usuario
 */
public class ManageEmployeeScreen extends javax.swing.JFrame {

    /**
     * Creates new form ManageEmployeeScreen
     */
    public ManageEmployeeScreen() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeList = new javax.swing.JList<>();
        deleteEmployeeButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Employees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N


        ArrayList<Staff> staff = PersistanceCtrl.getInstance().getStaffList();
        Staff[] strings = new Staff[staff.size()];
        for(int i = 0; i < staff.size(); i++) {
        strings[i] = staff.get(i);
        }
        employeeList.setModel(new javax.swing.AbstractListModel<Staff>() {

        public int getSize() { return strings.length; }
        public Staff getElementAt(int i) { return strings[i]; }
        });
        
        jScrollPane1.setViewportView(employeeList);

        deleteEmployeeButton.setText("Delete Selected Employee");
        deleteEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeButtonActionPerformed(evt);
            }
        });

        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteEmployeeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(returnButton))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteEmployeeButton)
                    .addComponent(returnButton)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
    	setVisible(false);
        ScreenCtrl.getInstance().showEmployeeScreen();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void deleteEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeButtonActionPerformed
    	
    	PersistanceCtrl.getInstance().remove(employeeList.getSelectedValue());
    	JOptionPane.showMessageDialog(null, "Employee deleted Successfully", "Success", 1);
        updateData();
    }//GEN-LAST:event_deleteEmployeeButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        	try {
        		class DetailsPanel extends javax.swing.JFrame {

        		    /**
        		     * Creates new form DetailsPanel
        		     */
        		    public DetailsPanel() {
        		        initComponents();
        		    }

        		    /**
        		     * This method is called from within the constructor to initialize the form.
        		     * WARNING: Do NOT modify this code. The content of this method is always
        		     * regenerated by the Form Editor.
        		     */
        		    @SuppressWarnings("unchecked")
        		    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        		    private void initComponents() {

        		        jPanel1 = new javax.swing.JPanel();
        		        jLabel1 = new javax.swing.JLabel();
        		        jLabel2 = new javax.swing.JLabel();
        		        jLabel3 = new javax.swing.JLabel();
        		        jLabel4 = new javax.swing.JLabel();
        		        jLabel5 = new javax.swing.JLabel();
        		        jLabel13 = new javax.swing.JLabel();
        		        jLabel14 = new javax.swing.JLabel();
        		        jLabel15 = new javax.swing.JLabel();
        		        okButton = new javax.swing.JButton();

        		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        		        jLabel1.setText("Employee's Name: "  + employeeList.getSelectedValue().getName());

        		        jLabel2.setText("Employee's Address: "  + employeeList.getSelectedValue().getAddress());

        		        jLabel3.setText("Employee's Birthday: "  + employeeList.getSelectedValue().getBirthday());

        		        jLabel4.setText("Employee's CPF: "  + employeeList.getSelectedValue().getCpf());

        		        jLabel5.setText("Employee's Phone: "  + employeeList.getSelectedValue().getPhone());

        		        jLabel13.setText("Employee's RG: "  + employeeList.getSelectedValue().getRg());

        		        jLabel14.setText("Employee's Salary: "  + employeeList.getSelectedValue().getSalary());

        		        jLabel15.setText("Employee's Position: "  + employeeList.getSelectedValue().getPosition());

        		        okButton.setText("OK");
        		        okButton.addActionListener(new java.awt.event.ActionListener() {
        		            public void actionPerformed(java.awt.event.ActionEvent evt) {
        		                okButtonActionPerformed(evt);
        		            }
        		        });

        		        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        		        jPanel1.setLayout(jPanel1Layout);
        		        jPanel1Layout.setHorizontalGroup(
        		            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		            .addGroup(jPanel1Layout.createSequentialGroup()
        		                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		                    .addGroup(jPanel1Layout.createSequentialGroup()
        		                        .addGap(66, 66, 66)
        		                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        		                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		                        .addGap(113, 113, 113)
        		                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        		                    .addGroup(jPanel1Layout.createSequentialGroup()
        		                        .addGap(123, 123, 123)
        		                        .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		                        .addGap(71, 71, 71)))
        		                .addGap(145, 145, 145))
        		        );
        		        jPanel1Layout.setVerticalGroup(
        		            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		            .addGroup(jPanel1Layout.createSequentialGroup()
        		                .addGap(14, 14, 14)
        		                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        		                    .addComponent(jLabel1)
        		                    .addComponent(jLabel2))
        		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        		                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        		                    .addComponent(jLabel15)
        		                    .addComponent(jLabel3))
        		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        		                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        		                    .addComponent(jLabel14)
        		                    .addComponent(jLabel4))
        		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        		                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        		                    .addComponent(jLabel13)
        		                    .addComponent(jLabel5))
        		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        		                .addComponent(okButton)
        		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		        );

        		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        		        getContentPane().setLayout(layout);
        		        layout.setHorizontalGroup(
        		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		            .addGroup(layout.createSequentialGroup()
        		                .addContainerGap()
        		                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		                .addContainerGap())
        		        );
        		        layout.setVerticalGroup(
        		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		            .addGroup(layout.createSequentialGroup()
        		                .addContainerGap()
        		                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		                .addContainerGap())
        		        );

        		        pack();
        		    }// </editor-fold>                        

        		    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        		        setVisible(false);
        		        }                                        

        		    /**
        		     * @param args the command line arguments
        		     */

        		    // Variables declaration - do not modify                     
        		    private javax.swing.JLabel jLabel1;
        		    private javax.swing.JLabel jLabel13;
        		    private javax.swing.JLabel jLabel14;
        		    private javax.swing.JLabel jLabel15;
        		    private javax.swing.JLabel jLabel2;
        		    private javax.swing.JLabel jLabel3;
        		    private javax.swing.JLabel jLabel4;
        		    private javax.swing.JLabel jLabel5;
        		    private javax.swing.JPanel jPanel1;
        		    private javax.swing.JButton okButton;
        		    // End of variables declaration                   
        		}
        		DetailsPanel details = new DetailsPanel();
        		details.setVisible(true);
        	}catch(NullPointerException e) {
        		JOptionPane.showMessageDialog(null, "No Staff Selected.", "Attention", 1);
        	}

    	
 

    }//GEN-LAST:event_jButton1ActionPerformed

    public void updateData() {
    	ArrayList<Staff> staff = PersistanceCtrl.getInstance().getStaffList();
    	Staff[] strings = new Staff[staff.size()];
    	for(int i = 0; i < staff.size(); i++) {
    	strings[i] = staff.get(i);
    	}
    	employeeList.setModel(new javax.swing.AbstractListModel<Staff>() {

    	public int getSize() { return strings.length; }
    	public Staff getElementAt(int i) { return strings[i]; }
    	});
    	this.repaint();

    	}
    
    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteEmployeeButton;
    private javax.swing.JList<Staff> employeeList;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
