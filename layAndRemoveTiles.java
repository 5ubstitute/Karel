void layAndRemoveTiles () {
    dropBeeper ();
    moveForward ();
    if (! onBeeper ()) {
        if (frontIsClear () && ! beeperAhead ()) {
            layAndRemoveTiles ();
        }
        else {
            turnLeft ();
            layAndRemoveTiles ();
            turnRight ();
        }
    }
    else {
        turnAround ();
    }
    moveForward ();
    pickBeeper ();
}
