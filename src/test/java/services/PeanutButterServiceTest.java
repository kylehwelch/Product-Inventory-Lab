package services;

import models.PeanutButter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PeanutButterServiceTest {

    @Test
    public void testPBCreate(){
        String exbrand = "jif";
        String extype = "chunky";
        int exqua = 5;
        double exprice = 4.99;

        PeanutButterService pbs = new PeanutButterService();
        PeanutButter pb = pbs.create(exbrand, extype, exqua, exprice);

        String acbrand = pb.getBrand();
        String actype = pb.getType();
        int acque = pb.getQuantity();
        double acprice = pb.getPrice();

        Assert.assertEquals(exbrand, acbrand);
        Assert.assertEquals(extype, actype);
        Assert.assertEquals(exqua, acque);
        Assert.assertEquals(exprice, acprice);
    }



}
