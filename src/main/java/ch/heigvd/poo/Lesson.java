package ch.heigvd.poo;

public class Lesson {
    private String branch, room;
    private int weekDay, startPeriod, duration;
    private Professor prof;

    public Lesson(String branch, int weekDay, int startPeriod, int duration, String room) {
        this.branch = branch;
        this.room = room;
        this.weekDay = weekDay;
        this.startPeriod = startPeriod;
        this.duration = duration;
    }

    public String schedule(){
        return "";
    }
}
