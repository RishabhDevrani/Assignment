package Array;

import java.util.Scanner;

public class Rain_water_trapping {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

	        int testCases = s.nextInt();
	        for (int t = 0; t < testCases; t++) {
	            int n = s.nextInt();
	            int[] heights = new int[n];

	            for (int i = 0; i < n; i++) {
	                heights[i] = s.nextInt();
	            }

	            int trappedWater = trapRainwater(heights);
	            System.out.println(trappedWater);
	        }
	    }

	    public static int trapRainwater(int[] height) {
	        int n = height.length;
	        int[] leftMax = new int[n];
	        int[] rightMax = new int[n];

	        int leftMaxSoFar = 0;
	        for (int i = 0; i < n; i++) {
	            leftMax[i] = leftMaxSoFar;
	            leftMaxSoFar = Math.max(leftMaxSoFar, height[i]);
	        }

	        int rightMaxSoFar = 0;
	        for (int i = n - 1; i >= 0; i--) {
	            rightMax[i] = rightMaxSoFar;
	            rightMaxSoFar = Math.max(rightMaxSoFar, height[i]);
	        }

	        int trappedWater = 0;
	        for (int i = 0; i < n; i++) {
	            int minWallHeight = Math.min(leftMax[i], rightMax[i]);
	            if (minWallHeight > height[i]) {
	                trappedWater += minWallHeight - height[i];
	            }
	        }

	        return trappedWater;
	}
}
