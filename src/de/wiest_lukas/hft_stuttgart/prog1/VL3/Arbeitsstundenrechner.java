package de.wiest_lukas.hft_stuttgart.prog1.VL3;

public class Arbeitsstundenrechner
{

    public static void main(String[] args)
    {
        calculateWorkTime(20);
    }

    public static float calculateWorkTime(int workedMinutes)
    {
        return workedMinutes / 60;
    }
}
