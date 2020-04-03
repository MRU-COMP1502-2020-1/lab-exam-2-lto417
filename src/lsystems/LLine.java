package lsystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		//first check, if there is no sequence of chars then we will never get the 10 iterations
		if(line.length == 0) {
			throw new LSystemLengthException();
		}
		
		ArrayList<Character> chars = new ArrayList<>();
		
		for(char currChar : line) {
			boolean doesMatchExist = false;
			for(LRule currRule : rules) {
				if(currChar == currRule.getMatch()) {
					doesMatchExist = true;
					char[] tempList = currRule.getBody();
					for(char c : tempList) {
						chars.add(c);
					}
				}
			}
			//if there is no rule that applies to character in sequence
			if(!doesMatchExist) {
				throw new LSystemSymbolException();
			}
		}
		this.line = listToArray(chars);
		
	}
	
	
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
