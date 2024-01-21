public class Main {
    public static void main(String[] args) {
        TeacherService name = new TeacherService();
        TeacherView view = new TeacherView();

        TeacherController controller = new TeacherController(name, view);

        controller.run();
    }
}
