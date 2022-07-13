package models;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PeanutButterTest {

    @Test
    public void testSetBrand(){
        //given
        String expected = "Jif";

        //when
        PeanutButter testPeanutButter = new PeanutButter();
        testPeanutButter.setBrand(expected);

        //then
        Assert.assertEquals(expected, testPeanutButter.getBrand());

    }
    @Test
    public void testSetType(){
        //given
        String expected = "Crunchy";

        //when
        PeanutButter testPeanutButter = new PeanutButter();
        testPeanutButter.setType(expected);

        //then
        Assert.assertEquals(expected, testPeanutButter.getType());

    }
    @Test
    public void testSetQuantity(){
        //given
        int expected = 5;

        //when
        PeanutButter testPeanutButter = new PeanutButter();
        testPeanutButter.setQuantity(expected);

        //then
        Assert.assertEquals(expected, testPeanutButter.getQuantity());

    }
    @Test
    public void testSetPrice(){
        //given
        double expected = 21.01;

        //when
        PeanutButter testPeanutButter = new PeanutButter();
        testPeanutButter.setPrice(expected);

        //then
        Assert.assertEquals(expected, testPeanutButter.getPrice());

    }

}
