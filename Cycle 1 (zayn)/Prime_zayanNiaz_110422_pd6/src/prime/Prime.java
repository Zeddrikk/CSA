package prime;

public class Prime {
    private int number;

    public Prime(int number) {
        this.number = number;
    }

    public void setPrime(int num) {
        number = num;
    }

    public boolean isPrime() {
        if (number <= 1)
            return false;
        if (number <= 3)
            return true;

        if (number % 2 == 0 || number % 3 == 0)
            return false;

        for (int i = 5; i * i <= number; i = i + 6)
            if (number % i == 0 || number % (i + 2) == 0)
                return false;

        return true;
    }

    public String toString() {
        String str;

        if(isPrime() == true)
            str = "PRIME";
        else
            str = "NOT PRIME";

        return number + " IS " + str;
    }
}