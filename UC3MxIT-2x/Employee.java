
/**
 * Solving P2PAssess2
 * 
 * @author RaviTeja <ravi-teja@live.in>
 * @version 1.0
 */

public abstract class Employee implements Employed {
    public static int TEMPORARY  = 0;
    public static int TRAINING   = 1;
    public static int INDEFINITE = 2;
    private String name;
    private int contract_type;
    private int years;
    private String department;
    private String contract_string;
    
    public Employee(String name, int contract_type, int years, String department) {
        setName(name);
        setContractType(contract_type);
        setYears(years);
        setDepartment(department);
    }
    
    public void setName(String name){
        // check that the received name is not null or empty.
        if (name != null || name != "") {
            this.name = name;
        }
        else { 
            throw new IllegalArgumentException("Employee name can't be null or empty");
        }
    }
    public String getName(){
        return this.name;
    }
    
    public void setContractType(int contract_type){
        // check that the received contract_Type is valid. 
        if (contract_type == TEMPORARY || contract_type == TRAINING || contract_type == INDEFINITE){
        this.contract_type = contract_type;
        }
        else {
            throw new IllegalArgumentException("Invalid contract type");
        }
    }
    
    public String getContractType(){
        switch (this.contract_type) {
            case 0: return "temporary";
            case 1: return "training";
            case 2: return "indefinite";
            default: return "";
        } 
    }
    
    public void setYears(int years){
        // check that the years received it positive. 
        if(years >= 0){
        this.years = years;
        }
        else {
            throw new IllegalArgumentException("Years can't be a negative number!");
        }
    }
    
    public int getYears(){
        return this.years;
    }
    
    public void setDepartment(String department){
        // check that the received department is not null or empty. 
        if (department != null || department != "") {
            this.department = department;
        }
        else { 
            throw new IllegalArgumentException("Department can't be null or empty");
        } 
    }
    
    public String getDepartment(){
        return this.department;
    }
    
    // as we have different salaries for different employess, let's abstract this method. 
    public abstract double getSalary();

    // override the default toString method, with what we like.  
    public String toString(){
        //For reference: <name>: <department> department, <type of contract> contract, <years> years in the company, salary of <salary> bitcoins
        return "- "+ this.getName() + ": " + this.getDepartment() +" department, "+ this.getContractType() + " contract, "+ this.getYears() + " years in the company, salary of "+ this.getSalary() + " bitcoins";
    }
}
