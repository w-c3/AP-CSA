public class EmployeeTester
{
    public static void main(String[] args)
    {
        // Start here!
        Employee billy = new Employee("Billy", 70000);
        HourlyEmployee jackson = new HourlyEmployee("Jackson", 25.00, 60);
        System.out.println(billy.toString());
        System.out.println(jackson.toString());
        
    }
    
}