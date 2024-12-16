package ss8.model;

import java.time.LocalDate;

public class Client {
    private int id;
    private String name;
    private LocalDate birthDay;
    private String address;

    public Client() {
    }

    public Client(int id, String name, LocalDate birthDay, String address) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate birthDay() {
        return birthDay;
    }

    public void setBirthday(LocalDate birthDay) {
        this.birthDay = birthDay;
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

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthDay +
                ", address='" + address + '\'' +
                '}';
    }
}
