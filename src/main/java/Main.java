import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Евгения";
        post.surname = "Шумихина";
        post.patronymic = "Дмитриевна";
        post.phone = "79046441684";
        post.passport = 888888;
        post.subscription = true;
        post.birthday.day = 22;
        post.birthday.month = 5;
        post.birthday.year = 1994;


    }
}
