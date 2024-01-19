import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {
    // EnumSet adalah Set yang elemen datanya harus Enum
    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {
        Set<Gender> genders = EnumSet.allOf(Gender.class);
        // Set<Gender> genders = EnumSet.allOf(Gender.MALE, Gender.FEMALE, Gender.FEMALE); // Value unik -> Female jadi satu

        for (var gender : genders) {
            System.out.println(gender);
        }
    }
}
