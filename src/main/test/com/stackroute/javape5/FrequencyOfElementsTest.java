package com.stackroute.javape5;

import org.junit.*;

import java.util.Map;

import static org.junit.Assert.*;

public class FrequencyOfElementsTest {
    FrequencyOfElements check;
    @Before
    public void setUp(){
        check=new FrequencyOfElements();
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


        //act
        Map result=check.frequencyOfElements("one one -one___two,,three,one @three*one?two");

        //assert
        assertEquals(Map.of("one",5,"two",2,"three",2),result);
    }

    @Test
    public void givenInput2ShouldReturnSuccessMessage(){
        //arrange


        //act
        Map result=check.frequencyOfElements("a 8b@c%a 8b-c _a 8b %a &8b#  $c a");

        //assert
        assertEquals(Map.of("a",5,"8b",4,"c",3),result);
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage(){
        //arrange


        //act
        Map result=check.frequencyOfElements(null);

        //assert
        assertNull(null,result);
    }


}