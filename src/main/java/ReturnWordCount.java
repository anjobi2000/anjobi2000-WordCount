
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        if ( in == null || in.trim().isEmpty()) {
            return 0;
        }
        String[] words = in.trim().split("\\s+");
        return words.length;
    }
}
