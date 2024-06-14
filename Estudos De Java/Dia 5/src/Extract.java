public class Extract {
    public static void main(String[] args) {
        System.out.println("Listar os números pares de 0 a 20");
        evenNumbers(20);
    }
    public static void evenNumbers(int numbers) {
         for (int i = 0; i <= numbers; i++)
             if (i % 2 == 0)
                 System.out.print(i + " ");
    }
}
