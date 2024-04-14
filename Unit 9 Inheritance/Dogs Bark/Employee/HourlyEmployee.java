public class HourlyEmployee extends Employee {

    private double hoursPerWeek;

    // Call the Employee constructor and pass it a calculated annual salary
    
    public HourlyEmployee(String name1, double hourlySalary, double hoursPerWeek1){
        super(name1, (hourlySalary*hoursPerWeek1*52));
        hoursPerWeek = hoursPerWeek1;
        
    }
    
    // Get the annual salary from the superclass and convert it back
    // to hourly.
    public double getHourlySalary(){
        return super.getAnnualSalary()/hoursPerWeek/52;
    }

    // Use the hourly salary input and convert it
    // to the annual salary and update in the superclass
    
    public void setHourlySalary(double hourlySalary){
       super.setAnnualSalary(hourlySalary*hoursPerWeek*52);
    }
    public double getHoursPerWeek(){
        return hoursPerWeek;
    }

    /**
     * Example output:
     * Mike makes $18.0 per hour
     */
     
    public String toString(){
        return super.getName() + " makes $" + this.getHourlySalary() + " per hour";
    }
}