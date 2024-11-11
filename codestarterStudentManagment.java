import java.util.*;

class Student{
    private String name;
    private int id;
    private int [] grade;


// constuctors//
public Student(){
    this.name = "unknown";
    this.id = 0;
}

public Student(String name, int id, int[] grade){
this.name = name;
this.id = id;
this.grade = grade;
}

public void arrraySize(int size){
this.grade = new int [size];
}

// getters//
public String getName(){
    return this.name;
}
public int getID(){
    return this.id;
}
public int getGrade(int index){
    return this.grade[index];
}
//setters//
public void setName(String name){
    this.name = name;
}
public void setId(int ID){
    this.id  = ID;
}
public void setGrade(int grade, int index){
    if((grade>=0) && (grade<=100)){
        this.grade[index] = grade;
    }else{
        System.out.println("Failed to change enter grade due to an invalid number");
    }
}

    //methods//
     public double average() {
        double average;
        double sum = 0;
     for(int i = 0; i < grade.length;i++){
       sum = sum + grade[i];
     }
     average = sum / grade.length;
     return average;
    }
}

class studentManagement{
    Student [] students;
    int studentCount;

    public studentManagement(){
        this.students = new Student[5];
        this.studentCount = 0;

    }

    //methods//
    public void addStudents(Student student){
        if(studentCount >= students.length){
            System.out.println("Cannot add more students (Exeeds Limit)");
        }else{
            students[studentCount] = student;
            this.studentCount ++;
            System.out.println("Student " + student.getName() + " added");
        } 
    }
    public void displayAllStudents(){
        if(studentCount == 0){
            System.out.println("No students to display");
        }else{
            for(int i = 0; i < studentCount; i++){
                System.out.println(students[i].getName() + "'s info:");
                System.out.println("Name: " + students[i].getName());
                System.out.println("ID: " + students[i].getID());
                System.out.println("Grade Average: " + students[i].average());
            }
        }

    }
    
}

public class cosc113 {

    public static void main(String[] args) {
        

        int[] grade = {85,80,78};
        int[] grade2 = {92,87,75,80};
        Student stu1 = new Student("Alice",01,grade);
        Student stu2 = new Student("Bob",02,grade2);
        studentManagement management = new studentManagement();
        
        management.addStudents(stu1);
        management.addStudents(stu2);

        management.displayAllStudents();




    }

}
    
