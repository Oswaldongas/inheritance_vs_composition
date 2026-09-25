package composition;

public class ContractCommission implements Commission {
    private double sales;
    private double commissionRate;

    public ContractCommission(double sales, double commissionRate) {
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double computeCommission() {
        return sales * commissionRate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

}
