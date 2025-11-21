public class 
{
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        public static int noOfNodesInCycle(ListNode head){
            ListNode slow = head;
            ListNode fast = head;
            ListNode temp = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast) break;
            }
            if(fast==null || fast.next==null) return 0;
            while(temp!=slow){
                temp = temp.next;
                slow = slow.next;
            }
            int noOfNodes = 1;
            temp=temp.next;
            while(temp!=slow){
                noOfNodes++;
                temp = temp.next;
            }
            return noOfNodes;
        }
    }
    
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = c;
		System.out.println(ListNode.noOfNodesInCycle(a));
	}
}