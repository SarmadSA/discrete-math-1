public class SetCalc {

    public boolean isContained(char character, char[] charArr){
        boolean contained = false;
        for(char ch: charArr){
            if(ch == character){
                return true;
            }
        }
        return contained;
    }

    public boolean isSubset(char[] arr1, char[] arr2) {
        boolean isSubset = false;
        int counter = 0;
        for (char ch : arr1) {
            if (isContained(ch, arr2)) {
                counter++;
            }
        }
        if (counter == arr1.length) {
            isSubset = true;
        }
        return isSubset;
    }

}


