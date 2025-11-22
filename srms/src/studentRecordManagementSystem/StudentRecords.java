package studentRecordManagementSystem;

import java.io.*;
import java.util.*;

public class StudentRecords {
    private LinkedHashMap<String, Student> students = new LinkedHashMap<>();
    private final String FILE = "students.txt";

    public StudentRecords() {
        loadFromFile(); 
    }

    public Collection<Student> viewAllStudents() {
        return students.values(); 
    }
    
    public Student searchByID(String id) {
        return students.get(id);
    }
    
    public boolean containsID(String id) {
        return students.containsKey(id);
    }
    
    public void addStudent(Student s) {
        students.put(s.getIDNumber(), s);
    }
    
    public boolean deleteStudent(String id) {
        return students.remove(id) != null;
    }

    public void updateStudentID(String oldId, Student s, String newId) {
        students.remove(oldId);
        s.setIDNumber(newId);
        students.put(newId, s);
    }

    public void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (Student s : students.values()) {
                pw.println(s.toSaveInfo());
            }
            
            System.out.println("[✓] Data saved to " + FILE);
            
        } catch (IOException e) {
            System.out.println("[✕] Error saving data: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        File f = new File(FILE);
        
        if (!f.exists()) {
                return;
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                Student s = Student.fromSavedInfo(line);
                
                if (s != null) {
                        students.put(s.getIDNumber(), s);
                }
            }
            
            System.out.println("[↻] Loaded " + students.size() + " records from " + FILE + ".");
        } catch (Exception e) {
            System.out.println("[✕] Error loading data: " + e.getMessage());
        }
    }

    public String generateID(String first, String second, String middle, String last) {
        char f = (first.isEmpty() ? 'X' : Character.toUpperCase(first.charAt(0)));
        char s = (second.isEmpty() ? '0' : Character.toUpperCase(second.charAt(0)));
        char m = (middle.isEmpty() ? '0' : Character.toUpperCase(middle.charAt(0)));
        char l = (last.isEmpty() ? 'X' : Character.toUpperCase(last.charAt(0)));

        String base = "" + f + s + m + l;
        List<Character> secondVariants = new ArrayList<>();
        secondVariants.add(s);
        
        for (char c = '1'; c <= '9'; c++) {
                secondVariants.add(c);
        }
        
        for (char c = 'A'; c <= 'Z'; c++) {
                secondVariants.add(c);
        }

        for (char sec : secondVariants) {
            String trialBase = "" + f + sec + m + l;
            
            for (int i = 0; i < 100; i++) {
                String id = trialBase + String.format("%02d", i);
                
                if (!students.containsKey(id)) {
                        return id;
                }
            }
        }

        int suffix = students.size() % 100;
        return base + String.format("%02d", suffix);
    }

    public List<Student> sortBySurname() {
        List<Student> list = new ArrayList<>(students.values());
        list.sort(Comparator.comparing(s -> s.getSurname().toLowerCase()));
        return list;
    }
}
