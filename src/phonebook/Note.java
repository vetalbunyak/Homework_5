package phonebook;

public class Note {
    private String name;
    private int phoneNumber;


    public Note(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", phone number=" + phoneNumber +
                '}';
    }
}
