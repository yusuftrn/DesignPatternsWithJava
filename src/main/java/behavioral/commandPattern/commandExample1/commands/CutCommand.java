package behavioral.commandPattern.commandExample1.commands;

import behavioral.commandPattern.commandExample1.editor.Editor;

public class CutCommand extends Command {

    public CutCommand(Editor editor){
        super(editor);
    }

    @Override
    public boolean execute() {
        if(editor.textField.getSelectedText().isEmpty())
            return false;
        backup();
        String source = editor.textField.getText();
        editor.textField.setText(cutString(source));
        return false;
    }

    private String cutString(String source){
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start+end;
    }
}
