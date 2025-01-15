//package ss10.service;
//import ss10.model.Student;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//
//public class StudentService implements IStudentService {
//    private static final ArrayList<Student> students = new ArrayList<>();
//
//
//    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//
//    static {
//        students.add(new Student(1, "Bùi Trung Nguyên", 21, LocalDate.parse("05/12/2003", formatter), "Gia Lai"));
//        students.add(new Student(2, "Đặng Ngọc Hoàng Thái", 21, LocalDate.parse("16/12/2003", formatter), "Quảng Nam"));
//        students.add(new Student(3, "Huỳnh Nhân", 21, LocalDate.parse("15/06/2003", formatter), "Đà Nẵng"));
//    }
//
////    @Override
//    public ArrayList<Student> findAllStudent() {
//        return students;
//    }
//
//    @Override
//    public ArrayList<Student> addStudent(Student student) {
//        students.add(student);
//        return students;
//    }
//
//    @Override
//    public ArrayList<Student> updateStudent(int id, String name, int age, LocalDate birthday, String address) {
//        for (Student student : students) {
//            if (student.getId() == id) {
//                student.setName(name);
//                student.setAge(age);
//                student.setBirthday(birthday);
//                student.setAddress(address);
//                return students;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public ArrayList<Student> deleteStudent(int id) {
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getId() == id) {
//                students.remove(i);
//                return students;
//            }
//        }
//        return null;
//    }
//}