package enum_class;

import reflection.annotation.Fancy;

@Fancy(name = "Enum", tags = {"reflection", "java"})
public enum Level {
    // Jika kita menggunakan constructor, maka opsi value enumnya harus menggunakan constructor
    STANDARD("Standar Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    // private field
    private String description;

    // Constructor tidak boleh dibuat public krn tujuan enum class bukan untuk di instansiasi secara bebas
    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
