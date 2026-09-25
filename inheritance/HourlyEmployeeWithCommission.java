package inheritance;

public class HourlyEmployeeWithCommission extends HourlyEmployee {
    private double sales;
    private double commissionRate;

    public HourlyEmployeeWithCommission(String name, String area, double hoursWorked, double hourlyRate, double sales, double commissionRate) {
        super(name, area,  hoursWorked, hourlyRate);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRate() {
        return commissionRate;
    }

    public void setRate(double rate) {
        this.commissionRate = rate;
    }

    public double computeCommission(){
        return sales*commissionRate;
    }
    @Override
    public double computePay(){
        return super.computePay()+computeCommission();
    }
}
