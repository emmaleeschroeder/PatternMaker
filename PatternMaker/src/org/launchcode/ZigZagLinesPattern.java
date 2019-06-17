package org.launchcode;

public class ZigZagLinesPattern extends Pattern {

    @Override
    public void pattern() {
        ZigZagStitch zigZagStitch = new ZigZagStitch();
        FillStitch fillStitch = new FillStitch();

        fillStitch.sew();
        zigZagStitch.sew();

        for(int i = 0; i < 3; i++) {
            zigZagStitch.sew();
        }
        for(int i = 0; i < 3;i++){
            fillStitch.sew();
        }
        for(int i = 0; i < 3; i++) {
            zigZagStitch.sew();
        }
        for(int i = 0; i < 3;i++) {
            fillStitch.sew();
        }

    }

}

