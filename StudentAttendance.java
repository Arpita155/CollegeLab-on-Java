package CollegeLab.SecondClass;

class Student {

    String name;
    int roll;
    int presentDays;

    Student(String name,int roll,int presentDays){
        this.name = name;
        this.roll=roll;
        this.presentDays=presentDays;
    }

    public void display(){
        System.out.println("Student "+this.name+" is present in the class "+presentDays+" Days");
    }

}

public class StudentAttendance{
    public static void main(String[] args) {
        Student s = new Student("Arpita sahoo",76,125);

        s.display();   // Student Arpita sahoo is present in the class 125 Days
    }
}
