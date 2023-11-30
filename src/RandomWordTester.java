public class RandomWordTester
{
    public static void main(String[] args)
    {
        RandomWord rand1 = new RandomWord("zebra", "dog");

        System.out.println("EXPECTED RESULT : ");
        System.out.println("ACTUAL RESULT   : " + rand1.getNewWord());

        System.out.println("EXPECTED RESULT : [random letter from the word zebra]");
        System.out.println("ACTUAL RESULT   : " + rand1.randomLetter(1));

        System.out.println("EXPECTED RESULT : [random letter from the word dog]");
        System.out.println("ACTUAL RESULT   : " + rand1.randomLetter(2));

        System.out.println("EXPECTED RESULT : [random letter from the word zebra]");
        System.out.println("ACTUAL RESULT   : " + rand1.randomLetter(1));

        System.out.println("EXPECTED RESULT : [a word with three letters (the first letter is a random letter from the word zebra, the second letter is a random letter from the word dog, the third letter is a random letter from the word zebra]");
        System.out.println("ACTUAL RESULT   : " + rand1.getNewWord());

        rand1.resetWord();
    }
}