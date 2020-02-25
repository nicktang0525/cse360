// Author Name: Nicholas Tang
// Class ID: 212
// Assignment 1
// Description: Class SimpleList represents a list and has methods to add and remove elements,
//  return the number of elements, return a string of the elements in the list, and search for
//  an individual element.
package testquestion;
public class SimpleList {
    //Class Variables
    private int[] list;
    private int count;

    //constructor to make a new list
    public SimpleList() {
        //create an array of length 10 named list
        list = new int[10];
        //create an int variable to keep track of number of elements
        count = 0;
    }

    //method to add a new number to the beginning of the list and shift the others down one
    public void add(int number){
        //if count is 10, change last element to 0 and decrement count by 1
    	if(count == 10) {
    		list[9] = 0;
        	count = count - 1;
    	}
    	
    	//If list is empty, set first element to number
        if(count == 0){
            list[0] = number;
        }
        else{
            //for loop to move all of the elements up one index in the array
            for(int index = count; index > 0; index--){
                list[index] = list[index - 1];
            }
        }

        //add input to the first element in the array
        list[0] = number;

        //increase count by one since there is a new element in the list
        count = count + 1;
    }

    //method to remove a number from list and shift elements down as needed
    public void remove(int number){
        //use search method to find index of number that needs to be removed
        int indexOfNumber = search(number);

        //boolean variable to keep track of whether or not the right element has been found
        boolean found = false;

        //for loop to iterate through indices
        for(int index = 0; index < count; index++){
            //if statement to detirmine if at index of number that needs to be removed
            if(index == indexOfNumber){
                found = true;
            }

            //if at the index of number that needs to be removed
            if(found){
                //if not at the last element in the array
                if(index < 9){
                    //shift elements down an element to override number that needs to be removed
                    list[index] = list[index + 1];
                }
                else{
                    //if index is 9, set list[9] to 0 to prevent out of bounds error
                    list[index] = 0;
                }
                //if number was removed, decrease count by one
                count = count - 1;
            }
        }
    }

    //method to return the number of elements currently in the list
    public int count(){
        //return count (number of elements in the array)
        return count;
    }

    //method that returns the numbers in list as a string separated by spaces
    public String toString(){
        //return variable listToString defaults to empty String
        String listToString = "";

        //If there the list is not empty
        if(count != 0){
            //for loop to iterate through the list and the elements of list
            for(int index = 0; index < count; index++){
                //append next element to listToString
                listToString = listToString + list[index];

                //if not at last element in the list, add a space
                if(index < count - 1){
                    listToString = listToString + " ";
                }
            }
        }

        return listToString;
    }
    //search is a method that takes in an number and searches list for the index of that number
    //it will return the index that the number is at
    public int search(int number){
        //location defaults to -1 if parameter is not in the list
        int location = -1;

        //for loop to iterate through list to find desired number in list
        //if found, location = index
        for(int index = 0; index < count; index++){
            if(list[index] == number){
                location = index;
            }
        }
        return location;
    }
}