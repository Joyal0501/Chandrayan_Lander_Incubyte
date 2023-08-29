package Incubyte.Chandrayaan;

import  org.junit.Assert;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class RocketTestTrue 
{
    /**
     * Rigorous Test :-)
     */
	
    @Test
    public void shouldAnswerWithTrue()
    {
    	char[] command = {'f','r','u','b','l'};
    	String Expected_Direction="N";
    	int Expected_X = 0;
    	int Expected_Y = 1;
    	int Expected_Z = -1;
        Lander go = new Lander(0,0,0, "N", command);
        go.Test();
        String Direction = go.direction;
        int x = go.x;
        int y = go.y;
        int z = go.z;
        Assert.assertEquals(Expected_Direction, Direction);
        Assert.assertEquals(Expected_X, x);
        Assert.assertEquals(Expected_Y, y);
        Assert.assertEquals(Expected_Z, z);
    }
    
    
    @Test
    public void shouldAnswerWithTrue2()
    {
    	char[] command = {'l','d','l'};
    	String True_Direction="W";
        Lander go = new Lander(0,0,0,"E", command);
        go.Test();
        String Direction = go.direction;
        Assert.assertEquals(True_Direction, Direction);
    }
    @Test
    public void shouldAnswerWithTrue3()
    {
    	char[] command = {'b','l','f','d','f','r'};
    	String Expected_Direction="E";
    	int Expected_X = -1;
    	int Expected_Y = 1;
    	int Expected_Z = -1;
        Lander go = new Lander(0,0,0, "E", command);
        go.Test();
        String Direction = go.direction;
        int x = go.x;
        int y = go.y;
        int z = go.z;
        Assert.assertEquals(Expected_Direction, Direction);
        Assert.assertEquals(Expected_X, x);
        Assert.assertEquals(Expected_Y, y);
        Assert.assertEquals(Expected_Z, z);
    }
}
