package lsystems;

public class A_Q extends LRule {
	
	private char match;
	private char[] bodyList;
	
	public A_Q() {
		this.match = 'A';
		bodyList = new char[] {'Q'};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return bodyList;
	}

}
