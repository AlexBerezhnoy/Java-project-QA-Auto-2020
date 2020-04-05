package Lec11;

public class ManualQA implements Employee, IQAStatistic {

    @Override
    public void doWork() {
        System.out.println("QA test Code");
    }

    @Override
    public int getFoundBugs() {
        return 10;
    }
}