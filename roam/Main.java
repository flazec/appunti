
public class Main {

    public static void main(String[] args) {
        System.out.print("success");
    }


    public class Nastro implements SupportoRiscrivibile{
        private Pellicola pellicola;
        @Override
        public void leggi(){
            attivaTestina();
            muoviTestina();
        }
        @Override
        public void scrivi(){
            attivaTestina();
            caricaTestina();
            muoviTestina();
            scaricaTestina();
        }
        public void attivaTestina(){}
        public void caricaTestina(){}
        public void scaricaTestina(){}
        public void muoviTestina(){}
    }

}