package com.pinc.design_pattern.commond;

public class Main {

    public static void main(String[] args) {
        Content content = new Content();
        Commond commond = new InsertContentCommond(content);
        commond.doit();
        System.out.println(content.msg);
        commond.undo();
        System.out.println(content.msg);
        Commond commond1 = new DeleteContentCommond(content);
        commond1.doit();
        System.out.println(content.msg);
        commond1.undo();
        System.out.println(content.msg);

    }
}
