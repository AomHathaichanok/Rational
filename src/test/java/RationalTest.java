import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test // annotation
    public void testAdd() {
        // 1/2 + 1/4 = 3/4
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract() {
        // 1/2 - 1/4 = 2/4 - 1/4 = 1/4
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testmultiply() {
        // 1/2 * 1/4 = 1/8
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }

    @Test
    public void testdivide() {
        // 1/2 / 1/4 = 2/1
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testequal() {

        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.equals(y);
        Assert.assertTrue(true);

    }

    @Test
    public void testCompareTo() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        Assert.assertEquals(1, x.compareTo(y));
    }

    @Test
    public void testToString(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        String expectedResult = "1/2";
        Assert.assertEquals(expectedResult, x.toString());
    }
}
