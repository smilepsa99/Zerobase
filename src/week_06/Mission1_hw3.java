package week_06;

class Pager {
    final int itemsInAPage = 10;
    final int maxIndex = 10;
    long totalCount;
    long pageIndex;

    public Pager(long totalCount) {
        this.totalCount = totalCount;
    }

    public String html(long pageIndex) {
        this.pageIndex = pageIndex;
        StringBuilder html = new StringBuilder();
        html.append("<a href='#'>[처음]</a>\n")
            .append("<a href='#'>[이전]</a>\n\n");

        long totalPage = (this.totalCount + itemsInAPage - 1) / itemsInAPage;
        long n = pageIndex / maxIndex;
        long lastPage = Math.min(maxIndex * (n+1), totalPage);
        for (long i = maxIndex * n + 1; i <= lastPage; i++) {
            html.append("<a href='#'");
            if (i == pageIndex) html.append(" class='on'");
            html.append(">").append(i).append("</a>\n");
        }

        html.append("\n<a href='#'>[다음]</a>\n")
            .append("<a href='#'>[마지막]</a>");

        return html.toString();
    }
}

public class Mission1_hw3 {
    public static void main(String[] args) {
        long totalCount = 127;
        long pageIndex = 1;

        Pager pager = new Pager(totalCount);
        System.out.println(pager.html(pageIndex));
    }
}