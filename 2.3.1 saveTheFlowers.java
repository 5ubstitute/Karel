void saveTheFlowers () {
    repeat (4) {
        turnLeft ();
        while (! rightIsClear ()) {
            moveForward ();
        }
        turnRight ();
        moveForward ();
        pickBeeper ();
    }
    turnLeft ();
    while (! rightIsClear ()) {
        moveForward ();
    }
    turnRight ();
    moveForward ();
    dropBeeper ();
    repeat (3) {
        moveForward ();
        turnRight ();
        while (frontIsClear ()) {
            moveForward ();
        }
        dropBeeper ();
        turnLeft ();
    }
    moveForward ();
    turnRight ();
    while (frontIsClear ()) {
        moveForward ();
    }
    turnLeft ();
}
