void cleanTheTunnels () {
    repeat (10) {
        turnLeft ();
        pickBeeper ();
        while (beeperAhead ()) {
            moveForward ();
            pickBeeper ();
        }
        turnAround ();
        while (frontIsClear ()) {
            moveForward ();
        }
        turnLeft ();
        if (frontIsClear ()) {
            moveForward ();
        }
    }
}
