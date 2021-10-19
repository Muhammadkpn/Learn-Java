package repository;

import entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository {
    // import model Todolist[] dari entity
    public Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAll() {
        return data;
    }

    // Supaya lebih clean, pengecekan kapasitas model dipisah
    public boolean isFull() {
        // cek apakah model penuh?
        var isFull = true;
        for(var i = 0; i < data.length; i++){
            if(data[i] == null){
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIfFull() {
        // jika penuh, resize ukuran array menjadi 2x lipat
        if(isFull()){
            // copy data model ke dalam variable temp
            var temp = data;
            // ubah ukuran dari model string array
            data = new Todolist[data.length * 2];

            for (var i = 0; i < temp.length; i++){
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(Todolist todolist) {
        // Panggil method resizeIfFull untuk melakukan resize model jika kapasitas model sudah penuh
        resizeIfFull();

        // menambahkan data ke index yang masih bernilai null
        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todolist;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        // check error
        if (number > data.length || data[number - 1] == null){
            return false;
        } else {
            for(var i = (number - 1); i < data.length; i++){
                if (i == (data.length - 1)) {
                    // mengosongkan element terakhir dari array tsb
                    data[i] = null;
                } else {
                    // menggeser elemen ke index sebelahnya
                    data[i] = data[i+1];
                }
            }
            return true;
        }
    }
}
