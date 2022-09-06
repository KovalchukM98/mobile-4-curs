package com.mobile.lab1;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals( m.max(2, 8), 8);
        assertEquals( m.max(4, 1), 4);
        assertEquals( m.min(2, 3), 2);
        assertEquals( m.min( 6, 3), 3);
    }
}