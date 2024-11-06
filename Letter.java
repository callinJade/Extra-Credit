package cs250.ec.counting;

public class Letter {
    private char letter;
    private int count;

    public Letter(char letter, int count){
        this.letter = letter;
        this.count = count;
    }

    public void setLetter(char c){
        letter = c;
    }

    public void setCount(int i){
        count = i;
    }

    public char getLetter(){
        return letter;
    }

    public int getCount(){
        return count;
    }

    public void incrementCount(){
        count = count + 1;
    }
}
