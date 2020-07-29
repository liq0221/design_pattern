package com.pinc.design_pattern.composite;

public class Main {

    public static void main(String[] args) {
        BranchNode c1 = new BranchNode("c1");
        BranchNode c11 = new BranchNode("c11");
        BranchNode c12 = new BranchNode("c12");
        Node c111 = new LeafNode("c111");
        Node c222 = new LeafNode("c222");
        Node c333 = new LeafNode("c333");
        Node c444 = new LeafNode("c444");
        c1.add(c11);
        c1.add(c12);
        c11.add(c111);
        c11.add(c222);
        c12.add(c333);
        c12.add(c444);

        tree(c1,0);
    }

    private static void tree(Node n, int depth) {

        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }

        n.p();

        if (n instanceof BranchNode) {
            for (Node node : ((BranchNode)n).nodes) {
                tree(node,depth + 1);
            }
        }

    }
}
