void quantize () {
    repeat (10) {
        turnLeft ();
        repeat (5) {
            moveForward ();
        }
        if (onBeeper ()) {
            repeat (4) {
                moveForward ();
                if (! onBeeper ()) {
                    dropBeeper ();
                }
            }
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
