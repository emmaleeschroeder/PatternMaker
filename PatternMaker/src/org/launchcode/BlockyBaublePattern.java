package org.launchcode;

public class BlockyBaublePattern extends Pattern {

    @Override
    public void pattern() {
        BlockStitch blockStitch = new BlockStitch();
        ShortLineStitch shortLineStitch = new ShortLineStitch();
        CircleStitch circleStitch = new CircleStitch();

        blockStitch.sew();
        shortLineStitch.sew();
        circleStitch.sew();

        for(int i = 0; i < 1; i++) {
            blockStitch.sew();
        }

        for(int i = 0; i < 1; i++){
            shortLineStitch.sew();
        }
        for(int i = 0; i < 1; i++){
            circleStitch.sew();
        }
        for(int i = 0; i < 1; i++) {
            blockStitch.sew();
        }

        for(int i = 0; i < 1; i++){
            shortLineStitch.sew();
        }
        for(int i = 0; i < 1; i++){
            circleStitch.sew();
        }


    }

}
