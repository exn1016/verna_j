package nx.kakuma.yuufuku.qiao.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    private static final Pattern LD_PIPELINE_URL = Pattern.compile("^(?:http|https)://devops.woa.com/console/pipeline/([^/]+)/([^/]+)/detail/([^/]+)(?:/|/executeDetail)?$");
    private static final Pattern QCI_PIPELINE_URL = Pattern.compile("^(?:http|https)://(?:dev.|test.)?zhiyan.woa.com/qci/([^/]+)/pipeline/#/pipeline/detail/([^/]+)/build/([^/]+)/pipeline");

    public static void main(String[] args) {
        Matcher matcher = QCI_PIPELINE_URL.matcher("https://zhiyan.woa.com/qci/10379/pipeline/#/pipeline/detail/b-27b32d88fa4440488eea42702eed1d11/build/abc/pipeline");
        System.out.println(matcher.find());
        System.out.println(matcher.groupCount());
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));
        System.out.println(matcher.group(3));
    }
}
