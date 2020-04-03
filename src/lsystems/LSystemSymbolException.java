package lsystems;

public class LSystemSymbolException extends Exception {
		
	public String getSymbol() {
		return "there being no rule that applies to a character in the sequence";
	}

}
