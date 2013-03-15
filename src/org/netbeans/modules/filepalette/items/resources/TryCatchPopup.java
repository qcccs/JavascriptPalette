/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.filepalette.items.resources;

import edu.mass.qcc.qcccodewizard.CodeDrop;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.EditorRegistry;
import org.netbeans.modules.filepalette.OpenHelpUrl;
import org.netbeans.modules.filepalette.items.TryCatch;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;

/**
 *
 * @author Ian
 */
public class TryCatchPopup extends javax.swing.JPanel {

    private Dialog dialog = null;
    private DialogDescriptor descriptor = null;
    private boolean dialogOK = false;
    TryCatch ifitem;
    JTextComponent target;

    /**
     * Creates new Popup form
     * @param item 
     * @param target 
     */
    public TryCatchPopup(TryCatch item, JTextComponent target) {
        this.ifitem = item;
        this.target = target;
        initComponents();

    }

    /**
     *
     * @return
     */
    public boolean showDialog() {
        tcButton.setVisible(false);
        dialogOK = false;

        String displayName = "";
        try {
            displayName = NbBundle.getBundle("org.netbeans.modules.filepalette.items.resources.Bundle").getString("NAME_html-tryCatch");
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

                            tcButton.doClick();
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        varPane = new javax.swing.JPanel();
        excType = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        tcButton = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(TryCatchPopup.class, "TryCatchPopup.jLabel1.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(TryCatchPopup.class, "TryCatchPopup.jTextField1.text")); // NOI18N

        varPane.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TryCatchPopup.class, "TryCatchPopup.varPane.border.title"))); // NOI18N
        varPane.setToolTipText(org.openide.util.NbBundle.getMessage(TryCatchPopup.class, "TryCatchPopup.varPane.toolTipText")); // NOI18N

        excType.setEditable(true);
        excType.setModel(new VariableTypeComboBoxModel());
        excType.setToolTipText(org.openide.util.NbBundle.getMessage(TryCatchPopup.class, "TryCatchPopup.excType.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(TryCatchPopup.class, "TryCatchPopup.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(tcButton, org.openide.util.NbBundle.getMessage(TryCatchPopup.class, "TryCatchPopup.tcButton.text")); // NOI18N
        tcButton.setToolTipText(org.openide.util.NbBundle.getMessage(TryCatchPopup.class, "TryCatchPopup.tcButton.toolTipText")); // NOI18N
        tcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcButtonActionPerformed(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/mass/qcc/qcccodewizard/Question.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel33, org.openide.util.NbBundle.getMessage(TryCatchPopup.class, "TryCatchPopup.jLabel33.text")); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout varPaneLayout = new javax.swing.GroupLayout(varPane);
        varPane.setLayout(varPaneLayout);
        varPaneLayout.setHorizontalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varPaneLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excType, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33))
            .addGroup(varPaneLayout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(tcButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        varPaneLayout.setVerticalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varPaneLayout.createSequentialGroup()
                .addGroup(varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33)
                    .addGroup(varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(excType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(tcButton)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(varPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcButtonActionPerformed

        //This adds a new variable into the current document

        //Get the currently open java source

        JTextComponent jtc = EditorRegistry.lastFocusedComponent();
        CodeDrop codedrop = new CodeDrop();
        //Find the type of exception.
        String exception = excType.getSelectedItem().toString().toLowerCase();

        //Construct the output string
        StringBuilder sb = new StringBuilder();
        sb.append("try {\n\t\t//Try Block Code Here\n\t\t}catch(").append(exception).append(" ex").append("){\n\t\t//Catch Block Here\n\t\tcout << \"An exception occurred. Exception Nr. \" << ex << endl;\n\t\t}");
        String code = sb.toString();
        try {
            //Insert into document
            System.out.println("Inserting Code");
            CodeDrop.insert(code, jtc);
        } catch (BadLocationException ex) {
            Exceptions.printStackTrace(ex);
        }




        //Call combobox models visit method to update with the new variable.
    }//GEN-LAST:event_tcButtonActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // Help Page
        OpenHelpUrl o = new OpenHelpUrl("http://www.w3schools.com/js/js_ex_dom.asp");
    }//GEN-LAST:event_jLabel33MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox excType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton tcButton;
    private javax.swing.JPanel varPane;
    // End of variables declaration//GEN-END:variables
}
