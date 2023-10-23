/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author sahil
 */
public class TeacherUpdateCourses extends javax.swing.JPanel {

    /**
     * Creates new form TeacherUpdateCourses
     */
    public TeacherUpdateCourses() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        dropdownCourseNameT2_3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCoursePriceT2_3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBoxMonday = new javax.swing.JCheckBox();
        jCheckBoxTuesday = new javax.swing.JCheckBox();
        jCheckBoxWednesday = new javax.swing.JCheckBox();
        jCheckBoxThursday = new javax.swing.JCheckBox();
        jCheckBoxFriday = new javax.swing.JCheckBox();
        jCheckBoxSaturday = new javax.swing.JCheckBox();
        jCheckBoxSunday = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCourseCatalogT2_3 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnUpdateCourseT2_3 = new javax.swing.JButton();

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Course Name");

        dropdownCourseNameT2_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dropdownCourseNameT2_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Computers", "Maths", "Physics", "English", "Biology", "History", "Architecture", "Arts", "Dance", "Music" }));
        dropdownCourseNameT2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownCourseNameT2_3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Course Price");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Course Days");

        jCheckBoxMonday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxMonday.setText("Monday");

        jCheckBoxTuesday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxTuesday.setText("Tuesday");

        jCheckBoxWednesday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxWednesday.setText("Wednesday");

        jCheckBoxThursday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxThursday.setText("Thursday");

        jCheckBoxFriday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxFriday.setText("Friday");

        jCheckBoxSaturday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxSaturday.setText("Saturday");

        jCheckBoxSunday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxSunday.setText("Sunday");
        jCheckBoxSunday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSundayActionPerformed(evt);
            }
        });

        txtCourseCatalogT2_3.setColumns(20);
        txtCourseCatalogT2_3.setRows(5);
        jScrollPane2.setViewportView(txtCourseCatalogT2_3);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Course Catalog");

        btnUpdateCourseT2_3.setBackground(new java.awt.Color(153, 255, 102));
        btnUpdateCourseT2_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateCourseT2_3.setText("Update");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCoursePriceT2_3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(dropdownCourseNameT2_3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addComponent(btnUpdateCourseT2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(242, 242, 242))
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2))
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBoxMonday, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBoxTuesday, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBoxWednesday, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBoxThursday, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBoxFriday, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBoxSaturday)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBoxSunday, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(161, 161, 161))))))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropdownCourseNameT2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCoursePriceT2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMonday)
                    .addComponent(jCheckBoxTuesday)
                    .addComponent(jCheckBoxWednesday)
                    .addComponent(jCheckBoxThursday)
                    .addComponent(jCheckBoxFriday)
                    .addComponent(jCheckBoxSaturday)
                    .addComponent(jCheckBoxSunday))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateCourseT2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1289, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 872, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxSundayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSundayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxSundayActionPerformed

    private void dropdownCourseNameT2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownCourseNameT2_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownCourseNameT2_3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateCourseT2_3;
    private javax.swing.JComboBox<String> dropdownCourseNameT2_3;
    private javax.swing.JCheckBox jCheckBoxFriday;
    private javax.swing.JCheckBox jCheckBoxMonday;
    private javax.swing.JCheckBox jCheckBoxSaturday;
    private javax.swing.JCheckBox jCheckBoxSunday;
    private javax.swing.JCheckBox jCheckBoxThursday;
    private javax.swing.JCheckBox jCheckBoxTuesday;
    private javax.swing.JCheckBox jCheckBoxWednesday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextArea txtCourseCatalogT2_3;
    private javax.swing.JTextField txtCoursePriceT2_3;
    // End of variables declaration//GEN-END:variables
}