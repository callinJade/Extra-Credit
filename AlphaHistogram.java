package cs250.ec.counting;

public class AlphaHistogram {
    static char[] code = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
    static Letter a = new Letter('a', 0);
    static Letter b = new Letter('b', 0);
    static Letter c = new Letter('c', 0);
    static Letter d = new Letter('d', 0);
    static Letter e = new Letter('e', 0);
    static Letter f = new Letter('f', 0);
    static Letter g = new Letter('g', 0);
    static Letter h = new Letter('h', 0);
    static Letter i = new Letter('i', 0);
    static Letter j = new Letter('j', 0);
    static Letter k = new Letter('k', 0);
    static Letter l = new Letter('l', 0);
    static Letter m = new Letter('m', 0);
    static Letter n = new Letter('n', 0);
    static Letter o = new Letter('o', 0);
    static Letter p = new Letter('p', 0);
    static Letter q = new Letter('q', 0);
    static Letter r = new Letter('r', 0);
    static Letter s = new Letter('s', 0);
    static Letter t = new Letter('t', 0);
    static Letter u = new Letter('u', 0);
    static Letter v = new Letter('v', 0);
    static Letter w = new Letter('w', 0);
    static Letter x = new Letter('x', 0);
    static Letter y = new Letter('y', 0);
    static Letter z = new Letter('z', 0);
    static Letter[] alphabet = new Letter[]{a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};
    public static void main(String[] args) {
        if (!task2(args[0]) || args.length == 0 || args.length > 1){
            System.out.println("Arguments not correct - please try again");
        }
    }

    public static boolean isValidArgument(String arg) {
        if (!arg.startsWith("\"")) {
            return false;
        }
    
        if (!arg.endsWith("\"")) {
            return false;
        }
    
        return true;
    }

    public static Boolean task2(String str){
        int temp = 0;
        String sentence = str.toLowerCase();

        for (int ch = 0; ch < sentence.length(); ch++){
           temp = convertChar(sentence.charAt(ch), code);
           if (temp == -1){return false;}
           if (temp == 0){
            a.incrementCount();
           }
           if (temp == 1){
            b.incrementCount();
           }
           if (temp == 2){
            c.incrementCount();
           }
           if (temp == 3){
            d.incrementCount();
           }
           if (temp == 4){
            e.incrementCount();
           }
           if (temp == 5){
            f.incrementCount();
           }
           if (temp == 6){
            g.incrementCount();
           }
           if (temp == 7){
            h.incrementCount();
           }
           if (temp == 8){
            i.incrementCount();
           }
           if (temp == 9){
            j.incrementCount();
           }
           if (temp == 10){
            k.incrementCount();
           }
           if (temp == 11){
            l.incrementCount();
           }
           if (temp == 12){
            m.incrementCount();
           }
           if (temp == 13){
            n.incrementCount();
           }
           if (temp == 14){
            o.incrementCount();
           }
           if (temp == 15){
            p.incrementCount();
           }
           if (temp == 16){
            q.incrementCount();
           }
           if (temp == 17){
            r.incrementCount();
           }
           if (temp == 18){
            s.incrementCount();
           }
           if (temp == 19){
            t.incrementCount();
           }
           if (temp == 20){
            u.incrementCount();
           }
           if (temp == 21){
            v.incrementCount();
           }
           if (temp == 22){
            w.incrementCount();
           }
           if (temp == 23){
            x.incrementCount();
           }
           if (temp == 24){
            y.incrementCount();
           }
           if (temp == 25){
            z.incrementCount();
           }
        }
        
        bubbleSort(alphabet);
        printArr(alphabet);

        return true;
    }

    public static int convertChar(char a, char[] code){
        int temp = -1;
        for (int i = 0; i < code.length; i++){
           char c = code[i];
           if (a == c){
              temp = i;
           }         
       }
       return temp;
     }

     public static void bubbleSort(Letter[] arr) {
        int len = arr.length;
        int firstLet = -1;
        int secLet = -1;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j].getCount() < arr[j + 1].getCount()) {
                    Letter temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                else if (arr[j].getCount() == arr[j + 1].getCount()){
                    firstLet = convertChar(arr[j].getLetter(), code);
                    secLet = convertChar(arr[j+1].getLetter(), code);
                    if (firstLet > secLet){
                        Letter temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void printArr(Letter[] arr){
        for (Letter letter : arr){
            if (letter.getCount() > 0){
                System.out.println(letter.getLetter() + ": " + letter.getCount());
            }
        }
    }

}
