package m适配器模式;

// 适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
public class Main {
    public static void main(String[] args) {
        Player m = new Guards("麦迪");
        m.attack();
        m.defense();
//        Player ym = new Centers("姚明");
//
//
//        ym.attack();
//        ym.defense();
        // Translator就是一个适配器 把听中文的姚明转换成听英文的姚明
        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();

    }
}
