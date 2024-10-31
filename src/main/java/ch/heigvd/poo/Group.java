package ch.heigvd.poo;

public class Group {
    private String orientation;
    private int id, semester;
    private Student[] students;
    private Lesson[] lesson;

    public Group(int id, String orientation, int semester) {
        this.orientation = orientation;
        this.id  = id;
        this.semester = semester;
    }

    public void addStudentToGrp(Student[] students) {
        this.students = students;

        for(Student stud : students)
            stud.setGrp(this);
    }

    public void addLesson(Lesson[] l) {
        this.lesson = l;
    }

    public String nom(){
        return orientation + id + "_" + semester;
    }

    public String schedule() {
        return "";
    }

    @Override
    public String toString(){
        return schedule();
    }
}
