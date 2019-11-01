package ec.edu.utpl.sic.arqapl;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import ec.edu.utpl.sic.arqapl.metrics.JaroWinkelDistance;

/***
 * @title AlgorithmManager Class implementation
 * @author Jean Mosquera
 * @implNote Class to delegate the function of instace the Class [algorithm(Cosine, Jaccard, JaroWinkelDistance)]
 *             in function of the name entered by the user.
 */
public class AlgorithmManager {

    /**
     * METHOD defineAlgo
     * @param name name of the algorithm
     * @return a TweetSimilarity Object with the instance of the algorithm asociated a the param name.
     */


    public static TweetSimilarity defineAlgo(String name){
        TweetSimilarity tw= null;
        switch (name){
            case "cosine":
                tw= new TweetSimilarity(new Cosine());
                break;
            case "jaccard":
                tw= new TweetSimilarity(new Jaccard());
                break;
            case "jarowinkel":
                tw= new TweetSimilarity((new JaroWinkelDistance()));
                break;
            case "default" :


        }
        return tw;
    }



}
