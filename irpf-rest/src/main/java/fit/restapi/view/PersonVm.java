package fit.restapi.view;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PersonVm {
    private double totalSalary;
    private int dependentsNumber;
    private double irpf;

    public PersonVm() {
        super();
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public int getDependentsNumber() {
        return dependentsNumber;
    }

    public void setDependentsNumber(int dependentsNumber) {
        this.dependentsNumber = dependentsNumber;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        Double valor;
        DecimalFormat decimalFormat = new DecimalFormat("###0.00");
        decimalFormat.setRoundingMode(RoundingMode.UP); 
        valor = Double.parseDouble( decimalFormat.format(irpf).replace(",","."));
        this.irpf = valor;
    }


}
