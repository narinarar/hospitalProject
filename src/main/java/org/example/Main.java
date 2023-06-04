package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ChiefPhysician chiefPhysician = new ChiefPhysician("Narin", "Arar", 3333, "Professor", "Internal medicine", 12);
        Cardiology cardiology = new Cardiology("Associate professor", "Umut", "Coskun", 3838);
        Neurology neurology = new Neurology("Erciyes University", "Tugba", "Yılmaz", 1212);

        Scanner scanner = new Scanner(System.in);
        String options = "Hastane sistemine hoşgeldiniz..." +
                "Bir işlem seçiniz:\n" +
                "Başhekim birimiyle ilgili işlemler için 1'e\n" +
                "Kardiyoloji birimiyle ilgili işlemler için 2'ye\n" +
                "Nöroloji birimiyle ilgili işlemler için 3'e\n" +
                "Sistemden çıkmak için 0'a basınız.";

        while (true) {

            System.out.println(options);
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            String choice = scanner.nextLine();
            System.out.println(" ");

            while (true) {
                if (choice.equals("0")) {
                    System.out.println("Sistemden çıkılıyor.");
                    Thread.sleep(3000);
                    return;
                } else if (choice.equals("1")) {
                    System.out.println("Başhekim birimine hoşgeldiniz." +
                            "Başhekim bilgileri tanımlanıyor.");
                    chiefPhysician.nameBadge();
                    chiefPhysician.work();
                    System.out.println("Başhekim çalışmasını bitirdi.");
                    break;
                } else if (choice.equals("2")) {
                    System.out.println("Kardiyoloji birimine hoşgelniz" +
                            "Kardiyoloji doktorunun bilgileri tanımlanıyor.");
                    cardiology.nameBadge();
                    cardiology.ecg();
                } else if (choice.equals("3")) {
                    System.out.println("Nöroloji birimine hoşgeldiniz.");
                    neurology.nameBadge();
                    String s = "Baş ağrısı tedavisi için 1'e " +
                            "Uyku bozukluğu tedavisi için 2'ye basınız.";
                    System.out.println(s);
                    String choice2 = scanner.nextLine();

                    if (choice2.equals("1")) {
                        neurology.headache();
                        break;
                    } else if (choice2.equals("2")) {
                        neurology.sleepingDisorder();
                        break;
                    } else {
                        System.out.println("Hatalı bir seçim yaptınız.");
                        break;
                    }

                }
            }
        }


    }
}