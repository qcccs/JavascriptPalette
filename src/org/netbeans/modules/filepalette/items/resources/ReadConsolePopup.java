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
import org.netbeans.modules.filepalette.items.ReadConsole;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;

/**
 *
 * @author Ian
 */
public class ReadConsolePopup extends javax.swing.JPanel {

    private Dialog dialog = null;
    private DialogDescriptor descriptor = null;
    private boolean dialogOK = false;
    ReadConsole ifitem;
    JTextComponent target;

    /**
     * Creates new Popup form
     * @param item
     * @param target  
     */
    public ReadConsolePopup(ReadConsole item, JTextComponent target) {
        this.ifitem = item;
        this.target = target;
        initComponents();

    }

    /**
     *
     * @return
     */
    public boolean showDialog() {
        readConsoleButton.setVisible(false);
        dialogOK = false;

        String displayName = "";
        try {
            displayName = NbBundle.getBundle("org.netbeans.modules.filepalette.items.resources.Bundle").getString("NAME_html-readConsole");
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
                            readConsoleButton.doClick();
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
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        readConsoleButton = new javax.swing.JButton();

        jTextField1.setText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jTextField1.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jLabel1.text")); // NOI18N

        varPane.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.varPane.border.title"))); // NOI18N
        varPane.setToolTipText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.varPane.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton1);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton1, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton1.text")); // NOI18N
        jRadioButton1.setToolTipText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton1.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton2);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton2, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton2.text")); // NOI18N
        jRadioButton2.setToolTipText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton2.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton3);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton3, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton3.text")); // NOI18N
        jRadioButton3.setToolTipText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton3.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton4, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton4.text")); // NOI18N
        jRadioButton4.setToolTipText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton4.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton5);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton5, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton5.text")); // NOI18N
        jRadioButton5.setToolTipText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton5.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton6);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton6, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton6.text")); // NOI18N
        jRadioButton6.setToolTipText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton6.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton7);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton7, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton7.text")); // NOI18N
        jRadioButton7.setToolTipText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton7.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton8);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton8, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton8.text")); // NOI18N
        jRadioButton8.setToolTipText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton8.toolTipText")); // NOI18N

        buttonGroup1.add(jRadioButton9);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton9, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton9.text")); // NOI18N
        jRadioButton9.setToolTipText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jRadioButton9.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jLabel4.text")); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/mass/qcc/qcccodewizard/Question.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel33, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jLabel33.text")); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel39, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.jLabel39.text")); // NOI18N

        varNameCombo1.setText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.varNameCombo1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(readConsoleButton, org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.readConsoleButton.text")); // NOI18N
        readConsoleButton.setToolTipText(org.openide.util.NbBundle.getMessage(ReadConsolePopup.class, "ReadConsolePopup.readConsoleButton.toolTipText")); // NOI18N
        readConsoleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readConsoleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout varPaneLayout = new javax.swing.GroupLayout(varPane);
        varPane.setLayout(varPaneLayout);
        varPaneLayout.setHorizontalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33))
            .addGroup(varPaneLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varNameCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(readConsoleButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        varPaneLayout.setVerticalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varPaneLayout.createSequentialGroup()
                .addGroup(varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(jLabel33))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel39)
                    .addComponent(varNameCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(readConsoleButton))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(varPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void readConsoleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readConsoleButtonActionPerformed

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

                //Get the name for the variable
                String varName = varNameCombo1.getText();

                //Make sure its a valid variable name...
                CheckVariableName cvn = new CheckVariableName();
                if (cvn.isGood(varName)) {
                    //If name is valid, add it to the editor.
                    System.out.println("Valid Name");
                    //Start Building String for insertion.
                    StringBuilder sb = new StringBuilder();
                    sb.append("//  Read input from the console.\n\t");
                    sb.append("std::getline(std::cin, ").append(varName).append(");\n\t");
                    

                    String code = sb.toString();


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
    }//GEN-LAST:event_readConsoleButtonActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // Help Page
        OpenHelpUrl o = new OpenHelpUrl("http://www.w3schools.com/js/js_ex_dom.asp");
    }//GEN-LAST:event_jLabel33MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JButton readConsoleButton;
    private javax.swing.JTextField varNameCombo1;
    private javax.swing.JPanel varPane;
    // End of variables declaration//GEN-END:variables
}
