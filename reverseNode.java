public static Node reverseNode(Node head,int k){
        Node prev = null;
        Node current = head;
        Node next = null;

        int count=0;
        while (current != null && count<k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null) {
            head.next = reverseNode(next, k);
        }

        return prev;
    }
    public static Node reverse(Node node, int k)
    {
        return reverseNode(node,k);
    }