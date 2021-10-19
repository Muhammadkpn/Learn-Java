public class MethodVariableArgument {
    public static void main(String[] args) {
        // tanpa variable arguments, kita harus membuat array di dalam parameter method tsb
        int[] congratsValue = { 10, 20, 30, 100 };
        sayCongrats("Kiky", congratsValue);

        // dengan variable arguments tidak perlu membuat array di dalam parameter method tsb
        hitungAvg("Kiky", 10, 20, 30, 100);

    }

    // without variable arguments
    static void sayCongrats (String name, int[] values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var avgValue = total / values.length;

        System.out.println("Nilai rata-rata Anda adalah " + avgValue);
    }

    // with variable arguments
    static void hitungAvg (String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var avgValue = total / values.length;

        System.out.println("Nilai rata-rata Anda adalah " + avgValue);
    }
}
