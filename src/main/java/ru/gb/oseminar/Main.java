package ru.gb.oseminar;
import ru.gb.oseminar.controller.UserController;

public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController();
        controller.createTeacher("Alisa", "Syaribzhanova", "Igorevna");
        controller.createStudent("Ivan", "Ivanov", "Ivanovich");
        controller.createStudent("Anna", "Petrova", "Sergeevna");
        controller.createStudent("Vladislav", "Vadinov", "Anatolievich");

        controller.createStudyGroup();
    }
}