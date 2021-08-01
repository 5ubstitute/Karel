void tileTheFloor () {
    repeat (19) {
        repeat (9) {
            if (!beeperAhead ()) {
                dropBeeper ();
                moveForward ();
            }
        }
        turnLeft ();
    }
    dropBeeper ();
    moveForward ();
}
