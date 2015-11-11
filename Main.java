package com.company;

public class Main {

    public static void main(String[] args) {
        Darbuotojas darbuotojas = new Darbuotojas("Petras", "Petrauskas", 1973, 123123123, 5);
        DirbantisDarbuotojas dirbantisDarbuotojas = new DirbantisDarbuotojas("Jonas", "Jonaitis", 1973, 123123123, 5, 3, 20);

        System.out.println(darbuotojas.getVardas());
        System.out.println(dirbantisDarbuotojas.getVardas());
    }
}
