package com.msalihkocak;

public class Main {

    public static void main(String[] args) {
	    Day mon = Day.get("M");
        Day mon2 = Day.MONDAY;
	    Day tue = Day.TUESDAY;

        System.out.println(mon.name());
        System.out.println(mon2.getAbbreviation());
        System.out.println(mon == mon2);
        System.out.println(tue.getAbbreviation());
    }
}
