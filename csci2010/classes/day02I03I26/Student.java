package day02I03I26;

public class Student extends Person {
    private int studentNumber;

    public Student(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    public Student(String name) {
        super();
        studentNumber= 0;    
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }



    
}
