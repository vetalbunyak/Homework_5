package phonebook;

import java.util.ArrayList;

public class PhoneDirectory {
    private ArrayList<Note> notes;

    public PhoneDirectory() {
        notes = new ArrayList<>();
    }

    public void add(Note newNote) {
        notes.add(newNote);
    }

    public Note find(String name) {
        for (Note note : notes) {
            if (note.getName().equalsIgnoreCase(name)) {
                return note;
            }
        }
        return null;
    }

    public ArrayList<Note> findAll(String name) {
        ArrayList<Note> findAllNumbers = new ArrayList<>();
        for (Note note : notes) {
            if (note.getName().equalsIgnoreCase(name)) {
                findAllNumbers.add(note);
            }
        }
        if (findAllNumbers.isEmpty()) {
            return null;
        } else {
            return findAllNumbers;
        }
    }
}
