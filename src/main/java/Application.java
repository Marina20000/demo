import domain.User;

public class Application {
    public static void main(String... agrs){
        User user = new User("Ivan", 20);
        int age = user.age;
        System.out.println(user);
    }
}
