/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.filepalette;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import org.netbeans.api.editor.EditorRegistry;
import java.util.LinkedList;


/**
 *
 * @author Tim
 * Based on code by Ian Hickey and Bill Jelesma
 */
class VariableNameComboModel extends AbstractListModel implements ComboBoxModel {
    //Open read each line of the current java source file collecting all variables
    //into the foundVariables ArrayList

    String[] VariableNames = {" "};
    String selection = null;

    VariableNameComboModel() {
        //Find Variables

        //GetCompilationUnit fv = new GetCompilationUnit();

        //CompilationUnit cu = null;
        /*
        try {
            cu = fv.getCU();
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
*/
        //GetVariableDeclarations vd = new GetVariableDeclarations();
        //vd.visit(cu, null);
        //ArrayList variableArray = vd.getMyArray();
        //this.VariableNames = (String[]) variableArray.toArray(new String[0]);


    }

    public void Refresh() {
        //Find Variables

        

    }

    @Override
    public Object getElementAt(int index) {
        return VariableNames[index];
    }

    @Override
    public int getSize() {
        return VariableNames.length;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selection = (String) anItem; // to select and register an
    } // item from the pull-down list

    // Methods implemented from the interface ComboBoxModel
    @Override
    public Object getSelectedItem() {
        return selection; // to add the selection to the combo box
    }
}
