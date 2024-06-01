// Programmer Name : Aayush Mohod
// Roll No. : 32442
// Batch : L8
// Problem Statement : Draw different geometrical figures like oval,
//                     rectangle, line, text using graphics class.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener
{
	private final JButton ovalButton, rectangleButton, lineButton, textButton, exitButton;
	private String drawShape = null;
	private String userInputText = null;

	public Main()
	{
		setTitle("Geometrical Shapes App");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel buttonPanel = new JPanel();
		ovalButton = new JButton("Oval");
		rectangleButton = new JButton("Rectangle");
		lineButton = new JButton("Line");
		textButton = new JButton("Text");
		exitButton = new JButton("Exit");

		ovalButton.addActionListener(this);
		rectangleButton.addActionListener(this);
		lineButton.addActionListener(this);
		textButton.addActionListener(this);
		exitButton.addActionListener(this);

		buttonPanel.add(ovalButton);
		buttonPanel.add(rectangleButton);
		buttonPanel.add(lineButton);
		buttonPanel.add(textButton);
		buttonPanel.add(exitButton);

		add(buttonPanel, BorderLayout.SOUTH);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == ovalButton)
		{
			drawShape = "oval";
			userInputText = null;
			repaint();
		}
		else if (e.getSource() == rectangleButton)
		{
			drawShape = "rectangle";
			userInputText = null;
			repaint();
		}
		else if (e.getSource() == lineButton)
		{
			drawShape = "line";
			userInputText = null;
			repaint();
		}
		else if (e.getSource() == textButton)
		{
			userInputText = JOptionPane.showInputDialog(this, "Enter text:");
			drawShape = "text";
			repaint();
		}
		else if (e.getSource() == exitButton)
		{
			System.exit(0);
		}
	}

	public void paint(Graphics g)
	{
		super.paint(g);

		if (drawShape != null)
		{
			g.setColor(Color.BLACK);

			int centerX = getWidth() / 2;
			int centerY = getHeight() / 2;

			if (drawShape.equals("oval"))
			{
				g.drawOval(centerX - 50, centerY - 25, 100, 50);
			}
			else if (drawShape.equals("rectangle"))
			{
				g.drawRect(centerX - 50, centerY - 25, 100, 50);
			}
			else if (drawShape.equals("line"))
			{
				g.drawLine(centerX - 50, centerY, centerX + 50, centerY);
			}
			else if (drawShape.equals("text") && userInputText != null)
			{
				g.drawString(userInputText, centerX - userInputText.length() * 3, centerY);
			}
		}
	}

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Main();
			}
		});
	}
}