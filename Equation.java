package cs250.ec.order;
//package ec.order;

public class Equation {
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Not enough arguments - please try again");
            return;
        }
        if (!task3(args[0], args[1])){
            System.out.println("Arguments not correct - please try again");
        }
    }

    public static Boolean task3(String num1, String num2){
        Boolean goodArgs = true;
        if (!num1.matches("-?[0-9]+") || !num2.matches("-?[0-9]+")){
            goodArgs = false;
            return goodArgs;
        }
        int x = convertCode(num1);
        int y = convertCode(num2);
        double result = 0.0;

        int mult = x * y;
        double top = Math.abs(mult);
        top = Math.log10(top);
        double topTemp = Math.pow(x, 4);
        top -= topTemp;
        double botTemp = Math.pow(mult, 2);
        double bot = Math.sqrt(botTemp);
        botTemp = Math.pow(y, 3);
        botTemp *= x;
        bot += botTemp;
        result = top / bot;

        System.out.format("f(x,y) = %.5f\n", result);
        return goodArgs;
    }

    public static int convertCode(String arg){
        int temp = 0;
        int integer = 0;
        int iter = 0;
        int pow = arg.length() - 1;
        if (arg.startsWith("-")){
            return convertCodeNeg(arg);
        }
        for (int i = iter; i < arg.length(); i++){
            temp = convertChar(arg.charAt(i));
            temp *= Math.pow(10, pow - i);
            integer += temp;
        }
        return integer;
     }

     public static int convertCodeNeg(String arg){
        int temp = 0;
        int integer = 0;
        int iter = 1;
        int pow = arg.length() - 1;
        for (int i = iter; i < arg.length(); i++){
            temp = convertChar(arg.charAt(i));
            temp *= Math.pow(10, pow - i);
            integer += temp;
        }
        integer *= -1;
        
        return integer;
     }
  
       public static int convertChar(char a){
        char[] code = new char[]{'0','1','2','3','4','5','6','7','8','9'};
        int temp = -1;
        for (int i = 0; i < code.length; i++){
           char c = code[i];
           if (a == c){
              temp = i;
           }         
       }
       return temp;
     }
}
