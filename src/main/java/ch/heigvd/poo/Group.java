package ch.heigvd.poo;

public class Group {
    private String orientation;
    private int id, semester;
    private Student[] students;
    private Lesson lesson;

    public String nom(){
        return orientation + id + "_" + semester;
    }

    public String schedule() {
        return "";
    }

    @Override
    public String toString(){
        return "";
    }
}
