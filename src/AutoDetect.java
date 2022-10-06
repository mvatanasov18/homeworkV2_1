import java.util.Scanner;

public class AutoDetect {
    private String expression;

    public AutoDetect(){
        setExpression();
    }

    public void setExpression() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an expression: ");
        this.expression = scan.nextLine();
    }
    public void printResult(){
        String exp="";
        for(int i=0;i<expression.length();i++){
            if(!(expression.charAt(i)==' ')){
                exp+=expression.charAt(i);
            }
        }
    }

    public String getExpression() {
        return expression;
    }
}
