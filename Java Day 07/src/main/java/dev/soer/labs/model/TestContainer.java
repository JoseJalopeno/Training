package dev.soer.labs.model;

public class TestContainer {

	public static void main(String[] args) {
		Container<String> container = new Container<String>();
		container.setObject("Hello");
		
		System.out.println(container.getObject());
		
	}
}
