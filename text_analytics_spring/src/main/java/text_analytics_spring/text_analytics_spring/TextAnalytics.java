package Analytics;

public class TextAnalytics implements TextInterface {

    public String readFile(String path) {
        String text = "";
        Path file_path = Paths.get(path);
        try {
            byte[] file_content_in_bytes = Files.readAllBytes(file_path);
            String file_content_str = new String(file_content_in_bytes, StandardCharsets.UTF_8);
            text = file_content_str;
        } catch (IOException my_error) {
            my_error.printStackTrace();
        }
        return text;
    }

    public String[] splitWords(String text) {
        String[] wordArray = text.split("");
        return wordArray;
    }



}