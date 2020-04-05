package Lec11;

public class InterfaceExample {
    public static void main(String[] args) {

        EmployeesFactory employeesFactory = new EmployeesFactory();

        Employee developer = employeesFactory.createEmployee("front_end");
        developer.doWork();

        Employee backEndDeveloper = employeesFactory.createEmployee("back_dev");
        backEndDeveloper.doWork();

//        ManualQA qa = new ManualQA();
//        qa.doWork();
//        AutoQA autoqa = new AutoQA();
//        qa.doWork();
        ManualQA qa = (ManualQA) employeesFactory.createEmployee("manual_qa");
        qa.doWork();
//        AutoQA autoqa = new AutoQA();
//        qa.doWork();

//        ProjectManager projectManager = new ProjectManager();
        ProjectManager projectManager = (ProjectManager) employeesFactory.createEmployee("pm");
        projectManager.doWork();
        projectManager.showFoundedBugInfo(qa);
//        projectManager.showFoundedBugInfo(autoqa);

        IQAStatistic qa2 = new ManualQA();
        qa2.getFoundBugs();


    }
}
