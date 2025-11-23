import java.util.Scanner;
import java.util.HashMap;

public class StudentDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> studentList = new HashMap<>();

        System.out.print("Enter the number of student: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.print("Enter the student number: ");
            String num = sc.nextLine();
            System.out.print("Enter the student name: ");
            String name = sc.nextLine();
            studentList.put(num, name);
        }
        System.out.println("Students: " + studentList);

       

        boolean t = true;
        do {
            System.out.println();
            System.out.println("Operations: Search - 1, Remove - 2, Add - 3, Update - 4, Exit - 5");
            System.out.print("Choose an operation: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the student number: ");
                    String searchNum = sc.nextLine();
                    if (studentList.containsKey(searchNum)) {
                        System.out.println("Student name: " + studentList.get(searchNum));
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    System.out.println("Students: " + studentList);
                    break;

                case 2:
                    System.out.print("Enter the student number to remove: ");
                    String removeNum = sc.nextLine();
                    if (studentList.containsKey(removeNum)) {
                        studentList.remove(removeNum);
                        System.out.println("Student Update: " + studentList);
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    System.out.println("Students Update: " + studentList);
                    break;
                
                case 3:
                    System.out.print("Enter new student number: ");
                    String newNum = sc.nextLine();
                    System.out.print("Enter student name: ");
                    String newName = sc.nextLine();
                    studentList.put(newNum, newName);
                    System.out.println("Students Update: " + studentList);
                    break;

                case 4:
                    System.out.print("Enter the student number to update the student name: ");
                    String num = sc.nextLine();
                    System.out.print("Update the students' name: ");
                    String newName2 = sc.nextLine();

                    if (studentList.containsKey(num)) {
                        studentList.put(num, newName2);
                    }
                    System.out.println("Students Update: " + studentList);
                    break;

                case 5:
                    t = false;
                    break;

                default:
                    System.out.println("Operation invalid.");
                    break;
            }
        } while (t);


        sc.close();
    }
}
