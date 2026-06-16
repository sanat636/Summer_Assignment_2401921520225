public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode temp=head;
       ListNode temp1=head;
       while(temp1 !=null && temp1.next!=null){
        temp=temp.next;
        temp1=temp1.next.next;
        if(temp==temp1) return true;
       }
       return false;
    }
}