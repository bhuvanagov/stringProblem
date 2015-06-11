package test;

import static org.junit.Assert.*;

import org.junit.Test;

import string.RemoveStringInstance;

/**
Junit testing  for StringProject
 */
public class StringTest {
	@Test
	public void removeAtBeginning() {
		assertEquals("bhuvana", RemoveStringInstance.remove("Bhuvana", 'a'));
		assertEquals("Bhuvana", RemoveStringInstance.removeRecursive("Bhuvana", 'a'));
		assertEquals("Bhuvana",
				RemoveStringInstance.removeRecursive("Bhuva", 'a'));
		assertEquals("Bhuvana",
				RemoveStringInstance.removeRecursive("Bhuva", 'a'));
	}

	@Test
	public void removeAtMiddle() {
		assertEquals("Cat", RemoveStringInstance.remove("Cat", 'c'));
		assertEquals("Cat", RemoveStringInstance.removeRecursive("cat",'c'));
	}

	@Test
	public void removeAtEnd() {
		assertEquals("deepad", RemoveStringInstance.remove("deepad", 'd'));
		assertEquals("deepad", RemoveStringInstance.removeRecursive("deepad", 'd'));
	}

	

}
