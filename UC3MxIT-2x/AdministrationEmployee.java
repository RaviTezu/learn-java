// Lastly, the AdministrationEmployee class represents an employee in the Administration department. These employees are hired from employment agencies, so his/her contracts are always temporary and count as 0 years in the company. The salary is fixed, 18 000 bitcoins.

public class AdministrationEmployee extends Employee { 
    // use this static variable to calculate the totalsalaries. 
    public static double totalSalaries = 0.0;
    private static int contract_type = TRAINING;
    private static int years = 0;
    private static String department = "Administration";
    
    public AdministrationEmployee(String name){
        super(name, contract_type, years, department);
        //add up the salary of each object created. 
        totalSalaries = totalSalaries + this.getSalary();
    }
    
    public double getSalary(){
        return 18000;
    }
}
