package view;

import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import util.InputUtil;

public class TodolistView {
    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }
    // Jumlah view/page yang ada di aplikasi
    public void showTodolist() {
        while(true){
            // invoke showTodolist in todolistService
            todolistService.showTodolist();

            System.out.println("\n\nMenu: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            // import method input from InputUtil to create input in cmd
            var input = InputUtil.input("Pilih");

            if (input.equals("1")) {
                // invoke view addtodolist
                addTodolist();
            } else if (input.equals("2")) {
                // invoke view removetodolist
                removeTodolist();
            } else if (input.equals("x")) {
                System.out.println("Program Selesai. Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan Anda salah. Silahkan Coba lagi!");
            }
        }
    }

    public void addTodolist(){
        System.out.println("ADD TODOLIST");
        var addTodo = InputUtil.input("Masukkan todolist (Ketik 'x' untuk keluar)");

        if (addTodo.equals("")) {
            System.out.println("Todolist wajib diisi. Silahkan ulangi lagi!");

            // Call view addTodolist untuk kembali ke menu addTodolist
            addTodolist();
        } else if(addTodo.equals("x")) {
            System.out.println("\nProgram selesai. Terima Kasih!");
        } else {
            System.out.println("\nAnda telah berhasil menambah kegiatan ke dalam todolist.\n");
            // Call service addTodolist to execute addTodolist
            todolistService.addTodolist(addTodo);
        }
    }

    public void removeTodolist(){
        System.out.println("\nHAPUS TODOLIST");
        var number = InputUtil.input("Pilih todolist yang ingin dihapus (Ketik 'x' untuk batal)");

        if (number.equals("")) {
            System.out.println("No todolist wajib diisi. Silahkan coba lagi!");
        } else if(number.equals("x")) {
            showTodolist(); // call view showTodolist
        } else {
            todolistService.removeTodolist(Integer.valueOf(number));
        }
    }
}
