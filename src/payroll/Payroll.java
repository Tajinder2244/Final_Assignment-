package payroll;


/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 * @author srinivsi
 */
public class Payroll 
{

   private double Salary;
   private double bonus;
   private String emp;
 
     //constructor that takes the salary and employee name
      
   public Payroll(double Sal,String givenUser)
        {
            Salary=Sal;
            emp=givenUser;
                 
        }

    Payroll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
       //The method for calculating salary including bonus.Bonus is 10% of salary    
   public void calculateSalary()
   {
     if(Salary <= 3000 )
     {
        setSalary(Salary + getBonus())   ; 
     }
     else if (Salary > 3000)
     {
     System.out.print("You are not Eligible for Bonus.");
     System.exit(1);
     }
   }
            
     //The getter for the Salary
     // @return the Salary
    
        public double getSalary() 
        {
        return Salary;
        }
       
        public void setSalary(double Salary)
        {
          calculateSalary();
            this.Salary = Salary ;
          }        
        
    /*The getter for bonus
     * @return the bonus*/
     
        public double getBonus() 
        {
            return Salary/10;
        }

    /**user is the read only field
     * @return the user
     */
    public String getEmp() {
        return emp;
    }
    
    public void setEmp(String emp)
    {
    this.emp = emp ;
    }
    
}
