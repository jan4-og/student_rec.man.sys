# Student Record Management System
This is a terminal-based application built in Java that simulates a Student Record Management System (SRMS). The system offers complete CRUD (Create, Read, Update, Delete) capability through a user-driven Command-Line Interface. It uses Object-Oriented Programming principles. Input validation ensures data integrity, demonstrating concepts such as Encapsulation, Methods, and modular Classes.

- **Language:** Java 19
- **Architecture:** Modular, object-oriented design
- **Data Structure:** LinkedHashMap for maintaining insertion order
- **Storage Format:** Plain text file with delimiter-separated values
- **ID Generation:** Intelligent algorithm using name initials with collision handling

---

## How to Run the Program
This project runs on the Replit platform, which provides a Java environment.

**Steps:**
1. Click on “Remix this app”
2. Log in to your Replit account or sign up for one.
3. Name it whatever you want. Putting a description is optional.
4. Set your preferred privacy settings.
5. Click on “Remix this app” again.
6. Click Run to launch; the console and menu will appear automatically.
7. Upon clicking, a built-in console window will appear.
8. You can now manage the system and its features through the main menu.

---

## Features
- **Menu System** - A numerical menu in the Command-Line Interface for feature navigation.
 
- **Add a Student** - This feature enables users to input data (First Name, Second Name (Optional), Middle Name (Optional), Surname, Age, Gender, etc.) to add a new student file in the student records. This is where the “Create” component of CRUD is implemented.
 
- **ID Generation** - Automatically generates a unique Student ID based on name initials and a sequence number (control number) to handle potential collisions. The update feature also generates a new ID if the student's name details are changed.
 
- **View All Students** - This feature displays a sorted (alphabetically by Surname) list of all student records in a padded table and a readable layout. This is where the “Read” component of CRUD is implemented.
 
- **Search** - Enables searching for matching student records by different fields (ID, Name Component, Sex, Age, Course and Year Level).
 
- **Update Student** - This feature allows modification of existing student details such as names, Age, Course, etc, based on a student ID lookup. This also generates a new ID if the student's name details are changed. Lastly, this is where the “Update” component of CRUD is implemented.
 
- **Delete Student** - This feature facilitates the removal of a student's record by student ID. This is where the “Delete” component of CRUD is implemented.
 
- **Robust Input Validation** - This program prompts users to follow strict data requirements for integrity, including data type checking (e.g., Age) and normalisation of data (e.g., Year Level and Name Casing).
 
- **Persistent Data Storage** - All student data is stored and managed using Java Collections during application runtime. The program offers the option to save records to a file upon exiting, allowing data to persist across program sessions.

---

## Sample Inputs/Outputs

**Example 1: Main Menu**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
[1] Add a Student ⎘
[2] View All Students ⧉
[3] Search ⌕
[4] Update a Student's Data ✎
[5] Delete a Student ⌦
[6] Exit ⍈
Enter your choice: 6

[⎙] Save changes before exit? (Y/N): y
[✓] Data saved to students.txt
Goodbye! ₍ᐢ› ̫ ‹ᐢ₎
```

**Example 2.1: Add a Student**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
             ADD A STUDENT              
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Note: Press [Enter] for fields with no data.
First Name: 
[✕] This field cannot be empty.
First Name: jOYce
Second Name: anNE
Middle Name: jINAO
Surname: 
[✕] This field cannot be empty.
Surname: GUevarra
Sex (Male/Female): 1
[✕] Please enter Male or Female.
Sex (Male/Female): femAle
Age (year/s): 1000
[✕] Invalid input!
[?] Inputted age is not considered realistic for human records.
Age (year/s): 
[✕] Invalid number. Please enter digits only.
Age (year/s): twenty
[✕] Invalid number. Please enter digits only.
Age (year/s): 19
Course Code/Title: aSSociaTE in COmPUter TechNoloGy
Year Level: 89
[✕] Invalid year level.
Year Level: 1

[✓] Student added successfully! ₍ᵔ•ᴗ•ᵔ₎
Generated ID: JAJG00

Press [Enter] to return to the Main Menu...
```

**Example 2.2: Add a Student**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
             ADD A STUDENT              
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Note: Press [Enter] for fields with no data.
First Name: steven
Second Name: 
Middle Name: 
Surname: Tolentino
Sex (Male/Female): male
Age (year/s): 18
Course Code/Title: ACT
Year Level: freshman

[✓] Student added successfully! ₍ᵔ•ᴗ•ᵔ₎
Generated ID: S00T00

Press [Enter] to return to the Main Menu...
```
**Example 2.3: Add a Student**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
             ADD A STUDENT              
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Note: Press [Enter] for fields with no data.
First Name: Obet
Second Name: 
Middle Name: Alamodin
Surname: Fernando
Sex (Male/Female): male
Age (year/s): 19
Course Code/Title: ACT
Year Level: 1st year

[✓] Student added successfully! ₍ᵔ•ᴗ•ᵔ₎
Generated ID: O0AF00

Press [Enter] to return to the Main Menu...
```

