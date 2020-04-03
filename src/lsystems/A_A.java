package lsystems; 

public class A_A extends LRule {
	
	private char match;
	private char[] bodyList;
	
	public A_A() {
		this.match = 'A';
		bodyList = new char[] {'A'};
	}
	
	public char getMatch() {	
		return match;
	}
	
	public char[] getBody() {
		return bodyList;
	}

}
