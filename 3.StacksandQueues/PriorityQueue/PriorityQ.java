package StacksandQueues.PriorityQueue;





class PriorityQ{
    private int maxSize;
    private long [] queArray ;
    private int nItems;

    public PriorityQ(int s) { // constructor 
        maxSize = s ;
        queArray = new long[maxSize]; 
        nItems = 0;
    }

    public void insert(long item) { // insert item 
        int j;
        if(nItems==0) 
            queArray[nItems++] = item;
        else {
            for(j=nItems-1; j>=0; j--){

                if( item > queArray[j] ) // if new item larger,
                    queArray[j+1] = queArray[j ]; // shift upward 
                    else // if smaller ,
                        break; // done shifting 
                    } // end for
        queArray[j+1] = item; // insert it 
        nItems ++;
        } // end else (nItems > 0)
        } // end insert ()

        public long remove() // remove minimum item 
            { return queArray[--nItems]; }


        public long peekMin()
            { return queArray[nItems -1]; }

        public boolean isEmpty()
            {return (nItems == 0); }

        public boolean isFull()
            {return (nItems == maxSize);}

}




