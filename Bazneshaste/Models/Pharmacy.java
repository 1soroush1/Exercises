package Models;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    String name;
    ArrayList<Drug> drugs;
    ArrayList<Employee> employees;

    public Pharmacy(String name) {
        this.name = name;
        drugs = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void addDrug(Drug drug)
    {
        drugs.add(drug);
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    public int totalPrice()
    {
        int total = 0;
        for (Drug drug : drugs){
            total+=drug.price;
        }
        return total;
    }

    public String employeeSummary()
    {
        String ans = "Employees:\n";
        for(int i = 0 ; i < employees.size() ; i++){
            int turn = i+1;
            ans+="The employee number "+turn+" is "+employees.get(i).firstName+" "+employees.get(i).lastName+" who is "+employees.get(i).age+" years old.\n";
            System.out.println(ans);
        }
        return "";
    }
}
