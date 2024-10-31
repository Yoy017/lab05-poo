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

        Group g1 = new Group(6, "IL", 1);
        g1.addStudentToGrp(new Student[]{s1, s2, s3, s4});
        Group g2 = new Group(6, "SI", 1);
        g2.addStudentToGrp(new Student[]{s5, s6});

        g1.addLesson(new Lesson[]{l1, l2, l3});
        g2.addLesson(new Lesson[]{l1});

        Person[] arr_people = {
                p1, p2,
                s1, s2, s3, s4, s5, s6
        };
        System.out.println("-- Membres de l'école\n");
        for(Person p : arr_people) {
            System.out.println(p);
        }
        System.out.println("\n");

        System.out.println("-- Horaire du groupe IL6-1 (4 etudiants)\n");
        System.out.println(g1);

        System.out.println("-- Horaire Prof. Pier Donini (PDO)");
        System.out.println(p2.schedule());
    }
}