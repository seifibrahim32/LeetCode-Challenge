public class MiddleofTheLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode tail = head;
            int N;
            for( N = 0; tail!=null ; tail= tail.next){
                N++;
            }
            if(N <= 1){
                return head;
            }
            ListNode currentNode = head;
            int mid  = (int) N /2;
            for(int i = 1; i <= N ; i++){
                currentNode = currentNode.next;
                if(i == mid && N % 2 == 0){
                    break;
                }
                else if(i == mid && N % 2 == 1){
                    break;
                }
            }
            return currentNode;
        }
    }
}
