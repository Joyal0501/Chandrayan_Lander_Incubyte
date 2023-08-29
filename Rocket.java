package Incubyte.Chandrayaan;

class Lander {
    char[] move;
    int x, y, z;
    String direction;
    String previousDir;
    String previousDirComplement;
    boolean verticalAxis = false;

    Lander(int x, int y, int z, String dir, char[] move) {
        if (dir != "N" && dir != "S" && dir != "E" && dir != "W" && dir != "Up" && dir != "Down") {
            throw new NullPointerException("Invalid Input");
        }
        for (char c : move) {
            if (c != 'f' && c != 'b' && c != 'l' && c != 'r' && c != 'u' && c != 'd' && c != ' ') {
                throw new NullPointerException("Invalid Input");
            }
        }
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = dir;
        this.move = move;
        this.previousDir = dir;
    }

    void previousDirComplement(String previousDir) {
        switch (previousDir) {
            case "N":
                previousDirComplement = "S";
                break;
            case "S":
                previousDirComplement = "N";
                break;
            case "W":
                previousDirComplement = "E";
                break;
            case "E":
                previousDirComplement = "W";
                break;
            case "Up":
                previousDirComplement = "Down";
                break;
            case "Down":
                previousDirComplement = "Up";
                break;

        }
    }

    void moveForward() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
            case "E":
                x++;
                break;
            case "Up":
                z++;
                break;
            case "Down":
                z--;
                break;

        }
    }

    void moveBackward() {
        switch (direction) {
            case "N":
                y--;
                break;
            case "S":
                y++;
                break;
            case "W":
                x++;
                break;
            case "E":
                x--;
                break;
            case "Up":
                z--;
                break;
            case "Down":
                z++;
                break;
        }
    }

    void turnLeft() {

        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "S":
                direction = "E";
                break;
            case "W":
            if(!verticalAxis)
                direction = "S";
                else
                {
                    direction="Down";
                }
                break;
            case "E":
                direction = "N";
                break;
            case "Up":
                direction = previousDir;
                turnLeft();
                break;
            case "Down":
                direction = previousDirComplement;
                turnRight();
                break;
        }
    }

    void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
            case "E":
                direction = "S";
                break;
            case "Up":
                direction = previousDirComplement;
                turnLeft();
                break;
            case "Down":
                direction = previousDir;
                turnRight();
                break;
        }
    }

    void turnUp() {
        previousDir = direction;
        previousDirComplement(previousDir);
        switch (direction) {
            case "N":
                direction = "Up";
                if (!verticalAxis) {
                    turnRight();
                }
                break;
            case "S":
                direction = "Up";
                if (!verticalAxis) {
                    turnRight();
                }
                break;
            case "W":
                direction = "Up";
                if (!verticalAxis) {
                    turnRight();
                }
                break;
            case "E":
                direction = "Up";
                if (!verticalAxis) {
                    turnRight();
                }
                break;
            case "Up":
                direction = previousDirComplement;
                break;
            case "Down":
                direction = previousDir;
                break;
        }
    }

    void turnDown() {
        previousDir = direction;
        previousDirComplement(previousDir);
        switch (direction) {
            case "N":
                direction = "Down";
                if (!verticalAxis) {
                    turnLeft();
                }
                break;
            case "S":
                direction = "Down";
                if (!verticalAxis) {
                    turnLeft();
                }
                break;
            case "W":
                direction = "Down";
                if (!verticalAxis) {
                    turnLeft();
                }
                break;
            case "E":
                direction = "Down";
                if (!verticalAxis) {
                    turnLeft();
                }
                break;
            case "Up":
                direction = previousDir;
                break;
            case "Down":
                direction = previousDirComplement;
                break;
        }
    }

    void Test() {

        for (char c : move)

        {
            if (c == 'u' || c == 'd') {
                if (!verticalAxis) {
                    verticalAxis = true;
                } 
                else
                {
                    verticalAxis = false;
                }
            }
            switch (c) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'u':
                    turnUp();
                    break;
                case 'd':
                    turnDown();
                    break;
            }
           // System.out.println(c +" :" +direction + ": " + verticalAxis + " : " +previousDir);

        }
//        System.out.println(x + ", " + y + ", " + z);
//        System.out.println(direction);

    }

}