public class Withdraw extends javax.swing.JFrame {

          Customer cus;

        /**
         * Creates new form ATM
         */
        public Withdraw() {
            initComponents();

        }


         public Withdraw(Customer cus) {
            initComponents();
               this.cus=cus;
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
            lbl_r1 = new javax.swing.JLabel();
            lbl_r2 = new javax.swing.JLabel();
            lbl_r3 = new javax.swing.JLabel();
            lbl_r4 = new javax.swing.JLabel();
            lbl_l3 = new javax.swing.JLabel();
            lbl_l4 = new javax.swing.JLabel();
            lbl_l1 = new javax.swing.JLabel();
            lbl_l2 = new javax.swing.JLabel();
            jPanel1 = new javax.swing.JPanel();
            jLabel12 = new javax.swing.JLabel();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            jLabel15 = new javax.swing.JLabel();
            jLabel16 = new javax.swing.JLabel();
            jLabel17 = new javax.swing.JLabel();
            jLabel18 = new javax.swing.JLabel();
            jLabel19 = new javax.swing.JLabel();
            btn_n1 = new javax.swing.JButton();
            btn_n2 = new javax.swing.JButton();
            btn_n3 = new javax.swing.JButton();
            btn_n6 = new javax.swing.JButton();
            btn_n5 = new javax.swing.JButton();
            btn_n4 = new javax.swing.JButton();
            btn_n9 = new javax.swing.JButton();
            btn_n7 = new javax.swing.JButton();
            btn_n8 = new javax.swing.JButton();
            btn_n_dot = new javax.swing.JButton();
            btn_n_blank = new javax.swing.JButton();
            btn_n0 = new javax.swing.JButton();
            btn_ok = new javax.swing.JButton();
            btn_clear = new javax.swing.JButton();
            btn_cancel = new javax.swing.JButton();
            btn_enter = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bank_logo_2.png"))); // NOI18N

            lbl_r1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round.png"))); // NOI18N
            lbl_r1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lbl_r1MouseClicked(evt);
                }
            });

            lbl_r2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round.png"))); // NOI18N
            lbl_r2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lbl_r2MouseClicked(evt);
                }
            });

            lbl_r3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round.png"))); // NOI18N
            lbl_r3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lbl_r3MouseClicked(evt);
                }
            });

            lbl_r4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round.png"))); // NOI18N
            lbl_r4.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lbl_r4MouseClicked(evt);
                }
            });

            lbl_l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round.png"))); // NOI18N
            lbl_l3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lbl_l3MouseClicked(evt);
                }
            });

            lbl_l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round.png"))); // NOI18N
            lbl_l4.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lbl_l4MouseClicked(evt);
                }
            });

            lbl_l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round.png"))); // NOI18N
            lbl_l1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lbl_l1MouseClicked(evt);
                }
            });

            lbl_l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round.png"))); // NOI18N
            lbl_l2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lbl_l2MouseClicked(evt);
                }
            });

            jPanel1.setBackground(new java.awt.Color(251, 146, 124));
            jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 255), null, null));
            jPanel1.setPreferredSize(new java.awt.Dimension(330, 311));

            jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel12.setForeground(new java.awt.Color(255, 255, 255));
            jLabel12.setText("500");

            jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel13.setForeground(new java.awt.Color(255, 255, 255));
            jLabel13.setText("2000");

            jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel14.setForeground(new java.awt.Color(255, 255, 255));
            jLabel14.setText("5000");

            jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel15.setForeground(new java.awt.Color(255, 255, 255));
            jLabel15.setText("3000");

            jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel16.setForeground(new java.awt.Color(255, 255, 255));
            jLabel16.setText("1000");

            jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel17.setForeground(new java.awt.Color(255, 255, 255));
            jLabel17.setText("Back");

            jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel18.setForeground(new java.awt.Color(255, 255, 255));
            jLabel18.setText("10000");

            jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel19.setForeground(new java.awt.Color(255, 255, 255));
            jLabel19.setText("Other Amount");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(jLabel12))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel18)
                                .addComponent(jLabel17))
                            .addGap(19, 19, 19))))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(jLabel14)
                            .addGap(33, 33, 33))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel12)
                            .addGap(43, 43, 43)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel16))
                    .addGap(38, 38, 38)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel13))
                    .addGap(46, 46, 46)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel19))
                    .addContainerGap(48, Short.MAX_VALUE))
            );

            btn_n1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n1.setForeground(new java.awt.Color(249, 116, 92));
            btn_n1.setText("1");

            btn_n2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n2.setForeground(new java.awt.Color(249, 116, 92));
            btn_n2.setText("2");

            btn_n3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n3.setForeground(new java.awt.Color(249, 116, 92));
            btn_n3.setText("3");
            btn_n3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_n3ActionPerformed(evt);
                }
            });

            btn_n6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n6.setForeground(new java.awt.Color(249, 116, 92));
            btn_n6.setText("6");

            btn_n5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n5.setForeground(new java.awt.Color(249, 116, 92));
            btn_n5.setText("5");
            btn_n5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_n5ActionPerformed(evt);
                }
            });

            btn_n4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n4.setForeground(new java.awt.Color(249, 116, 92));
            btn_n4.setText("4");

            btn_n9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n9.setForeground(new java.awt.Color(249, 116, 92));
            btn_n9.setText("9");

            btn_n7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n7.setForeground(new java.awt.Color(249, 116, 92));
            btn_n7.setText("7");

            btn_n8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n8.setForeground(new java.awt.Color(249, 116, 92));
            btn_n8.setText("8");

            btn_n_dot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n_dot.setForeground(new java.awt.Color(249, 116, 92));
            btn_n_dot.setText(".");

            btn_n_blank.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n_blank.setForeground(new java.awt.Color(249, 116, 92));
            btn_n_blank.setText(" ");

            btn_n0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_n0.setForeground(new java.awt.Color(249, 116, 92));
            btn_n0.setText("0");

            btn_ok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_ok.setText("OK");

            btn_clear.setBackground(new java.awt.Color(255, 153, 0));
            btn_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_clear.setForeground(new java.awt.Color(255, 255, 255));
            btn_clear.setText("Clear");

            btn_cancel.setBackground(new java.awt.Color(255, 0, 0));
            btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
            btn_cancel.setText("Cancel");
            btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btn_cancelMouseClicked(evt);
                }
            });
            btn_cancel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_cancelActionPerformed(evt);
                }
            });

            btn_enter.setBackground(new java.awt.Color(0, 153, 51));
            btn_enter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            btn_enter.setForeground(new java.awt.Color(255, 255, 255));
            btn_enter.setText("Enter");
            btn_enter.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_enterActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_l3)
                                .addComponent(lbl_l4)
                                .addComponent(lbl_l1)
                                .addComponent(lbl_l2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_n4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_n5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_n6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_n_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_n0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_n_blank, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_n7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_n8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_n9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn_enter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn_ok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_r2)
                                .addComponent(lbl_r1)
                                .addComponent(lbl_r3)
                                .addComponent(lbl_r4))))
                    .addGap(3, 3, 3))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(lbl_l1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_l2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_l3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_l4))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(lbl_r1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_r2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_r3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_r4)))
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_n4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_n5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_n6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_n7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_n8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_n9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_n_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_n0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_n_blank, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(22, Short.MAX_VALUE))
            );

            setSize(new java.awt.Dimension(519, 830));
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void btn_n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n3ActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_btn_n3ActionPerformed

        private void btn_n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_n5ActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_btn_n5ActionPerformed

        private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed




            // TODO add your handling code here:
        }//GEN-LAST:event_btn_enterActionPerformed

        private void lbl_r4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_r4MouseClicked
    this.setVisible(false);
    new Withdraw1(cus).setVisible(true);

            // TODO add your handling code here:
        }//GEN-LAST:event_lbl_r4MouseClicked

        private void lbl_r3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_r3MouseClicked

    this.setVisible(false);
    new ATMHOME(cus).setVisible(true);


            // TODO add your handling code here:
        }//GEN-LAST:event_lbl_r3MouseClicked

        private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
    this.setVisible(false);
    new ATMPinConfirm().setVisible(true);        // TODO add your handling code here:
        }//GEN-LAST:event_btn_cancelActionPerformed

        private void lbl_l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_l1MouseClicked

    this.setVisible(false);
    new Confirm(500,cus).setVisible(true);

            // TODO add your handling code here:
        }//GEN-LAST:event_lbl_l1MouseClicked

        private void lbl_l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_l2MouseClicked
    this.setVisible(false);
    new Confirm(1000,cus).setVisible(true);        // TODO add your handling code here:
        }//GEN-LAST:event_lbl_l2MouseClicked

        private void lbl_l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_l3MouseClicked
    this.setVisible(false);
    new Confirm(2000,cus).setVisible(true);        // TODO add your handling code here:
        }//GEN-LAST:event_lbl_l3MouseClicked

        private void lbl_l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_l4MouseClicked
    this.setVisible(false);
    new Confirm(3000,cus).setVisible(true);        // TODO add your handling code here:
        }//GEN-LAST:event_lbl_l4MouseClicked

        private void lbl_r1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_r1MouseClicked
    this.setVisible(false);
    new Confirm(5000,cus).setVisible(true);        // TODO add your handling code here:
        }//GEN-LAST:event_lbl_r1MouseClicked

        private void lbl_r2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_r2MouseClicked
    this.setVisible(false);
    new Confirm(10000,cus).setVisible(true);        // TODO add your handling code here:
        }//GEN-LAST:event_lbl_r2MouseClicked

        private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
            // TODO add your handling code here:
        }//GEN-LAST:event_btn_cancelMouseClicked

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
                java.util.logging.Logger.getLogger(ATMPinConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ATMPinConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ATMPinConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ATMPinConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ATMPinConfirm().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btn_cancel;
        private javax.swing.JButton btn_clear;
        private javax.swing.JButton btn_enter;
        private javax.swing.JButton btn_n0;
        private javax.swing.JButton btn_n1;
        private javax.swing.JButton btn_n2;
        private javax.swing.JButton btn_n3;
        private javax.swing.JButton btn_n4;
        private javax.swing.JButton btn_n5;
        private javax.swing.JButton btn_n6;
        private javax.swing.JButton btn_n7;
        private javax.swing.JButton btn_n8;
        private javax.swing.JButton btn_n9;
        private javax.swing.JButton btn_n_blank;
        private javax.swing.JButton btn_n_dot;
        private javax.swing.JButton btn_ok;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel lbl_l1;
        private javax.swing.JLabel lbl_l2;
        private javax.swing.JLabel lbl_l3;
        private javax.swing.JLabel lbl_l4;
        private javax.swing.JLabel lbl_r1;
        private javax.swing.JLabel lbl_r2;
        private javax.swing.JLabel lbl_r3;
        private javax.swing.JLabel lbl_r4;
        // End of variables declaration//GEN-END:variables
    }