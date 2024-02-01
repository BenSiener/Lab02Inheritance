public class Student extends Person {

    private int gradeLevel;

    @Override
    public String toString() {
        return "Student{" +
                "gradeLevel=" + gradeLevel +
                '}';
    }


    public Student(String ID, String firstName, String lastName, String title, int YOB, int gradeLvl) {
        super(ID, firstName, lastName, title, YOB);
        this.gradeLevel = gradeLvl;
    }


    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
