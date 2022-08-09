void findTeddyBear () {
    while (! onBeeper ()) {
        while (! frontIsClear ()) {
            turnLeft ();
        }
        moveForward ();
    }
}
