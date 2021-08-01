void harvestTheField () {
    collectFour ();
    moveForward ();
    moveForward ();
    turnLeft ();
    moveForward ();
    moveForward ();
    turnLeft ();
    collectFour ();
    turnAround ();
    collectFour ();
    moveForward ();
    moveForward ();
    turnLeft ();
    moveForward ();
    moveForward ();
    turnLeft ();
    collectFour ();
}

void collectOne () {
    moveForward ();
    pickBeeper ();
    turnRight ();
    moveForward ();
    turnLeft ();
}

void collectFour () {
    repeat (4) {
        collectOne ();
    }
}
