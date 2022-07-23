package services;

import models.Cracker;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CrackerServiceTest {

    @Test
    public void testCCreate() throws IOException {
        String exbrand = "jif";
        String extype = "chunky";
        int exqua = 5;
        double exprice = 4.99;

        CrackerService pbs = new CrackerService();
        Cracker pb = pbs.create(exbrand, extype, exqua, exprice);

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
