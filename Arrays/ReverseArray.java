package Problems;

import java.util.ArrayList;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	/**
	 * Problem2: Reverse in Range
	 * 
		Problem Description
		Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].
		
		Problem Constraints
		1 <= N <= 105
		1 <= A[i] <= 109
		0 <= B <= C <= N - 1
		
		
		Input Format
		The first argument A is an array of integer.
		The second and third arguments are integers B and C
		
		Output Format
		Return the array A after reversing in the given range.
		
		
		Example Input
		
		Input 1:
		A = [1, 2, 3, 4]
		B = 2
		C = 3
		
		Input 2:
		A = [2, 5, 6]
		B = 0
		C = 2
		
		Example Output
		Output 1: [1, 2, 4, 3]
		Output 2: [6, 5, 2]
		
		Input= 1 2 3 4 5 6
		A=1, B=4
		Output= 1 5 4 3 2 6		
		
		Time=O(N) , Space=O(1)
		
		Time to Resolve: 20 mins
	 */
	public static int[] reverseArrayRange(int[] A, int B, int C)
	{
		//Reverse (not rotate i.e. set the subarray elements in reverse order) the entire subarray in the given range
		//Use elements swap from 1st to last and increment start pointer and decrement end pointer
		
		int iStartPointer=B, iEndPointer=C;
		while(iStartPointer < iEndPointer)
		{
			int temp  = A[iStartPointer];
			A[iStartPointer] = A[iEndPointer];
			A[iEndPointer] = temp;
			iStartPointer++;
			iEndPointer--;
		}
		
		return A;
	}	
	
    public static int[] reverseArray(ArrayList<Integer> arr, int m)
    {
    	
    	 // Check if M is within the valid range
        if (m < 0 || m >= arr.size() - 1) {
            System.out.println("Invalid position M");
            return null;
        }
        
        // Write your code here.
    	int index = 0;
        int[] newArray = new int[arr.size()];
        for (int element : arr) {
        	newArray[index] = element;
        	index++;
        }        

        int n = newArray.length;
        int iStartPointer = m + 1;
        int iEndPointer = n - 1;
        
        while(iStartPointer < iEndPointer)
		{
			int temp = newArray[iStartPointer];
			newArray[iStartPointer] = newArray[iEndPointer];
			newArray[iEndPointer] = temp;
			
			iStartPointer++;
			iEndPointer--;
		}

        arr = new ArrayList<>();
        for (int element : newArray) {
            arr.add(element);
        }
        
        return newArray;
    }	
}
