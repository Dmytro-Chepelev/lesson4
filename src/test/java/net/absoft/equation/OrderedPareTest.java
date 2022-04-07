package net.absoft.equation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderedPareTest {

    @Test
    public void testIsEqualWithNullArgument ()
    {
        OrderedPare some = new OrderedPare (1, 2);
        Assert.assertFalse( some.isEqual(null) );
    }

    @Test
    public void testIsEqualWithCopyReverseAndOther ()
    {
        OrderedPare original = new OrderedPare (1, 2);
        OrderedPare copy = new OrderedPare (1, 2);
        OrderedPare reverse = new OrderedPare (2, 1);
        OrderedPare other = new OrderedPare (3, 4);

        Assert.assertTrue( original.isEqual(reverse)
                && original.isEqual(copy)
                && ! original.isEqual(other));
    }
}
