package ch.heigvd.poo;

abstract class Person {
    private String lname, fname;

    protected Person(String lname, String fname){
        this.lname = lname;
        this.fname = fname;
    }

    @Override
    public String toString(){
        return lname + " " + fname;
    }
}

class Student extends Person {
    private int id;
    private Group grp;

    public Student(String lname, String fname) {
        super(lname, fname);
    }

    protected void setGrp(Group grp){
        this.grp = grp;
    }

    @Override
    public String toString(){
        return "Etud. " + super.toString() + " (#" + id + ") - " + grp.nom();
    }
}

class Professor extends Person {
    private String abbreviation;
    private Lesson lesson;

    public Professor(String lname, String fname, String abre){
        super(lname, fname);
        this.abbreviation = abre;
    }

    public String getAbbreviation(){
        return abbreviation;
    }

    public String schedule() {
        return "";
    }

    @Override
    public String toString(){
        return "Prof. " + super.toString() + " (" + abbreviation + ")";
    }
}