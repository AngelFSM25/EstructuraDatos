
public class Balanceo {

    //Verifica si los caracteres de apertura y cierre son del mismo tipo
    private static boolean esPareja(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
                (apertura == '{' && cierre == '}') ||
                (apertura == '[' && cierre == ']');
    }

    //Verifica si los parentesis y llaves estan balanceados
    public static boolean estanBalanceados(String expresion) {
        StackADT<Character> pila = new StackADT<>();

        //Recorremos cada caracter de la expresion
        for (char c : expresion.toCharArray()) {
            //Si encontramos un caracter de apertura, lo agregamos a la pila
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            }
            //Si encontramos un caracter de cierre
            else if (c == ')' || c == '}' || c == ']') {
                // Si la pila esta vacia, significa que no hay un caracter de apertura correspondiente
                if (pila.isEmpty()) {
                    return false;
                }
                //Sacamos el elemento superior de la pila y verificamos si es del mismo tipo
                char apertura = pila.pop();
                if (!esPareja(apertura, c)) {
                    return false;
                }
            }
        }

        //Al final, la pila debe estar vacia si los parentesis y llaves estan balanceados
        return pila.isEmpty();
      }
    }
