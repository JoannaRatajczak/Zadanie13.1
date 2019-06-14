import java.io.File;
import java.io.FileNotFoundException;


public class Method {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/rtaj/Desktop/Data.txt");
        Employee[] employeeTable = Methods.addData(file);
        
        //Metody:

        double avSalary = Methods.avSalary(employeeTable);
        System.out.println("Average salary: " + avSalary);
        double lowerSalary = Methods.lowerSalary(employeeTable);
        System.out.println("Lower salary: " + lowerSalary);
        double highSalary = Methods.higherSalary(employeeTable);
        System.out.println("Higher salary: " + highSalary);
        System.out.println("No. of employees in IT: " + Methods.division(employeeTable, "it"));
        System.out.println("No. of employees in Management: " + Methods.division(employeeTable, "Management"));
        System.out.println("No. of employees in Support: " + Methods.division(employeeTable, "Support"));


    }
}
