import java.util.HashSet;
import java.util.Scanner;

public class Hashset{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // ===== HashSet =====
        System.out.println("===== HashSet =====");
        HashSet<String> courses = new HashSet<>();
        for(int i = 1; i < 5; i++){
            System.out.print("Enter your " + i + " course code: ");
            String course = input.nextLine();
            courses.add(course);
        }
        System.out.print("Available Courses: " + courses);
        System.out.println();
        System.out.println();

        System.out.print("Search any courses: ");
        String courseSearch = input.nextLine();
        if (courses.contains(courseSearch)) {
            System.out.println(courseSearch + " is available");
        } else{
            System.out.println("This course does not exist");
        }

        System.out.print("Delete a course: ");
        String courseDelete = input.nextLine();
        courses.remove(courseDelete);
        System.out.print("Available Courses: " + courses);
        System.out.println();

        input.close();
    }
}