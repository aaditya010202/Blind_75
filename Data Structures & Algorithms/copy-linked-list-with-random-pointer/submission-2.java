/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node temp= head;
        while(temp != null) {
            Node copy = new Node(temp.val);
            map.put(temp, copy);
            temp = temp.next;
        }

        for(Map.Entry<Node, Node> entry: map.entrySet()) {
            Node original = entry.getKey();
            Node copy = entry.getValue();

            Node orgNext = original.next;
            Node orgRandom = original.random;

            copy.next = map.get(orgNext);
            copy.random = map.get(orgRandom);
        }

        return map.get(head);
    }
}
