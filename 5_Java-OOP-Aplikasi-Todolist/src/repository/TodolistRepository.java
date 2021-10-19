package repository;

import entity.Todolist;

public interface TodolistRepository {
    // GET all todolist
    Todolist[] getAll();

    // Add into todolist
    void add (Todolist todolist);

    // remove todolist with number of todo
    boolean remove(Integer number);
}
