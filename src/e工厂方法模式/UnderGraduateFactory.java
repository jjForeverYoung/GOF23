package e工厂方法模式;

class UnderGraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeifeng() {
        return new UnderGraduate();
    }
}
