package ec.edu.utpl.sic.arqapl;


import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import ec.edu.utpl.sic.arqapl.metrics.JaroWinkelDistance;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class TweetSimilarity {
    private Similaritable algorithm;



    public TweetSimilarity() {

    }

    public TweetSimilarity(Similaritable algorithm) {
        this.algorithm = algorithm;
    }

    public double similarity(String tweet1, String tweet2) {
        return algorithm.similarity(tweet1, tweet2);
    }

    public static void main(String[] args) {

    }

}
