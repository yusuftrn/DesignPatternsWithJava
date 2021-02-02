package behavioral.mediatorPattern.mediatorExample1.components;

import behavioral.mediatorPattern.mediatorExample1.mediator.Mediator;
import behavioral.mediatorPattern.mediatorExample1.mediator.Note;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Concrete components don't talk with each other. They have only on
 * communication channel–sending requests to the mediator.
 */

public class Filter extends JTextField implements Component {

    private Mediator mediator;
    private ListModel listModel;

    public Filter() {}

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent){
        String start = getText();
        searchElements(start);
    }

    public void setList(ListModel listModel){
        this.listModel = listModel;
    }

    private void searchElements(String s) {
        if(listModel == null){
            return;
        }
        if(s.equals("")){
            mediator.setElementsList(listModel);
            return;
        }
        ArrayList<Note> notes = new ArrayList<>();
        for(int i=0; i<listModel.getSize(); i++){
            //add object as Note type
            notes.add((Note) listModel.getElementAt(i));
        }
        DefaultListModel<Note> listModel = new DefaultListModel<>();
        for(Note n : notes){
            if(n.getName().contains(s)){
                listModel.addElement(n);
            }
        }
        mediator.setElementsList(listModel);
    }

    @Override
    public String getName() {
        return "Filter";
    }
}
