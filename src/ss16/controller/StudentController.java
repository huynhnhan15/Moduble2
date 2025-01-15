package ss16.controller;

import ss16.model.Student;
import ss16.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    private final StudentService studentService;
    private final Scanner scanner;

    public StudentController() {
        studentService = new StudentService();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int choice = -1;
        do {
            System.out.println("----- Quản lý sinh viên -----");
            System.out.println("1. Thêm sinh viên ");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Cập nhật sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn một chức năng: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    handleAddStudent();
                    break;
                case 2:
                    handleDisplayStudents();
                    break;
                case 3:
                    handleUpdateStudent();
                    break;
                case 4:
                    handleDeleteStudent();
                    break;
                case 5:
                    System.out.println("Thoát khỏi chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
            System.out.println();
        } while (choice != 5);
    }

    private void handleAddStudent() {
        int id;
        do {
            id = inputIdStudent("Nhập ID sinh viên: ");
            if (studentService.getStudentByID(id) != null) {
                System.out.println("ID này đã tồn tại. Vui lòng nhập lại.");
            } else {
                break;
            }
        } while (true);

        Student student = inputDataForStudent(id);
        studentService.addStudent(student);
        System.out.println("Thêm sinh viên thành công!");
    }

    private void handleDisplayStudents() {
        List<Student> list = studentService.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            System.out.println("=== Danh sách sinh viên ===");
            for (Student student : list) {
                System.out.println(student);
            }
        }
    }

    private void handleUpdateStudent() {
        int updateId = inputIdStudent("Nhập ID cần cập nhật: ");
        Student existingStudent = studentService.getStudentByID(updateId);
        if (existingStudent != null) {
            System.out.println("Thông tin sinh viên hiện tại: " + existingStudent);
            Student updatedStudent = inputDataForStudent(updateId);
            studentService.updateStudent(updatedStudent);
            System.out.println("Cập nhật sinh viên thành công!");
        } else {
            System.out.println("ID không tồn tại.");
        }
    }

    private void handleDeleteStudent() {
        int id = inputIdStudent("Nhập ID cần xóa: ");
        boolean isSuccess = studentService.deleteStudentByID(id);
        if (isSuccess) {
            System.out.println("Đã xóa sinh viên thành công.");
        } else {
            System.out.println("Không tìm thấy ID.");
        }
    }

    private Student inputDataForStudent(int id) {
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh sinh viên (dd/mm/yyyy): ");
        String dob = scanner.nextLine();
        System.out.print("Nhập chuyên ngành sinh viên: ");
        String major = scanner.nextLine();

        return new Student(id, name, dob, major);
    }

    private int inputIdStudent(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ID không hợp lệ. Phải là một số nguyên.");
            }
        }
    }
}
