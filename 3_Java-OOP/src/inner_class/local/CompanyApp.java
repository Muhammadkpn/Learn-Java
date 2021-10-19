package inner_class.local;

public class CompanyApp {
    public static void main(String[] args) {
        // Instantiate in the parent class
        Company company = new Company();
        company.setName("Disulamin.aja");

        // Instantiate inner class from object parent class
        Company.Employee employee = company.new Employee();
        employee.setName("Kiky");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
