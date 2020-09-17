import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TagView extends JPanel implements KeyListener, MouseMotionListener, ActionListener {// we get keypresses,
                                                                                                 // mouse positions, and
                                                                                                 // button clicks

    private boolean debug = false;

    // make the frame
    public TagView(final boolean debug, final int windowWidth, final int windowHeight) {
        this.debug = debug;//sets debug instance variable to the value passed into it by TagController
        final JFrame window = new JFrame();
        window.setSize(new Dimension(windowWidth, windowHeight));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.requestFocus();
        window.setLayout(null);
        window.setResizable(false);
        //add all the event listeners
        window.addKeyListener(this);
        this.setSize(new Dimension(windowWidth, windowHeight - 100));
        window.getContentPane().add(this);
        this.addMouseMotionListener(this);

        // make the start button
        final JButton start = new JButton("Start");
        final Rectangle rstart = new Rectangle(windowWidth / 4 * 1, windowHeight - 90, 80, 40);
        start.setBounds(rstart);
        start.addActionListener(this);
        window.getContentPane().add(start);
        start.setFocusable(false);

        // make the stop button
        final JButton stop = new JButton("Stop");
        final Rectangle rstop = new Rectangle((windowWidth / 4) * 2, windowHeight - 90, 80, 40);
        stop.setBounds(rstop);
        stop.addActionListener(this);
        window.getContentPane().add(stop);
        stop.setFocusable(false);

        // make the reset button
        final JButton reset = new JButton("Reset");
        final Rectangle rreset = new Rectangle((windowWidth / 4) * 3, windowHeight - 90, 80, 40);
        reset.setBounds(rreset);
        reset.addActionListener(this);
        window.getContentPane().add(reset);
        reset.setFocusable(false);

        repaint();
    }

    protected void paintComponent(final Graphics g) // repaints the screen

    {
        super.paintComponent(g);
        g.clearRect(0, 0, this.getWidth(), this.getHeight());// just clears the screen

    }

    @Override
    public void mouseDragged(final MouseEvent e) {// called when the mouse position changes while click is held
        if (debug)
            System.out.println("Mouse: " + e.getPoint());
    }

    @Override
    public void mouseMoved(final MouseEvent e) {// called when the mouse position changes without clicking
        if (debug)
            System.out.println("Mouse: " + e.getPoint());

    }

    @Override
    public void keyTyped(final KeyEvent e) {

    }

    @Override
    public void keyPressed(final KeyEvent e) {//called when a key is pressed
        if (debug)
            System.out.println("Key Pressed:" + e.getKeyCode());

    }

    @Override
    public void keyReleased(final KeyEvent e) {//take a guess
        if (debug)
            System.out.println("Key Relesed:" + e.getKeyCode());

    }

    @Override
    public void actionPerformed(final ActionEvent e) {//gets called when an onscreen button is clicked
        if (debug)
            System.out.println("Event: " + e.getSource());

    }

}
