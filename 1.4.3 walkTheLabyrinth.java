void walkTheLabyrinth () {
    repeat (99) {
        if (!frontIsClear ()) {
            if (leftIsClear ()) {
                turnLeft ();
            }
            else {
                turnRight ();
            }
        }
        moveForward ();
    }
}
