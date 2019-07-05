package com.stackroute.javape5;

import org.junit.*;

import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapElementTest {
    ModifyMapElement check;
    @Before
    public void setUp(){
        check=new ModifyMapElement();
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
        Map result=check.modifyMapElement(Map.of("val1","suchita","val2","kanchhal"));

        //assert
        assertEquals(Map.of("val1"," ","val2","suchita"),result);
    }

    @Test
    public void givenInput2ShouldSucessMessage(){
        //arrange

        //act
        Map result=check.modifyMapElement(Map.of("val1","java","val2","python"));

        //assert
        assertEquals(Map.of("val1"," ","val2","java"),result);
    }
}