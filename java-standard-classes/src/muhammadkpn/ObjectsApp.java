package muhammadkpn;

import java.util.Objects;

public class ObjectsApp {
    public static class Data {
        private String data;

        public Data (String data){
            this.data = data;
        }
        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data1 = (Data) o;
            return Objects.equals(data, data1.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        /*
            Class Objects berbeda dengan Class Object.
            Class Objects merupakan class utility yg berisikan banyak static method yg
            bisa digunakan untuk operasi Class Object
         */
        execute(null);
        execute(new Data("Muhammadkpn"));
    }

    public static void execute(Data data) {
        // Mencegah error NullPointerException without objects
        if (data != null) {
            System.out.println(data.toString());
            System.out.println(data.hashCode());
            System.out.println("=================================");
        }

        // Jika memakai method objects tidak perlu melakukan pengecekan null, karena by default sudah dicek oleh method tsb
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
}
