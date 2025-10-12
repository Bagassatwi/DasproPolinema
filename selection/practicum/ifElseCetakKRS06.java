import java.util.Scanner;

public class ifElseCetakKRS06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Enter current semester: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS Semester 1 is displayed");
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 is displayed");
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 is displayed");
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 is displayed");
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 is displayed");
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 is displayed");
        } else if (semester == 7) {
            System.out.println("KRS Semester 7 is displayed");
        } else if (semester == 8) {
            System.out.println("KRS Semester 8 is displayed");
        } else {
            System.out.println("Invalid semester");
        }
    }
}