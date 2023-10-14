package week_06;
// [참고] 자바로 html 파일 생성 및 수정
// https://velog.io/@mingsomm/%EC%9E%90%EB%B0%94%EB%A1%9C-html-%ED%8C%8C%EC%9D%BC-%EC%83%9D%EC%84%B1-%EB%B0%8F-%EC%88%98%EC%A0%95
import java.io.*;

public class Mission1_hw1 {
    public static void main(String[] args) {
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n")
            .append("<html>\n")
            .append("    <head>\n")
            .append("        <meta charset=\"UTF-8\">\n")
            .append("        <style>\n")
            .append("            table { border-collapse: collapse; width: 100%; }\n")
            .append("            th, td { border: solid 1px #000; }\n")
            .append("        </style>\n")
            .append("    </head>\n")
            .append("    <body>\n")
            .append("        <h1>자바 환경정보</h1>\n")
            .append("        <table>\n")
            .append("            <th>키</th>\n")
            .append("            <th></th>\n");

        for (Object k : System.getProperties().keySet()) {
            String key = k.toString();
            String value = System.getProperty(key);
            html.append("            <tr>\n")
                .append("                <td>").append(key).append("</td>\n")
                .append("                <td>").append(value).append("</td>\n")
                .append("            </tr>\n");
        }

        html.append("        </table>\n")
            .append("    </body>\n")
            .append("</html>");

        try {
            File file = new File("property.html");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(html.toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}