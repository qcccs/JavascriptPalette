
/*
 *-----------------------------------------------------------------------------------------
 *---This file was generated using Snip - A Snippets Source Code Generator 
 *---for use with Netbeans Palettes. This project is an expansion of the sample
 *---Java Palette by Geertjan Wielenga.
 *---Quinsigamond Community College - 2013
 *-----------------------------------------------------------------------------------------
 */

package org.netbeans.modules.filepalette.items;
import org.netbeans.modules.filepalette.items.resources.PrintPopup;
import org.openide.text.ActiveEditorDrop;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

/**
 * This class gets and sets comments for the code snippet and calls
 *  the popup or customizer associated with this class.
 */
public class Print implements ActiveEditorDrop {
    private String comment = "";

    /**
     *
     */
    public Print() {}

    private String createBody() {
        comment = getComment();
        StringBuilder buffer = new StringBuilder();
        buffer.append("document.write(").append(comment).append(");\n");
        return buffer.toString();
    }

    /**
     *
     * @param targetComponent
     * @return
     */
    public boolean handleTransfer(JTextComponent targetComponent) {
        PrintPopup c      = new PrintPopup(this, targetComponent);
        boolean         accept = c.showDialog();

        if (accept) {
            String body = this.createBody();

            try {
               FilePaletteUtilities.insert(body, targetComponent);
            } catch (BadLocationException ble) {
                accept = false;
            }
        }

        return accept;
    }

    /**
     *
     * @return Returns a comment.
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     */
    public void setComment(String comment) {
     this.comment = comment;
    }
}
