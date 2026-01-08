package HashSetAndHashmap;

import java.util.HashMap;

public class MajorityElement {
    public static void majorityElements(int []nums){
        HashMap<Integer, Integer> map=new HashMap<>();
        int i=0;
        int size=nums.length;
        while(i<size){
            if(!map.containsKey(nums[i])){
                
                map.put(nums[i], 1);
            }
            else{
                
                map.put(nums[i],map.get(nums[i])+1);
            }
            i++;
        }
        ;
           
           for (int key : map.keySet()) {   
                if(map.get(key)>size/3){
                    System.out.println("number  "+map.get(key)+" has frequency "+key);
                }
            }
            
        
    }
   public static void main(String[] args) {
    int[] nums = {3,2,3,3,3};
   majorityElements(nums);
    
   } 
}
