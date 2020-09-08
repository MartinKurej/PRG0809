public class Prvocisla {
    public static void main(String[] args) {
        int nejcislo = 100;
        boolean hlavni = true;
        String prvocisla = "";
        for (int a = 1; a <= nejcislo; a++) {
            hlavni = checkhlavni(a);
            if (hlavni) {
                prvocisla = prvocisla + a + " ";
            }
        }
        System.out.println("Vypsani prvocisel do " + nejcislo + ": ");
        System.out.println(prvocisla);
    }

    public static boolean checkhlavni(int number) {
        int zbytecek;
        for (int a = 2; a <= number / 2; a++) {
            zbytecek = number % a;
            if (zbytecek == 0) {
                return false;
            }
        }
        return true;
    }
}