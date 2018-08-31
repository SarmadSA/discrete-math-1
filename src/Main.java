public class Main {

    public static void main(String[] args) {
        char[] A = {'a','b','c'};
        char[] B = {'a','c','d'};

        SetCalc setCalc= new SetCalc();
        System.out.println("Is a an element of A: " + setCalc.isContained('a', A));
        System.out.println("Is B subset of A: " + setCalc.isSubset(B, A));
    }
}
