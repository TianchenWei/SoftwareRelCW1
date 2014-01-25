package bookings;

public class Seat {
    //@ invariant MAX_ROW >= 'A' && MIN_ROW >= 'A' && MAX_NUMBER >= 1 && MIN_NUMBER >= 1;
    //@ invariant row >= 'A' && number >= 1;
	
    public static final char MIN_ROW = 'A';
    public static final char MAX_ROW = 'G';
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 20;

    private final char row;
    private final int number;
    
    public Seat(char row, int number) {
        this.row = row;
        this.number = number;
    }

	//@ensures \result >= 'A';
    public final char getRow() {
        return row;
    }

	//@ensures \result >= 1;
    public final int getNumber() {
        return number;
    }
}
