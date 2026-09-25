package inheritance;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new HourlyEmployee("Ana", "Soporte", 40, 150),
                new HourlyEmployeeWithCommission("Beto", "Soporte", 40, 150, 50000, 0.05),
                new SalariedEmployee("Carla", "Finanzas", 20000),
                new SalariedEmployeeWithCommission("Diego", "Ventas", 20000, 50000, 0.05),
                new Freelancer("Elena", "Diseño", 3, 5000),
                new FreelancerWithCommission("Fer", "Diseño", 3, 5000, 50000, 0.05)
        );

        System.out.println("=== Inheritance version ===");
        for (Employee e : employees) {
            System.out.printf("%-8s %-30s $%,12.2f%n",
                    e.getName(), e.getClass().getSimpleName(), e.computePay());
        }
    }
}