package Incubyte.Chandrayaan;

import  org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class InvalidTest 
{
    /**
     * Rigorous Test :-)
     */
    
    @Test(expected=NullPointerException.class)
    public void shouldAnswerWithFalse()
    {
    	char[] command = {'f','r','u','b','l'};
    	String False_Direction="p";
    	int False_X = -1;
    	int False_Y = -1;
    	int False_Z = 1;
        Lander go = new Lander(0,0,0, " ", command);
        go.Test();
        String Direction = go.direction;
        int x = go.x;
        int y = go.y;
        int z = go.z;
        Assert.assertNotEquals(False_Direction, Direction);
        Assert.assertNotEquals(False_X, x);
        Assert.assertNotEquals(False_Y, y);
        Assert.assertNotEquals(False_Z, z);
    }
    @Test(expected=NullPointerException.class)
    public void shouldAnswerWithFalse2()
    {
    	char[] command = {'x'};
    	String False_Direction=" ";
        Lander go = new Lander(0,0,0, "N", command);
        go.Test();
        String Direction = go.direction;
        Assert.assertNotEquals(False_Direction, Direction);
    }
}
