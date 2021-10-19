package inner_class.local;

public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // inner class -> bisa membaca semua private acces di outer class
    public class Employee {
        private String name;

        public String getCompany() {
            return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
