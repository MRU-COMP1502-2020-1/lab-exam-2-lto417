package lsystems;

public class C_B extends LRule {
	
	private char match;
	private char[] bodyList;
	
	public C_B() {
		this.match = 'C';
		bodyList = new char[] {'B'};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return bodyList;
	}


}
