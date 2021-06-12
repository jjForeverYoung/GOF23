package l状态模式;

// 各种状态都依赖work传过来的时间
public class Main {
    public static void main(String[] args) {
        Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(10);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(12);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(13);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(14);
        emergencyProjects.writeProgram();
        emergencyProjects.setFinish(true);
        emergencyProjects.setHour(17);
        emergencyProjects.writeProgram();

//        emergencyProjects.setFinish(false);
//        emergencyProjects.setFinish(true);


        emergencyProjects.setHour(19);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(22);
        emergencyProjects.writeProgram();
    }
}
