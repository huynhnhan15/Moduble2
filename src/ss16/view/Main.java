package ss16.view;

import ss16.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.showMenu();
    }
}