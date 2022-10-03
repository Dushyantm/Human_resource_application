/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Employee;
import model.employeeHistory;

/**
 *
 * @author dumma
 */
public class UpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    employeeHistory history;
    
    public UpdateJPanel(employeeHistory history) {
        initComponents();
        this.history = history;
    }
    public ImageIcon ResizeImage(String ImagePath){
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(labelPhoto.getWidth(),labelPhoto.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
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
        title = new javax.swing.JLabel();
        queryEID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        emailID2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        emailID3 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jStartDate = new com.toedter.calendar.JDateChooser();
        employeeID2 = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        txtPTitle = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        employeeID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        emailID1 = new javax.swing.JLabel();
        txtEID = new javax.swing.JTextField();
        age1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        employeeID1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        labelPhoto = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtGender = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(912, 456));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Enter Employee ID:");

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Update Employee");

        queryEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryEIDActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setText("Name:");

        age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        age.setText("Age:");

        emailID2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailID2.setText("Email ID:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        emailID3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailID3.setText("Phone:");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        employeeID2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeID2.setText("Level:");

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });

        txtPTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPTitleActionPerformed(evt);
            }
        });

        emailID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailID.setText("Employee ID:");

        employeeID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeID.setText("Team Info:");

        emailID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailID1.setText("Position Title:");

        txtEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEIDActionPerformed(evt);
            }
        });

        age1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        age1.setText("Gender:");

        name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name1.setText("Photo:");

        employeeID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeID1.setText("Start Date:");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGenderKeyReleased(evt);
            }
        });

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });
        txtLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLevelKeyReleased(evt);
            }
        });

        jLabel2.setText("select another photo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(name)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(emailID)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(emailID1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(age)
                                .addGap(18, 18, 18)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(age1)
                                .addGap(18, 18, 18)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(employeeID2)
                                .addGap(18, 18, 18)
                                .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(employeeID1)
                                .addGap(18, 18, 18)
                                .addComponent(jStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name1)
                                .addGap(40, 40, 40)
                                .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(employeeID)
                                .addGap(18, 18, 18)
                                .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(emailID3)
                                        .addGap(270, 270, 270))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(emailID2)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1)
                                                .addGap(49, 49, 49))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(queryEID, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(queryEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name1)))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailID)
                                    .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailID1)
                            .addComponent(txtPTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(age1)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(employeeID2)
                                .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeID1)
                            .addComponent(jStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailID2)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailID3)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeID))
                        .addGap(18, 18, 18)))
                .addComponent(btnUpdate)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void queryEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryEIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryEIDActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void txtPTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPTitleActionPerformed

    private void txtEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEIDActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String query = queryEID.getText();
        List<Employee> temp = new ArrayList();
        for (Employee emp:history.getHistory()){
            if(String.valueOf(emp.getEmployeeId()).equals(query)){
                        temp.add(emp);
                        
                        break;

                    }
        }
        
        if (!temp.isEmpty()){
            Employee emp = temp.get(0);
            txtName.setText(emp.getName());
            txtEID.setText(emp.getEmployeeId().toString());
            txtPTitle.setText(emp.getPositionTitle());
            txtEmail.setText(emp.getEmailId());
            txtPhone.setText(emp.getContactInfo().toString());
            txtAge.setText(emp.getAge().toString());
            txtGender.setText(emp.getGender());
            txtLevel.setText(emp.getLevel());
            txtTeamInfo.setText(emp.getTeamInfo());
            if (jStartDate.getDate()==null){
            String date = emp.getStartDate();
            java.util.Date date2 = null;
            try {
                date2 = new SimpleDateFormat("dd-MMM-yyyy").parse(date);
            } catch (ParseException ex) {
                Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            jStartDate.setDate(date2);
            }
            labelPhoto.setIcon(ResizeImage(emp.getPhotoPath()));
        }
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String query = queryEID.getText();
        if(query.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please search for Employee ID first!");
        }
        else{
            String nameUpdated = txtName.getText();
            Integer employeeIdUpdated = Integer.valueOf(txtEID.getText());

            Integer ageUpdated = Integer.valueOf(txtAge.getText());
            Integer contactInfo = Integer.valueOf(String.valueOf(txtPhone.getText()));
            String emailId= txtEmail.getText();
            String positionTitle = txtPTitle.getText();
            String TeamInfo = txtTeamInfo.getText();
            String gender = txtGender.getText();
            String level = txtLevel.getText();

            List<Employee> temp = new ArrayList();
            for (Employee emp:history.getHistory()){
                if(String.valueOf(emp.getEmployeeId()).equals(query)){
                            temp.add(emp);

                            break;

                        }
            }
            if (!temp.isEmpty()){
                Employee emp = temp.get(0);
//                System.out.println(emp.toString());


                emp.setName(nameUpdated);
                emp.setEmployeeId(employeeIdUpdated);
                emp.setAge(ageUpdated);
                emp.setContactInfo(contactInfo);
                emp.setEmailId(emailId);
                emp.setGender(gender);
                emp.setPositionTitle(positionTitle);
                emp.setStartDate(new SimpleDateFormat("dd-MMM-yyyy").format(this.jStartDate.getDate()));
                emp.setPhotoPath(this.photoPath);
                emp.setTeamInfo(TeamInfo);
                emp.setLevel(level);

    //            history.addNewEmployee(emp);


                JOptionPane.showMessageDialog(this, "Employee Updated");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtAgeKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser("C:\\");
            //        file.setCurrentDirectory(new File(System.getProperty("C:\\Users\\dumma\\Pictures")));
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            labelPhoto.setIcon(ResizeImage(path));
            this.photoPath =path;
        }
        String EXPRESSION = "^[a-zA-Z]{1,12}$";
        Pattern express = Pattern.compile(EXPRESSION);
        Matcher match = express.matcher(photoPath);
        if(!match.matches()){
            labelPhoto.setText("Select a photo!");
        }
        else{
            labelPhoto.setText(null);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyReleased

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void txtLevelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLevelKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelKeyReleased
    private String photoPath = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel age1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel emailID1;
    private javax.swing.JLabel emailID2;
    private javax.swing.JLabel emailID3;
    private javax.swing.JLabel employeeID;
    private javax.swing.JLabel employeeID1;
    private javax.swing.JLabel employeeID2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.toedter.calendar.JDateChooser jStartDate;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JTextField queryEID;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPTitle;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
