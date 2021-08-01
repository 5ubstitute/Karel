void followTheSeeds () {
    while (beeperAhead ()) {
        while (beeperAhead ()) {
            moveForward ();
            pickBeeper ();
        }
        turnLeft ();
    }
}
