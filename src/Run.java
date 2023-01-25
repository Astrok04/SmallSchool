import java.util.ArrayList;
import java.util.Scanner;
public class Run {
    public static void run() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffs = new ArrayList<>();
        while (true) {
            System.out.println("1: Enroll a new student.\n2: Hire new staff.\n3: List all students.\n4: List all staff.");
            while (true) {
                try {
                    int a = scan.nextInt();
                    switch (a) {
                        case 1:
                            System.out.println("Fill in:");
                            System.out.println("Name: ");
                            String name = scan.next();
                            System.out.println("Address: ");
                            String address = scan.next();
                            System.out.println("Program: ");
                            String program = scan.next();
                            System.out.println("Year: ");
                            int year = scan.nextInt();
                            double fee = 0;
                            students.add(new Student(name, address, program, year, fee));
                            break;
                        case 2:
                            System.out.println("Fill in:");
                            System.out.println("Name: ");
                            name = scan.next();
                            System.out.println("Address: ");
                            address = scan.next();
                            System.out.println("school: ");
                            String school = scan.next();
                            System.out.println("Pay: ");
                            double pay = scan.nextDouble();
                            staffs.add(new Staff(name, address, school, pay));
                            break;
                        case 3:
                            if (students.size() >= 1) {
                                for (Student student : students) {
                                    System.out.println(student.toString());
                                }
                                break;
                            }
                        case 4:
                            if (staffs.size() >= 1) {
                                for (Staff staff : staffs) {
                                    System.out.println(staff.toString());
                                }
                                break;
                            }
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("No");
                }
            }
        }
    }
}
