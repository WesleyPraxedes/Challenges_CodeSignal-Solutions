package codesignal.cap2_edge_of_the_ocean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlmostIncreasingSequence {

	public static void main(String[] args) {
        // Exemplos de uso
		System.out.println(solution(new int[] {1, 3, 2, 1})); // Output: false
        System.out.println(solution(new int[] {1, 3, 2})); // Output: true
        System.out.println(solution(new int[] {1, 2, 1, 2})); // Output: false
        System.out.println(solution(new int[] {3, 6, 5, 8, 10, 20, 15})); // Output: false
	}

	static boolean solution(int[] sequence) {
	    boolean increase = true;
	    List<Integer> list = new ArrayList<>();
	    for (int a :sequence ) 
	    {
	        list.add(a); 
	    }
	    //System.out.println(list);
	    if(list.size()==1)
	    {
	        return false;
	    }
	    for (int i = 0;i < list.size()-1 ;i++ ) 
	    {
	        if (list.get(1)<=list.get(0)) 
	        {
	            list.remove(0);
	            break;    
	        }
	        if(list.get(i+1)<=list.get(i)) 
	        {
	            if (list.get(i+1)>list.get(i-1)) 
	            {
	                list.remove(i); 
	            }
	            else
	            {
	                list.remove(i+1);
	            }
	            break;
	        } 
	    }

	    for (int i =0;i<list.size()-1 ;i++ ) 
	    {
	        if (list.get(i+1)<list.get(i) || list.get(i+1)==list.get(i) ) 
	        {
	            increase = false;
	        }    
	    }
	    return increase;
	}

}
