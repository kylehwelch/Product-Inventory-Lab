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

    @Test
    public void testConstructor(){
        String expBrand = "whatever";
        String expType = "also whatever";
        int expQuantity = 12;
        double expPrice = 9.99;

        PeanutButter pb = new PeanutButter(expBrand, expType, expQuantity, expPrice);

        Assert.assertEquals(expBrand, pb.getBrand());
        Assert.assertEquals(expType, pb.getType());
        Assert.assertEquals(expQuantity, pb.getQuantity());
        Assert.assertEquals(expPrice, pb.getPrice());
    }

}
