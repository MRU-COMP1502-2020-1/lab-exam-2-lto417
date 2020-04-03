package lsystems;

public class A_AA extends LRule {
	
	private char match;
	private char[] bodyList;
	
	public A_AA() {
		this.match = 'A';
		bodyList = new char[] {'A', 'A'};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return bodyList;
	}


}
