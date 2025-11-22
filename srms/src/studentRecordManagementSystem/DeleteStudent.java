package studentRecordManagementSystem;

import java.util.Scanner;

public class DeleteStudent {
    private Scanner sc = new Scanner(System.in);

    public void execute(StudentRecords records) {
        System.out.println("\n⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        System.out.println("    STUDENT RECORD MANAGEMENT SYSTEM    ");
        System.out.println("           DELETE A STUDENT             ");
        System.out.println("⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊");
        System.out.print("\nEnter ID to delete: ");
        String id = sc.nextLine().trim().toUpperCase();
        Student s = records.searchByID(id);
        
        if (s == null) {
            System.out.println("[✕] Student not found.");
            sc.nextLine();
            return;
        }
        
        System.out.print("Delete " + s.buildFullName() + " (Y/N)? ");
        String ans = sc.nextLine().trim().toUpperCase();
        
        while (true) {
                if (ans.equals("Y")) {
                    records.deleteStudent(id);
                    System.out.println("[✓] Student deleted.");
                    break;
                } else if (ans.equals("N")) {
                    System.out.println("[✕] Deletion cancelled.");
                    break;
                } else {
                        System.out.println("[✕] Invalid input.");
                }
        }
        
        System.out.print("\nPress [Enter] to return to the Main Menu...");
        sc.nextLine();
    }
}
