package lsystems;

public class A_X extends LRule {
	
	private char match;
	private char[] bodyList;
	
	public A_X() {
		this.match = 'A';
		bodyList = new char[]{};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return bodyList;
	}


}