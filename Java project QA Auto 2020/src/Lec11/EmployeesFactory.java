package Lec11;

public class EmployeesFactory {

    public Employee createEmployee (String job) {
        switch (job) {
            case "back_dev": return new BackEndDeveloper();
            case "front_dev": return new FrontEndDeveloper();
            case "manual_qa": return new ManualQA();
            case "auto_qa": return new AutoQA();
            case "pm": return new ProjectManager();
            default: return null;
        }
    }
}
