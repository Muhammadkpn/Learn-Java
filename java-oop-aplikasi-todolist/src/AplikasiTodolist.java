public class AplikasiTodolist {
    // model adalah representasi dari state di sebuah aplikasi, seperti data.
    // Model jg bisa terdiri dari business logic
    public static String[] model = new String[10];

    // variable untuk definisi object yg mendukung input di command prompt
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodolist();
    }

    /**
     * Menampilkan todolist
     */
    public static void showTodolist() {
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodolist() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Membuat aplikasi Todolist";
        showTodolist();
    }

    /**
     * Menambahkan todolist
     */
    public static void addTodolist(String todo){
        // cek apakah model penuh?
        var isFull = true;
        for(var i = 0; i < model.length; i++){
            if(model[i] == null){
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, resize ukuran array menjadi 2x lipat
        if(isFull){
            // copy data model ke dalam variable temp
            var temp = model;
            // ubah ukuran dari model string array
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        // menambahkan data ke index yang masih bernilai null
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodolist() {
        for (var i = 0; i < 25; i++){
            addTodolist("Kegiatan ke-" + i);
        }
        showTodolist();
    }

    /**
     * Menghapus todolist
     */
    public static boolean removeTodolist(int number) {
        // check error
        if (number > model.length || model[number - 1] == null){
            return false;
        } else {
            for(var i = (number - 1); i < model.length; i++){
                if (i == (model.length - 1)) {
                    // mengosongkan element terakhir dari array tsb
                    model[i] = null;
                } else {
                    // menggeser elemen ke index sebelahnya
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodolist() {
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");

        // remove element dengan index yang lebih besar dari ukuran model
        var result = removeTodolist(20);
        System.out.println("Remove out of range: " + result);

        // remove element yang sebelumnya sudah null
        result = removeTodolist(7);
        System.out.println("Remove element null: " + result);

        // remove element yang tepat
        result = removeTodolist(2);
        System.out.println("Remove correct element: " + result);

        showTodolist();
    }

    public static String input (String info){
        // untuk menambahkan info di dalam form input
        System.out.print(info + ": ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel ");
        System.out.println(channel);
    }

    // View: Represent the presentation. Ex: User Interface
    /**
     * Menampilkan view todolist
     */
    public static void viewShowTodolist() {
        while(true){
            showTodolist();

            System.out.println("\n\nMenu: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if (input.equals("1")) {
                viewAddTodolist();
            } else if (input.equals("2")) {
                viewRemoveTodolist();
            } else if (input.equals("x")) {
                System.out.println("Program Selesai. Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan Anda salah. Silahkan Coba lagi!");
            }
        }
    }

    public static void testViewShowTodolist() {
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");

        viewShowTodolist();
    }

    /**
     * Menampilkan view addTodolist
     */
    public static void viewAddTodolist() {
        System.out.println("ADD TODOLIST");
        var addTodo = input("Masukkan todolist (Ketik 'x' untuk keluar)");

        if (addTodo.equals("")) {
            System.out.println("Todolist wajib diisi. Silahkan ulangi lagi!");
            viewAddTodolist();
        } else if(addTodo.equals("x")) {
            System.out.println("\nProgram selesai. Terima Kasih!");
        } else {
            System.out.println("\nAnda telah berhasil menambah kegiatan ke dalam todolist.\n");
            addTodolist(addTodo);
        }
    }

    public static void testViewTodolist() {
        addTodolist("Satu");
        addTodolist("Dua");

        viewAddTodolist();
        viewShowTodolist();
    }

    /**
     * Menampilkan view removeTodolist
     */
    public static void viewRemoveTodolist() {
        System.out.println("\nHAPUS TODOLIST");
        var number = input("Pilih todolist yang ingin dihapus (Ketik 'x' untuk batal)");

        if (number.equals("")) {
            System.out.println("No todolist wajib diisi. Silahkan coba lagi!");
        } else if(number.equals("x")) {
            viewShowTodolist();
        } else {
            boolean ifSuccess = removeTodolist(Integer.valueOf(number));

            if (!ifSuccess) {
                System.out.println("Gagal menghapus todolist: " + number + "\n");
            } else {
                System.out.println("\nTodolist nomer ke-" + number + " berhasil dihapus\n");
            }
        }
    }

    public static void testViewRemoveTodolist(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");

        showTodolist();

        viewRemoveTodolist();

        showTodolist();
    }
}
