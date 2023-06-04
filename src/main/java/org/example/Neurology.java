package org.example;

public class Neurology extends JobDescription{

    private String diploma;

    public Neurology(String diploma, String name, String lastName, int idNo) {
        super(name, lastName, idNo);
        this.diploma = diploma;
    }

    void sleepingDisorder() throws InterruptedException {
        System.out.println("Doctor" + getName() + " treated patient  for sleep disorder.");
        Thread.sleep(3000);
        System.out.println("Sleep disorder treatment successfully completed.");
    }

    void headache() throws InterruptedException {
        System.out.println("Doctor" + getName() + " treated patient for headache.");
        Thread.sleep(3000);
        System.out.println("Headache treatmen successfully completed.");
    }

    @Override
    void nameBadge() {
        super.nameBadge();
        System.out.println("University from which the doctor graduated: " + diploma);
    }
}
