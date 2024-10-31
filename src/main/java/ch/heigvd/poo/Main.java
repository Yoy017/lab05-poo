package ch.heigvd.poo;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Rossier", "Daniel", "DRE");
        Professor p2 = new Professor("Donini", "Pier", "PDO");

        Lesson l1 = new Lesson("POO", 4, 5, 90, "G01");
        Lesson l2 = new Lesson("SYE", 2, 5, 90, "B23");
        Lesson l3 = new Lesson("TIC", 5, 5, 90, "Aula");

        Student s1 = new Student("Lennon", "John");
        Student s2 = new Student("Mc Cartney", "Paul");
        Student s3 = new Student("Starr", "Ringo");
        Student s4 = new Student("Harisson", "George");
        Student s5 = new Student("Waters", "Roger");
        Student s6 = new Student("Gilmour", "David");

        Group g1 new Group(6, "IL", 1, {s1, s2, s3, s4});
        Group g2 new Group(6, "SI", 1, {s5, s6});

        g1.addLesson({l1, l2, l3});
        g2.addLesson({l1});

        System.out.println("-- Membres de l'école\n");
        Object[] arr_people = {
                p1, p2,
                s1, s2, s3, s4, s5, s6
        };

        for(Person p : arr_people) {
            System.out.println(p);
        }

        System.out.prinln(g1);
        p2.printHoraire();
    }
}