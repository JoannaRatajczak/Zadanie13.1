import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Method {

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("C:/Users/rtaj/Desktop/Data.txt");
        System.out.println(file.exists());
        Scanner in = new Scanner(file);

        int lines = 4;

        /* dopytać o in.close dlaczego tutaj mi wywalało błąd

        while (in.hasNextLine()) {
            String name = in.nextLine();
            lines++;
        }
        System.out.println("Ilość wierszy w pliku: " + lines);
        in.close(); */

        Employee[] employeeTable = new Employee[lines];
        int i = 0;

        while (in.hasNextLine()) {

            String nextLine = in.nextLine();
            String[] split = nextLine.split(";");

            employeeTable[i] = new Employee(split[0], split[1], split[2], split[3], Double.valueOf(split[4]));
            i++;

        }
        in.close();

        /* Sprawdzenie wczytania danych
        for (int j = 0; j < employeeTable.length; j++) {

            System.out.println(employeeTable[j]);
        } */

        //Metody:

        double avSalary = Methods.avSalary(employeeTable);
        System.out.println("Average salary: " + avSalary);
        double lowerSalary = Methods.lowerSalary(employeeTable);
        System.out.println("Lower salary: " + lowerSalary);
        double highSalary = Methods.higherSalary(employeeTable);
        System.out.println("Higher salary: " + highSalary);
        System.out.println(Methods.division(employeeTable));


    }
}
