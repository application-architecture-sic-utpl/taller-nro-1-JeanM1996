package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import static org.junit.Assert.*;

import ec.edu.utpl.sic.arqapl.metrics.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;


/***
 * @title Parameterized Test - Method 2
 * @author Jean Mosquera
 * @implNote Class to test all Implementations of Similaritable Interface using an Array with the Parameters (Instances
 * of Algorithm Classes (Cosine, Jaccard, JaroWinkelDistance))
 */
@RunWith(Parameterized.class)
public class TweetSimilarityTest {
    private final Similaritable algorithm;


    public TweetSimilarityTest(Similaritable algorithm) {
        this.algorithm=algorithm;
    }

/***
 *Parameters
 *Building of an List with the instances of Classes (Algorithms) that implements the Iface Similaritable
 */

    @Parameterized.Parameters(name = "{index}: {0}")
    public static List<Object[]> getParameters() {
        List<Object[]> params = new ArrayList<>();
        // Algoritms Instances
        params.add(new Object[] { new Jaccard()});
        params.add(new Object[] { new Cosine()});
        params.add(new Object[] { new JaroWinkelDistance()});
        return params;
    }


    @Test
    public void similarAll() {
        var tweet1 = "Hola";
        var tweet2 = "Hola";
            assertEquals(1.0,
                algorithm.similarity(tweet1, tweet2), 0.1);
    }


}
