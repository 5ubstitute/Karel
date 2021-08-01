void removeTheTiles () {
    pickBeeper ();
    repeat (19) {
        repeat (9) {
            if (beeperAhead ()) {
                moveForward ();
                pickBeeper ();
            }
        }
        turnLeft ();
    }
    moveForward ();
}
