package l状态模式;

// 上午工作状态
public class ForenoonState extends State {

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12){
            System.out.println("当前时间:" + w.getHour() + "点，上午工作，精神百倍");
        }else{
            w.setCurrent(new NoonState());
            w.writeProgram();
        }
    }
}
