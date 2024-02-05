public class MyProgram4
{
    public static void main(String[] args)
    {
        String [] words = {"chips", "dip", "pizza", "wings","cookies","doughnut", "pretzels"};
        
        // remember to store the length and value of the item with the longest name
        // if more than one item has that length, store the last value
        int length = 0;
        String name = "";
        for(String word : words){
            if(word.length() >= length){
                name = word;
                length = word.length();
            }
        }
        System.out.println("The longest word in array is " + name + " it contains " + length + " letters.");
    }
}