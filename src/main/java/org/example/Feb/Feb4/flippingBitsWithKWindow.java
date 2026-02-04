package org.example.Feb.Feb4;

import java.util.LinkedList;
import java.util.Queue;

public class flippingBitsWithKWindow {
//    [Naive Approach] Using Nested loops - O(n*k) Time and O(1) Space
//We scan the array from left to right, and whenever we see a 0, we flip the next k elements so that this 0 becomes 1.
// We keep doing this until we reach the last possible starting position. If at the end any 0 remains,
// it means it is impossible to make all elements 1; otherwise, the number of flips we made is the answer.
//
//Working:
//
//Start iterating from index 0.
//Whenever you find arr[i] == 0, flip the next k elements by XOR with 1.
//-> This ensures the current 0 becomes 1.
//Keep a counter (res) to track the number of flips performed.
//At the end, check the last (k - 1) elements. If any of them is 0, return -1 (not possible).Otherwise, return the total flips.
        static int kBitFlips(int[] arr, int k) {
            int n = arr.length;
            int res = 0;

            for (int i = 0; i < n - k + 1; i++) {
                if (arr[i] == 0) {

                    // if arr[i] = 0, flip arr[i...i+k-1]
                    for (int j = i; j < (i + k); j++)
                        arr[j] = 1 ^ arr[j];

                    res += 1;
                }
            }

            // If arr[i] is still 0, then it is impossible
            // to convert all elements to 1
            for (int i = n - k + 1; i < n; i++) {
                if (arr[i] == 0)
                    return -1;
            }

            return res;
        }

    static int kBitFlipsQueue(int[] arr, int k) {
        int n = arr.length;
        int res = 0, flag = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            if(i >= k)
                flag ^= q.poll();

            // If flag = 1, then flip the current index
            if(flag == 1)
                arr[i] ^= 1;

            // Finally, if arr[i] = 0, then we need to flip
            if(arr[i] == 0) {

                // Check if k elements are left
                if(i + k > n)
                    return -1;

                res += 1;

                // Flip flag so that upcoming elements are also flipped
                flag ^= 1;

                // If we flip, push 1 to the queue
                q.offer(1);
            }
            else {

                // If we don't flip, push 0 to queue
                q.offer(0);
            }
        }

        return res;
    }

        public static void main(String[] args) {
            int[] arr = {1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1};
            int k = 2;
            System.out.println(kBitFlips(arr, k));
            System.out.println(kBitFlips(arr, k));
        }
    }


//    [Expected Approach] Using Queue - O(n) Time and O(k) Space
//Instead of keeping a whole auxiliary array to mark flip boundaries, we use a queue of size at most k to track active
// flips. The flag variable tells whether the current element is in a flipped state. When we encounter a 0,
// we start a new flip of size k and mark it in the queue; when we move past that window,
// we remove its effect from the flag.
//
//Working:
//
//Start with res = 0 (flip count), flag = 0 (tracks if current bit is flipped), and an empty queue q.
//For each index i in the array:
//->If i >= k, remove the effect of the flip that started k steps ago (flag ^= q.front(); q.pop();).
//->If flag == 1, flip the current element (arr[i] ^= 1).
//->If arr[i] == 0, check if k elements remain; if not return -1, else increment res, toggle flag, and push 1 into q.
// else push 0 into q
//After processing all elements, return res as the minimum flips.