class Solution {
 public ListNode removeNthFromEnd(ListNode head, int n) {
        int l=0;
        ListNode a=head;
        while(a!=null){
            l++;
            a=a.next;
        }
        if(l==n) return head.next;
        ListNode temp=head;
        ListNode temp2=null;
        int x=l-n;
        while(x>0){
            temp2=temp;
            temp=temp.next;
            x--;
        }
        if(temp2!=null) temp2.next=temp.next;
        temp=null;
        return head;
    }
}