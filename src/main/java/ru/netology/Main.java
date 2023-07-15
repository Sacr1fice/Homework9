package ru.netology;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
                post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "1234 № 987654";
        post.phone = "+7-(990)-546-77-99";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1996;

    }
}