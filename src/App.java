import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class App {
    public static void main(String[] args) throws Exception {
        double[] nums = {500 
            ,3.33333e10
            ,-7893333
            ,5789.987
            ,4444.678
            ,-8377457.988
            ,2.8789898888e10
            ,8.7687634569e10
            ,564545456.5
            ,37564985.57
            ,5768439
            ,37465968.98
            ,2374859.98
            ,-376258.678
            ,387847.788
            };

        String[] words = {"hello"
            ,"manila"
            ,"United States of America"
            ,"Philippines"
            ,"Bank of the Philippine Islands"
            ,"Bank of America"
            ,"Hongkong Shanghai Bank"
            ,"United Coconut Planters Bank"
            ,"Land Bank of the Philippines"
            ,"Rizal Commercial Banking Corporation"
            ,"Rizal Cement Corporation"
            ,"Banco de Oro"
            ,"Dao Heng Bank"
            ,"ABN Amro Bank"
            ,"University of Santo Tomas"
            };
        
        // ArrayList<Integer> wordLength = new ArrayList<>();
        LinkedHashMap<String, Integer> words1 = new LinkedHashMap<>();

        //sorting numbers from least to greatest and outputting them
        Arrays.sort(nums);

        System.out.println("Sorted Numbers:");
        for(int i = nums.length - 1; i > -1; i--)
            System.out.println(nums[i]);
        
        System.out.println("-----------------------");

        //sorting words based on number of characters per word (including spaces)
        for(int i = 0; i < words.length; i++)
            words1.put(words[i], words[i].length());
        
        System.out.println("Unsorted Words and Length:");

        for(String i : words1.keySet())
            System.out.println("key: " + i + " value: " + words1.get(i));

        for(String i : words1.keySet())
        {
            Integer arrLength = words1.size();

            //passes
            for(int j = 0; j < arrLength; j++)
            {
                
            }
        }
    }
}