import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    static ArrayList<String> wordList = new ArrayList<>();
    static ArrayList<Integer> wordLength = new ArrayList<>();
    static ArrayList<Double> nums = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Integer rowNum = 0;
        
        //reading the input file
        readTheFile();
        rowNum = wordList.size();
        
        //sorting numbers from least to greatest and outputting them
        sortNumbers();

        //sorting words based on word length (including spaces)
        sortWords();
        
        //writing sorted contents to file
        writeToTheFile(rowNum);
    }

    static void readTheFile() 
    {
        String[] lineArr = new String[] {};
        String l = "";
        Integer index = 0;
        try{
            File readFile = new File("Dela Rea-Input file.csv");
            Scanner sRead = new Scanner(readFile);
            while (sRead.hasNextLine())
            {
                l = sRead.nextLine();
                lineArr = l.split(",");
                
                nums.add(Double.parseDouble(lineArr[0]));
                wordList.add(lineArr[1]);

                index++;
            }
            sRead.close();
        } catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred while reading the file :(");
            e.printStackTrace();
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readTheFile'");
    }
    
    static void sortNumbers() 
    {
        Collections.sort(nums);

        System.out.println("Sorted Numbers:");
        for(int i = nums.size() - 1; i > -1; i--)
            System.out.println(nums.get(i));
        
        System.out.println("-----------------------\n");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortNumbers'");
    }

    static void sortWords() 
    {
        String tempValue = "";
        System.out.println("Unsorted words:");
        for(String i : wordList)
            System.out.println(i);

        //num of passes
        for(int i = 0; i < wordList.size(); i++)
        {
            //iterate thru each element
            for(int j = 0; j < wordList.size() - 1; j++)
            {
                if(wordList.get(j).length() > wordList.get(j + 1).length())
                {
                    tempValue = wordList.get(j);
                    wordList.set(j, wordList.get(j + 1));
                    wordList.set(j + 1, tempValue);

                    //create if statement for the scenario where 2 word lengths are the same, then sort alphabetically thru ASCII codes
                }
            }
        }
        
        for(String i : wordList)
            wordLength.add(i.length());

        System.out.println("\nSorted words by length:");
        for(String i : wordList)
            System.out.println(i);

        System.out.println("\nSorted word lengths:");
        for(Integer i : wordLength)
            System.out.println(i);
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortWords'");
    }

    static void writeToTheFile(Integer rowNum) 
    {
        try{
            FileWriter writeFile = new FileWriter("Dela Rea-Output file.csv");
            writeFile.write("NUMBERS:, WORDS:, LENGTH:\n");
            for(int i = 0; i < rowNum; i++)
            {
                writeFile.write(nums.get(i) + ", " + wordList.get(i) + ", " + wordLength.get(i) + "\n");
            }
            System.out.println("Successfully written contents to file!");
            writeFile.close();
        } catch (IOException e)
        {
            System.out.println("An error occurred while writing to the file :(");
            e.printStackTrace();
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeToTheFile'");
    }
}