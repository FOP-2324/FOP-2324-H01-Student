package h01;

import fopbot.Robot;
import h01.template.GameControllerBase;
import org.tudalgo.algoutils.student.Student;

/**
 * A {@link GameController} controls the game loop and the {@link Robot}s and checks the win condition.
 */
public class GameController extends GameControllerBase {

    /**
     * Creates a new {@link GameControllerBase}.
     */
    public GameController() {
        setup();
    }

    @Override
    public void checkWinCondition() {
        // TODO: H3
        Student.crash("H3 - remove if implemented");
    }
}
