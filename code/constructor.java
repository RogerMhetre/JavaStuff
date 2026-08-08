public class constructor {
    public static void main(String[] args) {

        Student student1 = new Student("Roger", 17, 3.5);
        Student student2 = new Student("Juice", 21, 4.0);
        Student student3 = new Student("Drake", 39, 4.5);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        System.out.println();

        student1.study();
        student2.study();
        student3.study();
    }
}
