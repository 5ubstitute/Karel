void addSlow () {
    while (frontIsClear ()) {
        decrement ();
        if (frontIsClear ()) {
            back ();
            turnRight ();
            moveForward ();
            turnRight ();
            increment ();
            back ();
            turnLeft ();
            moveForward ();
            turnLeft ();
        }
    }
}

void increment () {
    while (onBeeper ()) {
        pickBeeper ();
        moveForward ();
    }
    dropBeeper ();
}

void decrement () {
    while (!onBeeper () && frontIsClear ()) {
        dropBeeper ();
        moveForward ();
    }
    if (frontIsClear ()) {
        pickBeeper ();
    }
}

void back () {
    turnAround ();
    while (frontIsClear ()) {
        moveForward ();
    }
}
