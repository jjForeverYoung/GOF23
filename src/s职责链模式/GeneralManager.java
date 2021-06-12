package s职责链模式;

public class GeneralManager extends Manager {
    GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.getRequestType().equals("请假") && request.getNum() <= 2){
            System.out.println(name + ":" + request.getRequestContent() + "数量" + request.getNum() + "被批准");
        }else if (request.getRequestType().equals("加薪") && request.getNum() <= 500){
            System.out.println(name + ":" + request.getRequestContent() + "数量" + request.getNum() + "被批准");
        }else if (request.getRequestType().equals("加薪") && request.getNum() > 500){
            System.out.println(name + ":" + request.getRequestContent() + "数量" + request.getNum() + "再说吧");
        }
    }

}
