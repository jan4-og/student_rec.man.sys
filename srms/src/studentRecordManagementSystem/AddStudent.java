package studentRecordManagementSystem;

import java.util.Scanner;

public class AddStudent {
    private Scanner sc = new Scanner(System.in);

    public void execute(StudentRecords records) {
    	System.out.println("\n⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        System.out.println("    STUDENT RECORD MANAGEMENT SYSTEM    ");
        System.out.println("             ADD A STUDENT              ");
        System.out.println("⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        System.out.println("\nNote: Press [Enter] for fields with no data.");
        
        String first = askNonEmptyName("First Name: ");
        String second = askNameAllowEmpty("Second Name: ");
        String middle = askNameAllowEmpty("Middle Name: ");
        String surname = askNonEmptyName("Surname: ");

        String sex;
        while (true) {
            System.out.print("Sex (Male/Female): ");
            sex = Utils.casing(sc.nextLine().trim());
            
            if (sex.equals("Male") || sex.equals("Female")) {
            	break;
            }
            
            System.out.println("[❌] Please enter Male or Female.");
        }

        int age;
        while (true) {
            System.out.print("Age (year/s): ");
            String in = sc.nextLine().trim();
            try {
                age = Integer.parseInt(in);
                
                if (age < 1 || age > 150) {
                    System.out.println("[❌] Invalid input!");
                    System.out.println("[❓] Inputted age is not considered realistic for human records.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("[❌] Invalid number. Please enter digits only.");
            }
        }

        String rawCourse;
        do {
            System.out.print("Course Code/Title: ");
            rawCourse = sc.nextLine().trim();
            
            if (rawCourse.isEmpty()) {
            	System.out.println("Course cannot be empty.");
            }
        } while (rawCourse.isEmpty());
        
        String courseCode = Utils.toCourseCode(rawCourse);

        String yearLevel;
        while (true) {
            System.out.print("Year Level: ");
            String yIn = sc.nextLine().trim();
            yearLevel = Utils.normalizeYearLevel(yIn);
            
            if (!yearLevel.isEmpty()) {
            	break;
            }
            
            System.out.println("[❌] Invalid year level.");
        }

        String id = records.generateID(first, second, middle, surname);
        Student s = new Student(id, first, second, middle, surname, sex, age, courseCode, yearLevel);
        records.addStudent(s);

        System.out.println("\nStudent added successfully! ₍ᵔ•ᴗ•ᵔ₎");
        System.out.println("Generated ID: " + id);
        System.out.print("\nPress [Enter] to return to Main Menu...");
        sc.nextLine();
    }

    private String askNonEmptyName(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = Utils.casing(sc.nextLine().trim());
            
            if (!input.isEmpty()) {
            	return input;
            }
            
            System.out.println("[❌] This field cannot be empty.");
        }
    }

    private String askNameAllowEmpty(String prompt) {
        System.out.print(prompt);
        String input = Utils.casing(sc.nextLine().trim());
        return input == null ? "" : input;
    }
}
