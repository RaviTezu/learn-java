//Similarly, the EngineeringEmployee class represents an employee in the Engineering department. The salary of an engineer starts with 25 000 bitcoins and is incremented in 2 500 bitcoins each complete year that he/she stays in the company.

public class EngineeringEmployee extends Employee { 
    private static String department = "Engineering";
    // use this static variable to calculate the totalsalaries. 
    public static double totalSalaries = 0.0;
    public EngineeringEmployee(String name, int years, int contract_type){
        super(name, contract_type, years, department);
        //add up the salary of each object created. 
        totalSalaries = totalSalaries + this.getSalary();
    }
    public double getSalary(){
        return 25000 + 2500 * this.getYears();
    }
}
