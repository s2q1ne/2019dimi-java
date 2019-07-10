package openAPI;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class Papago {
    public static void main(String[] args) {
        String clientId = "xcuWIKGu7MuSJg5FZNPu";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "eeS9c8C289";//애플리케이션 클라이언트 시크릿값";
        try {
            String text = URLEncoder.encode("복어", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            // post request
            String postParams = "source=ko&target=en&text=" + text;
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postParams);
            wr.flush();
            wr.close();
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
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
            System.out.println(response.toString());
            viewer(response.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private static String viewer( String str ) throws Exception{
        Map map = new ObjectMapper().readValue( str, Map.class);
        Map message = (Map)map.get("message");
        Map result = (Map)message.get("result");
        System.out.println(result.get("translatedText"));
        return result.get("translatedText").toString();
    }
}
