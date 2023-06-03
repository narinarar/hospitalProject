package org.example;

public class chiefPhysician extends jobDescription{

    private String title;
    private String profession;
    private int tenure;


    public chiefPhysician(String name, String lastName, int idNo, String title, String profession, int servicePeriod) {
        super(name, lastName, idNo);
        this.title = title;
        this.profession = profession;
        this.tenure = servicePeriod;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    void work() throws InterruptedException {
        System.out.println("Chief physician" + getName() + "inspect the doctors annuel leave");
        Thread.sleep(3000);
        System.out.println("Chief physician" + getName() + "inspect laboratory");

    }

    @Override
    void nameBadge() {
        super.nameBadge();
        System.out.println("Tite: " + title);
        System.out.println("Profession: " + profession);
        System.out.println("Tenure: " + tenure);
    }
}
