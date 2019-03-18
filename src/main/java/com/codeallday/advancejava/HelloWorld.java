package com.codeallday.advancejava;

import com.google.common.collect.Sets;
import org.apache.http.client.utils.URIBuilder;

import java.net.URISyntaxException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HelloWorld {

    public static void main(String args[]) throws URISyntaxException {
//        String endpoint = "https://helloworld.com/blah";
//
//        URIBuilder b = new URIBuilder(endpoint);
//        b.addParameter("and", "this");
//
//        System.out.println(b.build().toString());
//
//
//        String url = "http://ypatel-wsm.internal.salesforce.com:6109";
//
//        System.out.println(url.substring(url.lastIndexOf("//") + 2 , url.indexOf(".")));
//
//        System.out.println(endpoint.substring(0, 3));
//
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Hello", 1);
//        if(Objects.isNull(map.get("bye"))) System.out.println("Hello");;
//        map.get("Hello");
//
//        Set<String> whoIds = Sets.newHashSet();
//        List<String> names = Arrays.asList("Chris", "HTML", "CSS", "XML", "CSS", "CSS");
//        whoIds.addAll(names.stream().filter(id -> id.startsWith("C")).collect(Collectors.toList()));
//        System.out.println(whoIds);

        List<String> names = Arrays.asList("Chris", "HTML", "CSS", "XML", "CSS", "CSS");
        System.out.println(names.stream().limit(20).collect(Collectors.toList()));

        String[] myStringArray = {"a","b","c"};
        foo(myStringArray);

        Pattern EMAIL_PATTERN = Pattern.compile(
                "\\b[\\w_._%+-]+@[\\w-.]+\\.\\w\\w+\\b");
        Matcher matcher = EMAIL_PATTERN.matcher("Matt Newton <matt.newton@theaccessgroup.com>");
        if(matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println(
                EMAIL_PATTERN.
                        matcher("Matt Newton <matt.newton@theaccessgroup.com>").find());
    }

    static void foo(String ... a) {
        System.out.println(a.length);
    }

}


