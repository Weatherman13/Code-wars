package kyu8;

public class Number2 {
//    todo Nathan loves cycling.Because Nathan knows it is important to stay hydrated,
//     he drinks 0.5 litres of water per hour of cycling.You get given the time in hours
//     and you need to return the number of litres Nathan will drink, rounded to the smallest value.
    public static int Liters(double time)  {

        Double result = Double.valueOf(time).shortValue()*0.5;
        return result.shortValue();

    }

    public static void main(String[] args) {
        double d = 5.8;
        System.out.println(Liters(d));
    }
}
