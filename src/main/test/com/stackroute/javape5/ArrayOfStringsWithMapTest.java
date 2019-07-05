package com.stackroute.javape5;

import org.junit.*;

import java.util.Map;

import static org.junit.Assert.*;

public class ArrayOfStringsWithMapTest {

    ArrayOfStringsWithMap check;
    @Before
    public void setUp(){
        check=new ArrayOfStringsWithMap();
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
        Map result=check.arrayOfStrings(new String[]{"a","b","c","a","a","c"});

        //assert
        assertEquals(Map.of("a",true,"b",false,"c",true),result);
    }

    @Test
    public void givenInput2ShouldReturnSuccessMessage(){
        //arrange


        //act
        Map result=check.arrayOfStrings(new String[]{"3","@","3","a","3"});

        //assert
        assertEquals(Map.of("3",true,"@",false,"a",false),result);
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage(){
        //arrange


        //act
        Map result=check.arrayOfStrings(new String[]{});

        //assert
        assertNull(null,result);
    }



}