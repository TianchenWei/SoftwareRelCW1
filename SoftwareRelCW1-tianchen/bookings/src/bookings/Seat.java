package bookings;
 
public class Seat {
	//@ invariant row >= MIN_ROW && number >= MIN_NUMBER && row <= MAX_ROW && number <= MAX_NUMBER;
	public static final char MIN_ROW = 'A';
	public static final char MAX_ROW = 'G';
	public static final int MIN_NUMBER = 1;
	public static final int MAX_NUMBER = 20;
 
	private final char row;
	private final int number;
	
	//@requires row >= MIN_ROW && number >= MIN_NUMBER && row <= MAX_ROW && number <= MAX_NUMBER;
	//@ensures this.row >= MIN_ROW && this.number >= MIN_NUMBER && this.row <= MAX_ROW && this.number <= MAX_NUMBER; 
	public Seat(char row, int number) {
    	this.row = row;
    	this.number = number;
	}
 
	//@requires this.row >= MIN_ROW && this.row <= MAX_ROW;
    //@ensures \result >= MIN_ROW && \result <= MAX_ROW;
	public final char getRow() {
    	return row;
	}
 
	//@requires this.number >= MIN_NUMBER && this.number <= MAX_NUMBER;
    //@ensures \result >= MIN_NUMBER && \result <= MAX_NUMBER;
	public final int getNumber() {
    	return number;
	}
}

