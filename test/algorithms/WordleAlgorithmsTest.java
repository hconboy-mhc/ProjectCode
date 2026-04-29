package algorithms;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordleAlgorithmsTest {
    private GuessCorrectness guessCorrectness;

    @BeforeEach
    public void setUp() {
        guessCorrectness = new GuessCorrectness();
    }

    @Test
    public void testNewGuestCorrectness() {
        assertNotNull(guessCorrectness);
    }
}
