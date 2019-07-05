package com.stackroute.javape5;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MaintestTest {
    Maintest check;

    @Before
    public void setUp() {
        check = new Maintest();
    }

    @After
    public void tearDown() {
        check = null;
    }

    @BeforeClass
    public static void setUpBeforeClass() {

    }

    @AfterClass
    public static void tearDownAfterClass() {

    }

    @Test
    public void givenInput1ShouldReturnSuccessMessage() {
        //arrange
        Student student1 = new Student("Ritik", 24, 56);
        Student student2 = new Student("Ashish", 23, 28);
        Student student3 = new Student("Raman", 20, 87);
        Student student4 = new Student("Divya", 30, 62);
        Student student5 = new Student("Ashish", 23, 19);
        List<Student> expected = new ArrayList<>();
        expected.add(student4);
        expected.add(student1);
        expected.add(student2);
        expected.add(student5);
        expected.add(student3);
        //act
        List<Student> result = check.maintest(student1,student2,student3,student4,student5);

        //assert
        assertEquals(expected, result);
    }

    @Test
    public void givenInput2ShouldReturnSuccessMessage() {
        //arrange
        Student student1 = new Student("Shivangi", 23, 33);
        Student student2 = new Student("Ashish", 24, 58);
        Student student3 = new Student("Riya", 22, 87);
        Student student4 = new Student("Piya", 34, 26);
        Student student5 = new Student("Tia", 28, 19);
        List<Student> expected = new ArrayList<>();
        expected.add(student4);
        expected.add(student5);
        expected.add(student2);
        expected.add(student1);
        expected.add(student3);
        //act
        List<Student> result = check.maintest(student1,student2,student3,student4,student5);

        //assert
        assertEquals(expected, result);
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage() {
        //arrange
        Student student1 = new Student("Ravi", 23, 33);
        Student student2 = new Student("Megha", 23, 58);
        Student student3 = new Student("Babita", 23, 87);
        Student student4 = new Student("Piya", 23, 26);
        Student student5 = new Student("Arya", 23, 19);
        List<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student4);
        expected.add(student2);
        expected.add(student3);
        expected.add(student5);
        //act
        List<Student> result = check.maintest(student1,student2,student3,student4,student5);

        //assert
        assertEquals(expected, result);
    }

    @Test
    public void givenInput4ShouldReturnSuccessMessage() {
        //arrange
        Student student1 = new Student(" ", 23, 33);
        Student student2 = new Student(" ", 23, 58);
        Student student3 = new Student("Riya", 22, 87);
        Student student4 = new Student("Piya", 34, 26);
        Student student5 = new Student("Tia", 28, 19);
        List<Student> expected = new ArrayList<>();
        expected.add(student4);
        expected.add(student5);
        expected.add(student1);
        expected.add(student2);
        expected.add(student3);
        //act
        List<Student> result = check.maintest(student1,student2,student3,student4,student5);

        //assert
        assertNotEquals(expected, result);
    }



}