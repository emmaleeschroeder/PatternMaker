package org.launchcode;

public class CrossStitchWigglePattern extends Pattern {

    @Override
    public void pattern(){
        SmallCrossStitch smallCrossStitch = new SmallCrossStitch();
        LargeCrossStitch largeCrossStitch = new LargeCrossStitch();

        smallCrossStitch.sew();
        largeCrossStitch.sew();

        for(int i = 0; i < 1; i++){
            smallCrossStitch.sew();
        }
        for(int i = 0; i < 1; i++){
            largeCrossStitch.sew();
        }
        for(int i = 0; i < 1; i++){
            smallCrossStitch.sew();
        }
        for(int i = 0; i < 1; i++){
            largeCrossStitch.sew();
        }
        for(int i = 0; i < 1; i++){
            smallCrossStitch.sew();
        }
        for(int i = 0; i < 1; i++){
            largeCrossStitch.sew();
        }
        for(int i = 0; i < 1; i++){
            smallCrossStitch.sew();
        }
        for(int i = 0; i < 1; i++){
            largeCrossStitch.sew();
        }
        for(int i = 0; i < 1; i++){
            smallCrossStitch.sew();
        }
        for(int i = 0; i < 1; i++){
            largeCrossStitch.sew();
        }

    }
}
