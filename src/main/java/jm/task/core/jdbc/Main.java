package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Oscar", "Khonma", (byte) 150);
        userService.getAllUsers().forEach(System.out::println);
        userService.removeUserById(1);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();



    }
}
