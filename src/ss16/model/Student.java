package ss16.model;

public class Student {
    private int id;
    private String name;
    private String dob;
    private String major;

    public Student(int id, String name, String dob, String major) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toCSV() {
        return id + "," + name + "," + dob + "," + major;
    }

    @Override
    public String toString() {
        return "SV {" +
                "Mã SV = " + id +
                ", Tên = '" + name + '\'' +
                ", Ngày/Tháng/Năm Sinh = '" + dob + '\'' +
                ", Chuyên ngành = '" + major + '\'' +
                '}';
    }

    public static Student fromCSV(String csvLine) {
        if (csvLine == null || csvLine.trim().isEmpty()) {
            return null;
        }

        String[] parts = csvLine.split(",");

        if (parts.length < 4) {
            System.out.println("Dòng CSV không hợp lệ: " + csvLine);
            return null;
        }

        try {
            return new Student(
                    Integer.parseInt(parts[0]),
                    parts[1].trim(),
                    parts[2].trim(),
                    parts[3].trim()
            );
        } catch (NumberFormatException e) {
            System.out.println("Lỗi định dạng ID trong CSV: " + csvLine);
            return null;
        }
    }
}