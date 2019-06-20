package payroll;


import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint 
{
public static void main(String[] args) 
{


Payroll user = new Payroll() ;

Scanner input = new Scanner(System.in);

System.out.println("Please enter the employee name:");
String name;
name = input.nextLine();

// send name of the user to payroll class
user.setEmp(name) ;


System.out.println("Please enter the salary: salary <=3000");
int salary = input.nextInt();

// send the salary for calculation
 user.setSalary(salary);
user.calculateSalary();
 
System.out.println("The final Salary for " + user.getEmp() +" including bonus is: "+ user.getSalary() );         

}

}
