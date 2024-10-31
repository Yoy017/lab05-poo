package ch.heigvd.poo;

abstract class Person {
    private String lname, fname;

    @Override
    public String toString(){
        return lname + " " + fname;
    }
}

class Student extends Person {
    private int id;

    @Override
    public String toString(){
        return "";
    }
}

class Professor extends Person {
    private String abbreviation;
    private Lesson lesson;

    public String getAbbreviation(){
        return abbreviation;
    }

    public String schedule() {
        return "";
    }

    @Override
    public String toString(){
        return "";
    }
}