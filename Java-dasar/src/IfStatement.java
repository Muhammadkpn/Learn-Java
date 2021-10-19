public class IfStatement {
    public static void main(String[] args) {
        var mtk = 90;
        var kimia = 80;

        if (mtk >= 80 && kimia >= 80) {
            System.out.println("Nilai MTK dan Kimia Anda adalah A");
        } else {
            System.out.println("Silahkan Coba lagi!");
        }

        if (mtk >= 80) {
            System.out.println("Nilai MTK = A");
        } else if (mtk < 80 && mtk >= 68) {
            System.out.println("Nilai MTK = B");
        } else if (mtk < 68 && mtk >= 54) {
            System.out.println("Nilai MTK = C");
        } else if (mtk < 54 && mtk >= 42) {
            System.out.println("Nilai MTK = D");
        } else {
            System.out.println("Nilai MTK = E");
        }
    }
}
