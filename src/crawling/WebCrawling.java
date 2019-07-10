package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrawling {
    public static void main(String[] args) {
        try{

            Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
            Elements elements = doc.select("[id=realTimeRankFavorite]").select("li").select("a");
            List<String> texts = elements.eachText();
            int d=0;
            for( String text : texts ){
                text= text.substring( 0,text.indexOf("-"));
                System.out.printf("%d : %s \n",++d, text);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
