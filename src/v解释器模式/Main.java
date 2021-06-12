package v解释器模式;

// 这种模式被用在 SQL 解析、符号处理引擎等。
public class Main {
        //规则：Robert 和 John 是男性
        private static Expression getMaleExpression(){
            Expression robert = new TerminalExpression("Robert");
            Expression john = new TerminalExpression("John");
            return new OrExpression(robert, john);
        }

        //规则：Julie 是一个已婚的女性
        private static Expression getMarriedWomanExpression(){
            Expression julie = new TerminalExpression("Julie");
            Expression married = new TerminalExpression("Married");
            return new AndExpression(julie, married);
        }

        public static void main(String[] args) {
            Expression isMale = getMaleExpression();
            Expression isMarriedWoman = getMarriedWomanExpression();

            System.out.println("John is male? " + isMale.interpret("John"));
            System.out.println("Julie is a married women? "
                    + isMarriedWoman.interpret("Married Julie"));
        }
}
