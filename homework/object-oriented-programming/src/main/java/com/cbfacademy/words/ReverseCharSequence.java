package com.cbfacademy.words;

public class ReverseCharSequence implements CharSequence {

    private final String originalString;

    public ReverseCharSequence(String originalString) {
        this.originalString = originalString;
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= this.length()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return originalString.charAt(this.length() - 1 - index);
    }

    @Override
    public int length() {
        return originalString.length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > this.length() || start > end) {
            throw new IndexOutOfBoundsException("Start or end out of bounds");
        }
        StringBuilder sub = new StringBuilder(originalString.substring(start, end));
        return sub.reverse();
    }

    @Override
    public String toString() {
        return new StringBuilder(originalString).reverse().toString();
    }

    public static void main(String[] args) {
        ReverseCharSequence reverse = new ReverseCharSequence("Example");
        System.out.println("Reversed: " + reverse.toString());
        // Add additional tests if needed
    }
}
