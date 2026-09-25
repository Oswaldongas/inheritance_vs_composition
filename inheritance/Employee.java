package inheritance;

public abstract class Employee {
    private final String name;
    private String area;

    public Employee(String name, String area) {
        this.name = name;
        this.area = area;
    }

    public abstract double computePay();

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }
}
