package v解释器模式;

public class TerminalExpression implements Expression {
    private String data;

    TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
