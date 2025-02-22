package BeginCurs.day8;

public class Task1 {
    public static void main(String[] args) {
        long beforeStri = System.currentTimeMillis();
        stri();
        long afStri = System.currentTimeMillis();
        long time = afStri - beforeStri;
        System.out.println(" stri time: "+time);
        long beforeBild = System.currentTimeMillis();
        bild();
        long afterBild = System.currentTimeMillis();
        System.out.println(" bild time: "+(afterBild-beforeBild));

    }

    public static void stri() {
        String str = "";
        for (int i = 0; i <= 20000; i++) {
            str = str + " " + i;
        }
    }

    public static void bild() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "0";
        for (int i = 0; i <= 20000; i++) {
            str = String.valueOf(stringBuilder.append(" " + i));

        }
    }
}
