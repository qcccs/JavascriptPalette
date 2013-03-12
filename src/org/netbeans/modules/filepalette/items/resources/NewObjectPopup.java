/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.filepalette.items.resources;

import edu.mass.qcc.qcccodewizard.CheckVariableName;
import edu.mass.qcc.qcccodewizard.CodeDrop;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.EditorRegistry;
import org.netbeans.modules.filepalette.OpenHelpUrl;
import org.netbeans.modules.filepalette.items.NewObject;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;

/**
 *
 * @author Ian
 */
public class NewObjectPopup extends JPanel {

    private Dialog dialog = null;
    private DialogDescriptor descriptor = null;
    private boolean dialogOK = false;
    NewObject ifitem;
    JTextComponent target;

    /**
     * Creates new form ItemCustomizer
     * @param item
     * @param target  
     */
    public NewObjectPopup(NewObject item, JTextComponent target) {
        this.ifitem = item;
        this.target = target;

        initComponents();
    }

    /**
     *
     * @return
     */
    public boolean showDialog() {
        instObjectButton.setVisible(false);
        dialogOK = false;

        String displayName = "";
        try {
            displayName = NbBundle.getBundle("org.netbeans.modules.filepalette.items.resources.Bundle").getString("Name_HTML_newObject");
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
                        }
                        dialog.dispose();
                        instObjectButton.doClick();
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        objectName = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        varName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        instObjectButton = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        params = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.jLabel1.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.jTextField1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.jLabel4.text")); // NOI18N

        objectName.setEditable(true);
        objectName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Object", "File", "FileReader", "FileWriter", "BufferedReader", "InputStreamReader", "InputStream", "OutputStream", "PrintWriter", "Scanner", "String", "StringBuilder", "ArrayList", "System", "HashMap", "Thread", "Iterator", " " }));
        objectName.setToolTipText(org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.objectName.toolTipText")); // NOI18N
        objectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objectNameActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.jLabel10.text")); // NOI18N

        varName.setText(org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.varName.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.jLabel11.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(instObjectButton, org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.instObjectButton.text")); // NOI18N
        instObjectButton.setToolTipText(org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.instObjectButton.toolTipText")); // NOI18N
        instObjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instObjectButtonActionPerformed(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/mass/qcc/qcccodewizard/Question.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel33, org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.jLabel33.text")); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        params.setText(org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.params.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(NewObjectPopup.class, "NewObjectPopup.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(objectName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(params)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(instObjectButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(objectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(varName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instObjectButton)
                            .addComponent(params, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void instObjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instObjectButtonActionPerformed

        //This instantiates a new Object into the current document

        //Get the currently open java source
        try {
            JTextComponent jtc = EditorRegistry.lastFocusedComponent();
            CodeDrop codedrop = new CodeDrop();

            String oName = objectName.getSelectedItem().toString();
            String vName = varName.getText();
            String[] param = params.getText().toString().split(",");

            //Make sure its a valid variable name...
            CheckVariableName cvn = new CheckVariableName();
            if (cvn.isGood(oName) && cvn.isGood(oName)) {
                //If name is valid, add it to the editor.
                System.out.println("Valid Object Names");

                //Construct the output string
                StringBuilder sb = new StringBuilder();
                sb.append(oName).append(" *").append(vName).append(" ").append("= new ").append(oName).append("(");

                //Add the method params into the string
                int count = 0;
                for (String p : param) {
                    if (count == param.length - 1) {
                        sb.append(p).append(");");
                    } else {
                        sb.append(p).append(", ");
                    }
                    count++;
                }

                String code = sb.toString();
                try {
                    //Insert into document
                    System.out.println("Inserting Code");
                    CodeDrop.insert(code, jtc);
                } catch (BadLocationException ex) {
                    Exceptions.printStackTrace(ex);
                }

            }
        } catch (java.lang.Throwable t) {

            JOptionPane.showMessageDialog(this, "All Fields must be filled out.");

        }
        //Call combobox models visit method to update with the new variable.
    }//GEN-LAST:event_instObjectButtonActionPerformed

    private void objectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_objectNameActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        //Open Instantiating Help
        OpenHelpUrl o = new OpenHelpUrl("http://www.cplusplus.com");
    }//GEN-LAST:event_jLabel33MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton instObjectButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox objectName;
    private javax.swing.JTextField params;
    private javax.swing.JTextField varName;
    // End of variables declaration//GEN-END:variables
}
