package com.pinc.design_pattern.iterator;

public class Main {

    public static void main(String[] args) {
        Collection_<String> arrayList_ = new ArrayList_<>();

        arrayList_.add("a");
        arrayList_.add("b");
        arrayList_.add("c");
        arrayList_.add("d");

        Iterator_ iterator = arrayList_.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
