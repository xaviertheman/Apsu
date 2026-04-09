package csci2011.WhitlowLab10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class WhitlowLab10 {
    LinkedList<Employee> employeeList = new LinkedList<Employee>();

    private static void displayMenu(){
        System.out.println("1 Add Employee");
        System.out.println("2 Update Employee");
        System.out.println("3 Remove Employee");
        System.out.println("4 Search Employee=");
        System.out.println("5 List All Employees");
        System.out.println("6 Generate Salary Report");
        System.out.println("7 Exit");
    }

    private static void addEmployee(LinkedList<Employee> list){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = kb.nextLine();
        System.out.println("Enter a ID");
        int ID = kb.nextInt();
        System.out.println("Enter a position");
        kb.nextLine();
        String position = kb.nextLine();
        System.out.println("Enter Salary");
        double salary = kb.nextDouble();
        list.add(new Employee(ID, name, position, salary));
    }

    //**Returns -1 if employee not found otherwise returns position of employee in list */
    private static int findEmployeeById(LinkedList<Employee> list){
        int num;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id = kb.nextInt();
        for (Employee employee : list) {
            if (employee.getId()== id) {
                return list.indexOf(employee);
            }
        }
        return -1;
    }

    private static void removeEmployee(LinkedList<Employee> list){
        int num = findEmployeeById(list);
        if (num<0) {
            System.out.println("No Such Employee found");
        }else{
            list.remove(num);
        }
    }

    private static void updateEmployee(LinkedList<Employee> list){
        int num = findEmployeeById(list);
        if (num<0) {
            System.out.println("No Such Employee found");
        }else{
             Scanner kb = new Scanner(System.in);
            System.out.println("Enter a name");
            String name = kb.nextLine();
            System.out.println("Enter a ID");
            int ID = kb.nextInt();
            System.out.println("Enter a position");
            String position = kb.nextLine();
            System.out.println("Enter Salary");
            double salary = kb.nextDouble();
            list.add(num, new Employee(ID, name, position, salary));
            list.remove(num+1);
        }
    }

    private static void searchEmployee(LinkedList<Employee> list){
        System.out.println("Search using");
        System.out.println("1 ID");
        System.out.println("2 Name");
        System.out.println("3 position");
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        ArrayList<Integer> indexList = new ArrayList<Integer>();
        switch (num) {
            case 1:
                System.out.println("Enter Employee ID");
                int id = kb.nextInt();
                for (Employee employee : list) {
                    if (employee.getId()== id) {
                        indexList.add(list.indexOf(employee));
                    }
                }if (!indexList.isEmpty()) {
                    for (int index : indexList) {
                        System.out.println(list.get(index));
                    }
                }else{
                    System.out.println("no such Employee");
                }
                break;
            case 2:
                System.out.println("Enter Employee Name");
                kb.nextLine();
                String name = kb.nextLine();
                for (Employee employee : list) {
                    if (employee.getName().equals(name)) {
                        indexList.add(list.indexOf(employee));
                    }
                }if (!indexList.isEmpty()) {
                    for (int index : indexList) {
                        System.out.println(list.get(index));
                    }
                }else{
                    System.out.println("no such Employee");
                }
                break;
            case 3:
                System.out.println("Enter Employee position");
                String position = kb.nextLine();
                for (Employee employee : list) {
                    if (employee.getPostion()== position) {
                        indexList.add(list.indexOf(employee));
                    }
                }if (!indexList.isEmpty()) {
                    for (int index : indexList) {
                        System.out.println(list.get(index));
                    }
                }else{
                    System.out.println("no such Employee");
                }
                break;
            default:
                break;
        }
    }

    private static void listAllEmployees(LinkedList<Employee> list){
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    private static void generateSalaryReport(LinkedList<Employee> list){
        double min = Double.MAX_VALUE;
        Double max = Double.MIN_VALUE;
        Double avg;
        Double sum = 0.0;

        for (Employee employee : list) {
            if (min> employee.getSalary()) {
                min = employee.getSalary();
            }if (max < employee.getSalary()) {
                max = employee.getSalary();
            }
            sum +=employee.getSalary();
        }
        avg = sum/list.size();
        System.out.println("totals salary is "+ sum+ "Lowest salary is "+ min+"Highest salary is "+ max+ "The average salary is "+ avg);
    }

    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<Employee>();
        Scanner kb = new Scanner(System.in);
        int userInput;
        do {
            displayMenu();
            userInput= kb.nextInt();
            switch (userInput) {
                case 1:
                    addEmployee(list);
                    break;
                case 2:
                    updateEmployee(list);
                    break;
                case 3:
                    removeEmployee(list);
                    break;
                case 4: 
                    searchEmployee(list);
                    break;
                case 5:
                    listAllEmployees(list);
                    break;
                case 6:
                    generateSalaryReport(list);
                    break;
                case 7:
                    System.out.println("exiting");
                default:
                    break;
            }
        } while (userInput!=7);
        
    }

}
