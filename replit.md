# Student Record Management System

## Overview
A Java-based console application for managing student records. This system allows users to add, view, search, update, and delete student information with persistent storage to a text file.

## Project Information
- **Language**: Java 19 (GraalVM)
- **Type**: Console Application (TUI)
- **Build System**: Manual compilation using javac
- **Data Storage**: Text file (students.txt)

## Project Structure
```
srms/
├── src/
│   ├── studentRecordManagementSystem/
│   │   ├── Main.java              - Entry point and menu system
│   │   ├── Student.java           - Student data model
│   │   ├── StudentRecords.java    - Records management
│   │   ├── AddStudent.java        - Add student functionality
│   │   ├── ViewAllStudents.java   - View all students
│   │   ├── SearchStudent.java     - Search functionality
│   │   ├── UpdateStudent.java     - Update student records
│   │   ├── DeleteStudent.java     - Delete student records
│   │   └── Utils.java             - Utility functions
│   └── module-info.java
├── bin/                           - Compiled .class files
└── students.txt                   - Student data storage
```

## Features
1. **Add Student** - Add new student records with details
2. **View All Students** - Display all registered students
3. **Search Student** - Search for specific student records
4. **Update Student** - Modify existing student information
5. **Delete Student** - Remove student records
6. **Persistent Storage** - Save/load data from text file

## Running the Application
The application runs automatically via the configured workflow. It presents an interactive menu system in the console where you can:
- Enter numbers 1-6 to select operations
- Follow prompts to input student information
- Save changes before exiting

## Compilation
The project is compiled using:
```bash
cd srms
javac -d bin src/studentRecordManagementSystem/*.java src/module-info.java
```

## Recent Changes
- **2025-11-22**: Bug fixes (Round 2)
  - Fixed infinite loop when entering invalid input in delete confirmation
  - Added proper input re-prompt loop for invalid Y/N responses
  
- **2025-11-22**: Bug fixes (Round 1)
  - Fixed infinite loop in DeleteStudent.java (missing break statement after deletion)
  - Fixed syntax error in StudentRecords.java (extra period on line 7)
  - Recompiled and tested all fixes successfully

- **2025-11-22**: Initial import from GitHub
  - Installed Java GraalVM 22.3 (Java 19)
  - Configured workflow for console application
  - Set up project structure with proper .gitignore
  - Verified compilation and runtime functionality

## Architecture
- **Console-based UI**: Interactive menu-driven interface
- **File-based storage**: Uses students.txt for data persistence
- **Modular design**: Separate classes for each operation
- **Java 19 compatible**: Works with GraalVM runtime
