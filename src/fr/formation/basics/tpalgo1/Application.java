package fr.formation.basics.tpalgo1;

import com.sun.java.accessibility.util.TopLevelWindowListener;

public class Application {

    /**
     * Do not change.
     */
    private final static String[] TOP = {"╔═", "══", "╗"};

    /**
     * Do not change.
     */
    private final static String[] INTERMEDIATE = {"║ ", "O ", "║"};

    /**
     * Do not change.
     */
    private final static String[] BOTTOM = {"╚═", "══", "╝"};

    /**
     * Main method, do not change but the brick's dimensions.
     */
    public static void main(String[] args) {
        // Hard-coded example of a 2x4 brick
        System.out.println("Hard-coded example:");
        System.out.println("╔═════════╗");
        System.out.println("║ O O O O ║");
        System.out.println("║ O O O O ║");
        System.out.println("╚═════════╝");
        System.out.println("Brain-coded example:");
        // Can change to test other dimensions
        LegoBrick brick = new LegoBrick(2, 4);
        displayBrick(brick);
    }

    /**
     * Displays the given {@code LegoBrick} into the console.
     * <p>
     * Should work what ever the {@code brick}'s dimensions are.
     * <p>
     * Implementation should not declare another {@code StringBuilder} neither
     * use concatenation, and the one that is already declared should be the one
     * printed.
     * <p>
     * Make use of the 3 arrays declared as constants in this class.
     */
    private static void displayBrick(LegoBrick brick) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < brick.getHeight() + 2; i++) {
            for (int j = 0; j < brick.getWidth() + 2; j++) {
                if (j == 0 && i == 0) {
                    sb.append(TOP[0]);
                } else if (j == brick.getWidth() + 1 && i == 0) {
                    sb.append(TOP[2]);
                    sb.append("\n");
                } else if (j == 0 && i == brick.getHeight() + 1) {
                    sb.append(BOTTOM[0]);
                } else if (j == brick.getWidth() + 1 && i == brick.getHeight() + 1) {
                    sb.append(BOTTOM[2]);
                    sb.append("\n");
                } else if (i == 0 || i == brick.getHeight() + 1) {
                    sb.append(TOP[1]);
                } else if (j == 0) {
                    sb.append(INTERMEDIATE[0]);
                } else if (j == brick.getWidth() + 1) {
                    sb.append(INTERMEDIATE[0]);
                    sb.append("\n");
                } else {
                    sb.append(INTERMEDIATE[1]);
                }
            }
        }
        System.out.print(sb);
    }
}
