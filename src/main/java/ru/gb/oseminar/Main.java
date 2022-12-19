package ru.gb.oseminar;

import ru.gb.oseminar.controllers.UserController;
import ru.gb.oseminar.model.*;
import ru.gb.oseminar.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.csv");
        Repository repository = new RepositoryFileCsv(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}