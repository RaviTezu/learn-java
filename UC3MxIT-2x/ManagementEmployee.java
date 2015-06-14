// The ManagementEmployee class represents an employee in the Management department. A manager always has an indefinite contract and his/her salary is based on a starting salary of 40 000 bitcoins plus 6 000 bitcoins for every year in the company.

public class ManagementEmployee extends Employee { 
    // use this static variable to calculate the totalsalaries. 
    public static double totalSalaries = 0.0;
    private static int contract_type = INDEFINITE;
    private static String department = "Management";
    public ManagementEmployee(String name, int years){
        super(name, contract_type, years, department);
        //add up the salary of each object created. 
        totalSalaries = totalSalaries + this.getSalary();    
    }
    
    public double getSalary(){
        return 40000 + 6000 * this.getYears();
    }

}
