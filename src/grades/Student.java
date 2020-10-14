package grades;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Ron"));
        studentList.add(new Student("Susan"));
        studentList.add(new Student("Rick"));
        studentList.add(new Student("Steve"));
        studentList.add(new Student("Vettie"));

        System.out.println("name.size() = " + studentList.size());
        System.out.println("name.get(3) = " + studentList.get(3));

        studentList.get(0).addGrade(73);
        studentList.get(0).addGrade(68);
        studentList.get(0).addGrade(90);
        studentList.get(0).addGrade(88);

        System.out.println("studentList.get(0).getGradeAverage() = " + studentList.get(0).getGradeAverage());
    }

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
}

