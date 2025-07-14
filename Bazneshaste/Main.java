import Models.Employee;
import Models.Pharmacy;

public class Main {
    public static void main(String[] args) {
        Pharmacy setare = new Pharmacy("setare");
        Employee one = new Employee("mamad","bag",20);
        Employee two = new Employee("ali","drag",23);
        setare.addEmployee(one);
        setare.addEmployee(two);
        System.out.println(setare.employeeSummary());
    }
}