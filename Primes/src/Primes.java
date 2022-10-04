public class Primes {
    public static void main(String[] args) {
        //Перебирая числа в диапозоне от 2 до 100 мы выводим те числа, которые являются простыми при помощи метода isPrime
        for (int j = 2; j < 100; j++){
            if (isPrime(j)){
                System.out.println(j);
            }
        }
    }
    //Этот метод проверяет является ли число простым или нет
    public static boolean isPrime(int n) {
        int x = (n / 2) + 1;
        for (int i = 2; i < x; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}