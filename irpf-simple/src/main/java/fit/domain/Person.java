package fit.domain;

public class Person {
    private final double totalSalary;
    private final int dependentsNumber;
    private final double irpf;

    public Person(double totalSalary, int dependentsNumber) {
        this.totalSalary = totalSalary;
        this.dependentsNumber = dependentsNumber;
        this.irpf = 0.0;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public int getDependentsNumber() {
        return dependentsNumber;
    }

    public double getirpf() {
        return irpf;
    }

}
