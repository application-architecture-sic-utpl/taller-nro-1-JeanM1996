package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.AlgorithmManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/***
 * @title Algorithm Unit Test - Method 1
 * @author Jean Mosquera
 * @implNote Class to make individual Test to Class implementations (Algorithms).
 *          Algorithm Manager implements the method defineAlgo that requires the name of algorithm an later instance
 *          TweetSimilarity Object to instance the target algorithm asociated with the name
 */
public class AlgorithmsUnitTest {


    /**
     * Test Jaccard Algorithm
     */
    @Test
    public void jaccardTest(){
        var algorithm= AlgorithmManager.defineAlgo("jaccard");
        var tweet1 = "Hola";
        var tweet2 = "Hola";
        assertEquals(1.0,
                algorithm.similarity(tweet1, tweet2), 0.1);
    }

    /**
     * Test Cosine Algorithm
     */
    @Test
    public void cosineTest(){
        var algorithm= AlgorithmManager.defineAlgo("cosine");
        var tweet1 = "Hola";
        var tweet2 = "Hola";
        assertEquals(1.0,
                algorithm.similarity(tweet1, tweet2), 0.1);
    }

    /**
     * Test JaroWinkelDistance
     */
    @Test
    public void JaroWinkelS(){
        var algorithm= AlgorithmManager.defineAlgo("jarowinkel");
        var tweet1 = "Hola";
        var tweet2 = "Hola";
        assertEquals(1.0,
                algorithm.similarity(tweet1, tweet2), 0.1);
    }
}
