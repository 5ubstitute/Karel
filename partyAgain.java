void partyAgain () {
    repeat (10) {
        turnLeft ();
        pickBeeper ();
        moveBeeper ();
        turnLeft ();
        if (frontIsClear ()) {
            moveForward ();
        }
    }
}

void moveBeeper () {
    moveForward ();
    if (frontIsClear ()) {
        moveBeeper ();
    }
    else {
        dropBeeper ();
        turnAround ();
    }
    moveForward ();
}
