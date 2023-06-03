package org.example;

import static java.lang.Thread.*;

public class cardiology extends jobDescription {

    private String title;

    public cardiology(String name, String lastName, int idNo) {
        super(name, lastName, idNo);
        this.title = title;
    }

    void ecg() throws InterruptedException {
        System.out.println(title + " doctor " + getName() + " taking your ECG");
        sleep(3000);
        System.out.println("ECG process completed successfully");
    }

    @Override
    void nameBadge() {
        super.nameBadge();
        System.out.println("Title: " + title);
    }
}
