package exception.stack_trace_element;

public class StackTraceApp {
    public static void main(String[] args) {
        // Detect exception.error tunggal
        try {
            String[] name = {
                    "Muhammad", "Kiky", "PN"
            };

             System.out.println(name[100]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            // Diberikan informasi lokasi file, package, dan baris letak errornya
             throwable.printStackTrace();
        }
        System.out.println("Pemisah");

        // Detect exception.error bertingkat -> Errornya lebih detail krn step by step
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] name = {
                    "Muhammad", "Kiky", "PN"
            };

//            System.out.println(name[100]);
        } catch (Throwable throwable) {
            // Pakai RuntimException supaya tidak usah ada try-catch lagi
            throw new RuntimeException(throwable);
        }
    }
}
