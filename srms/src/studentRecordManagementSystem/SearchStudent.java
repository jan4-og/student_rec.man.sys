package studentRecordManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchStudent {
    private Scanner sc = new Scanner(System.in);

    public void execute(StudentRecords records) {
        System.out.println("\n⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        System.out.println("    STUDENT RECORD MANAGEMENT SYSTEM    ");
        System.out.println("                 SEARCH                 ");
        System.out.println("⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        System.out.println("[1] ⌕ Search by ID");
        System.out.println("[2] ⌕ Search by Name");
        System.out.println("[3] ⌕ Search by Sex");
        System.out.println("[4] ⌕ Search by Age");
        System.out.println("[5] ⌕ Search by Course");
        System.out.println("[6] ⌕ Search by Year Level");

        int choice;
        while (true) {
            System.out.print("Choice (1-6): ");
            String in = sc.nextLine().trim();
            
            try {
                choice = Integer.parseInt(in);
                
                if (choice >= 1 && choice <= 6) {
                	break;
                }
                
            } catch (Exception ignored) {
            }
            
            System.out.println("[✕] Invalid choice.");
        }

        List<Student> results = new ArrayList<>();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter ID: ");
                String id = sc.nextLine().trim().toUpperCase();
                Student s = records.searchByID(id);
                
                if (s != null) {
                	results.add(s);
                }
            }
            
            case 2 -> {
                System.out.print("Enter name: ");
                String kw = sc.nextLine().trim().toLowerCase();
                for (Student s : records.viewAllStudents()) {
                    if (s.buildFullName().toLowerCase().contains(kw)) {
                    	results.add(s);
                    }
                }
            }
            
            case 3 -> {
                System.out.print("Enter Sex (Male/Female): ");
                String sex = Utils.casing(sc.nextLine().trim());
                for (Student s : records.viewAllStudents()) {
                    if (s.getSex().equalsIgnoreCase(sex)) {
                    	results.add(s);
                    }
                }
            }
            
            case 4 -> {
                System.out.print("Enter age: ");
                
                try {
                    int age = Integer.parseInt(sc.nextLine().trim());
                    
                    for (Student s : records.viewAllStudents()) {
                        if (s.getAge() == age) {
                        	results.add(s);
                        }
                    }
                } catch (Exception e) { System.out.println("[✕] Invalid number."); }
            }
            
            case 5 -> {
                System.out.print("Enter course code or title: ");
                String raw = sc.nextLine().trim();
                String code = Utils.toCourseCode(raw);
                
                for (Student s : records.viewAllStudents()) {
                    if (s.getCourse().equalsIgnoreCase(code)) {
                    	results.add(s);
                    }
                }
            }
            
            case 6 -> {
                System.out.print("Enter year level: ");
                String raw = sc.nextLine().trim();
                String yr = Utils.normalizeYearLevel(raw);
                
                if (!yr.isEmpty()) {
                    for (Student s : records.viewAllStudents()) {
                    	if (s.getYearLevel().equalsIgnoreCase(yr)) {
                    		results.add(s);
                    	}
                    }     
                }
            }
        }

        if (results.isEmpty()) {
        	System.out.println("\n⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        	System.out.println("    STUDENT RECORD MANAGEMENT SYSTEM    ");
        	System.out.println("                 SEARCH                 ");
        	System.out.println("⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        	System.out.println("\n[✕] No matching records.");
        } else {
        	System.out.println("\n⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        	System.out.println("    STUDENT RECORD MANAGEMENT SYSTEM    ");
        	System.out.println("                 SEARCH                 ");
        	System.out.println("⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        	System.out.println("\nRESULTS:");

        	int idW = 0, nameW = 0, sexW = 0, ageW = 0, courseW = 0, yrW = 0;
            for (Student s : results) {
                idW = Math.max(idW, ("ID Number: " + s.getIDNumber()).length());
                nameW = Math.max(nameW, ("Name: " + s.buildFullName()).length());
                sexW = Math.max(sexW, ("Sex: " + s.getSex()).length());
                ageW = Math.max(ageW, ("Age: " + s.getAge()).length());
                courseW = Math.max(courseW, ("Course: " + s.getCourse()).length());
                yrW = Math.max(yrW, ("Year Level: " + s.getYearLevel()).length());
            }

            int totalLen = 0;

            for (Student s : results) {
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
        }

        System.out.print("\nPress [Enter] to return to the Main Menu...");
        sc.nextLine();
    }
}
