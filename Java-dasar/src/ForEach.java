public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Muhammad", "Kiky", "Prasetyo", "Nurdin"
        };

        for(var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("For Each");

        for(var item : names){
            System.out.println(item);
        }
    }
}
