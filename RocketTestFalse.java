package Incubyte.Chandrayaan;

import  org.junit.Assert;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class RocketTestFalse 
{
    /*
     * Rigorous Test :-)
     */
    
    @Test
    public void shouldAnswerWithFalse()
    {
    	char[] command = {'f','r','u','b','l'};
    	String False_Direction="E";
    	int False_X = -1;
    	int False_Y = -1;
    	int False_Z = 1;
        Lander go = new Lander(0,0,0, "N", command);
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
    
    @Test
    public void shouldAnswerWithFalse2()
    {
    	char[] command = {'l','d','l'};
    	String True_Direction="E";
        Lander go = new Lander(0,0,0,"E", command);
        go.Test();
        String Direction = go.direction;

        Assert.assertNotEquals(True_Direction, Direction);
    }
    
    @Test
    public void shouldAnswerWithFalse3()
    {
    	char[] command = {'b','l','f','d','f','r'};
    	String False_Direction="W";
    	int Expected_X = -1;
    	int Expected_Y = 1;
    	int Expected_Z = -1;
        Lander go = new Lander(0,0,0, "E", command);
        go.Test();
        String Direction = go.direction;
        int x = go.x;
        int y = go.y;
        int z = go.z;
        Assert.assertNotEquals(False_Direction, Direction);
        Assert.assertEquals(Expected_X, x);
        Assert.assertEquals(Expected_Y, y);
        Assert.assertEquals(Expected_Z, z);
    }
}
