package behavioral.commandPattern.commandExample1.commands;

import behavioral.commandPattern.commandExample1.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor){
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipBoard = editor.textField.getSelectedText();
        return false;
    }
}
