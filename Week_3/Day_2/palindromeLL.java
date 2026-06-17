class Solution {
    public ListNode rev(ListNode head){
        if(head==null || head.next==null) return head;
       ListNode temp=rev(head.next);
       head.next.next=head;
       head.next=null;
       return temp;
    }
    public boolean isPalindrome(ListNode head) {
         if(head==null || head.next==null) return true;
           ListNode temp1=head;
           ListNode temp2=head;
           ListNode prev=null;
           while(temp2!=null && temp2.next!=null){
            prev=temp1;
            temp1=temp1.next;
            temp2=temp2.next.next;
           }
           ListNode r=rev(temp1);
           prev.next=null;
           while(r!=null && head!=null){
            if(r.val!=head.val) return false;
            r=r.next;
           head=head.next;
           }
        return true;
    }
}