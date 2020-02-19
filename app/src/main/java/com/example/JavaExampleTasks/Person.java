package com.example.JavaExampleTasks;

import androidx.annotation.NonNull;

public abstract class Person {
    private String name;
    private long phone;
    private long aadhaar;

    public Person(String name, long phone, long aadhaar) {
        this.name = name;
        this.phone = phone;
        this.aadhaar = aadhaar;
    }

    public abstract void work();

    public void schooling() {
        System.out.println("School = " + "Sri Venkateswara School");
    }

    public void higherStudies() {
        System.out.println("Intermediate = " + "Sri Chaithanya college");

    }

    public void underGraduation() {
        System.out.println("Graduation = " + "Sietk Engineering college");

    }


    @NonNull
    @Override
    public String toString() {
        return "Name= " + this.name + " :: Phone=" + this.phone + " :: Aadhaar=" + this.aadhaar;
    }
}

class Family extends Person implements Education {

    private String officeName;
    private int emId;
    private long salary;

    public Family(String name, long phone, long aadhaar, String officeName, int emId, long salary) {
        super(name, phone, aadhaar);
        this.officeName = officeName;
        this.emId = emId;
        this.salary = salary;
    }

    @Override
    public void work() {
        if (emId == 0) {
            System.out.println("Not working");
        } else {
            System.out.println("Working as employee!!");
        }
    }

    public static void main(String args[]) {
        Family tharun = new Family("Tharun", 1234567890L, 5919191910000L, "CompIndia", 0, 22000);
        Person brother = new Family("uday", 1234567890L, 5919191910000L, "Congnizant", 201, 26000);

        System.out.println(tharun.toString());
        tharun.school();
        tharun.intermediate();
        tharun.btech();
        tharun.work();

        System.out.println(brother.toString());
        brother.work();
        brother.schooling();
        brother.higherStudies();
        brother.underGraduation();
    }

    @Override
    public void school() {
        System.out.println("School = " + "Govt. School");
    }

    @Override
    public void intermediate() {
        System.out.println("Intermediate = " + "Chaithanya college");
    }

    @Override
    public void btech() {
        System.out.println("Graduation = " + "Svce Engineering college");
    }
}

interface Education {
    void school();

    void intermediate();

    void btech();
}
