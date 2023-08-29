class Lander{
    char[] move;
    int x,y,z;
    char direction;

    Lander(int x, int y, int z, char dir, char[] move)
    {
        this.x= x;
        this.y = y;
        this.z = z;
        this.direction= dir;
        this.move = move;
    }
    void moveForward(){

    }
    void moveBackward(){

    }
    void turnLeft(){

    }
    void turnRight(){

    }
    void turnUp()
    {

    }
    void turnDown()
    {

    }
    void Test(){

        System.out.println(move);
        System.out.println(x+""+y+""+z);
        System.out.println(direction);
    }

}

class Rocket{

    public static void main(String[] args) {
        char[] command = {'f','r','u','b','l'};
        Lander go = new Lander(0,0,0, 'N', command);
        go.Test();
    }
}