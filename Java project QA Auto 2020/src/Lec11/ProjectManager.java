package Lec11;

public class ProjectManager implements Employee{
    @Override
    public void doWork() {
        System.out.println("ProjectManager do PM works");
    }

    public void showFoundedBugInfo (IQAStatistic statistic) {
        System.out.println("Found " + statistic.getFoundBugs() + " bugs.");
    }
}
