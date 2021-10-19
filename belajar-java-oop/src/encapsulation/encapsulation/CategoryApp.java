package encapsulation.encapsulation;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID");
        category.setId(null);
        // category.id(null); // exception.error -> krn access modifier field id private. Jd, untuk mengubah field id harus melalui setId()

        System.out.println(category.getId()); // result: ID. Krn ada proses validasi dalam mengubah field Id
    }
}
