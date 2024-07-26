public class Peformance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch; // series = series + ch
        }
        System.out.println(series); 
    }
}
