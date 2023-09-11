import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;


    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<>();
        for (int i = 0; i < words.length-1; i++){
            for (int j = i+1; j < words.length; j++){
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
        // To be implemented.

    }

    public ArrayList<WordPair> getAllPairs(){
        return this.allPairs;
    }

    public int numMatches()
    {
        int match = 0;
        for (WordPair i : getAllPairs()){
            if(i.getSecond().equals(i.getFirst())){
                match++;
            }
        }
        // To be implemented.
        return match;
    }
}
