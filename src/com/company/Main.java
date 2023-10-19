package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Vücut Kitle Endeksini Hesaplama Formulu = Boy * boy /kilo
        //vke = Vücut kitle indeksi

        double kilo, boy, vke;
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan kilo al
        System.out.print("Kilonuzu giriniz : ");
        kilo = input.nextDouble();

        //Kullanıcıdan boy al
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = input.nextDouble();

        //vke hesaplama
        vke = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz : " + vke);
    }
}
