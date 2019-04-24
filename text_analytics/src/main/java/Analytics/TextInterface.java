package Analytics;

interface TextInterface {
    public String readFile(String path);

    public String[] splitWords(String text);

    public String[] lowerCaseLetters(String[] wordArray);

    public int doubleCharI(String[] wordArray);
}