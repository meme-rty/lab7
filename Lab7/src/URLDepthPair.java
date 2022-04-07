
//Класс для хранения ссылки и ее глубины
public class URLDepthPair {
    private String url;
    private int depth;
    private int visited;
    public URLDepthPair(String URL, int dep) {
        url = URL;
        depth=dep;
        visited=1;
    }
    // Метод возвращает унифицированную метку ресурса
    // для данного объекта
    public String getURL() {
        return url;
    }
    // возвращает глубину поиска для данного объекта
    public int getDepth() {
        return depth;
    }
    public void incrementVisited() {
        visited++;
    }
    // Метод возвращает глубину поиска и URL в виде строки
    public String toString() {
        return "<URL href=\"" + url + "\" visited=\"" + visited + "\" depth=\"" + depth + "\" \\>";
    }
}
    
