public class constructor {
    public static void main(String[] args) {

//        Constructor = A special method to initialize objects.
//                      You can pass arguments to constructors
//                      and set up initial values

        Student student = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Macharia Munene", 25, 3.9);
        Student student3 = new Student("Nailah Kagure", 12, 4.0);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gpa);
        System.out.println(student.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student.study();
        student2.study();
        student3.study();

    }
}
