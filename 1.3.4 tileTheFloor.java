void tileTheFloor () {
    repeat (100) {
        dropBeeper ();
        if (!frontIsClear () || beeperAhead ()) {
            turnLeft ();
        }
        moveForward ();
}
