import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===== HashMap =====
        System.out.println();
        System.out.println("===== HashMap =====");
        HashMap<String, Integer> grades = new HashMap<>();
        
        for(int i = 1; i < 4; i++){
            System.out.print("Student " + i + " name: ");
            String names = input.nextLine();

            System.out.print(names + "'s grade: ");
            int grade = input.nextInt();
            input.nextLine();

            grades.put(names, grade);
        } 
        System.out.println("Grades " + grades);

        System.out.println();
        System.out.print("Search student: ");
        String searchMap = input.nextLine();
        System.out.println(searchMap + "'s grade: " + grades.get(searchMap));

        System.out.print("Update student: ");
        String update = input.nextLine();
        if (grades.containsKey(update)) {
            System.out.print("New grade: ");
            int newGrade = input.nextInt();
            input.nextLine();
            grades.put(update, newGrade);
        } else{
            System.out.println("Student not found");
        }
        System.out.println("Updated student grades: " + grades);
        
        System.out.print("Remove a student: ");
        String student = input.nextLine();
        grades.remove(student);
        System.out.println("Grades after removal: " + grades);
        
        input.close();
    }
}
