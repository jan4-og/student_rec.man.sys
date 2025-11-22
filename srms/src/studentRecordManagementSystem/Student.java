package studentRecordManagementSystem;

public class Student {

    private String idNumber;
    private String firstName;
    private String secondName;
    private String middleName;
    private String surname;
    private String sex;
    private int age;
    private String course;
    private String yearLevel;

    public Student(String idNumber, String firstName, String secondName,
                   String middleName, String surname, String sex,
                   int age, String course, String yearLevel) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.secondName = secondName == null ? "" : secondName;
        this.middleName = middleName == null ? "" : middleName;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.yearLevel = yearLevel;
    }

    public String getIDNumber() {
    	return idNumber;
    }
    public String getFirstName() {
    	return firstName;
    }
    
    public String getSecondName() {
    	return secondName;
    }
    
    public String getMiddleName() {
    	return middleName;
    }
    
    public String getSurname() {
    	return surname;
    }
    
    public String getSex() {
    	return sex;
    }
    
    public int getAge() {
    	return age;
    }
    
    public String getCourse() {
    	return course;
    }
    
    public String getYearLevel() {
    	return yearLevel;
    }

    public void setIDNumber(String id) {
    	this.idNumber = id;
    }
    
    public void setFirstName(String s) {
    	this.firstName = s;
    }
    
    public void setSecondName(String s) {
    	this.secondName = s;
    }
    
    public void setMiddleName(String s) {
    	this.middleName = s;
    }
    
    public void setSurname(String s) {
    	this.surname = s;
    }
    
    public void setSex(String s) {
    	this.sex = s;
    }
    
    public void setAge(int a) {
    	this.age = a; 
    }
    
    public void setCourse(String c) {
    	this.course = c;
    }
    
    public void setYearLevel(String y) {
    	this.yearLevel = y;
    }

    public String buildFullName() {
        StringBuilder sb = new StringBuilder();
        sb.append(surname).append(", ").append(firstName);

        if (!secondName.isEmpty()) {
        	sb.append(" ").append(secondName);
        }
        
        if (!middleName.isEmpty()) {
        	sb.append(", ").append(middleName);
        }
        
        return sb.toString().trim();
    }

    public String displayStudentInfo() {
        return "ID Number: " + idNumber + " | Name: " + buildFullName() + " | Sex: " + sex + " | Age: " + age + " | Course: " + course + " | Year Level: " + yearLevel;
    }

    public String toSaveInfo() {
        return idNumber + "|" + firstName + "|" + secondName + "|" + middleName + "|" + surname + "|" + sex + "|" + age + "|" + course + "|" + yearLevel;
    }

    public static Student fromSavedInfo(String line) {
        String[] p = line.split("\\|", -1);
        
        if (p.length < 9) return null;
        return new Student(
                p[0], p[1], p[2], p[3], p[4], p[5], Integer.parseInt(p[6]), p[7], p[8]
        );
    }
}
