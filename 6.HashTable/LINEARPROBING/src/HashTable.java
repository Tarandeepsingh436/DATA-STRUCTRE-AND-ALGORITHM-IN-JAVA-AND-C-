import java.io.*;
import java.util.*;
import java.util.ArrayList;

class HashTable{


    private DataItem[] hashArray; // array holds hash table
    private int arraySize;

    private DataItem nonItem; // for deleted items

    public HashTable(int size) // constructor
    {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1); // deleted item key is -1
    }
// -------------------------------------------------------------

    public void displayTable(){

        System.out.print("Table: ");
        for(int j=0; j<arraySize; j++){
        if(hashArray[j] != null)
            System.out.print(hashArray[j].getKey() + " ");
        else
            System.out.print(" ** ");
        }

    System.out.println("");

    }
    // -------------------------------------------------------------
    public int hashFunc(int key)
    {
    return key % arraySize; // hash function
    }

    // -------------------------------------------------------------
    public void insert(DataItem item) // insert a DataItem
    // (assumes table not full)
    {
        int key = item.getKey(); // extract key
        int hashVal = hashFunc(key); // hash the key
        // until empty cell or -1,
        while(hashArray[hashVal] != null &&  hashArray[hashVal].getKey() != -1)
        {
            ++hashVal; // go to next cell
            hashVal %= arraySize; // wraparound if necessary
        }
        hashArray[hashVal] = item; // insert item
    } // end insert()


    // -------------------------------------------------------------
    public DataItem delete(int key) // delete a DataItem
    {
        int hashVal = hashFunc(key); // hash the key
        while(hashArray[hashVal] != null) // until empty cell,
        { // found the key?
            if(hashArray[hashVal].getKey() == key){
                DataItem temp = hashArray[hashVal]; // save item
                hashArray[hashVal] = nonItem; // delete item
                return temp; // return item
            }
            ++hashVal; // go to next cell
            hashVal %= arraySize; // wraparound if necessary
        }
            return null; // can’t find item
    } // end delete()
    // -------------------------------------------------------------
    
/*
  ArrayList<MapNode<K, V> > temp = buckets;
 
        // New bucketList of double the old size is created
        buckets = new ArrayList<MapNode<K, V> >(2 * numBuckets);
 
        for (int i = 0; i < 2 * numBuckets; i++) {
            // Initialised to null
            buckets.add(null);
        }
        // Now size is made zero
        // and we loop through all the nodes in the original bucket list(temp)
        // and insert it into the new list
        size = 0;
        numBuckets *= 2;
 
        for (int i = 0; i < temp.size(); i++) {
 
            // head of the chain at that index
            MapNode<K, V> head = temp.get(i);
 
            while (head != null) {
                K key = head.key;
                V val = head.value;
 
                // calling the insert function for each node in temp
                // as the new list is now the bucketArray
                insert(key, val);
                head = head.next;
            }
        }
 
        System.out.println("\n***Rehashing Ended***\n");


*/

    public void rehash(){

        ArrayList<> temp  = hashArray;
        
        
    
    
    }





    public DataItem find(int key) // find item with key
    {
        int hashVal = hashFunc(key); // hash the key
        while(hashArray[hashVal] != null) // until empty cell,
        { // found the key?
            if(hashArray[hashVal].getKey() == key)
            return hashArray[hashVal]; // yes, return item
            ++hashVal; // go to next cell
            hashVal %= arraySize; // wraparound if necessary
        }
        return null; // can’t find item
    }
    
    // -------------------------------------------------------------
} // end class HashTable


