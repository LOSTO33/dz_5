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
            }
        } while (choice != 3);
    }

    private void addContact() {
        System.out.print("Введите ФИО Учителя: ");
        String name = view.scanner.nextLine();
        System.out.print("Введите предмет: ");
        String type = view.scanner.nextLine();
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
    public void changeContact() {
        String oldName = model.getContacts("Введите старый RJY: ");
        String newPassword = model.addContact("Введите изминения: ");

        if (oldName.equals(view.getUserChoice())) {
            model.addContact(newPassword);
            System.out.print("ФИО изменены успешно");
        } else {
        }
    }
