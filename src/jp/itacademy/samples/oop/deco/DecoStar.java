package jp.itacademy.samples.oop.deco;

public class DecoStar extends DecoratedString {
	
	protected DecoStar(String str) {
		super(str);
	}
	
	protected String decorate(String str) {
		return "��" + str + "��";
	}
}
