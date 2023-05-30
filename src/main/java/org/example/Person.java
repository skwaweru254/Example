package org.example;

public class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
        System.out.println("Setter name:" + this.name);
    }

    public static void main(String[] args) {

        Person p = new Person();

    }
}



