package ec.edu.utpl.sic.arqapl.metrics;

import org.apache.commons.text.similarity.JaroWinklerDistance;

public class JaroWinkelDistance implements Similaritable{
    @Override
    public double similarity(String text1, String text2) {
        var winkelD=new JaroWinklerDistance();
        var similarity=winkelD.apply(text1,text2);

        return similarity;
    }
}
