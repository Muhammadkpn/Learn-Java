package test.view;

import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import util.InputUtil;
import view.TodolistView;

public class TodolistViewTest {
    public static void main(String[] args) {
        addTodolist();
    }

    public static void showTodolist() {
        /*
            FLOW
            1. Deklarasi repository untuk akses entity
            2. Deklarasi service untuk melakukan business logic yg diinginkan
            3. Deklarasi view untuk menampilkan view yg kita inginkan
         */
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        // addtodolist via service method
        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Standard Classes");

        // call view showTodolist
        todolistView.showTodolist();
    }

    public static void addTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.addTodolist();

        todolistView.showTodolist();
    }

    public static void removeTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        // addtodolist via service method
        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Standard Classes");

        // call service showTodolist to show list dari todo
        todolistService.showTodolist();

        // call view removetodolist to view menu removeTodolist
        todolistView.removeTodolist();
        todolistService.showTodolist();
    }
}
