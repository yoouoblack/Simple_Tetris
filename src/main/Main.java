package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame("Simple Tetris");	//제목창 설정
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		//GamePanel 창을 추가
		//Add GamePanel to the window
		
		GamePanel gp = new GamePanel();
		window.add(gp);
		window.pack();
;		
		window.setLocationRelativeTo(null);	//위치 지정, null 일시 중앙
		window.setVisible(true);
		
		gp.launchGame();
	}

}
