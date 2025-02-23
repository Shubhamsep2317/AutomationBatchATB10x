package Feb.Collections;

public class Student {
    private String name;
    private int rollNumber;
    private String disciple;

    Student(String Name, int RollNumber, String Disciple){
        this.name=Name;
        this.rollNumber=RollNumber;
        this.disciple=Disciple;
    }


    public String getDisciple() {
        return disciple;
    }

    public void setDisciple(String disciple) {
        this.disciple = disciple;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", disciple='" + disciple + '\'' +
                '}';
    }
}
