package prototype;

public class AppClient {
    public static void main(String[] args) {
        Student student = new Student("Hubert","111");
        Student cloneStudent = student.clone();

        System.out.println(cloneStudent);
    }
}
