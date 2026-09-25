package composition;

public class SalariedContract implements Contract {
    private double monthlySalary;

    public SalariedContract(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double computePay(){
        return monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
