package org.launchcode;

public class BaublePattern extends Pattern {

    @Override
    public void pattern(){
        ShortLineStitch shortLineStitch = new ShortLineStitch();
        CircleStitch circleStitch = new CircleStitch();

        circleStitch.sew();
        shortLineStitch.sew();

    }
}
