package com.stackroute.javape5;

import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;

public class UpdateSpecificElementTest {
    UpdateSpecificElement check;
    @Before
    public void setUp(){
        check=new UpdateSpecificElement();
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
            String result=check.updateSpecificElement(0,"Kiwi");

        //assert
        assertEquals("Input list is : [Apple, Grape, Melon, Berry]\n" +
                "Output list is: [Kiwi, Grape, Melon, Berry]\n" +
                "ArrayList after removing all elements: []",result);
    }

    @Test
    public void givenInput2ShouldSucessMessage(){
        //arrange

        //act
        String result=check.updateSpecificElement(2,"Mango");

        //assert
        assertEquals("Input list is : [Apple, Grape, Melon, Berry]\n" +
                "Output list is: [Apple, Grape, Mango, Berry]\n" +
                "ArrayList after removing all elements: []",result);
    }




}