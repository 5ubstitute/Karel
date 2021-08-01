void jumpTheHurdles () {
    while (! onBeeper ()) {
        while (frontIsClear () && ! onBeeper ()) {
            moveForward ();
        }
        if (! onBeeper ()) {
            turnLeft ();
            while (!rightIsClear ()) {
                moveForward ();
            }
            turnRight ();
            moveForward ();
            turnRight ();
            while (frontIsClear ()) {
                moveForward ();
            }
            turnLeft ();
        }
    }
}
