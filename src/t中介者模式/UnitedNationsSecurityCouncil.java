package t中介者模式;

public class UnitedNationsSecurityCouncil extends UnitedNations {
    private USA colleague1;
    private Iraq colleagur2;

    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleagur2(Iraq colleagur2) {
        this.colleagur2 = colleagur2;
    }

    @Override
    void declare(String message, Country colleague) {
        if(colleague == colleague1){
            colleagur2.getMessage(message);
        }else{
            colleague1.getMessage(message);
        }
    }


}
