/* Note this node is for storing int values only */

public class LinkedListExample {
    public static void main (String[] args) {
        LinkedList myList = new LinkedList();

        int[] myNums = {1, 9, 3, 7, 2, 8, 4, 6, 0, -2};

        for (int i = 0; i < myNums.length; i++) {
            System.out.println("Index " + i + " : " + myNums[i]);
            myList.append( myNums[i] );
        }

        System.out.println( "List contains 2 : " + myList.contains( 2 ) );
        System.out.println( "List contains 22 : " + myList.contains( 22 ) );
        System.out.println( "List contains -2 : " + myList.contains( -2 ) );
        System.out.println( "List contains -22: " + myList.contains( -22 ) );

        System.out.println( "Printing List : " );
        myList.printList();

        System.out.println( "Adding new head : 22 " );
        myList.prepend(22);
        System.out.println( "Adding new head : -22 " );
        myList.prepend(-22);

        System.out.println( "Deleting : -22 ");
        myList.deleteWithValue( -22 );
        System.out.println( "Deleting : -2 ");
        myList.deleteWithValue( -2 );
        System.out.println( "Deleting : 7 ");
        myList.deleteWithValue( 7 );

        System.out.println( "List contains 2 : " + myList.contains( 2 ) );
        System.out.println( "List contains 22 : " + myList.contains( 22 ) );
        System.out.println( "List contains -2 : " + myList.contains( -2 ) );
        System.out.println( "List contains -22: " + myList.contains( -22 ) );
        System.out.println( "List contains 7: " + myList.contains( 7 ) );
        System.out.println( "List contains 1 : " + myList.contains( 1 ) );
        System.out.println( "List contains 9 : " + myList.contains( 9 ) );

        System.out.println( "Printing List : " );
        myList.printList();

    }
}
