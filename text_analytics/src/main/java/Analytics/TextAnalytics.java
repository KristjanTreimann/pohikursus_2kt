package Analytics;

class TextAnalytics implements TextInterface {
    public TextAnalytics(String string) {
	}

	public String[] lowerCaseLetters(String[] wordArray) {
        for (int i = 0; i < wordArray.length; i++) {
            String word = wordArray[i];
            wordArray[i] = word.toLowerCase();
        }
        return wordArray;
    }

  

    @Override
    public String readFile(String path) {
        return null;
    }

    @Override
    public String[] splitWords(String text) {
        return null;
    }


    @Override
    public int doubleCharI(String[] wordArray) {
        return 0;
    }
}