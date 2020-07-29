package com.pinc.design_pattern.commond;

public class DeleteContentCommond extends Commond{

    Content content;

    String deleted ;

    public DeleteContentCommond(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        deleted = content.msg.substring(0,5);
        content.msg = content.msg.substring(5,content.msg.length());
    }

    @Override
    public void undo() {
        content.msg = deleted + content.msg;
    }
}
