package e工厂方法模式;

public class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeifeng() {
        return new Volunteer();
    }
}
