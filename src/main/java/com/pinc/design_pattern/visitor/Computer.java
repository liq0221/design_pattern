package com.pinc.design_pattern.visitor;

public class Computer {
    Cpu cpu = new Cpu();
    Memory memory = new Memory();
    Board borad = new Board();

    public void accept(Visitor v) {
        cpu.accept(v);
        memory.accept(v);
        borad.accept(v);
    }

    public static void main(String[] args) {
            PersonnelVisitor personnelVisitor = new PersonnelVisitor();
            new Computer().accept(personnelVisitor);
            System.out.println(personnelVisitor.totalPrice);
    }

}
abstract class ComputerPart {
    abstract  void accept(Visitor v);

    abstract  double getPrice();
}

class Cpu extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitCpu(this);
    }


    @Override
    double getPrice() {
        return 9000;
    }
}

class Memory extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitMemory(this);
    }


    @Override
    double getPrice() {
        return 2000;
    }
}

class Board extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitBoard(this);
    }


    @Override
    double getPrice() {
        return 1000;
    }
}
interface Visitor {
    void visitCpu(Cpu cpu);
    void visitMemory(Memory memory);
    void visitBoard(Board board);
}

class PersonnelVisitor implements Visitor {

    double totalPrice = 0.0;


    @Override
    public void visitCpu(Cpu cpu) {
        totalPrice += cpu.getPrice() * 0.7;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.6;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.5;
    }
}
