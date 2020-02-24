package Module2.Task10Employee;

public class TestEmployee implements ITest
{
    public String run ()
    {
        String result = "\n";
        int id = (int)(Math.random() * Integer.MAX_VALUE);
        result += testEmployee("name 1", "surname 1", id) + "\n";
        result += testEmployee("name 2", "surname 2") + "\n";
        result += testEmployee("name 3", "surname 3") + "\n";
        return result;
    }

    private String testEmployee(String name, String surname, int id)
    {
        return new Employee(name, surname, id).print();
    }

    private String testEmployee(String name, String surname)
    {
        Employee employee = new Employee(name, surname);
        return employee.print();
    }
}
