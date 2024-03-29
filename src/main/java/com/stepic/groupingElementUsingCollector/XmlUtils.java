package com.stepic.groupingElementUsingCollector;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class XmlUtils {

    public static Map<String, Long> countAllByTagName(List<XmlFile> files, String tagName) {
        return files.stream()
                .collect(Collectors.groupingBy(XmlFile::getEncoding,
                        Collectors.filtering(xml -> xml
                                .getTags()
                                .stream()
                                .anyMatch(tag -> tag
                                        .getName()
                                        .contains(tagName)), Collectors.flatMapping(xml -> xml
                                .getTags()
                                .stream(), Collectors.counting())
                        )));
    }

    public static void main(String[] args) {
        List<XmlFile> xmlFiles = List.of(
                new XmlFile("1", "UTF-8", List.of(new Tag("function"), new Tag("load"))),
                new XmlFile("2", "UTF-8", List.of(new Tag("table"), new Tag("main"))),
                new XmlFile("3", "ASCII", List.of(new Tag("row"), new Tag("column"))),
                new XmlFile("4", "ASCII", List.of(new Tag("sheet"), new Tag("row"))),
                new XmlFile("5", "ASCII", List.of(new Tag("sheet"), new Tag("column")))
        );

        System.out.println(countAllByTagName(xmlFiles, "function"));
    }
}

class Tag {
    private final String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class XmlFile {
    private final String id;
    private final String encoding;
    private final List<Tag> tags;

    public XmlFile(String id, String encoding, List<Tag> tags) {
        this.id = id;
        this.encoding = encoding;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public String getEncoding() {
        return encoding;
    }
}

