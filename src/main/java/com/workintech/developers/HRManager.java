package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {

        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                return;
            }
        }
        System.out.println("Array is full. Cannot add employee.");
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                return;
            }
        }
        System.out.println("Array is full. Cannot add employee.");
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                return;
            }
        }
        System.out.println("Array is full. Cannot add employee.");
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts working.");
        setSalary(getSalary() * 1.1);
    }

    @Override
    public String toString() {
        return "HRManager= " + getName() +
                "\njuniorDevelopers= " + Arrays.toString(juniorDevelopers) +
                "\nmidDevelopers= " + Arrays.toString(midDevelopers) +
                "\nseniorDevelopers= " + Arrays.toString(seniorDevelopers);
    }
}
