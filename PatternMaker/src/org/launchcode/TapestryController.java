package org.launchcode;

public class TapestryController {

    public static void main(String[] args) {
        ZigZagLinesPattern zigZagLinesPattern = new ZigZagLinesPattern();
        zigZagLinesPattern.pattern();
        System.out.println();
        BlockyBaublePattern blockyBaublePattern = new BlockyBaublePattern();
        blockyBaublePattern.pattern();
        System.out.println();
        CrossStitchWigglePattern crossStitchWigglePattern = new CrossStitchWigglePattern();
        crossStitchWigglePattern.pattern();
        BaublePattern baublePattern = new BaublePattern();
        baublePattern.pattern();

        System.out.println("\n");


        for (int i = 0; i < 8; i++) {
            crossStitchWigglePattern.pattern();
            System.out.print(" ");
            crossStitchWigglePattern.pattern();
            System.out.print(" ");
            crossStitchWigglePattern.pattern();
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < 8; i++) {
            zigZagLinesPattern.pattern();
            System.out.print(" ");
            zigZagLinesPattern.pattern();
            System.out.print(" ");
            zigZagLinesPattern.pattern();
            System.out.print(" ");
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < 8; i++) {
            blockyBaublePattern.pattern();
            System.out.print(" ");
            blockyBaublePattern.pattern();
            System.out.print(" ");
            blockyBaublePattern.pattern();
            System.out.print(" ");
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < 8; i++) {
            baublePattern.pattern();
            System.out.print(" ");
            baublePattern.pattern();
            System.out.print(" ");
            baublePattern.pattern();
            System.out.print(" ");
            System.out.println();

        }

        System.out.println("\n");

        for (int i = 0; i < 6; i++) {
            crossStitchWigglePattern.pattern();
            System.out.print(" ");
            crossStitchWigglePattern.pattern();
            System.out.print(" ");
            crossStitchWigglePattern.pattern();
            System.out.print(" ");
            crossStitchWigglePattern.pattern();
            System.out.print(" ");
            crossStitchWigglePattern.pattern();
            System.out.print(" ");
            crossStitchWigglePattern.pattern();
            System.out.print(" ");
            crossStitchWigglePattern.pattern();
            System.out.print(" ");
            crossStitchWigglePattern.pattern();
            System.out.print(" ");
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < 6; i++) {
            zigZagLinesPattern.pattern();
            System.out.print(" ");
            zigZagLinesPattern.pattern();
            System.out.print(" ");
            zigZagLinesPattern.pattern();
            System.out.print(" ");
            zigZagLinesPattern.pattern();
            System.out.print(" ");
            zigZagLinesPattern.pattern();
            System.out.print(" ");
            zigZagLinesPattern.pattern();
            System.out.print(" ");
            zigZagLinesPattern.pattern();
            System.out.print(" ");
            zigZagLinesPattern.pattern();
            System.out.print(" ");
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < 6; i++) {
            blockyBaublePattern.pattern();
            System.out.print(" ");
            blockyBaublePattern.pattern();
            System.out.print(" ");
            blockyBaublePattern.pattern();
            System.out.print(" ");
            blockyBaublePattern.pattern();
            System.out.print(" ");
            blockyBaublePattern.pattern();
            System.out.print(" ");
            blockyBaublePattern.pattern();
            System.out.print(" ");
            blockyBaublePattern.pattern();
            System.out.print(" ");
            blockyBaublePattern.pattern();
            System.out.print(" ");
            System.out.println();

        }

        System.out.println("\n");
        for (int i = 0; i < 6; i++) {
            baublePattern.pattern();
            System.out.print(" ");
            baublePattern.pattern();
            System.out.print(" ");
            baublePattern.pattern();
            System.out.print(" ");
            baublePattern.pattern();
            System.out.print(" ");
            baublePattern.pattern();
            System.out.print(" ");
            baublePattern.pattern();
            System.out.print(" ");
            baublePattern.pattern();
            System.out.print(" ");
            baublePattern.pattern();
            System.out.print(" ");
            System.out.println();
        }

    }
}
