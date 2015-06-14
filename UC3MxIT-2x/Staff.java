public class Staff {
  public static void main(String[] args) { 
  Employee[] arr = { new ManagementEmployee("Bill", 9), new EngineeringEmployee("Anna", 9, 2), new EngineeringEmployee("John",5,2),
                     new EngineeringEmployee("Elizabeth", 3, 1), new EngineeringEmployee("Michael", 2 , 1), new AdministrationEmployee("Albert")};

  // print the info...                     
  for(int i=0; i < arr.length; i++) {
      System.out.println(arr[i]);
  }
  System.out.println("");
  
  // Calculate the total salaries and print them.
  double acmeSalaries = ManagementEmployee.totalSalaries + EngineeringEmployee.totalSalaries + AdministrationEmployee.totalSalaries;
  System.out.println("MANAGEMENT TOTAL SALARY: "+ ManagementEmployee.totalSalaries + " bitcoins");
  System.out.println("ENGINEERING TOTAL SALARY: " +EngineeringEmployee.totalSalaries + " bitcoins");
  System.out.println("ADMINISTRATION TOTAL SALARY: " +AdministrationEmployee.totalSalaries + " bitcoins");
  System.out.println("ACME TOTAL SALARY: " + acmeSalaries+" bitcoins");
}
}
