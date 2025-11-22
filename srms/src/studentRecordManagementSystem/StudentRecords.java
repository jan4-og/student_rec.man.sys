package studentRecordManagementSystem;

// It imports all classes in java.io and java.util
import java.io.*;
import java.util.*;

// This file handles the file handling and the collection of students
public class StudentRecords {
	// it uses a LinkedHashMap where the key is the Student ID.
	// This is for fast lookup by ID.
    private LinkedHashMap<String, Student> students = new LinkedHashMap<>();
    
    //This standardizes the file name to students.txt only.
    private final String FILE = "students.txt";

    // This loads data from students.txt file into StudentRecords
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

    // This method changes the student ID and gives a new ID if name details are changed
    public void updateStudentID(String oldId, Student s, String newId) {
        students.remove(oldId);
        s.setIDNumber(newId);
        students.put(newId, s);
    }

    // It saves changes to the file.
    public void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (Student s : students.values()) {
            	pw.println(s.toSaveInfo());
            }
            
            System.out.println("Data saved to " + FILE);
            
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // It loads data from the file.
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
            
            System.out.println("🔃 Loaded " + students.size() + " records from " + FILE + ".");
        } catch (Exception e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    // it Generates the first 4 characters in ID based on student's initials.
    // Replaces empty name details with '0'.
    // 
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

    // This converts map values to a list and uses a comparator to sort students alphabetically by surname.
    public List<Student> sortBySurname() {
        List<Student> list = new ArrayList<>(students.values());
        list.sort(Comparator.comparing(s -> s.getSurname().toLowerCase()));
        return list;
    }
}
