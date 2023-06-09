package org.example;

import static java.lang.Thread.*;

public class Cardiology extends JobDescription {

    private String title;

    public Cardiology(String title, String name, String lastName, int idNo) {
        super(name, lastName, idNo);
        this.title = title;
    }

    void ecg() throws InterruptedException {
        System.out.println(title + " doctor " + getName() + " taking your ECG.");
        sleep(3000);
        System.out.println("ECG process completed successfully.");
    }

    @Override
    void nameBadge() {
        super.nameBadge();
        System.out.println("Title: " + title);
    }
}
