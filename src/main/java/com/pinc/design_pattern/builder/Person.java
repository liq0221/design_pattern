package com.pinc.design_pattern.builder;

public class Person {

    int weight;

    int height;

    String name;

    Location loc;



    private Person() {}

    public static class PersonBuilder {
        Person p = new Person();

        public PersonBuilder basicInfo(String name) {
            p.name = name;
            return this;
        }

        public PersonBuilder weight(int weight) {
            p.weight = weight;
            return this;
        }

        public PersonBuilder height(int height) {
            p.height = height;
            return this;
        }

        public PersonBuilder loc(String street,String addr) {
           p.loc = new Location(street,addr);
            return this;
        }

        public Person build() {
            return p;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", loc=" + loc +
                '}';
    }
}
class Location {

    String street;

    String addr;

    public Location(String street,String addr) {
        this.street = street;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
