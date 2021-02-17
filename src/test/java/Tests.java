import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    @Test
    public void FirstTest()
    {
        System.out.println("test1 executed hurray!");
        Primary primary = new Primary();
        Assert.assertEquals(primary.sumValues(1,3),4);
    }

    @Test
    public void SecondTest()
    {
        System.out.println("test2 executed hurray!");
    }
}
