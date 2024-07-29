package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    public Student(int id, String name, int grade)
    {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    public void setGrade(int grade)
    {
        this.grade=grade;
    }
    public void payFees(int fees)
    {
        feesPaid=feesPaid+fees;
       School.updateTotalMoneyEarned(FeesPaid);
}   public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    public int getReamainingFees()
   {
      return feesTotal-feesPaid;
   }
}