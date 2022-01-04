package TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestSampleClass {
    SampleClass sc;
    String str1, str2;
    @BeforeTest
    public void initStringsAndObjects()
    {
        sc = new SampleClass();
        str1 = "abc";
        str2 = "def";
    }
    @Test (priority = 1)
    public void testMergeStrings()
    {
        System.out.println("I'm in testMergeStrings");
        Assert.assertNotNull(sc.mergeStrings(str1, str2));
        System.out.println("Both strings are not null and have values");

        Assert.assertEquals(sc.mergeStrings(str1, str2), "abcdef");
        System.out.println("Concatenated strings without dash: " + str1 + str2);

    }

    @Test(priority = 2)
    public void testMergeStringsWithDash()
    {
        System.out.println("I'm in testMergeStringsWithDash");
        Assert.assertNotNull(sc.mergeStringsWithDash(str1, str2));
        System.out.println("Both strings are not null");

        Assert.assertEquals(sc.mergeStringsWithDash(str1, str2), "abc-def");
        System.out.println("Concatenated strings with dash: " + sc.mergeStringsWithDash(str1, str2));

        Assert.assertNotSame(sc.mergeStringsWithDash(str1, str2), "abcdef");
        System.out.println("Both strings are not identical or the same");
    }

    @AfterTest
    public void cleanup()
    {
        str1 = null;
        str2 = null;
        sc = null;
    }
}
