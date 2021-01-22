package structural.adapter.adapterExample3.codex;

import structural.adapter.adapterExample3.crypt.Crypt;

public class CodeXAdapter implements Crypt {

    private CodeX codeX;

    public CodeXAdapter(CodeX codeX){
        this.codeX = codeX;
    }

    @Override
    public void encrypt(String text) {
        codeX.textToCode(text);
    }

    @Override
    public void decrypt(String text) {
        codeX.codeToText(text);
    }
}
