package studentRecordManagementSystem;

import java.util.List;
import java.util.Scanner;

public class ViewAllStudents {

	public void execute(StudentRecords records, Scanner sc) {
        List<Student> list = records.sortBySurname();
        
        if (list.isEmpty()) {
            System.out.println("\n[✕] No students found.");
            System.out.print("\nPress Enter to return...");
            sc.nextLine();
            return;
        }

        int idW = 0, nameW = 0, sexW = 0, ageW = 0, courseW = 0, yrW = 0;
        for (Student s : list) {
            idW = Math.max(idW, ("ID Number: " + s.getIDNumber()).length());
            nameW = Math.max(nameW, ("Name: " + s.buildFullName()).length());
            sexW = Math.max(sexW, ("Sex: " + s.getSex()).length());
            ageW = Math.max(ageW, ("Age: " + s.getAge()).length());
            courseW = Math.max(courseW, ("Course: " + s.getCourse()).length());
            yrW = Math.max(yrW, ("Year Level: " + s.getYearLevel()).length());
        }

        System.out.println("\n⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        System.out.println("    STUDENT RECORD MANAGEMENT SYSTEM    ");
        System.out.println("            VIEW ALL STUDENTS           ");
        System.out.println("⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊\n");

        int totalLen = 0;
        for (Student s : list) {
            String line = Utils.padding("ID Number: " + s.getIDNumber(), idW) + " | " +
                          Utils.padding("Name: " + s.buildFullName(), nameW) + " | " +
                          Utils.padding("Sex: " + s.getSex(), sexW) + " | " +
                          Utils.padding("Age: " + s.getAge(), ageW) + " | " +
                          Utils.padding("Course: " + s.getCourse(), courseW) + " | " +
                          Utils.padding("Year Level: " + s.getYearLevel(), yrW);
            System.out.println(line);
            totalLen = Math.max(totalLen, line.length());
        }

        System.out.println("_".repeat(Math.max(totalLen, 40)));
        System.out.print("\nPress [Enter] to return to the Main Menu...");
        sc.nextLine();
    }
}

