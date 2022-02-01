package com.company;

public class Main {

    public static void main(String[] args) {
        Adam Adam = new Adam();
        Adam.aty = "Aychurok";
        Adam.boyu = 163;
        Adam.familiyasi = "Turgunbaeva";
        Adam.jashy = 27;
        Adam.salmagy = 49;


        Adam Adam2 = new Adam();
        Adam2.aty = "Ayzirek";
        Adam2.boyu = 165;
        Adam2.familiyasi = "Turgunbaeva";
        Adam2.jashy = 25;
        Adam2.salmagy = 50;


        Adam Adam3 = new Adam();
        Adam3.aty = "Bekbolot";
        Adam3.boyu = 175;
        Adam3.familiyasi = "Turgunbaev";
        Adam3.jashy = 22;
        Adam3.salmagy = 60;

        int sum = Adam.salmagy+Adam2.salmagy+Adam3.salmagy;
        System.out.println("Uch adamdin salmaginin summasi: " +sum);
    }
}
