
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode hare = head; //fast
        ListNode turtle = head; //slow


        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
}