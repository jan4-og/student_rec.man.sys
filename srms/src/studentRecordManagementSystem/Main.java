package studentRecordManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentRecords records = new StudentRecords();
        AddStudent add = new AddStudent();
        ViewAllStudents view = new ViewAllStudents();
        SearchStudent search = new SearchStudent();
        UpdateStudent update = new UpdateStudent();
        DeleteStudent delete = new DeleteStudent();

        Scanner sc = new Scanner(System.in);
        int choice = -1;

        do {
        	System.out.println("\n⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
            System.out.println("    STUDENT RECORD MANAGEMENT SYSTEM    ");
            System.out.println("⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
            System.out.println("[1] Add a Student ⎘");
            System.out.println("[2] View All Students ⧉");
            System.out.println("[3] Search ⌕");
            System.out.println("[4] Update a Student's Information ✎");
            System.out.println("[5] Delete a Student ⌦");
            System.out.println("[6] Exit ⍈");
            System.out.print("Enter your choice: ");

            String in = sc.nextLine().trim();
            
            try {
                choice = Integer.parseInt(in);
            } catch (Exception e) {
                System.out.println("[✕] Invalid input. Enter 1-6.");
                continue;
            }

            switch (choice) {
                case 1 -> add.execute(records);
                case 2 -> view.execute(records,sc);
                case 3 -> search.execute(records);
                case 4 -> update.execute(records);
                case 5 -> delete.execute(records);
                case 6 -> {
                    System.out.print("\n[⎙] Save changes before exit? (Y/N): ");
                    String yn = sc.nextLine().trim().toUpperCase();
                    if (yn.equals("Y")) records.saveToFile();
                    System.out.println("Goodbye! ₍ᐢ› ̫ ‹ᐢ₎");
                }
                
                default -> System.out.println("[✕] Choose between 1 and 6.");
            }
        } while (choice != 6);
        
        sc.close();
    }
}

