package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Oscar", "Khonma", (byte) 60);
        userService.saveUser("Tanya", "Tanya", (byte) 70);
        userService.saveUser("Katya", "Guk", (byte) 50);
        userService.saveUser("Ivan", "Ivanov", (byte) 55);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();



    }
}
