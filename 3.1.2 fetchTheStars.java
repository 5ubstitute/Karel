void fetchTheStars () {
    repeat (10) {
        turnLeft ();
        fetch ();
        dropBeeper ();
        turnLeft ();
        if (frontIsClear ()) {
            moveForward ();
        }
    }
}

void fetch () {
    moveForward ();
    if (! onBeeper ()) {
        fetch ();
    }
    else {
        pickBeeper ();
        turnAround ();
    }
    moveForward ();
}
