void findTeddyBear () {
    while (! onBeeper ()) {
        if (! frontIsClear ()) {
            turnLeft ();
        }
        moveForward ();
    }
}
