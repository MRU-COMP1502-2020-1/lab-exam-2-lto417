package lsystems;

public class A_BC extends LRule{
	
	private char match;
	private char[] bodyList;
	
	public A_BC() {
		this.match = 'A';
		bodyList = new char[] {'B','C'};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return bodyList;
	}


}
