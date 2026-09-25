package inheritance;

public class SalariedEmployeeWithCommission extends SalariedEmployee {
    private double sales;
    private double commissionRate;

    public SalariedEmployeeWithCommission(String name, String area, double monthlySalary, double sales, double commissionRate) {
        super(name, area, monthlySalary);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommisionRate() {
        return commissionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commissionRate = commisionRate;
    }

    public double computeCommission(){
        return sales*commissionRate;
    }
    @Override
    public double computePay(){
        return super.computePay()+computeCommission();
    }
}
