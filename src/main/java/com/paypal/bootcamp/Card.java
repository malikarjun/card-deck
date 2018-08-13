package com.paypal.bootcamp;
public class Card {

	private Suite suite;
	private int value;

	public Card(Suite suite, int value) {
		this.suite = suite;
		this.value = value;
	}

	public Suite getSuite() {
		return suite;
	}

	public void setSuites(Suite suite) {
		this.suite = suite;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int compareSuits(Card c){
		if (this.getSuite().ordinal()-c.getSuite().ordinal()==0){
			return this.value - c.value;
		}
		return  this.getSuite().ordinal()-c.getSuite().ordinal();
	}

	public int compareValue( Card c){
		if (this.value == c.value){
			return this.getSuite().ordinal()-c.getSuite().ordinal();
		}
		return  this.value - c.value;
	}


	public String toString() {
		if (suite.equals(Suite.SPADE))
			return value + " " + (char) '\u2660';
		else if (suite.equals(Suite.DIAMOND))
			return value + " " + (char) '\u2666';
		else if (suite.equals(Suite.CLUB))
			return value + " " + (char) '\u2663';
		else if (suite.equals(Suite.HEART))
			return value + " " + (char) '\u2764';
		return value + " " + suite;
	}
}
