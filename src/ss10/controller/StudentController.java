package ss10.controller;

import ss10.model.Student;
import ss10.service.IStudentService;
import ss10.service.StudentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    // Khởi tạo StudentService
    private static final IStudentService studentService = new StudentService();

    public static void displayClientMenu() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.println("""
                    Chọn chức năng\s
                    1. Xem danh sách
                    2. Thêm mới
                    3. Sửa
                    4. Xoá
                    5. Thoát""");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    ArrayList<Student> students = studentService.findAllStudent();
//                    ArrayList<Student> students = studentService.findAllStudent();
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;

                case 2:
                    System.out.println("Nhập id:");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.println("Nhập tên:");
                    String name = scanner.nextLine();

                    System.out.println("Nhập tuổi:");
                    int age = Integer.parseInt(scanner.nextLine());

                    System.out.println("Nhập ngày tháng năm sinh (dd/MM/yyyy):");
                    LocalDate birthDate;
                    try {
                        birthDate = LocalDate.parse(scanner.nextLine(), formatter);
                    } catch (Exception e) {
                        System.out.println("Ngày tháng không hợp lệ. Vui lòng nhập lại theo định dạng dd/MM/yyyy.");
                        break;
                    }

                    System.out.println("Nhập địa chỉ:");
                    String address = scanner.nextLine();

                    Student student = new Student(id, name, age, birthDate, address);
                    studentService.addStudent(student);
                    System.out.println("Thêm mới thành công!");
                    break;

                case 3:
                    System.out.println("Nhập id của sinh viên cần sửa:");
                    int updateId = Integer.parseInt(scanner.nextLine());

                    System.out.println("Nhập tên mới:");
                    String newName = scanner.nextLine();

                    System.out.println("Nhập tuổi mới:");
                    int newAge = Integer.parseInt(scanner.nextLine());

                    System.out.println("Nhập ngày tháng năm sinh mới (dd/MM/yyyy):");
                    LocalDate newBirthDate;
                    try {
                        newBirthDate = LocalDate.parse(scanner.nextLine(), formatter);
                    } catch (Exception e) {
                        System.out.println("Ngày tháng không hợp lệ. Vui lòng nhập lại theo định dạng dd/MM/yyyy.");
                        break;
                    }

                    System.out.println("Nhập địa chỉ mới:");
                    String newAddress = scanner.nextLine();

                    ArrayList<Student> updatedStudents = studentService.updateStudent(updateId, newName, newAge, newBirthDate, newAddress);
                    if (updatedStudents != null) {
                        System.out.println("Cập nhật thành công!");
                    } else {
                        System.out.println("Không tìm thấy sinh viên có id: " + updateId);
                    }
                    break;

                case 4:
                    System.out.println("Nhập id của sinh viên cần xóa:");
                    int deleteId = Integer.parseInt(scanner.nextLine());

                    ArrayList<Student> remainingStudents = studentService.deleteStudent(deleteId);
                    if (remainingStudents != null) {
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Không tìm thấy sinh viên có id: " + deleteId);
                    }
                    break;

                case 5:
                    System.out.println("-------- Kết thúc chương trình --------");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}