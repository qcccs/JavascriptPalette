/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.filepalette.items.resources;

import edu.mass.qcc.qcccodewizard.CheckVariableName;
import edu.mass.qcc.qcccodewizard.CodeDrop;
import edu.mass.qcc.qcccodewizard.GroupButtonUtils;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.EditorRegistry;
import org.netbeans.modules.filepalette.OpenHelpUrl;
import org.netbeans.modules.filepalette.items.CharVar;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;

/**
 *
 * @author Ian
 */
public class CharVarPopup extends javax.swing.JPanel {

    private Dialog dialog = null;
    private DialogDescriptor descriptor = null;
    private boolean dialogOK = false;
    CharVar ifitem;
    JTextComponent target;

    /**
     * Creates new Popup form
     * @param item
     * @param target  
     */
    public CharVarPopup(CharVar item, JTextComponent target) {
        this.ifitem = item;
        this.target = target;
        initComponents();

    }

    /**
     *
     * @return
     */
    public boolean showDialog() {
        addVariableButton.setVisible(false);
        dialogOK = false;

        String displayName = "";
        try {
            displayName = NbBundle.getBundle("org.netbeans.modules.filepalette.items.resources.Bundle").getString("NAME_html-charVar");
        } catch (Exception e) {
        }

        descriptor = new DialogDescriptor(this, NbBundle.getMessage(NewObjectPopup.class, "LBL_Customizer_InsertPrefix") + " " + displayName, true,
                DialogDescriptor.OK_CANCEL_OPTION, DialogDescriptor.CANCEL_OPTION,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (!descriptor.getValue().equals(DialogDescriptor.CANCEL_OPTION)) {
                            evaluateInput();
                            dialogOK = true;

                            addVariableButton.doClick();
                        }
                        dialog.dispose();

                    }
                });

        dialog = DialogDisplayer.getDefault().createDialog(descriptor);

        dialog.setVisible(true);
        repaint();

        return dialogOK;

    }

    private void evaluateInput() {

        String comment = jTextField1.getText();
        ifitem.setComment(comment);

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
        jPanel2 = new javax.swing.JPanel();
        expPane = new javax.swing.JPanel();
        vCb4 = new javax.swing.JComboBox();
        vCb5 = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        addVariableButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        varPane = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        varNameCombo1 = new javax.swing.JTextField();

        expPane.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.expPane.border.title"))); // NOI18N

        vCb4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=" }));

        vCb5.setEditable(true);
        vCb5.setModel(new VariableNameComboModel());
        vCb5.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.vCb5.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel41, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jLabel41.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(addVariableButton, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.addVariableButton.text")); // NOI18N
        addVariableButton.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.addVariableButton.toolTipText")); // NOI18N
        addVariableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVariableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout expPaneLayout = new javax.swing.GroupLayout(expPane);
        expPane.setLayout(expPaneLayout);
        expPaneLayout.setHorizontalGroup(
            expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(expPaneLayout.createSequentialGroup()
                        .addComponent(vCb4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vCb5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(expPaneLayout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addComponent(addVariableButton))))
        );
        expPaneLayout.setVerticalGroup(
            expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(addVariableButton)))
            .addGroup(expPaneLayout.createSequentialGroup()
                .addGroup(expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vCb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vCb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jLabel1.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jTextField1.text")); // NOI18N

        varPane.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.varPane.border.title"))); // NOI18N
        varPane.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.varPane.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton1);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton1, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton1.text")); // NOI18N
        jRadioButton1.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton1.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton2);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton2, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton2.text")); // NOI18N
        jRadioButton2.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton2.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton3, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton3.text")); // NOI18N
        jRadioButton3.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton3.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton4);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton4, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton4.text")); // NOI18N
        jRadioButton4.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton4.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton5);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton5, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton5.text")); // NOI18N
        jRadioButton5.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton5.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton6);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton6, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton6.text")); // NOI18N
        jRadioButton6.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton6.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton7);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton7, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton7.text")); // NOI18N
        jRadioButton7.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton7.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton8);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton8, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton8.text")); // NOI18N
        jRadioButton8.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton8.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton9);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton9, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton9.text")); // NOI18N
        jRadioButton9.setToolTipText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jRadioButton9.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jLabel4.text")); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/mass/qcc/qcccodewizard/Question.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel33, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jLabel33.text")); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel39, org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.jLabel39.text")); // NOI18N

        varNameCombo1.setText(org.openide.util.NbBundle.getMessage(CharVarPopup.class, "CharVarPopup.varNameCombo1.text")); // NOI18N

        javax.swing.GroupLayout varPaneLayout = new javax.swing.GroupLayout(varPane);
        varPane.setLayout(varPaneLayout);
        varPaneLayout.setHorizontalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varPaneLayout.createSequentialGroup()
                .addGroup(varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(varPaneLayout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton9))
                    .addGroup(varPaneLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varNameCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jLabel33))
        );
        varPaneLayout.setVerticalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varPaneLayout.createSequentialGroup()
                .addGroup(varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9))
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel39)
                    .addComponent(varNameCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
            .addGroup(varPaneLayout.createSequentialGroup()
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addComponent(varPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(expPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addVariableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVariableButtonActionPerformed

        //This adds a new variable into the current document
        GroupButtonUtils gbu = new GroupButtonUtils();
        if (gbu.getSelectedButtonText(buttonGroup1) != null && !varNameCombo1.getText().equals("")) {
            //Get the currently open java source
            try {
                JTextComponent jtc = EditorRegistry.lastFocusedComponent();
                CodeDrop codedrop = new CodeDrop();
                //Find the type of variable

                String varType = "";

                varType = gbu.getSelectedButtonText(buttonGroup1);

                if (!"Fix in Future".equals(varType)) {
                    varType = varType.toLowerCase();
                }
                System.out.println(varType);
                //Get the name for the variable
                String varName = varNameCombo1.getText();
                System.out.println(varName);

                //Make sure its a valid variable name...
                CheckVariableName cvn = new CheckVariableName();
                if (cvn.isGood(varName)) {
                    //If name is valid, add it to the editor.
                    System.out.println("Valid Name");

                    //Check if we need to add a value or simple expression.
                    String value1 = "";
                    String operator = "";
                    String code = "";
                    if (vCb5.getSelectedItem() != null) {
                        value1 = vCb5.getSelectedItem().toString();
                        operator = vCb4.getSelectedItem().toString();
                        code = varType + " " + varName + operator + "'" + value1 + "'" + ";";
                    } else {
                        code = varType + " " + varName + ";";
                    }


                    //Construct the output string

                    try {
                        //Insert into document
                        System.out.println("Inserting Code");
                        CodeDrop.insert(code, jtc);
                    } catch (BadLocationException ex) {
                        Exceptions.printStackTrace(ex);
                    }

                } else {

                    JOptionPane.showMessageDialog(this, "Invalid Variable Name. Try Again.");
                    System.out.println("Variable name not valid!");
                }

            } catch (java.lang.Throwable t) {

                JOptionPane.showMessageDialog(this, "All Fields must be filled out.");

            }
        }//end if
        //Call combobox models visit method to update with the new variable.
    }//GEN-LAST:event_addVariableButtonActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // Variable Help Page
        OpenHelpUrl o = new OpenHelpUrl("http://www.cplusplus.com");
    }//GEN-LAST:event_jLabel33MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVariableButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel expPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox vCb4;
    private javax.swing.JComboBox vCb5;
    private javax.swing.JTextField varNameCombo1;
    private javax.swing.JPanel varPane;
    // End of variables declaration//GEN-END:variables
}