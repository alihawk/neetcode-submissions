class LRUCache {
    private static class Node{
        int key;
        int value;
        Node prev; 
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private final int capacity; 

    private Map<Integer,Node> cache;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();

        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }

        Node node = cache.get(key);
        // after using it has to be put on the front


        //so we need to delete it from its current position and move it to the front to the head


       removeNode(node);
       insertAfterHead(node);
       return node.value;

    }
    
    public void put(int key, int value) {
       if(cache.containsKey(key)){
           Node existingNode = cache.get(key);
           existingNode.value = value;

           removeNode(existingNode);
           insertAfterHead(existingNode);
           return;


       }
                                  



        Node node = new Node(key,value);
        cache.put(key,node);
        insertAfterHead(node);
        if(cache.size()>capacity){
            Node lruNode = tail.prev;
            removeNode(lruNode);
            cache.remove(lruNode.key);
        }
        
    }
    private void removeNode(Node node){
       Node prevNode = node.prev;
       Node nextNode = node.next;
       prevNode.next = nextNode;
       nextNode.prev = prevNode;

    }
    private void insertAfterHead(Node node){
        Node currentFrontNode = head.next;
        node.next = currentFrontNode;
        node.prev = head;
        head.next = node;
        currentFrontNode.prev =node;
    }


}
