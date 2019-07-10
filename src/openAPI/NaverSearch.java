package openAPI;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class NaverSearch {

    public static void main(String[] args) {
        String clientId = "xcuWIKGu7MuSJg5FZNPu";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "eeS9c8C289";//애플리케이션 클라이언트 시크릿값";
        for( int i=0; i<1; i++) {
            try {
                String text = URLEncoder.encode("부릉부릉", "UTF-8");
                //String apiURL = "https://openapi.naver.com/v1/search/news.json?query=" + text; // json 결과
                //String apiURL = "https://search.naver.com/search.naver?query="+text;
                //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과
                String apiURL = "https://openapi.naver.com/v1/search/movie.json?query="+text;
                URL url = new URL(apiURL);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.setRequestProperty("X-Naver-Client-Id", clientId);
                con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
                int responseCode = con.getResponseCode();
                BufferedReader br;
                if (responseCode == 200) { // 정상 호출
                    br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                } else {  // 에러 발생
                    br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                }
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                br.close();
//                System.out.println(response.toString());
                //System.out.println("ok");
                parseBook(response.toString());
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    private static void parseBook(String json) throws Exception{
        Map map = new ObjectMapper().readValue( json, Map.class);
        List<Map<String,String>> list = (List)map.get("items");
        int index=0;
        for( Map<String,String> movie : list ){
            String title = movie.get("title");
            String author = movie.get("author");
            String price = movie.get("price");
            System.out.printf("%d. title: %s, author: %s, price: %s\n", ++index,title,author,price);
        }

    }
}