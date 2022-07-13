package models;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CrackerTest {

    @Test
    public void testSetBrand(){
        //given
        String expected = "Graham";
        //when
        Cracker testCracker = new Cracker();
        testCracker.setBrand(expected);
        //then
        Assert.assertEquals(expected, testCracker.getBrand());
    }
    @Test
    public void testSetType(){
        //given
        String expected = "Crunchy";
        //when
        Cracker testCracker = new Cracker();
        testCracker.setType(expected);
        //then
        Assert.assertEquals(expected, testCracker.getType());
    }
    @Test
    public void testSetQuantity(){
        //given
        int expected = 5;
        //when
        Cracker testCracker = new Cracker();
        testCracker.setQuantity(expected);
        //then
        Assert.assertEquals(expected, testCracker.getQuantity());
    }
    @Test
    public void testSetPrice(){
        //given
        double expected = 21.01;
        //when
        Cracker testCracker = new Cracker();
        testCracker.setPrice(expected);
        //then
        Assert.assertEquals(expected, testCracker.getPrice());
    }

    @Test
    public void testConstructor(){
        String expBrand = "whatever";
        String expType = "also whatever";
        int expQuantity = 12;
        double expPrice = 9.99;

        Cracker cracker = new Cracker(expBrand, expType, expQuantity, expPrice);

        Assert.assertEquals(expBrand, cracker.getBrand());
        Assert.assertEquals(expType, cracker.getType());
        Assert.assertEquals(expQuantity, cracker.getQuantity());
        Assert.assertEquals(expPrice, cracker.getPrice());
    }


}
