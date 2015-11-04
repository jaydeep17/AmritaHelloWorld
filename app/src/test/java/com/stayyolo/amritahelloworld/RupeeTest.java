package com.stayyolo.amritahelloworld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RupeeTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldGetTheSameValue() throws Exception {
        Rupee c = new Rupee("ONE");
        assertEquals(Rupee.ONE, c.getValue());
    }
}