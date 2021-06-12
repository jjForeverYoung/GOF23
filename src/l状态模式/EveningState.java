package l状态模式;

// 晚间工作状态
public class EveningState extends  State {
    @Override
    public void writeProgram(Work w) {
        if (w.isFinish()){
            w.setCurrent(new RestState());
            w.writeProgram();
        } else {
            if (w.getHour() < 21){
                System.out.println("当前时间:" + w.getHour() +"点，加班疲惫至极");
            }else{
                w.setCurrent(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
