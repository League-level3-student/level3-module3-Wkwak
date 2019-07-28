package _00_Text_Funkifier;

public class ReplaceSpace extends SpecialString {
	public ReplaceSpace(String s){
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String newWord = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				newWord += "/";
			} else {
				newWord += s.charAt(i);
			}
		}
		return newWord;
	}
}
