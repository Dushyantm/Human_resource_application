/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;



import java.awt.FlowLayout;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Employee;
import model.employeeHistory;
import java.util.regex.*;

/**
 *
 * @author dumma
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createJPanel
     */
    employeeHistory history;
    
    public CreateJPanel(employeeHistory history) {
        initComponents();
        FlowLayout exp = new FlowLayout();
        jBtnPanel.setLayout(exp);
        this.history = history;
        ButtonGroup group = new ButtonGroup();
        group.add(this.jRadioBtnMale);
        group.add(this.jRadioBtnFemale);
        group.add(this.jRadioBtnOther);
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        emailID = new javax.swing.JLabel();
        employeeID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        txtEID = new javax.swing.JTextField();
        employeeID1 = new javax.swing.JLabel();
        jStartDate = new com.toedter.calendar.JDateChooser();
        level = new javax.swing.JLabel();
        levelComboBox = new javax.swing.JComboBox<>();
        txtTeamInfo = new javax.swing.JTextField();
        txtPtitle = new javax.swing.JTextField();
        emailID1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtEmailID = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        labelPhoto = new javax.swing.JLabel();
        jBtnPanel = new javax.swing.JPanel();
        jRadioBtnMale = new javax.swing.JRadioButton();
        jRadioBtnFemale = new javax.swing.JRadioButton();
        jRadioBtnOther = new javax.swing.JRadioButton();
        Gender = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        labelPhone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelEID = new javax.swing.JLabel();
        labelPositionTitle = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelStartDate = new javax.swing.JLabel();
        labelLevel = new javax.swing.JLabel();
        labelLevel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(912, 463));

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Create Employee");

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setText("Name:");

        age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        age.setText("Age:");

        emailID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailID.setText("Employee ID:");

        employeeID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeID.setText("Team Info:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        txtEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEIDActionPerformed(evt);
            }
        });
        txtEID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEIDKeyReleased(evt);
            }
        });

        employeeID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeID1.setText("Start Date:");

        level.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        level.setText("Level:");

        levelComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        levelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 1", "Level 2", "Level 3", "Level 4" }));
        levelComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelComboBoxActionPerformed(evt);
            }
        });

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });

        txtPtitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPtitleActionPerformed(evt);
            }
        });
        txtPtitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPtitleKeyReleased(evt);
            }
        });

        emailID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailID1.setText("Position Title:");

        name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name1.setText("Upload Photo:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtEmailID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmailID.setText("Email ID:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
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

        jBtnPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBtnPanelKeyReleased(evt);
            }
        });

        jRadioBtnMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioBtnMale.setText("Male");
        jRadioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnMaleActionPerformed(evt);
            }
        });

        jRadioBtnFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioBtnFemale.setText("Female");
        jRadioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnFemaleActionPerformed(evt);
            }
        });

        jRadioBtnOther.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioBtnOther.setText("Other");
        jRadioBtnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnOtherActionPerformed(evt);
            }
        });

        Gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Gender.setText("Gender:");

        javax.swing.GroupLayout jBtnPanelLayout = new javax.swing.GroupLayout(jBtnPanel);
        jBtnPanel.setLayout(jBtnPanelLayout);
        jBtnPanelLayout.setHorizontalGroup(
            jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBtnPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Gender)
                .addGap(39, 39, 39)
                .addComponent(jRadioBtnMale)
                .addGap(12, 12, 12)
                .addComponent(jRadioBtnFemale)
                .addGap(12, 12, 12)
                .addComponent(jRadioBtnOther))
        );
        jBtnPanelLayout.setVerticalGroup(
            jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioBtnMale)
                        .addComponent(Gender))
                    .addComponent(jRadioBtnFemale)
                    .addComponent(jRadioBtnOther)))
        );

        Phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Phone.setText("Phone:");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneKeyReleased(evt);
            }
        });

        labelEID.setText(" ");

        labelPositionTitle.setText(" ");

        labelAge.setText(" ");

        labelGender.setText(" ");

        labelStartDate.setText(" ");

        labelLevel.setText(" ");

        labelLevel1.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(level)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(levelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(employeeID))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(labelLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(labelLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(name)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(76, 76, 76)
                                                .addComponent(name1))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Phone)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(emailID)
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtEID, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(6, 6, 6)
                                                            .addComponent(labelEID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(employeeID1)
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(labelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGap(55, 55, 55)
                                                                .addComponent(age)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(4, 4, 4)
                                                                .addComponent(labelAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(emailID1)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGap(6, 6, 6)
                                                                        .addComponent(labelPositionTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                    .addComponent(txtPtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                    .addGap(107, 107, 107)
                                                    .addComponent(txtEmailID)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6))
                                        .addComponent(labelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPhone)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(title)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name1)
                                .addComponent(jButton1)))
                        .addGap(4, 4, 4)
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailID)
                            .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelEID))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailID1)
                    .addComponent(txtPtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailID)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPositionTitle)
                    .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(age)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelAge))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(labelGender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeID1)
                    .addComponent(jStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStartDate)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(level)
                        .addComponent(levelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(employeeID)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLevel)
                    .addComponent(labelLevel1)
                    .addComponent(saveBtn))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents
    
