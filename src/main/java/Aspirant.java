public class Aspirant extends Student {

    public String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScholarship(double averageMark) {

        if (averageMark == 5) {
            return "200 грн.";
        } else {
            return "180 грн.";
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student("Олег", "Ковалёв", "Менеджмент", 5);
        Student student2 = new Student("Иван", "Забарный", "Логистика", 4.5);
        Student aspirant1 = new Aspirant("Григорий", "Королёв", "Информатика", 5, "Технологии виртуальной реальности");
        Student aspirant2 = new Aspirant("Лев", "Яшин", "Спорт", 4.9, "Тактика в футболе");

        Student[] studentsAndAspirants = {student1, student2, aspirant1, aspirant2};

        for (Student students : studentsAndAspirants) {
            System.out.println("Стипендия для " + students.lastName + " " + students.firstName + " составляет " + students.getScholarship(students.averageMark));
        }
    }
}
