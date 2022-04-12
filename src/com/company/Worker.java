package com.company;

public class Worker extends employee {
    String workspace;

    public Worker(double salary, double workHours, String name, String workspace) {
        super(salary, workHours, name);
        this.workspace = workspace;
    }

    @Override
    public void doWork() {
        System.out.println(name + " working for " + workHours + " hours with salary " + salary + " in " + workspace);
    }

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }
}
