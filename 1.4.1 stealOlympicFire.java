void stealOlympicFire () {
    moveForward ();
    repeat (6) {
        turnLeft ();
        moveForward ();
        turnRight ();
        moveForward ();
    }
    pickBeeper ();
    moveForward ();
    turnRight ();
    repeat (6) {
        moveForward ();
    }
    turnLeft ();
    moveForward ();
}
