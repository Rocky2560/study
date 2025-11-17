package org.example.Nov.Nov17;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TopKElements {
    public static void main(String[] args) {
            int[] nums = {3, 1, 5, 12, 2, 11};
            int k = 3;
            System.out.println(topKLargest(nums, k)); // Output: [12, 11, 5]
        }

    private static List<Integer> topKLargest(int[] nums, int k) {

        if (nums.length < k || k<=0 || nums == null)
        {
            throw new IllegalArgumentException("Invalid Input");
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);

        for(int x: nums)
        {
            if (priorityQueue.size() < k){ priorityQueue.offer(x);}
            else if (x > priorityQueue.peek()) { priorityQueue.poll(); priorityQueue.offer(x); }
        }
        List<Integer> op = new ArrayList<>(priorityQueue);
        op.sort(Collections.reverseOrder());
        return op;


    }
}

