public class keywordSuper {
    public static void main(String[] args) {

        Person person = new Person("Macharia", "Munene");
        Students student = new Students("Nailah", "Kagure", 4.0);
        Employee employee = new Employee("Zerlina", "Kabura", 250000);

        student.showName();
        System.out.println(student.gpa);

        employee.showSalary();

        student.showGPA();
    }
}
