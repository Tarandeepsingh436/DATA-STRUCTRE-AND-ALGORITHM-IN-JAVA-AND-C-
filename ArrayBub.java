package simplesorting.Bubblesort;

class ArrayBub
{
private long[] a;                 // ref to array a
private int nElems;               // number of data items
//--------------------------------------------------------------
public ArrayBub(int max)          // constructor
   {
   a = new long[max];                 // create the array
   nElems = 0;                        // no items yet
   }
//--------------------------------------------------------------
public void insert(long value)    // put element into array
   {
   a[nElems] = value;             // insert it
   nElems++;                      // increment size
   }
//--------------------------------------------------------------
public void display()             // displays array contents
   {
   for(int j=0; j<nElems; j++)       // for each element,
      System.out.print(a[j] + " ");  // display it
   System.out.println("");
   }
//--------------------------------------------------------------
public void bubbleSort()
   {
   int out, in;

   for(out=nElems-1; out>1; out--)   // outer loop (backward)
      for(in=0; in<out; in++)        // inner loop (forward)
         if( a[in] > a[in+1] )       // out of order?
            swap(in, in+1);          // swap them
   }  // end bubbleSort()
//--------------------------------------------------------------
private void swap(int one, int two)
   {
   long temp = a[one];
   a[one] = a[two];
   a[two] = temp;
   }
//--------------------------------------------------------------
}  // end class ArrayBub

/*
Swap  1:  (2)(7) 4  2  9  5  6  1  5 
Swap  2:   2 (4)(7) 2  9  5  6  1  5 
Swap  3:   2  4 (2)(7) 9  5  6  1  5 
Swap  4:   2  4  2  7 (5)(9) 6  1  5 
Swap  5:   2  4  2  7  5 (6)(9) 1  5 
Swap  6:   2  4  2  7  5  6 (1)(9) 5 
Swap  7:   2  4  2  7  5  6  1 (5)(9)
Swap  8:   2 (2)(4) 7  5  6  1  5  9 
Swap  9:   2  2  4 (5)(7) 6  1  5  9 
Swap 10:   2  2  4  5 (6)(7) 1  5  9 
Swap 11:   2  2  4  5  6 (1)(7) 5  9 
Swap 12:   2  2  4  5  6  1 (5)(7) 9 
Swap 13:   2  2  4  5 (1)(6) 5  7  9 
Swap 14:   2  2  4  5  1 (5)(6) 7  9 
Swap 15:   2  2  4 (1)(5) 5  6  7  9 
Swap 16:   2  2 (1)(4) 5  5  6  7  9 
Swap 17:   2 (1)(2) 4  5  5  6  7  9 
Swap 18:  (1)(2) 2  4  5  5  6  7  9 
*/

