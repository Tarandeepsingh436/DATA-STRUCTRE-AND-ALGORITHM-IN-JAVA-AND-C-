package STACKS;


class LinkStack
{
    private LinkList2 theList;
    //--------------------------------------------------------------
    public LinkStack()             // constructor
    {
        theList = new LinkList2();
    }
    //--------------------------------------------------------------
    public void push(long j)     // put item on top of stack
    {
        theList.insertFirst(j);
    }
    //--------------------------------------------------------------
    public long pop()            // take item from top of stack
    {
        return theList.deleteFirst();
    }
    //--------------------------------------------------------------
    public boolean isEmpty()       // true if stack is empty
    {
        return ( theList.isEmpty() );
    }
    //--------------------------------------------------------------
    public void displayStack()
    {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
    //--------------------------------------------------------------
}  // end class LinkStack
