package composition;

public class FreelancerContract implements Contract{
    private int numberOfProjects;
    private double ratePerProject;

    public FreelancerContract(int numberOfProjects, double ratePerProject) {
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
