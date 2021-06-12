package o组合模式;

public class Utils {
    public static String getNum(int num){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            sb.append('-');
        }
        return sb.toString();
    }
}
