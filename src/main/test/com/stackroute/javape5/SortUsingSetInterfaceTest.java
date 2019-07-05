package com.stackroute.javape5;

import org.junit.*;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortUsingSetInterfaceTest {

    SortUsingSetInterface check;
    @Before
    public void setUp(){
        check=new SortUsingSetInterface();
    }
    @After
    public void tearDown()
    {
        check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){

    }
    @AfterClass
    public static void tearDownAfterClass()
    {

    }
    @Test
    public void givenInput1ShouldReturnSuccessMessage(){
        //arrange
        Set<String> hashSet= new HashSet<>();
        hashSet.add("Harry");
        hashSet.add("Olive");
        hashSet.add("Alice");
        hashSet.add("Bluto");
        hashSet.add("Eugene");

        //act
        String result=check.sortUsingSetInterface(hashSet);

        //assert
        assertEquals("Input Set :[Olive, Bluto, Harry, Alice, Eugene]\n" +
                "Sorted Set:[Alice, Bluto, Eugene, Harry, Olive]\n" +
                "Array List from Set:[Alice, Bluto, Eugene, Harry, Olive]",result);
    }

    @Test
    public void givenInput2ShouldReturnSuccessMessage(){
        //arrange
        Set<String> hashSet= new HashSet<>();
        hashSet.add("I");
        hashSet.add("am");
        hashSet.add("a");
        hashSet.add("java");
        hashSet.add("developer");

        //act
        String result=check.sortUsingSetInterface(hashSet);

        //assert
        assertEquals("Input Set :[a, java, I, developer, am]\n" +
                "Sorted Set:[a, am, developer, I, java]\n" +
                "Array List from Set:[a, am, developer, I, java]",result);
    }

    @Test
    public void givenInput3ShouldReturnErrorMessage(){
        //arrange

        //act
        String result=check.sortUsingSetInterface(null);

        //assert
        assertNull(null,result);
    }
}