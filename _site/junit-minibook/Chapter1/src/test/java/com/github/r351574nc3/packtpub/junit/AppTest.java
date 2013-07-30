package com.github.r351574nc3.packtpub.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link Foo}.
 *
 * @author user@example.com (John Doe)
 */
@RunWith(JUnit4.class)
public class AppTest {

    @Test
    public void thisAlwaysPasses() {
    }

    @Test
    public void compareIntegers() {
        assertEquals("failure - strings not same", 5l, 4l);
    }

    @Test
    @Ignore
    public void thisIsIgnored() {
    }
}