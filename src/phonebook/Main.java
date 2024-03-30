package phonebook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add(new Note("Vetal", 123456789));
        phoneDirectory.add(new Note("John", 987654321));
        phoneDirectory.add(new Note("Vetal", 222222222));
        phoneDirectory.add(new Note("Maks", 473692354));
        phoneDirectory.add(new Note("Oleh", 657482332));

        String searchName = "Vetal";
        Note findNote = phoneDirectory.find(searchName);
        if (findNote != null) {
            System.out.println("Found record for " + searchName + ": " + findNote);
        } else {
            System.out.println("No record found for " + searchName);
        }

        ArrayList<Note> fideAllNotes = phoneDirectory.findAll(searchName);
        if (findNote != null)
        {
            System.out.println("All records found for " + searchName + ":");
            for (Note note : fideAllNotes)
            {
                System.out.println(note);
            }
        }
        else {
            System.out.println("No notes found for " + searchName);
        }
    }
}
