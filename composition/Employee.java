package composition;

public class Employee {
    private final String name;
    private final String area;
    private Contract contract;
    private Commission commission;

    // empleado sin comisión
    public Employee(String name, String area, Contract contract) {
        this(name, area, contract, null);
    }

    // empleado con comisión
    public Employee(String name, String area, Contract contract, Commission commission) {
        this.name = name;
        this.area = area;
        this.contract = contract;
        this.commission = commission;
    }

    public double computePay() {
        double pay = contract.computePay();          // delega al contrato
        if (commission != null) {
            pay += commission.computeCommission();   // delega a la comisión, si hay
        }
        return pay;
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }

    public Contract getContract() {
        return contract;
    }

    public Commission getCommission() {
        return commission;
    }


}
