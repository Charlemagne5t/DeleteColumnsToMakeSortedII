import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        String[] strs = {"ca","bb","ac"};
        int expected = 1;
        int actual = new Solution().minDeletionSize(strs);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        String[] strs = {"xc","yb","za"};
        int expected = 0;
        int actual = new Solution().minDeletionSize(strs);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        String[] strs = {"zyx","wvu","tsr"};
        int expected = 3;
        int actual = new Solution().minDeletionSize(strs);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        String[] strs = {"cktm","zqkz"};
        int expected = 0;
        int actual = new Solution().minDeletionSize(strs);

        Assert.assertEquals(expected, actual);
    }
}
