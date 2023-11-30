public class RandomWord
{
    private String word1;
    private String word2;
    private String newWord;

    public RandomWord(String word1, String word2)
    {
        this.word1 = word1;
        this.word2 = word2;
        this.newWord = "";
    }

    public String randomLetter(int n)
    {
        String word = "";
        String letter = "";
        if(n == 1)
        {
            word = word1;
        }
        if(n == 2)
        {
            word = word2;
        }
        int randomIndex = (int) (Math.random() * word.length());
        if(randomIndex == (word.length() - 1))
        {
            letter = word.substring(randomIndex);
        }
        if(randomIndex != (word.length() - 1))
        {
            letter = word.substring(randomIndex, randomIndex + 1);
        }
        newWord = newWord + letter;
        return letter;
    }

    public String getNewWord()
    {
        return getNewWord();
    }

    public void resetWord()
    {
        newWord = "";
    }
}