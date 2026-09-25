package inheritance;

public class FreelancerWithCommission extends Freelancer{
    private double sales;
    private double commissionRate;


    public FreelancerWithCommission(String name, String area, int numberOfProjects, double ratePerProject, double sales, double commissionRate) {
        super(name, area, numberOfProjects, ratePerProject);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double getCommisionRate() {
        return commissionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commissionRate = commisionRate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double computeCommission(){
        return sales*commissionRate;
    }
    @Override
    public double computePay(){
        return super.computePay()+computeCommission();
    }
}
