/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_11_struktur_i_en_gui;

/**
 *
 * @author j
 */
public class JacobPanel extends javax.swing.JPanel {
	/** Creates new form JacobPanel */
	public JacobPanel() {
		initComponents();
	}

	MangePaneler ejer;

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    okKnap = new javax.swing.JButton();
    ærlighedindikator = new javax.swing.JCheckBox();
    kloghedsinidkator = new javax.swing.JSlider();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextAreaDom = new javax.swing.JTextArea();
    jComboBox1 = new javax.swing.JComboBox();
    jButton1 = new javax.swing.JButton();

    jLabel1.setText("Hvor klog er du?");

    okKnap.setText("OK");
    okKnap.setEnabled(false);
    okKnap.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        okKnapActionPerformed(evt);
      }
    });

    ærlighedindikator.setText("Jeg er ærlig nu");

    kloghedsinidkator.setMaximum(70);
    kloghedsinidkator.setValue(35);

    jTextAreaDom.setColumns(20);
    jTextAreaDom.setRows(5);
    jTextAreaDom.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(java.awt.event.MouseEvent evt) {
        MusOverTekstarea(evt);
      }
    });
    jScrollPane1.setViewportView(jTextAreaDom);

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Søren", "Jacob", "Bo", "Ib" }));
    jComboBox1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jComboBox1ActionPerformed(evt);
      }
    });

    jButton1.setText("jButton1");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        denNyeKnapBlevTrykket(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(52, 52, 52)
            .addComponent(okKnap)
            .addGap(48, 48, 48)
            .addComponent(ærlighedindikator))
          .addGroup(layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(jLabel1))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(kloghedsinidkator, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(jButton1)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(kloghedsinidkator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton1))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(okKnap)
          .addComponent(ærlighedindikator))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(14, 14, 14)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void okKnapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okKnapActionPerformed


		System.out.println("huraaaaaaa!");
		int kloghed = kloghedsinidkator.getValue();
		boolean ærlig = ærlighedindikator.isSelected();

		if (kloghed > 60 && ærlig==false) {
			jTextAreaDom.setText("Din løgner!!");
		}
		if (kloghed < 20 && ærlig==false) {
			jTextAreaDom.setText("Nu er du fpr beskedden :-)");
		}

  }//GEN-LAST:event_okKnapActionPerformed

  private void MusOverTekstarea(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MusOverTekstarea
    // TODO add your handling code here:

		System.out.println("MusOverTekstarea " + evt.toString() );

  }//GEN-LAST:event_MusOverTekstarea

  private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    // TODO add your handling code here:

		if (jComboBox1.getSelectedIndex()<2) {
			okKnap.setEnabled(true);
		} else {
			okKnap.setEnabled(false);
		}

  }//GEN-LAST:event_jComboBox1ActionPerformed

  private void denNyeKnapBlevTrykket(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denNyeKnapBlevTrykket
		// TODO add your handling code here:
		System.out.println("denNyeKnapBlevTrykket");
		ejer.sætFane(0);
		
  }//GEN-LAST:event_denNyeKnapBlevTrykket



  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JComboBox jComboBox1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextAreaDom;
  private javax.swing.JSlider kloghedsinidkator;
  private javax.swing.JButton okKnap;
  private javax.swing.JCheckBox ærlighedindikator;
  // End of variables declaration//GEN-END:variables
}