class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head, temp1=head;
        while(temp!=null && temp1!=null && temp1.next!=null){
            temp=temp.next;
            temp1=temp1.next.next;
        }
        return temp;
    }
}