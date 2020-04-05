package Lec11;

public class AutoQA implements Employee, IQAStatistic {

    @Override
    public void doWork() {
        System.out.println("AutoQA write testCode");
    }

    @Override
    public int getFoundBugs() {
        return 2;
    }
}