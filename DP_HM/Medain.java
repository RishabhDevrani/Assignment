package DP_HM;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Medain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			median(arr);
			System.out.println();
			t--;
		}
	}

	public static void median(int[] arr) {
        PriorityQueue<Integer> Left = new PriorityQueue<>(Collections.reverseOrder());
                PriorityQueue<Integer> Right = new PriorityQueue<>();

                for (int ele : arr) {
                        if (Left.isEmpty() || ele <= Left.peek()) {
                                Left.add(ele);
                        } else {
                                Right.add(ele);
                        }

                        if(Left.size()-Right.size() >1) {
                                Right.add(Left.poll());
                        }

                        if(Right.size()-Left.size() >1) {
                                Left.add(Right.poll());
                        }

                        if(Left.size()==Right.size()) {
                                System.out.print((Left.peek()+Right.peek())/2+" ");
                        }else if(Left.size()== Right.size()+1) {
                                System.out.print(Left.peek()+" ");
                        }else if(Right.size()== Left.size()+1) {
                                System.out.print(Right.peek()+" ");       
                        }
                }
	}
}
