public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "1234 № 123456";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Петров";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 31;
        post.birthday.month = 12;
        post.birthday.year = 2022;
    }
}
