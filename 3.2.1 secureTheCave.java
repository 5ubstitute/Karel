void secureTheCave () {
    repeat (10) {
        turnLeft ();
        while (frontIsClear ()) {
            moveForward ();
        }
        turnAround ();
        collect ();
        turnRight ();
        if (frontIsClear ()) {
            moveForward ();
        }
    }
}

void collect () {
    pickBeeper ();
    moveForward ();
    if (onBeeper ()) {
        collect ();
    }
    else {
        while (frontIsClear ()) {
            moveForward ();
        }
        turnAround ();
    }
    dropBeeper ();
    moveForward ();
}
