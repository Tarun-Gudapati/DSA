import java.util.PriorityQueue;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        int n = nums1.length;
        int m = nums2.length;
        int mid = 0;
        int mid2 = 0;
        int a=0;
        a=6;
        //sedkk
        boolean e = true;
        if((n+m) % 2 == 0) {
            mid2 = (n+m) / 2;
            mid = mid2 - 1;
        }
        else {
            mid = (n+m) / 2;
            e = false;
        }
        System.out.print(mid);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i < n;i++) {
            pq.add(nums1[i]);
        }
        for(int i = 0;i < m;i++) {
            pq.add(nums2[i]);
        }
        if(e) {
            for(int i = 0;i < mid;i++) {
                pq.remove();
            }
            int x = pq.remove();
            int y = pq.remove();
            ans = x+y;
            ans = ans/2;
        }
        else {
            for(int i = 0;i < mid;i++) {
                pq.remove();
            }
            ans = pq.remove();
        }
        return ans;
    }
}
