package Basic;

public class Employees extends Person{
    String empId = "0000";

    public Employees(String nm) {
        super(nm);
        empId = nm;
    }
}
