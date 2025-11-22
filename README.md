# Student Record Management System

A Java-based console application for managing student records with persistent file storage.

---

## How to Run the Program

### Prerequisites
- Java Development Kit (JDK) 19 or higher
- Command line terminal

### Compilation Steps
1. Navigate to the `srms` directory:
   ```bash
   cd srms
   ```

2. Compile the Java source files:
   ```bash
   javac -d bin src/studentRecordManagementSystem/*.java src/module-info.java
   ```

### Running the Application
After compilation, run the program with:
```bash
java -cp bin studentRecordManagementSystem.Main
```

The application will start and display the main menu.

---

## Features

The Student Record Management System provides the following features:

### 1. Add a Student 🪪
- Add new student records to the system
- Input student information including:
  - First name, second name, middle name, surname
  - Program/course
  - Year level
- Automatically generates unique student ID based on name initials

### 2. View All Students ⧉
- Display all registered students in the system
- Shows complete student information in a formatted table
- Option to sort students by surname alphabetically
- Displays total number of records

### 3. Search Student ⌕
- Search for specific student records
- Search by Student ID
- Displays detailed information if student is found

### 4. Update Student ✎
- Modify existing student information
- Update any field: names, program, year level, or ID
- Validates changes before saving

### 5. Delete Student ⌦
- Remove student records from the system
- Confirmation prompt before deletion (Y/N)
- Validates input and prevents accidental deletions

### 6. Persistent Storage 💾
- Automatically loads student data from `students.txt` on startup
- Option to save changes before exiting
- Data persists between program sessions

---

## Sample Inputs/Outputs

### Example 1: Adding a Student
```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
           ADD A STUDENT
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Enter first name: John
Enter second name: Paul
Enter middle name: Andrew
Enter surname: Smith
Enter program: Computer Science
Enter year level: 2

[✓] Student added successfully!
Generated ID: JPAS00
```

### Example 2: Viewing All Students
```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
         VIEW ALL STUDENTS
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Sort by surname? (Y/N): Y

ID       | Name                    | Program             | Year
---------|-------------------------|---------------------|------
JPAS00   | John Paul Andrew Smith  | Computer Science    | 2
MDJB01   | Mary Dorothy Jane Brown | Engineering         | 3

Total students: 2
```

### Example 3: Searching for a Student
```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
          SEARCH STUDENT
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Enter student ID: JPAS00

[✓] Student found!
ID: JPAS00
Name: John Paul Andrew Smith
Program: Computer Science
Year: 2
```

### Example 4: Deleting a Student
```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
           DELETE A STUDENT
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Enter ID to delete: JPAS00
Delete John Paul Andrew Smith (Y/N)? Y
[✓] Student deleted.
```

### Example 5: Main Menu Navigation
```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
[1] Add a Student 🪪
[2] View All Students ⧉
[3] Search Student ⌕
[4] Update Student ✎
[5] Delete Student ⌦
[6] Exit 📁
Enter your choice: 6

[📂] Save changes before exit? (Y/N): Y
[✓] Data saved to students.txt
Goodbye! ₍ᐢ› ̫ ‹ᐢ₎
```

---

## Project Structure

```
srms/
├── src/
│   ├── studentRecordManagementSystem/
│   │   ├── Main.java              # Entry point and menu system
│   │   ├── Student.java           # Student data model
│   │   ├── StudentRecords.java    # Records management and file I/O
│   │   ├── AddStudent.java        # Add student functionality
│   │   ├── ViewAllStudents.java   # View and display students
│   │   ├── SearchStudent.java     # Search functionality
│   │   ├── UpdateStudent.java     # Update student records
│   │   ├── DeleteStudent.java     # Delete student records
│   │   └── Utils.java             # Utility functions
│   └── module-info.java           # Java module definition
├── bin/                           # Compiled .class files
└── students.txt                   # Student data storage file
```

---

## Technical Details

- **Language:** Java 19
- **Architecture:** Modular, object-oriented design
- **Data Structure:** LinkedHashMap for maintaining insertion order
- **Storage Format:** Plain text file with delimiter-separated values
- **ID Generation:** Intelligent algorithm using name initials with collision handling

---

## Team Contributions

### [Member Name 1]
- Developed the core Student class and data model
- Implemented file I/O operations (save/load functionality)
- Created the StudentRecords management system
- Designed the unique ID generation algorithm

### [Member Name 2]
- Built the main menu system and user interface
- Implemented Add Student functionality
- Created the View All Students feature with sorting
- Designed and implemented the program flow control

### [Member Name 3]
- Developed Search Student functionality
- Implemented Update Student feature
- Created Delete Student functionality with validation
- Bug fixes and code optimization
- Testing and quality assurance

### [Member Name 4]
- Utility functions development
- Input validation and error handling
- Documentation and code comments
- User interface improvements and emoji integration

---

## Known Issues and Future Improvements

### Current Limitations
- Single-file storage (no database integration)
- No data encryption for sensitive information
- Limited to console-based interface

### Potential Enhancements
- Implement database integration (MySQL/PostgreSQL)
- Add graphical user interface (GUI)
- Include photo upload functionality
- Generate student reports and statistics
- Add backup and restore features
- Implement user authentication and access control
- Add export functionality (CSV, PDF)

---

## License

This project is created for educational purposes as part of [Course Name/Number].

---

## Contact

For questions or issues, please contact:
- [Your Name/Team Name]
- [Email Address]
- [Institution Name]

---

**Last Updated:** November 22, 2025
