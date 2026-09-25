package composition;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Ana", "Soporte", new HourlyContract(40, 150)),
                new Employee("Beto", "Soporte", new HourlyContract(40, 150),
                        new ContractCommission(50000, 0.05)),
                new Employee("Carla", "Finanzas", new SalariedContract(20000)),
                new Employee("Diego", "Ventas", new SalariedContract(20000),
                        new ContractCommission(50000, 0.05)),
                new Employee("Elena", "Diseño", new FreelancerContract(3, 5000)),
                new Employee("Fer", "Diseño", new FreelancerContract(3, 5000),
                        new ContractCommission(50000, 0.05))
        );

        System.out.println("=== Composition version ===");
        for (Employee e : employees) {
            String contractType = e.getContract().getClass().getSimpleName();
            String commission = (e.getCommission() != null) ? "with commission" : "no commission";
            System.out.printf("%-8s %-20s %-16s $%,12.2f%n",
                    e.getName(), contractType, commission, e.computePay());
        }
    }
}
