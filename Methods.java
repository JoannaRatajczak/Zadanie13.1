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

    static String division(Employee[] employees) {

        //dokończyć z Arraylist! 
        int managment = 0;
        int it = 0;
        int support = 0;

        for (int i = 0; i < employees.length; i++) {
            String checking = employees[i].getDepartment();

            if (checking.equals("Management")) {
                managment++;
            } else if (employees[i].getDepartment().equals("it")) {
                it++;
            } else if (employees[i].getDepartment().equals("Support")) {
                support++;
            }
        }
        return "Number of empoyees divided by departments:\nManagment: " + managment + "\nIT: " + it + "\nSupport: " + support;
    }
}



