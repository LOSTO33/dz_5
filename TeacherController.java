import java.util.List;

public class TeacherController {
    private TeacherService model;
    private TeacherView view;

    public TeacherController(TeacherService model, TeacherView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int choice;

        do {
            view.displayContacts(model.getContacts());
            view.showMenu();
            choice = view.getUserChoice();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    changeName();
                    break;
            }
        } while (choice != 4);
    }

    private void addContact() {
        String name = view.getNameTeacher();
        String type = view.getType();
        Teacher contact = new Teacher(name, type);
        model.addContact(contact);
    }

    private void removeContact() {
        int contactNumber = view.getUserChoice() - 1;
        if (contactNumber >= 0 && contactNumber < model.getContacts().size()) {
            Teacher contactToRemove = model.getContacts().get(contactNumber);
            model.removeContact(contactToRemove);
        }
    }
    public void changeName() {
        String oldName;
        String newName;
        System.out.println("Введите ФИО учителя");
        oldName = view.scanner.nextLine();
        System.out.print("Введите Изминения: ");
        newName = view.scanner.nextLine();
        List<Teacher> lisTeach = model.getContacts();
        for (Teacher teach:lisTeach){
            if (teach.getName().equals(oldName)){
                teach.setName(newName);
            }
        }
        }
    }
