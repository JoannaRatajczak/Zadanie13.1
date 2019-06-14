public class Employee {
    private String name;
    private String surname;
    private String pesel;
    private String department;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String surname, String pesel, String department, double salary) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel=" + pesel +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


}
