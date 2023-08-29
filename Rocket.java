class Lander{
    char[] move;
    int x,y,z;
    String direction;
    String previosDir;
    String previosDirComplement;

    Lander(int x, int y, int z, String dir, char[] move)
    {
        this.x= x;
        this.y = y;
        this.z = z;
        this.direction= dir;
        this.move = move;
        this.previosDir=dir;
    }
    void previosDirComplement(String previosDir)
    {
        switch(previosDir){
            case "N":previosDirComplement="S"; break;
            case "S":previosDirComplement="N"; break;
            case "W":previosDirComplement="E"; break;
            case "E":previosDirComplement="W"; break;
            case "Up":previosDirComplement="Dn"; break;
            case "Dn":previosDirComplement="Up"; break;

        }
    }
    void moveForward(){
        switch(direction){
            case "N":y++; break;
            case "S":y--; break;
            case "W":x--; break;
            case "E":x++; break;
            case "Up": z++; break;
            case "Dn": z--; break;

        }
    }

    void moveBackward(){
        switch(direction){
            case "N":y--; break;
            case "S":y++; break;
            case "W":x++; break;
            case "E":x--; break;
            case "Up": z--; break;
            case "Dn": z++; break;
        }
    }
    void turnLeft(){
        switch(direction){
            case "N": direction="w"; break;
            case "S":direction="E"; break;
            case "W":direction="S"; break;
            case "E":direction="N"; break;
            case "Up": direction=previosDir; break;
            case "Dn": direction=previosDirComplement; break;
        }
    }
    void turnRight(){
        switch(direction){
            case "N": direction="E"; break;
            case "S":direction="W"; break;
            case "W":direction="N"; break;
            case "E":direction="S"; break;
            case "Up": direction=previosDirComplement; break;
            case "Dn": direction=previosDir; break;
        }
    }
    void turnUp()
    {
        previosDir = direction;
        switch(direction){
            case "N": direction="Up"; break;
            case "S":direction="Up"; break;
            case "W":direction="Up"; break;
            case "E":direction="Up"; break;
            case "Up": direction=previosDirComplement; break;
            case "Dn": direction=previosDir; break;
        }
    }
    void turnDown()
    {
        previosDir = direction;
        switch(direction){
            case "N": direction="Dn"; break;
            case "S":direction="Dn"; break;
            case "W":direction="Dn"; break;
            case "E":direction="Dn"; break;
            case "Up": direction=previosDir; break;
            case "Dn": direction=previosDirComplement; break;
        }
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
        Lander go = new Lander(0,0,0, "N", command);
        go.Test();
    }
}