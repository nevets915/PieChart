package q5;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * <p>The base class PieChart creates a pie chart visual within a frame.
 * It does so through a series of constants which are set out mathematically
 * to divide an ordinary circle into 8 equal shapes, all with various different
 * colors.  No input is necessary from the user to see the visual pop up
 * in a new window called, "Cut the pie!"</p>
 *
 * @author Steven Ma. Set 1A.
 * @version 1.0
 */
public class PieChart extends JFrame {
    /**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 20;

    /**
     * <p>The x position of the start of the pie chart.</p> 
     */
    private static final int X_CHART = 50;

    /**
     * <p>The y position of the start of the pie chart.</p> 
     */
    private static final int Y_CHART = 50;

    /**
     * <p>The degree for the arc shape created. </p> 
     */
    private static final int ARC = 45;

    /**
     * <p>The size of the arc shape.</p>
     */
    private static final int SIZE_CHART = 80;

    /**
     * <p>The size of the window displayed in the x-axis.</p>
     */
    private static final int WINDOW_X = 350;

    /**
     * <p>The size of the window displayed in the y-axis.</p>
     */
    private static final int WINDOW_Y = 220;

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public PieChart() {
        super("Cut the pie!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new PieChartPanel());
        setSize(WINDOW_X, WINDOW_Y); 
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class PieChartPanel extends JPanel {

        /**
         * <p>The default constructor that retrieves an image to draw.</p>
         */
        PieChartPanel() {
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.gray);
            g.setColor(Color.black);
            g.drawString("8 color slice pie chart", X_POSITION, Y_POSITION);
            g.drawOval(X_CHART, Y_CHART, SIZE_CHART, SIZE_CHART);
            int add; //Variable used to increase arc position for each slice 
            add = 2;

            g.setColor(Color.red);
            g.fillArc(X_CHART, Y_CHART, SIZE_CHART, SIZE_CHART, 0, ARC);

            g.setColor(Color.orange);
            g.fillArc(X_CHART, Y_CHART, SIZE_CHART, SIZE_CHART, ARC, ARC);

            g.setColor(Color.yellow);
            g.fillArc(X_CHART, Y_CHART, SIZE_CHART, SIZE_CHART, add * ARC, ARC);
            add++;

            g.setColor(Color.green);
            g.fillArc(X_CHART, Y_CHART, SIZE_CHART, SIZE_CHART, add * ARC, ARC);
            add++;

            g.setColor(Color.blue);
            g.fillArc(X_CHART, Y_CHART, SIZE_CHART, SIZE_CHART, add * ARC, ARC);
            add++;

            g.setColor(Color.cyan);
            g.fillArc(X_CHART, Y_CHART, SIZE_CHART, SIZE_CHART, add * ARC, ARC);
            add++;

            g.setColor(Color.magenta);
            g.fillArc(X_CHART, Y_CHART, SIZE_CHART, SIZE_CHART, add * ARC, ARC);
            add++;

            g.setColor(Color.white);
            g.fillArc(X_CHART, Y_CHART, SIZE_CHART, SIZE_CHART, add * ARC, ARC);


        }
    }

    /**
     * <p>The main method.</p>
     * @param args unused.
     */
    public static void main(String[] args) {
        new PieChart();
    }

};
