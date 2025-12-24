import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10) Input for Employee
        System.out.print("Enter employee name: ");
        String empName = sc.nextLine();

        System.out.print("Enter age: ");
        int empAge = sc.nextInt();

        System.out.print("Is alive (true/false): ");
        boolean empAlive = sc.nextBoolean();

        sc.nextLine(); // clear buffer

        System.out.print("Enter position: ");
        String empPosition = sc.nextLine();

        System.out.print("Enter salary: ");
        float empSalary = sc.nextFloat();

        // 9) Create Employee object
        Employee emp = new Employee(empAge, empName, empAlive, empPosition, empSalary);

        // 9) Create Student object 
        Student st = new Student(20, "Not Ansar", true, "AITU", 3.5f);

        // 11) Use setters/getters
        emp.setSalary(emp.getSalary() + 5000); // increase salary
        st.setGpa(3.8f); // update GPA

        // 12) Use methods
        emp.introduce();
        emp.activity();

        System.out.println();

        st.introduce();
        st.activity();

        // Static field usage
        System.out.println("\nEmployees count: " + Employee.count);
    }
}


class Human {

    // 2) basic attributes: int, String, boolean
    private int age;
    private String name;
    private boolean alive;

    // 5) constructor
    public Human(int age, String name, boolean alive) {
        this.age = age;
        this.name = name;
        this.alive = alive;
    }

    // 6) getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    // 7) common methods
    public void introduce() {
        System.out.println("My name is " + name);
    }

    public void activity() {
        System.out.println("Human does something");
    }
}

class Employee extends Human {

    // 3) unique attributes: String, float
    private String position;
    private float salary;

    // 8) static field
    public static int count = 0;

    // 5) constructor + super
    public Employee(int age, String name, boolean alive, String position, float salary) {
        super(age, name, alive);
        this.position = position;
        this.salary = salary;
        count++;
    }

    // 6) getters and setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // 7) overridden method
    @Override
    public void activity() {
        System.out.println("Employee is working");
    }
}


class Student extends Human {

    // 3) unique attributes: String, float
    private String university;
    private float gpa;

    // 5) constructor + super
    public Student(int age, String name, boolean alive, String university, float gpa) {
        super(age, name, alive);
        this.university = university;
        this.gpa = gpa;
    }

    // 6) getters and setters
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    // 7) overridden method
    @Override
    public void activity() {
        System.out.println("Student is studying");
    }
}

