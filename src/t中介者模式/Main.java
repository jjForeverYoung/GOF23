package t中介者模式;

public class Main {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

        USA c1 = new USA(UNSC);
        Iraq c2 = new Iraq(UNSC);

        UNSC.setColleague1(c1);
        UNSC.setColleagur2(c2);

        c1.declare("不准研制核武器，否则打爆你们屁屁");
        c2.declare("我们没有研制核武器，有种来干我");

    }
}
