package org.example;

public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation) {
            return true;
        }
        return false;
        }
    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    // We are in trouble if they are both smiling or if neither of them is smiling.
    // Return true if we are in trouble.
        public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            return (aSmile && bSmile) || (!aSmile && !bSmile);
        }
        public int sumDouble(int a, int b) {
            if (a == b) {
                return 2 * (a + b);
            }
            return a + b;
        }
        public int diff21(int n) {
            if (n > 21) {
                return 2 * (n - 21);
            }
            return 21 - n;
        }
        public boolean parrotTrouble(boolean talking, int hour){
        if (!talking)
            return false;
            return (hour < 7 || hour > 20);
        }
        }




