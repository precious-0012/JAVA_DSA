public class reverseList
{
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void display(ListNode head){
        ListNode temp = head;
        if(temp==null) return;
        System.out.print(temp.val+" ");
        display(temp.next);
    }
    public static void revDisplay(ListNode head){
        ListNode temp = head;
        if(temp==null) return;
        revDisplay(temp.next);
        System.out.print(temp.val+" ");
    }
    public static ListNode recReverse(ListNode head){
        if(head.next==null) return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static ListNode reverse(ListNode head){
        ListNode newHead = null;
        ListNode curr = head;
        ListNode nextCurr = head;
        while(curr!=null){
            nextCurr = nextCurr.next;
            curr.next = newHead;
            newHead = curr;
            curr = nextCurr;
        }
        return newHead;
    }
	public static void main(String[] args) {
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(5);
		ListNode c = new ListNode(1);
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
// 		revDisplay(a);
		ListNode newHead = reverse(a); 
		display(newHead);
	}
}