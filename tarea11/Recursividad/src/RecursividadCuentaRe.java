public class RecursividadCuentaRe {

        public static void CuentaRegresiva(int p) {
            if (p > 0) {
                System.out.println(p);
                CuentaRegresiva(p - 1);
            }
        }
    }

