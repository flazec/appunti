public class PensieroProfondo
    {
        public static void main(String[] args)
            {
                String s = "La risposta alla fondamentale sulla vita, l'universo e tutto quanto e' ";
                int v = 42;
                String risposta = s+v; // equivalente a String risposta = s+Integer.parseInt(v)
                System.out.println(risposta);
            }
}