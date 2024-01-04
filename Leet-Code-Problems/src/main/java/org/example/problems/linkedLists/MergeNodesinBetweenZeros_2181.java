package org.example.problems.linkedLists;


public class MergeNodesinBetweenZeros_2181 {

    public ListNode mergeNodes(ListNode head) {
        ListNode node = head.next;
        ListNode nn = new ListNode();
        head = nn;

        int sum = 0;
        while(node != null) {
            if(node.val == 0) {
                nn.next = new ListNode(sum);
                nn = nn.next;
                sum = 0;
            } else {
                sum += node.val;
            }
            node = node.next;
        }
        return head.next;
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        MergeNodesinBetweenZeros_2181 c = new MergeNodesinBetweenZeros_2181();
        ListNode head = new ListNode(0,
                new ListNode(3,
                        new ListNode(1,
                                new ListNode(0,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(2,
                                                                new ListNode(0))))))));

        ListNode newNode = c.mergeNodes(head);
        c.printList(newNode);



    }
}
