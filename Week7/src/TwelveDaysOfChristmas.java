public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        int count = 1;
        String dayNumber = "";
        String partridge = "a Partridge in a Pear Tree.\n\n";
        String song = "";
        while (count < 13) {
            switch (count) {
                case 1 -> {
                    dayNumber = "first";
                    song = partridge;
                }
                case 2 -> {
                    dayNumber = "second";
                    song = ("2 Turtle Doves\nand " + song);
                }
                case 3 -> {
                    dayNumber = "third";
                    song = "3 French Hens,\n" + song;
                }
                case 4 -> {
                    dayNumber = "forth";
                    song = "4 Calling Birds,\n" + song;
                }
                case 5 -> {
                    dayNumber = "fifth";
                    song = "5 Golden Rings,\n" + song;
                }
                case 6 -> {
                    dayNumber = "sixth";
                    song = "6 Geese a Laying,\n" + song;
                }
                case 7 -> {
                    dayNumber = "seventh";
                    song = "7 Swans a Swimming,\n" + song;
                }
                case 8 -> {
                    dayNumber = "eighth";
                    song = "8 Maids a Milking,\n" + song;
                }
                case 9 -> {
                    dayNumber = "ninth";
                    song = "9 Ladies Dancing,\n" + song;
                }
                case 10 -> {
                    dayNumber = "tenth";
                    song = "10 Lords a Leaping\n" + song;
                }
                case 11 -> {
                    dayNumber = "eleventh";
                    song = "11 Pipers Piping,\n" + song;
                }
                case 12 -> {
                    dayNumber = "twelfth";
                    song = "12 Drummers Drumming,\n" + song;
                }
            }
            System.out.print("On the " + dayNumber + " day of Christmas my true love sent to me: \n" + song);
            count++;
        }
    }
}