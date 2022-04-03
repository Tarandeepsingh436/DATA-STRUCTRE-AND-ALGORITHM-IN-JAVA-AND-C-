/** This program implements and illustrates Selection Sort - a very simple sorting algorithm using an array. Selection sort repeatedly scans the array to find the smallest value. Every time the smallest value is placed in its final position.
Note: The output displays the content of the array after each swap. The two numbers involved are placed inside (). */

/** More comments can be found at the end of the code. */
/** HAPPY LEARNING! */

/*************** CODE ************************/


#include<iostream>
#include <iomanip>
using namespace std;

int myArray[] = {7,2,4,2,9,5,6,1,5}; /* see 1 */
int arraySize = sizeof(myArray)/sizeof(myArray[0]); /* see 2 */
void SelectionSort(); /* see 3 */
void swap(int one, int two); /* see 4 */
void printMyArray(int, int); /* see 5 */

int main(){

    cout << "Array values before sorting: " << endl;
    printMyArray(-1,-1); /* see 6 */
    cout << endl;

    SelectionSort(); /* see 7 */

    cout << "\nThe array has been sorted.";
    return 0;
} // end main

void SelectionSort() { /* see 8 */
	int min;
	for(int i=0; i<arraySize-1; i++){ /* see 9 */
		min=i;
		for(int j=i+1; j<arraySize; j++) /* see 10 */
			if(myArray[j] < myArray[min])
				min=j;
		swap(i, min); /* see 11 */
	}

} // end SelectionSort

void swap(int one, int two) { /* see 12 */
	int temp = myArray[one];
	myArray[one] = myArray[two];
	myArray[two] = temp;

	static int swapCount=1;
	cout << "Swap " << setw(2) << swapCount++ <<":  ";
	printMyArray(one, two);
}// end swap

void printMyArray(int one, int two) { /* see 13 */
	  for(int j=0; j<arraySize; j++)
		  if(j==one or j==two)
			  cout << "(" << myArray[j] << ")";
		  else
			  cout << " " << myArray[j] << " ";
	  cout << endl;
}//end printMyArray()

/*************** COMMENTS ********************/
/* 1. You can add/change/delete values in this array */
/* 2. Calculating size of array for later use. */
/* 3. Function performing the sorting of values */
/* 4. Function swapping two values in the array */
/* 5. Function printing the content of the array */
/* 6. Print initial state of the array */
/* 7. Call function for sorting values */
/* 8. SelectionSort() uses a nested for loop to sort the values.*/
/* 9. This first (outer) loop runs n times, one for each element in the array. */
/* 10. This loop helps to find the smallest value in the array. It only scans the part of the array that has not been sorted already (it starts from i+1 position as i increases.).*/
/* 11. Once the scan is over and the smallest value is identified, the value is then placed in its final position by swapping the values. */
/* 12. Function swap() swaps two values in the array and keep track of the number of swaps performed. */
/* 13. This function prints the content of the array after each swap. It also places () around the values which are swapped. */