//    group.add(this.jRadioBtnMale);
    
    
    
    public ImageIcon ResizeImage(String ImagePath){
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(labelPhoto.getWidth(),labelPhoto.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        Integer employeeId;
        if (txtEID.getText().equals("")){
            employeeId = 0;
        }
        else {employeeId = Integer.valueOf(txtEID.getText());
        }
        
        Integer age;
        if((txtAge.getText().equals(""))){
            age = 0;
        }else {age = Integer.valueOf(txtAge.getText());}
        
        Integer contactInfo;
        if(txtPhone.getText().equals("")){
            contactInfo = 0;
        }else{contactInfo = Integer.valueOf(txtPhone.getText());}
        
        String emailId= txtEmail.getText();
        String positionTitle = txtPtitle.getText();
        String TeamInfo = txtTeamInfo.getText();
        String selectedLevel = String.valueOf(levelComboBox.getSelectedItem());
        String strDate = null;
        if (jStartDate.getDate()==null){
            String date = "01-Oct-2022";
            java.util.Date date2 = null;
            try {
                date2 = new SimpleDateFormat("dd-MMM-yyyy").parse(date);
            } catch (ParseException ex) {
                Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            jStartDate.setDate(date2);
        }else{
            strDate = new SimpleDateFormat("dd-MMM-yyyy").format(jStartDate.getDate());
        }
        
        Employee emp = new Employee();
        
        emp.setName(name);
        emp.setEmployeeId(employeeId);
        emp.setAge(age);
        emp.setContactInfo(contactInfo);
        emp.setEmailId(emailId);
        emp.setGender(this.radioBtnClick);
        emp.setPositionTitle(positionTitle);
        emp.setLevel(selectedLevel);
        emp.setStartDate(strDate);
        emp.setPhotoPath(this.photoPath);
        emp.setTeamInfo(TeamInfo);
        if (contactInfo ==0||emailId.isEmpty()|| strDate.isEmpty()|| positionTitle.isEmpty()||name.isEmpty() ||employeeId ==0 ||age==0){
            JOptionPane.showMessageDialog(this, "enter all fields ");
        }else{
            history.addNewEmployee(emp);
            JOptionPane.showMessageDialog(this, "New Employee Created");
        }
        
        
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void txtEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEIDActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void txtPtitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPtitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPtitleActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

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

    private void jRadioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnMaleActionPerformed
        // TODO add your handling code here:
        this.radioBtnClick = "Male";
    }//GEN-LAST:event_jRadioBtnMaleActionPerformed

    private void jRadioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnFemaleActionPerformed
        // TODO add your handling code here:
        this.radioBtnClick = "Female";

    }//GEN-LAST:event_jRadioBtnFemaleActionPerformed

    private void jRadioBtnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnOtherActionPerformed
        // TODO add your handling code here:
        this.radioBtnClick = "Other";

    }//GEN-LAST:event_jRadioBtnOtherActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyReleased
        // TODO add your handling code here:
        String EXPRESSION = "^[0-9]{10}$";
        Pattern express = Pattern.compile(EXPRESSION);
        Matcher match = express.matcher(txtPhone.getText());
        if(!match.matches() ){
            labelPhone.setText("Enter a valid 10 digit phone number!");
        }
        else{
            labelPhone.setText(null);            
        }
    }//GEN-LAST:event_txtPhoneKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        String EXPRESSION = "^[a-zA-Z0-9]{0,15}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{2,5}$";
        Pattern express = Pattern.compile(EXPRESSION);
        Matcher match = express.matcher(txtEmail.getText());
        if(!match.matches()){
            labelEmail.setText("Enter a valid e-mail address!");
        }
        else{
            labelEmail.setText(null);
        }
        
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        String EXPRESSION = "^[a-zA-Z]{2,20}$";
        Pattern express = Pattern.compile(EXPRESSION);
        Matcher match = express.matcher(txtName.getText());
        if(!match.matches()){
            labelName.setText("Enter a valid name!");
        }
        else{
            labelName.setText(null);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEIDKeyReleased
        // TODO add your handling code here:
        String EXPRESSION = "^[0-9]{5}$";
        Pattern express = Pattern.compile(EXPRESSION);
        Matcher match = express.matcher(txtEID.getText());
        if(!match.matches()){
            labelEID.setText("Enter valid 5 digit employee ID!");
        }
        else{
            labelEID.setText(" ");
        }
    }//GEN-LAST:event_txtEIDKeyReleased

    private void txtPtitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPtitleKeyReleased
        // TODO add your handling code here:
        String EXPRESSION = "^[a-zA-Z]{0,10}$";
        Pattern express = Pattern.compile(EXPRESSION);
        Matcher match = express.matcher(txtPtitle.getText());
        if(!match.matches()){
            labelPositionTitle.setText("Enter a valid Position Title!");
        }
        else{
            labelPositionTitle.setText(" ");
        }
    }//GEN-LAST:event_txtPtitleKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String EXPRESSION = "^[0-9]{1,2}$";
        Pattern express = Pattern.compile(EXPRESSION);
        Matcher match = express.matcher(txtAge.getText());
        if(!match.matches()){
            labelAge.setText("Enter valid age!");
        }
        else{
            labelAge.setText(" ");
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void jBtnPanelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnPanelKeyReleased
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_jBtnPanelKeyReleased

    private void levelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_levelComboBoxActionPerformed
    private String radioBtnClick = "";
    private String photoPath = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel age;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel emailID1;
    private javax.swing.JLabel employeeID;
    private javax.swing.JLabel employeeID1;
    private javax.swing.JPanel jBtnPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioBtnFemale;
    private javax.swing.JRadioButton jRadioBtnMale;
    private javax.swing.JRadioButton jRadioBtnOther;
    private com.toedter.calendar.JDateChooser jStartDate;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelEID;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelLevel;
    private javax.swing.JLabel labelLevel1;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JLabel labelPositionTitle;
    private javax.swing.JLabel labelStartDate;
    private javax.swing.JLabel level;
    private javax.swing.JComboBox<String> levelComboBox;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtEmailID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPtitle;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
