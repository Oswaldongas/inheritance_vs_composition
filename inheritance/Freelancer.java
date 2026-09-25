package inheritance;

public class Freelancer extends Employee {
    private int numberOfProjects;
    private double ratePerProject;

    public Freelancer(String name, String area, int numberOfProjects, double ratePerProject) {
        super(name, area);
        this.numberOfProjects = numberOfProjects;
        this.ratePerProject = ratePerProject;
    }

    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    public void setNumberOfProjects(int numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }

    public double getRatePerProject() {
        return ratePerProject;
    }

    public void setRatePerProject(double ratePerProject) {
        this.ratePerProject = ratePerProject;
    }

    @Override
    public double computePay() {
        return ratePerProject * numberOfProjects;
    }
}
