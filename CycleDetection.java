 class SingleLinkedListNode
     {
          int data;
          SingleLinkedListNode next;
      
   
    static boolean hasCycle(SingleLinkedListNode head) {
        if(head == null)
            return false;
        SingleLinkedListNode slowPtr = head;
        SingleLinkedListNode fastPtr = head;

        while((slowPtr != null) || (fastPtr != null) || (fastPtr.next != null)){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr)
                return true;
        
        }
        return false;
    }
     }