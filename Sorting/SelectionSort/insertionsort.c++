


/** This program implements and illustrates Insertion Sort - a basic sorting algorithm using an array. Insertion sort separates the array into two parts, the sorted part and the unsorted part. Then repeatedly picks an element from the unsorted part and inserts it in the sorted part. Every time the sorted part increases by one value and eventually all values are inserted in their final position in the sorted array. The algorithm stops once there are no more values in the unsorted part.
Note: The output displays the content of the array after each insertion. The value inserted at each iteration is placed inside (). */

/** More comments can be found at the end of the code. */
/** HAPPY LEARNING! */

/*************** CODE ************************/
#include<iostream>
using namespace std;

int myArray[] = {7,2,4,2,9,5,6,1,5}; /* see 1 */
int arraySize = sizeof(myArray)/sizeof(myArray[0]); /* see 2 */
void InsertionSort(); /* see 3 */
void printMyArray(int, int); /* see 4 */

int main(){

    cout << "Array values before sorting: " << endl;
    printMyArray(-1, -1); /* see 5 */
    cout << endl;

    InsertionSort(); /* see 6 */

    cout << "\nThe array has been sorted.";
    return 0;
} // end main()

void InsertionSort() { /* see 7 */
	int here, next, temp;
	printMyArray(-1, 1);
	for(next=1; next<arraySize; next++){ /* see 8 */
		temp=myArray[next];
		here = next;
		while (here>0 && myArray[here-1]>=temp){ /* see 9 */
			myArray[here] = myArray[here-1]; /* see 10 */
			here--;
		}
		myArray[here]=temp;
		printMyArray(here, next+1);
	} // end for
} // end InsertionSort()

void printMyArray(int inserted, int nextValue) { /* see 11 */
	  for(int j=0; j<arraySize; j++){
		  if(j==nextValue)
			  cout << " <-- Sorted | Unsorted --> ";
		  if(j==inserted)
			  cout << "(" << myArray[j] << ")";
		  else
			  cout << " " << myArray[j] << " ";
	  }
	  cout << endl;
}//end printMyArray()

/*************** COMMENTS ********************/
/* 1. You can add/change/delete values in this array */
/* 2. Calculating size of array for later use. */
/* 3. Function performing the sorting of values */
/* 4. Function printing the content of the array */
/* 5. Print initial state of the array */
/* 6. Call function for sorting values */
/* 7. SelectionSort() uses a nested loop to sort the values.*/
/* 8. This first (outer) loop runs n-1 times, one for each element in the array except for the first element. The sorted part of the array is initially only the first value in the array. The unsorted is everything else.*/
/* 9. This loop helps to find the position for the next value. In order to insert the new value in the already sorted part. We do this by shifting larger values right. Once all larger values are shifted, the current value is then inserted in its place.*/
/* 10. Shift values right. */
/* 11. This function prints the content of the array after each insertion. It separates the sorted part from the unsorted part. It also places in () the last inserted value. */


