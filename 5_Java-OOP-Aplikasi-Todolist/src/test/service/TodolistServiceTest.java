package test.service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {
    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist() {
        /*
        Ambil data model dari entity melalui todolistRepositoryImpl, krn tidak ada default data. Maka,
        data harus ditambahkan secara manual melalui repository
         */
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();

        // Add todolist dengan method biasa melalui repository
        todolistRepository.data[0] = new Todolist("Belajar Java Dasar");
        todolistRepository.data[1] = new Todolist("Belajar Java OOP");
        todolistRepository.data[2] = new Todolist("Belajar Java Standard Classes");

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.showTodolist();
    }

    public static void testAddTodolist() {
        // Polymorphism -> bisa pake repository interface atau repository implement
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        // Polymorphism -> bisa pake service interface atau service implement
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        // add todolist dengan method yang ada di service
        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Standard Classes");

        todolistService.showTodolist();
    }

    public static void testRemoveTodolist() {
        // Deklarasi repository & service untuk mengakses entity
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        // add todolist dengan method yang ada di service
        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Standard Classes");

        todolistService.showTodolist();

        todolistService.removeTodolist(5); // remove todo ke-5 gagal, krn tidak ada di data
        todolistService.removeTodolist(2); // remove todo ke-2 sukses, krn data tersedia

        todolistService.showTodolist();

        todolistService.removeTodolist(2); // remove todo ke-2 sukses, krn todo memiliki data ke-2
        todolistService.showTodolist();

        todolistService.removeTodolist(2); // remove todo ke-2 gagal, krn todo tidak memiliki data ke-2
        todolistService.showTodolist();
    }
}
