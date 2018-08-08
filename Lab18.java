import java.util.Arrays;
import java.util.HashMap;

/*Jasmine Allen
 * August 7, 2018
 * Program: B: removedAt(int index)
 * 			D: insertAt(int index, Object o)
 * 			include MyList, ArrayList, LinkedList
 * Program 2: Count the occurence of each number in the array using an array and hashmap
 */
public class Lab18 {

	public static void main(String[] args) {
		
		MyList list = new MyArrayList();
		
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.removeFromBeginning();
		list.removeFromEnd();
		
		list.insertAt(0, "Z");
		list.removeAt(0);

		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.get(1));
	
		//Program 2
		
		int [] nums = {1,2,3,2,2,4,5,5,7,8,4,4,1,0,10};
		
		Arrays.sort(nums);
		for (int k = 0; k < nums.length; k++)
		{
			System.out.print(nums[k] + " ");
		}
		System.out.println();
		
		//with array
		int [] counter = new int [nums.length];
		int index = 0;
		for (int i = 0; i < nums.length; i++)
		{ 
			//counts first occurrence
			counter[index]++;

			for (int j = i + 1 ; j < nums.length; j++)
			{ 
				//counts ever occurrence after
				if (nums[i] == nums[j]) 
				{			
					counter[index]++;
					i = j;
				}
			}
			System.out.println("[" + nums[i] + "]: " + counter[index]);
			index++;

		}

		
		//with hashmap
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        //checking every element of the array
         
        for (int number : nums) 
        {
            if(count.containsKey(number))
            {
                //If number is present in array, incrementing it's count by 1
                count.put(number, count.get(number)+1);
            }
            else
            {
                //If number is not present in count, 
                //adding this number to count with 1 as it's value
                count.put(number, 1);
            }
        }
		
        System.out.println(count);

	}

}
