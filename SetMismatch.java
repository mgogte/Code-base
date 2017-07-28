/*
The set S originally contains numbers from 1 to n. 
But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, 
which results in repetition of one number and loss of another number.
Given an array nums representing the data status of this set after the error. 
Your task is to firstly find the number occurs twice and then find the number that is missing. 
Return them in the form of an array.
*/

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int expected_sum = (n*(n+1))/2;
        int sum = 0;
        int rep = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i =0 ; i < n ; i++){
            
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],nums[i]);
                sum = sum + nums[i];
            }
            else {
                 rep = nums[i];
            }
        }
        System.out.println("expected sum" + expected_sum);
        System.out.println(" sum" + sum);
        System.out.println("rep" + rep);
        int[] arr = {rep,(expected_sum - sum )};
        return arr;
        
    }
}
