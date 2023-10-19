public class WordGames {
    private String word;
    
    public WordGames(String initWord){
        word = initWord;
    }
    public String whisper(){
        return word.toLowerCase();
    }
    public String yell(){
        return word.toUpperCase();
    }
    public void setText(String initWord){
        word = initWord;
    }
    public String scramble(){
        int length = word.length()/2;
        return word.substring(length) + word.substring(0,length);
    }
    public String bananaSplit(int insertldx, String insertText){
        return word.substring(0, insertldx) + insertText.toUpperCase() + word.substring(insertldx, (word.length()));
    }
    public String bananaSplit(String insertChar, String insertText){
        insertText.toUpperCase();
        return word.substring(0, word.indexOf(insertChar)) + insertText.toUpperCase() + word.substring(word.indexOf(insertChar));
    }
    public String toString(){
        return "[" + word + "]";
    }
}