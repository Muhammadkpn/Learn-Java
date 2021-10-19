package encapsulation.encapsulation;

public class Category {
    // encapsulation field id & expensive agar field tsb tidak bisa diubah secara lgsg dari luar class-nya
    private String id;
    private boolean expensive;

    // auto generate getter & setter in IDE: code -> generate -> getter and setter -> OK
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null){
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
