package ru.dai.main;

public class Main {
	private static MainWindow window;
	
	public static MainWindow getWindow() {
		return window;
	}

	public static void setWindow(MainWindow window) {
		Main.window = window;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setWindow(new MainWindow(640,480));
	}

}
