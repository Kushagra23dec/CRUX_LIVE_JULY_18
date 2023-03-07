package HashMap;

import java.util.Arrays;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int[] nums = { 1 };

//		System.out.println(Arrays.toString(leftRigthDifference(nums)));

//		int m = 3;
//		String word = "998244353";
//
//		System.out.println(Arrays.toString(divisibilityArray(word, m)));

		int[] arr = {1,78,27,48,14,86,79,68,77,20,57,21,18,67,5,51,70,85,47,56,22,79,41,8,39,81,59,74,14,45,49,15,10,28,16,77,22,65,8,36,79,94,44,80,72,8,96,78,39,92,69,55,9,44,26,76,40,77,16,69,40,64,12,48,66,7,59,10};
		int[] arr2 = {42,83,48,10,24,55,9,100,10,17,17,99,51,32,16,98,99,31,28,68,71,14,64,29,15,40};
		
 
		
//		System.out.println(arr.length);
//		System.out.println("\n"+maxNumOfMarkedIndices(arr));
		
		int grid[][] = {{0,1,3,2},{5,1,2,5},{4,3,8,6}};
		
		int ans = mTime(grid,0,0,0,"");
		
		System.out.println((ans==Integer.MAX_VALUE?-1:ans));
		
	}
	
	
	
	 public static int mTime(int[][] grid,int cr, int cc,int ans,String st){
	        
	        if(cr==grid.length-1 && cc == grid[0].length-1){
	            System.out.println(st);
	            return ans;
	        }
	        
	        
	        int a = Integer.MAX_VALUE,b= Integer.MAX_VALUE;
	        
	        if(cr<grid.length-1 && (grid[cr][cc] <= grid[cr+1][cc])){
	            a  = mTime(grid,cr+1,cc,ans+1,st+"["+cr+"]-"+"["+cc+"] // ");
	        
	        }
	        
	        if(cc<grid[0].length-1 && (grid[cr][cc] <= grid[cr][cc+1]) ){
	            b  = mTime(grid,cr,cc+1,ans+1,st+"["+cr+"]-"+"["+cc+"] // ");
	        
	        }
	        
	        
	        return Math.min(a,b);
	        
	        
	        
	    }
	    
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static int maxNumOfMarkedIndices(int[] nums) {
		int ans = 0;
		List<String> check = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j) {
					continue;
				}
				
				if (!check.contains(i+"") && !check.contains(j+"") && 2 * nums[i] <= nums[j]) {
					ans += 2;
					System.out.print(i + "/" + j + " -- ");
					check.add(i+"");
					check.add(j+"");
					break;
				}
			}
		}

		for (int j = 1; j < nums.length; j++) {

			if (!check.contains(0+"") && !check.contains(j+"") && 2 * nums[0] <= nums[j]) {
				ans += 2;
				System.out.print(0 + "/" + j + " -- ");
				check.add(0+"");
				check.add(j+"");
				break;
			}
		}

		return ans;
	}

	public static int[] divisibilityArray(String word, int m) {

		List<Integer> ans = new ArrayList<>();
		Long temp = 0L;
		int mul = 0;
		for (int i = 0; i < word.length(); i++) {

			temp = temp * 10 + (word.charAt(i) - '0');

//	        	System.out.println(temp+" ");
			if (temp % m == 0) {
				ans.add(1);
			} else {
				ans.add(0);
			}

			mul++;

		}

		int[] answer = new int[ans.size()];
		int x = 0;
		for (int i : ans) {
//	        	System.out.println(i+" ");
			answer[x] = i;
			x++;
		}

		return answer;
	}

	public static int[] leftRigthDifference(int[] nums) {

		int[] left = new int[nums.length];
		// left sum
		for (int i = 1; i < nums.length; i++) {
			left[i] = nums[i - 1] + left[i - 1];
		}
		int[] right = new int[nums.length];
		// right sum
		for (int i = nums.length - 2; i >= 0; i--) {
			right[i] = nums[i + 1] + right[i + 1];

		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = Math.abs(left[i] - right[i]);
		}

		return nums;

	}

}
