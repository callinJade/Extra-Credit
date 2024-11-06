package cs250.ec.convert;

import java.util.ArrayList;

public class DecimalToBinary {
    public static void main(String[] args) {
        if (!task1(args[0])){
            System.out.println("Arguments not correct - please try again");
        }
    }

    public static Boolean task1(String num){
        Boolean result = true;
        Double decimal = 0.0;
        String binary = "0.";
        ArrayList<Integer> arr = convertCode(num, 2);
        decimal = arrToDec(arr);
        if (decimal == 0 || num.charAt(0) == '1' || num.contains("-")){
            result = false;
            return result;
        }
        //System.out.println(decimal);
        while (decimal > 0){
            decimal *= 2;

            if (decimal >= 1){
                binary += "1";
                decimal -= 1;
            }
            else{
                binary += "0";
            }
        }
        System.out.println(num + " -> " + binary);
        return result;
    }

    public static ArrayList<Integer> convertCode(String arg, int index){
        int temp = -1;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = index; i< arg.length(); i++){
           temp = convertChar(arg.charAt(i));
           arr.add(temp);
        }
        return arr;
     }
  
       public static int convertChar(char a){
        char[] code = new char[]{'0','1','2','3','4','5','6','7','8','9'};
        int temp = -1;
        for (int i = 0; i< code.length; i++){
           char c = code[i];
           if (a == c){
              temp = i;
           }         
       }
       return temp;
     }

     public static Double arrToDec(ArrayList<Integer> arr){
        Double temp = 0.0;
        for (int i = 0; i < arr.size(); i++){
            temp += arr.get(i)/(Math.pow(10, i+1));
        }
        return temp;
     }
}