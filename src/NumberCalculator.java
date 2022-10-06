import java.util.Objects;
import java.util.Scanner;

public class NumberCalculator{
    private Number numberA;
    private Number numberB;
    private Number maxSize;
    private int choice;
    public NumberCalculator(Number mS,int c){
        this.maxSize=mS;
        this.choice=c;
    }
    public boolean checkValues(Number number){
        if(choice==1){
            try{
                int i=number.intValue();
                return i>=0 && i<=maxSize.intValue();
            }catch (Exception e){
                return false;
            }
        }
        if(choice==2){
            try{
                float i=number.floatValue();
                return i>=0 && i<=maxSize.floatValue();
            }catch (Exception e){
                return false;
            }
        }
        if(choice==3){
            try{
                double i=number.doubleValue();
                return i>=0 && i<=maxSize.doubleValue();
            }catch (Exception e){
                return false;
            }
        }
        if(choice==4){
            try{
                if(number.toString().equals("1")){
                    return true;
                }
                return number.toString().equals("0");

            }catch (Exception e){
                return false;
            }
        }
        if(choice==5){
            try{
                byte i=number.byteValue();
                return i>=0 && i<=maxSize.byteValue();
            }catch (Exception e){
                return false;
            }
        }
        if(choice==6){
            try{
                short i=number.shortValue();
                return i>=0 && i<=maxSize.shortValue();
            }catch (Exception e){
                return false;
            }
        }
        if(choice==7){
            try{
                long i=number.longValue();
                return i>=0 && i<=maxSize.longValue();
            }catch (Exception e){
                return false;
            }
        }
        return false;
    }

    public void setNumberA(Number numberA) {


        if (checkValues(numberA)) {
            this.numberA = numberA;

        }
    }

    public void setNumberB(Number numberB) {
        if ( checkValues(numberB)) {
            this.numberB = numberB;

        }

    }



    /////////////       DIVISION

    public void division(){
        if(choice==1){
            System.out.println(numberA.intValue() / numberB.intValue());
        }if(choice==2){
            System.out.println(numberA.floatValue() / numberB.floatValue());
        }
        if(choice==3){
            System.out.println(numberA.doubleValue() / numberB.doubleValue());
        }
        if(choice==4){
            System.out.println("!?\nNo such thing. Only multiplication is possible");
        }
        if(choice==5){
            System.out.println(numberA.byteValue() / numberB.byteValue());
        }
        if(choice==6){
            System.out.println((numberA.shortValue() / numberB.shortValue()));
        }
        if(choice==7){
            System.out.println(numberA.longValue() / numberB.longValue());
        }
    }

///////////         MULTIPLICATION

    public void multiplication(){
        if(choice==1){
            System.out.println(numberA.intValue() * numberB.intValue());
        }if(choice==2){
            System.out.println(numberA.floatValue() * numberB.floatValue());
        }
        if(choice==3){
            System.out.println(numberA.doubleValue() * numberB.doubleValue());
        }
        if(choice==4){
            Boolean a=null;
            Boolean b=null;
            if(numberA.toString().equals("1")){
                a=true;
            } else if (numberA.toString().equals("0")) {
                a=false;
            }
            if(numberB.toString().equals("1")){
                b=true;
            }else if (numberB.toString().equals("0")) {
                b=false;
            }
            if(a!=null && b!=null) {
                System.out.println(a & b);
            }else{
                System.out.println("!?\nEnter valid data!");
            }
        }
        if(choice==5){
            System.out.println(numberA.byteValue() * numberB.byteValue());
        }
        if(choice==6){
            System.out.println((numberA.shortValue() * numberB.shortValue()));
        }
        if(choice==7){
            System.out.println(numberA.longValue() * numberB.longValue());
        }
    }

}
