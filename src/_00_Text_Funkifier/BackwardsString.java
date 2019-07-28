package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String funk = "";

		for (int j = s.length()-1; j >= 0; j--) {
			funk += s.charAt(j);
		}
		return funk;
	}

}
