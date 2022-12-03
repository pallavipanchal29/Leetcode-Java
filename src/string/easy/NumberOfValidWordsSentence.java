package string.easy;

public class NumberOfValidWordsSentence {
    public static void main(String[] args) {
        System.out.println(countValidWords("-"));
    }

    public static int countValidWords(String sentence) {
        int count = 0;
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i] == "") continue;
            boolean isValid = true;
            String word = words[i];
            char[] temp = word.toCharArray();
            int hyphen = 0;
            int punc = 0;

            for (int j = 0; j < temp.length; j++) {
                if (Character.isUpperCase(temp[j]) || Character.isDigit(temp[j])) {
                    isValid = false;
                    break;
                } else if (temp[j] == '-') {
                    hyphen++;
                    if (hyphen > 1) {
                        isValid = false;
                        break;
                    }
                    if ((j > 0 && j < word.length() - 1) && (Character.isLetter(temp[j - 1]) && Character.isLetter((temp[j + 1])))) {
                        continue;
                    } else {
                        isValid = false;
                        break;
                    }
                } else if (!Character.isLetter(temp[j])) {
                    punc++;
                    if (punc > 1 || j != word.length() - 1) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid)
                count++;
        }
        return count;
    }
}
