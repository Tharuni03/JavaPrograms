//program 
import java.util.Scanner;

import javax.swing.SpringLayout;
public class Employee {
    int empId;
    String empName;
    String empdesignation;
    public Employee(int Id, String empName, String empDesignation){
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
    }
    public class Test {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        Employee list[] = new Employee[total];
        for(int i=0; i<total; i++){
            System.out.println("Enter Employee ID:");
            int empId = scan.nextInt();
            System.out.println("Enter Employee Name");
            scan.nextLine();
            String rmpName = scan.nextLine();
            System.out.println("Enter Employee Designation");
            String empDesignation = scan.nextLine();
            Employee e = new Employee(empId, empName, empDesignation);
            list[i] = e;
        }
    } 
        System.out.println("Enter the emp ID to search");
        int search = scan.nextInt();
        for(Employee t : list){
            if (t.empId == search){
                System.out.println("Match Found");
                System.out.println("Employee ID:" + t.empId);
                System.out.println("Employee Name:" + t.empName);
                System.out.println("Employee Designation:" + t.empDesignation);

            }
        }
          scan.close();





    }
    
        
      

          
      
    





    

