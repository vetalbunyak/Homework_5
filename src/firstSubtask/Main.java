package firstSubtask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //____________________________________________________________________________________________
        ArrayList<String> randomWords = new ArrayList<String>();
        randomWords.add("java");
        randomWords.add("fish");
        randomWords.add("tea");
        randomWords.add("java");
        randomWords.add("performance");
        randomWords.add("fish");
        randomWords.add("cat");
        randomWords.add("java");
        randomWords.add("banana");
        randomWords.add("cat");
        String wordSearch = "java";
        int count = countOccurance(randomWords, wordSearch);
        System.out.println("Word " + wordSearch + "is repeated " + count + " " +  "times in the text" );
        //____________________________________________________________________________________________

        //____________________________________________________________________________________________
        int [] array = new int[] {1,2,3};
        ArrayList<Integer> convertedArray = toList(array);
        System.out.println(convertedArray.toString());
        //____________________________________________________________________________________________

        ArrayList<Integer> randomNumber = new ArrayList<>();
        randomNumber.add(3);
        randomNumber.add(1);
        randomNumber.add(3);
        randomNumber.add(4);
        randomNumber.add(5);
        randomNumber.add(4);
        randomNumber.add(6);
        randomNumber.add(3);
        randomNumber.add(2);
        randomNumber.add(4);
        randomNumber.add(10);
        ArrayList<Integer> uniqueNumber = findUnique(randomNumber);
        System.out.println(uniqueNumber.toString());

        //-------------------------------------------------------------------------------
        calcOccurance(randomWords);
        //-------------------------------------------------------------------------------

        //-------------------------------------------------------------------------------
        ArrayList<WordOccurrence> occurrences = findOccurance(randomWords);
        for (WordOccurrence occurrence : occurrences) {
            System.out.println("{name: \"" + occurrence.getName() + "\", occurrence: " + occurrence.getOccurrence() + "}");
        }
        //-------------------------------------------------------------------------------
    }

    public static int countOccurance (ArrayList<String> randomWords, String word)
    {
        int count = 0;
        for (String i : randomWords)
        {
            if (i.equals(word))
            {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> toList(int [] array)
    {
        ArrayList<Integer> tempList = new ArrayList<>();
        for (Integer i : array)
        {
            tempList.add(i);
        }
        return tempList;
    }

    public static ArrayList<Integer> findUnique (ArrayList<Integer> randomNumber)
    {
        ArrayList<Integer> tempArray = new ArrayList<>();
        for (int i = 0; i < randomNumber.size(); i++)
        {
            int currentNumber = randomNumber.get(i);
            boolean checkUnique = true;
            for (int j = 0; j < randomNumber.size(); j++)
            {
                if (i != j && currentNumber == randomNumber.get(j))
                {
                    checkUnique = false;
                    break;
                }
            }
            if (checkUnique)
            {
                tempArray.add(currentNumber);
            }
        }
        return tempArray;
    }

    public static void calcOccurance(ArrayList<String> words) {
        ArrayList<String> repeatedWords = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i);
            int count = 0;

            for (int j = 0; j < words.size(); j++) {
                if (currentWord.equals(words.get(j))) {
                    count++;
                }
            }

            if (count > 1 && !repeatedWords.contains(currentWord)) {
                repeatedWords.add(currentWord);
            }
        }

        for (String word : repeatedWords) {
            int count = 0;
            for (String w : words) {
                if (word.equals(w)) {
                    count++;
                }
            }
            System.out.println(word + ": "  + count);
        }
    }

    public static ArrayList<WordOccurrence> findOccurance (ArrayList<String> randomWords)
    {
        ArrayList<WordOccurrence> occurrences = new ArrayList<>();

        for (String word: randomWords)
        {
            boolean checkOccurrence = false;
            for (WordOccurrence occurrence : occurrences)
            {
                if (occurrence.getName().equals(word))
                {
                    occurrence.incrementOccurrence();
                    checkOccurrence = true;
                    break;
                }
            }
            if (!checkOccurrence)
            {
                occurrences.add(new WordOccurrence(word));
            }
        }
        return occurrences;
    }
}