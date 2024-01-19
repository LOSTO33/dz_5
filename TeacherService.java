import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> contacts;

    public TeacherService() {

        contacts = new ArrayList<>();
    }

    public void addContact(Teacher contact) {
        contacts.add(contact);
    }

    public List<Teacher> getContacts() {
        return contacts;
    }

    public void removeContact(Teacher contact) {
        contacts.remove(contact);
    }
}
