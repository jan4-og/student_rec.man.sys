package studentRecordManagementSystem;

import java.util.Scanner;

public class UpdateStudent {
    private Scanner sc = new Scanner(System.in);

    public void execute(StudentRecords records) {
    	System.out.println("\n⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        System.out.println("    STUDENT RECORD MANAGEMENT SYSTEM    ");
        System.out.println("      MODIFY STUDENT's INFORMATION      ");
        System.out.println("⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        System.out.print("\nEnter ID of student to update: ");
        String id = sc.nextLine().trim().toUpperCase();
        Student s = records.searchByID(id);
        
        if (s == null) {
            System.out.println("[✕] Student not found.");
            sc.nextLine();
            return;
        }

        String oldFirst = s.getFirstName();
        String oldSecond = s.getSecondName();
        String oldMiddle = s.getMiddleName();
        String oldSurname = s.getSurname();

        System.out.println("Note: Press [Enter] to keep current value.");
        System.out.print("First Name (" + s.getFirstName() + "): ");
        String first = sc.nextLine().trim();
        
        if (!first.isEmpty()) {
        	s.setFirstName(Utils.casing(first));
        }

        System.out.print("Second Name (" + s.getSecondName() + "): ");
        String second = sc.nextLine().trim();
        
        if (!second.isEmpty()) {
        	s.setSecondName(Utils.casing(second));
        }

        System.out.print("Middle Name (" + s.getMiddleName() + "): ");
        String middle = sc.nextLine().trim();
        
        if (!middle.isEmpty()) {
        	s.setMiddleName(Utils.casing(middle));
        }

        System.out.print("Surname (" + s.getSurname() + "): ");
        String surname = sc.nextLine().trim();
        
        if (!surname.isEmpty()) {
        	s.setSurname(Utils.casing(surname));
        }

        System.out.print("Sex (" + s.getSex() + "): ");
        String sex = sc.nextLine().trim();
        
        if (!sex.isEmpty()) {
        	s.setSex(Utils.casing(sex));
        }

        String ageIn;
        boolean ageUpdated = false;

        while (!ageUpdated) {
            System.out.print("Age (" + s.getAge() + "): ");
            ageIn = sc.nextLine().trim();

            if (ageIn.isEmpty()) {
                break; 
            }

            try {
                int age = Integer.parseInt(ageIn);
                
                if (age >= 1 && age <= 150) {
                    s.setAge(age);
                    ageUpdated = true;
                } else {
                    System.out.println("[✕] Age must be realistic.");
                }
            } catch (NumberFormatException e) {
                System.out.println("[✕] Invalid input format.");
            }
        }

        System.out.print("Course (" + s.getCourse() + "): ");
        String courseIn = sc.nextLine().trim();
        
        if (!courseIn.isEmpty()) {
        	s.setCourse(Utils.toCourseCode(courseIn));
        }

        String yr;
        String norm = "";
        boolean yearUpdated = false;

        while (!yearUpdated) {
            System.out.print("Year Level (" + s.getYearLevel() + "): ");
            yr = sc.nextLine().trim();

            if (yr.isEmpty()) {
                break;
            }

            norm = Utils.normalizeYearLevel(yr);
            
            if (!norm.isEmpty()) {
                s.setYearLevel(norm);
                yearUpdated = true;
            } else {
                System.out.println("[✕] Invalid input.");
            }
        }

        boolean nameChanged = !oldFirst.equals(s.getFirstName()) || !oldSecond.equals(s.getSecondName()) || !oldMiddle.equals(s.getMiddleName()) || !oldSurname.equals(s.getSurname());

        if (nameChanged) {
            String newId = records.generateID(s.getFirstName(), s.getSecondName(), s.getMiddleName(), s.getSurname());
            records.updateStudentID(id, s, newId);
            System.out.println("[] Name changed — ID regenerated: " + newId);
        } else {
            records.addStudent(s);
        }

        System.out.println("Student updated.");
        System.out.print("\nPress [Enter] to return to the Main Menu...");
        sc.nextLine();
    }
}
