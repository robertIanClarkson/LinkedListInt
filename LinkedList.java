public class LinkedList {
    Node head;

    /* Insert a new end node with the given 'data' */
    public void append( int data ) {
        if ( head == null ) { // First Node in Linked List
            head = new Node( data );
            return; // Dont need to run the rest of "append"
        }

        Node current = head; // set up first pointer
        while ( current.next != null ) { // walk through nodes
            current = current.next; // cycle through nodes until we find an empty node
        }
        current.next = new Node( data ); // set the empty node to our data
    }

    /* insert a new head node with the given 'data' */
    public void prepend( int data ) {
        Node newHead = new Node( data );
        newHead.next = head;
        head = newHead;
    }

    /* Delete a node with the given 'data'
        Special cases:
                1. There is no data in the list --> empty List
                2. We want to delete the head node -- > deleting the first node in the list
                3. Deleting a node that is not a head node */
    public void deleteWithValue( int data ) {
        /* Special Case 1 */
        if ( head == null ) { // there is no data in the list
            return;
        }

        /* Special Case 2 */
        if ( head.data == data ) {
            head = head.next;
            return;
        }

        /* Special Case 3 */
        Node current = head; // set up first pointer
        while ( current.next != null ) { // walk through nodes
            if ( current.next.data == data ) { // next node has the data we want to delete
                current.next = current.next.next; // walk around the node we want to delete
                return; // we have deleted the node we want so we can stop cycling through the nodes
            } else { // keep walking through the nodes
                current = current.next;
            }
        }
    }

    /* Returns if the link list contains 'data'
        Special Cases:
            1. The list is empty
            2. The head Node holds the data
            3. One of the non-head nodes holds the data */
    public boolean contains( int data ) {
        /* Special Case 1 */
        if( head == null ) {
            return false;
        } else {
            /* Special Case 2 */
            if ( head.data == data ) {
                return true;
            } else {
                /* Special Case 3 */
                Node current = head;
                while ( current.next != null ) {
                    if (current.next.data == data ) {
                        return true;
                    }
                    current = current.next;
                }
                return false;
            }
        }
    }

    /* Print from head node to last node
        Special Cases:
            1. The list is empty */
    public void printList() {
        if ( head == null ) {
            return;
        } else  {
            Node current = head;
            System.out.println( current.data );
            while ( current.next != null ) {
                current = current.next;
                System.out.println( current.data );
            }
        }
    }
}
