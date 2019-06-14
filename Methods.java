import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Methods {

    static double avSalary(Employee[] employees) {
        double avSalary = 0;
        int quantity = 0;

        for (int i = 0; i < employees.length; i++) {
            avSalary += employees[i].getSalary();
            quantity++;
        }
        return avSalary / quantity;
    }

    static double lowerSalary(Employee[] employees) {
        double lowerSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < lowerSalary)
                lowerSalary = employees[i].getSalary();
        }

        return lowerSalary;
    }

    static double higherSalary(Employee[] employees) {
        double higherSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > higherSalary)
                higherSalary = employees[i].getSalary();
        }

        return higherSalary;
    }

    static int division(Employee[] employees, String division) {

        int x = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equals(division)) {
                x++;

            }
        }
        return x;
    }

    static Employee[] addData (File file) throws FileNotFoundException {

        System.out.println(file.exists());
        Scanner in = new Scanner(file);

        int lines = 0;

        while (in.hasNextLine()) {
            String name = in.nextLine();
            lines++;
        }
        System.out.println("Ilość wierszy w pliku: " + lines);
        in.close();

        in = new Scanner(file);

        Employee[] employeeTable = new Employee[lines];
        int i = 0;

        while (in.hasNextLine()) {

            String nextLine = in.nextLine();
            String[] split = nextLine.split(";");

            employeeTable[i] = new Employee(split[0], split[1], split[2], split[3], Double.valueOf(split[4]));
            i++;

        }
        in.close();



        return employeeTable;
    }
}



