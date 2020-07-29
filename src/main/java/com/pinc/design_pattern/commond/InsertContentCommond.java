package com.pinc.design_pattern.commond;

public class InsertContentCommond extends Commond{

    Content content;

    String insertMsg = "InsertCommond";

    public InsertContentCommond(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        content.msg = content.msg + insertMsg;
    }

    @Override
    public void undo() {
        content.msg = content.msg.substring(0,content.msg.length() - insertMsg.length());
    }
}
