package A_Lesson_2_Home_Task_2;

public class Employee {
    public static void main(String[] args) {
        Employee employee = new Employee("Minasian Artur Vartanovich", "Java developer", "artur@gmail.com", "+380979567856", 35);
        employee.info();
    }
    private final String fullName;
    private final String jobTitle;
    private final String eMail;
    private final String telephoneNumber;
    private final int age;

    public Employee(String fullName, String jobTitle, String eMail, String telephoneNumber, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.eMail = eMail;
        this.telephoneNumber = telephoneNumber;
        this.age = age;
    }
    public void info(){
        System.out.println(String.format("Full name - %1$2s, job title - %2$2s, email - %3$2s, telephoneNumber - %4$2s, age - %5$2s.", fullName, jobTitle, eMail, telephoneNumber, age));
    }
}

