package LowArray;


class LowArray
{
private long[] a;                 // ref to array a
//--------------------------------------------------------------
public LowArray(int size)         // constructor
   { a = new long[size]; }        // create array
//--------------------------------------------------------------
public void setElem(int index, long value)     // set value
   { a[index] = value; }
//--------------------------------------------------------------
public long getElem(int index)              // get value
   { return a[index]; }
//--------------------------------------------------------------
}  // end class LowArray





