// Author Name: Nicholas Tang
// Class ID: 212
// Assignment 2
// Repository: https://github.com/nicktang0525/cse360/tree/master/cse360assign2
// Description: This class is used to test added functionality from previous version of 
//	SimpleList

package simpleList2;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleListTest {

	@Test
    //Checks to see if constructor works properly in making a new list
    public void testSimpleList() {
        //constructor to make a new simpleList
        SimpleList testList = new SimpleList();

        //Check to see if testList is null, return "testList is null" if it is null
        assertNotNull(testList);
    }

	@Test
//	test to check if function first is working properly
	public void testFirst() {
		SimpleList testList = new SimpleList();
		
		testList.add(1);
		
		assertEquals(1, testList.first());
	}
	
	@Test
//	test to check if function first is working properly
	public void testFirstEmpty() {
		SimpleList testList = new SimpleList();
		
		assertEquals(-1, testList.first());
	}
	
	@Test
//	test to check if function last is working properly
	public void testLast() {
		SimpleList testList = new SimpleList();
		
		testList.add(1);
		testList.add(2);
		
		assertEquals(1, testList.last());
	}
	
	@Test
//	test to check if function last is working properly
	public void testLastEmpty() {
		SimpleList testList = new SimpleList();
		
		assertEquals(-1, testList.last());
	}
	
	@Test
//	test to check if function size is working properly
	public void testSizet() {
		SimpleList testList = new SimpleList();
		
		testList.add(1);
		
		assertEquals(10, testList.size());
	}
	
	@Test
//	test to check if append function is working properly
	public void testAppend() {
		SimpleList testList = new SimpleList();
		
		testList.add(1);
		testList.append(2);
		
		assertEquals("1 2", testList.toString());
	}
	
	@Test
	//test to check if new add function properly increases size of list
	public void testNewAdd() {
		SimpleList testList = new SimpleList();
		
		for(int i = 0; i < 13; i++) {
			testList.add(i);
		}
		
		assertEquals(15, testList.size());
	}
	
	@Test
	//Test to see if new remove reduces the size of the lsit
	public void testNewRemove() {
		SimpleList testList = new SimpleList();
		
		for(int i = 0; i < 8; i++) {
			testList.add(i);
		}
		
		testList.remove(1);
		testList.remove(2);
		
		assertEquals(7, testList.size());
	}
}

