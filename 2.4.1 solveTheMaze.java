void solveTheMaze () {
    while (! onBeeper ()) {
        if (leftIsClear ()) {
            turnLeft ();
        }
        if (! frontIsClear ()) {
            if (rightIsClear ()) {
                turnRight ();
            }
            else {
                turnAround ();
            }
        }
        moveForward ();
    }
}
