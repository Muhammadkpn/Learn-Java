package service;

import entity.Todolist;
import repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService {
    // Akses ke database/model harus melalui repository
    private TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodolist() {
        // Akses dan manipulasi model(String array) melalui method di repository
        Todolist[] model = todolistRepository.getAll();
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++) {
            var todolist = model[i];
            var no = i + 1;

            if (todolist != null){
                System.out.println(no + ". " + todolist.getTodo());
            }
        }
    }

    @Override
    public void addTodolist(String todo) {
        Todolist todolist = new Todolist(todo);
        todolistRepository.add(todolist);
        System.out.println("SUKSES MENAMBAH TODO: " + todo);
    }

    @Override
    public void removeTodolist(Integer number) {
        // Verifikasi biasanya di service dan manipulasi di repository
        boolean success = todolistRepository.remove(number);

        if(success) {
            System.out.println("SUKSES MENGHAPUS TODO: " + number);
        } else {
            System.out.println("GAGAL MENGHAPUS TODO: " + number);
        }
    }
}
