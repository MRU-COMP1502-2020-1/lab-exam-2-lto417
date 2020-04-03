package lsystems;

public class B_A extends LRule {
	
	private char match;
	private char[] bodyList;
	
	public B_A() {
		this.match = 'B';
		bodyList = new char[] {'A'};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return bodyList;
	}


}