**Example 3.1: Update a Student's Information**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
      MODIFY STUDENT's INFORMATION      
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Enter ID of student to update: jajg00
Note: Press [Enter] to keep current value.
First Name (Joyce): 
Second Name (Anne): 
Middle Name (Jinao): 
Surname (Guevarra): 
Sex (Female): 
Age (19): 
Course (ACT): 
Year Level (Freshman): 
Student updated.

Press [Enter] to return to the Main Menu...
```

**Example 3.2: Update a Student's Information**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
      MODIFY STUDENT's INFORMATION      
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Enter ID of student to update: O0AF00
Note: Press [Enter] to keep current value.
First Name (Obet): Rass
Second Name (): Viell
Middle Name (Alamodin): Serrano
Surname (Fernando): Laxamana
Sex (Male): female
Age (19): 18
Course (ACT): associate in computer technology
Year Level (Freshman): 1
[] Name changed — ID regenerated: RVSL00
Student updated.

Press [Enter] to return to the Main Menu...
```

**Example 4.1: ID Generation (Add a Student)**

```
[✓] Student added successfully! ₍ᵔ•ᴗ•ᵔ₎
Generated ID: O0AF00
```

**Example 4.2: ID Generation (Update a Student's Information)**

```
[!] Name changed — ID regenerated: RVSL00
Student updated.
```

**Example 5: View All Students**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
            VIEW ALL STUDENTS           
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

ID Number: JAJG00 | Name: Guevarra, Joyce Anne, Jinao   | Sex: Female | Age: 19 | Course: ACT | Year Level: Freshman
ID Number: RVSL00 | Name: Laxamana, Rass Viell, Serrano | Sex: Female | Age: 18 | Course: ACT | Year Level: Freshman
ID Number: S00T00 | Name: Tolentino, Steven             | Sex: Male   | Age: 18 | Course: ACT | Year Level: Freshman
____________________________________________________________________________________________________________________

Press [Enter] to return to the Main Menu...
```

**Example 6.1: Search by ID**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
                 SEARCH                 
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
[1] Search by ID
[2] Search by Name
[3] Search by Sex
[4] Search by Age
[5] Search by Course
[6] Search by Year Level
Choice (1-6): 1
Enter ID: RVSL00

⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
                 SEARCH                 
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

RESULTS:
ID Number: RVSL00 | Name: Laxamana, Rass Viell, Serrano | Sex: Female | Age: 18 | Course: ACT | Year Level: Freshman
____________________________________________________________________________________________________________________

Press [Enter] to return to the Main Menu...
```

**Example 6.2: Search by Name**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
                 SEARCH                 
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
[1] Search by ID
[2] Search by Name
[3] Search by Sex
[4] Search by Age
[5] Search by Course
[6] Search by Year Level
Choice (1-6): 2
Enter name: Joyce

RESULTS:
ID Number: JAJG00 | Name: Guevarra, Joyce Anne, Jinao | Sex: Female | Age: 19 | Course: ACT | Year Level: Freshman
__________________________________________________________________________________________________________________

Press [Enter] to return to the Main Menu...
```

**Example 6.3: Search by Sex**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
                 SEARCH                 
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
[1] Search by ID
[2] Search by Name
[3] Search by Sex
[4] Search by Age
[5] Search by Course
[6] Search by Year Level
Choice (1-6): 3
Enter Sex (Male/Female): male

⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
                 SEARCH                 
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

RESULTS:
ID Number: S00T00 | Name: Tolentino, Steven        | Sex: Male | Age: 18 | Course: ACT | Year Level: Freshman
_____________________________________________________________________________________________________________

Press [Enter] to return to the Main Menu...
```

**Example 6.4: Search by Age**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
                 SEARCH                 
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
[1] Search by ID
[2] Search by Name
[3] Search by Sex
[4] Search by Age
[5] Search by Course
[6] Search by Year Level
Choice (1-6): 4
Enter age: 19

⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
                 SEARCH                 
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

RESULTS:
ID Number: JAJG00 | Name: Guevarra, Joyce Anne, Jinao | Sex: Female | Age: 19 | Course: ACT | Year Level: Freshman
__________________________________________________________________________________________________________________

Press [Enter] to return to the Main Menu...
```

**Example 6.5: Search by Course**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
                 SEARCH                 
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
[1] Search by ID
[2] Search by Name
[3] Search by Sex
[4] Search by Age
[5] Search by Course
[6] Search by Year Level
Choice (1-6): 5
Enter course code or title: ACT

⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
                 SEARCH                 
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

RESULTS:
ID Number: JAJG00 | Name: Guevarra, Joyce Anne, Jinao   | Sex: Female | Age: 19 | Course: ACT | Year Level: Freshman
ID Number: RVSL00 | Name: Laxamana, Rass Viell, Serrano | Sex: Female | Age: 18 | Course: ACT | Year Level: Freshman
ID Number: Z00M00 | Name: Maraña, Zepaneia              | Sex: Female | Age: 18 | Course: ACT | Year Level: Freshman
____________________________________________________________________________________________________________________

Press [Enter] to return to the Main Menu...
```

**Example 6.6: Search by Year Level**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
                 SEARCH                 
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
[1] Search by ID
[2] Search by Name
[3] Search by Sex
[4] Search by Age
[5] Search by Course
[6] Search by Year Level
Choice (1-6): 6
Enter year level: freshman

⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
                 SEARCH                 
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

RESULTS:
ID Number: JAJG00 | Name: Guevarra, Joyce Anne, Jinao   | Sex: Female | Age: 19 | Course: ACT | Year Level: Freshman
ID Number: RVSL00 | Name: Laxamana, Rass Viell, Serrano | Sex: Female | Age: 18 | Course: ACT | Year Level: Freshman
ID Number: Z00M00 | Name: Maraña, Zepaneia              | Sex: Female | Age: 18 | Course: ACT | Year Level: Freshman
____________________________________________________________________________________________________________________

Press [Enter] to return to the Main Menu...
```

**Example 7.1: Delete a Student**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
           DELETE A STUDENT             
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Enter ID to delete: S00T00
Delete Tolentino, Steven (Y/N)? n
[✕] Deletion cancelled.

Press [Enter] to return to the Main Menu...
```

**Example 7.2: Delete a Student**

```

⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
           DELETE A STUDENT             
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Enter ID to delete: S00T00
Delete Tolentino, Steven (Y/N)? y
[✓] Student deleted.

Press [Enter] to return to the Main Menu...
```

**Example 8: Robust Input Validation**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
             ADD A STUDENT              
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊

Note: Press [Enter] for fields with no data.
First Name: 
[✕] This field cannot be empty.
First Name: Zepaneia
Second Name: 
Middle Name: 
Surname: 
[✕] This field cannot be empty.
Surname: Maraña
Sex (Male/Female): f
[✕] Please enter Male or Female.
Sex (Male/Female): female
Age (year/s): 1000
[✕] Invalid input!
[?] Inputted age is not considered realistic for human records.
Age (year/s): -1
[✕] Invalid input!
[?] Inputted age is not considered realistic for human records.
Age (year/s): twenty
[✕] Invalid number. Please enter digits only.
Age (year/s): 18
Course Code/Title: associate in computer technology
Year Level: 100
[✕] Invalid year level.
Year Level: 1
```

**Example 9.1: Persistent Data Storage**

```
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
[1] Add a Student ⎘
[2] View All Students ⧉
[3] Search ⌕
[4] Update a Student's Data ✎
[5] Delete a Student ⌦
[6] Exit ⍈
Enter your choice: 6

[⎙] Save changes before exit? (Y/N): Y
[✓] Data saved to students.txt
Goodbye! ₍ᐢ› ̫ ‹ᐢ₎
```

**Example 9.2: Persistent Data Storage**

```
[↻] Loaded 3 records from students.txt.

⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
    STUDENT RECORD MANAGEMENT SYSTEM    
⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊⚊
[1] Add a Student ⎘
[2] View All Students ⧉
[3] Search ⌕
[4] Update a Student's Information ✎
[5] Delete a Student ⌦
[6] Exit ⍈
Enter your choice: 
```

---

## List of Contributions

**Guevarra, Joyce Anne J.**
- Developed the initial ViewAllStudents class.
- Contributed to the interface design.
- Contributed to the README.md file contents.
- Managed the Peer Evaluation Folder in Google Drive.

**Laxamana, Rass Viell S.**
- Developed the initial SearchStudent class.
- Contributed to the interface design.
- Contributed to the README.md file contents.
- Managed the List of Contributions file in Google Drive.

**Lazaro, Naomi Zai C.**
- Developed the initial DeleteStudent class.
- Contributed to the interface design.
- Contributed to the README.md file contents.
- Managed the Peer Evaluation Folder in Google Drive.

**Maraña, Zepaneia Ruth R.**
- Developed the initial UpdateStudent class.
- Contributed to the interface design.
- Contributed to the README.md file contents.
- Edited the Presentation.

**Nollora, Janelyn G.**
- Developed several classes (Utils, Student, StudentRecords, AddStudent and Main).
- Finalised the classes made by the other members (ViewAllStudents, SearchStudent, UpdateStudent, and DeleteStudent).
- Handled the repositories across platforms (Eclipse, GitHub, and Replit).
- Managed changes and member inputs in the README.md file.
- Co-edited the Presentation.

---
