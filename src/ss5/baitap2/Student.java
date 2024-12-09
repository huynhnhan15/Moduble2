package ss5.baitap2;
public class Student {
    // Thuộc tính private
    private String name = "John";
    private String classes = "C02";

    // Hàm tạo không tham số
    public Student() {
    }

    // Phương thức private: setName
    private void setName(String name) {
        this.name = name;
    }

    // Phương thức private: setClasses
    private void setClasses(String classes) {
        this.classes = classes;
    }

    // Phương thức public: updateInfo
    public void updateInfo(String name, String classes) {
        this.setName(name);
        this.setClasses(classes);
    }

    // Phương thức public: getName
    public String getName() {
        return name;
    }

    // Phương thức public: getClasses
    public String getClasses() {
        return classes;
    }
}

