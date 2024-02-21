package org.example;

public class Main {
    public static void main(String[] args) {
        GamingConsoles gadget1 = new GamingConsoles("Aditya");
        gadget1.info();
        DigitalScales gadget2 = new DigitalScales("Budiman");
        gadget2.info();

        System.out.println(Gadget.getOwnerList());
        System.out.println(Gadget.getSupertypeList());
        System.out.println(Gadget.getTypeList());

        gadget1.infoAll();
    }
}