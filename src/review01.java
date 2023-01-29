
public class review01 {

    public static void main(String[] args) {

        int nedan = 1500;
        int zei = 10;
        int result;

        result = tax(nedan, zei);

        System.out.println(nedan + "円の商品の税込価格は"
        + (nedan + result)+"円(消費税は"+ result + "円)です。");

    }
    public static int tax(int nedan, int zei) {

        int result = (int) ( nedan * zei / 100);

        return result;


    }

}
