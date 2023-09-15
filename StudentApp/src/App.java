import java.util.ArrayList;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);
        // распределяем студентов по группам

        List<Student> listStud1 = new ArrayList<Student>();

        listStud1.add(s1);
        listStud1.add(s2);

        List<Student> listStud2 = new ArrayList<Student>();

        listStud2.add(s3);
        listStud2.add(s4);
        listStud2.add(s5);

        List<Student> listStud3 = new ArrayList<Student>();

        listStud3.add(s6);

        StudentGroup group5123 = new StudentGroup(listStud1, 5123);
        StudentGroup group5124 = new StudentGroup(listStud2, 5124);
        StudentGroup group5125 = new StudentGroup(listStud3, 5125);

        List<StudentGroup> listSteam1 = new ArrayList<StudentGroup>();
        listSteam1.add(group5123);

        List<StudentGroup> listSteam2 = new ArrayList<StudentGroup>();
        listSteam2.add(group5124);

        List<StudentGroup> listSteam3 = new ArrayList<StudentGroup>();
        listSteam3.add(group5125);
        // распределяем студентов по потокам

        StudentSteam steam1 = new StudentSteam(listSteam1, 1);
        StudentSteam steam2 = new StudentSteam(listSteam2, 2);
        StudentSteam steam3 = new StudentSteam(listSteam3, 3);
// выводим в консоль номер потока, номер группы и студентов
        System.out.println(steam1);
        for (StudentGroup steam : steam1) {
            System.out.println(steam);
        }
        for (Student s : group5123) {
            System.out.println(s);

        }
        System.out.println();
        System.out.println();

        System.out.println(steam2);
        for (StudentGroup steam : steam2) {
            System.out.println(steam);
        }

        for (Student s : group5124) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println();

        System.out.println(steam3);
        for (StudentGroup steam : steam3) {
            System.out.println(steam);
        }
        for (Student s : group5125) {
            System.out.println(s);
        }
         
     

  
}
}
