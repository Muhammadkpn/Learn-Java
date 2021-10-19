public class OperasiBoolean {
    public static void main(String[] args) {
        var mtk = 75;
        var kimia = 80;

        boolean lulusMtk = mtk >= 80;
        boolean lulusKimia = kimia >= 80;

        var lulus = lulusMtk && lulusKimia;
        System.out.println(lulus);
    }
}
