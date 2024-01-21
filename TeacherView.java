
import java.util.List;
import java.util.Scanner;

public class TeacherView {
    Scanner scanner;

    public TeacherView() {

        scanner = new Scanner(System.in);
    }

    public void displayContacts(List<Teacher> contacts) {
        System.out.println("Список Учителей :");
        for (int i = 0; i < contacts.size(); i++) {
            Teacher contact = contacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " (" + contact.getType() + ")");
        }
    }

    public int getUserChoice() {
        System.out.print("Выберите контакт Учителя: ");
        return scanner.nextInt();
    }

    public String getNameTeacher(){
        System.out.print("Введите ФИО Учителя: ");
        return scanner.nextLine();
    }

    public String getType(){
        System.out.print("Введите предмет: ");
        return scanner.nextLine();
    }

    public void showMenu() {
        System.out.println("Меню:");
        System.out.println("1. Добавить контакт");
        System.out.println("2. Показать все контакты");
        System.out.println("3. Внести изминения: ");
        System.out.println("4. Выход");
    }
}
