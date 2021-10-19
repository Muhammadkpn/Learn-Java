package service;

public interface TodolistService {
    // Business logic -> show, add, and remove todolist
    void showTodolist();
    void addTodolist(String todo);
    void removeTodolist(Integer number);
}
