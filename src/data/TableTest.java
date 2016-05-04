package data;

import annotation.AnnotationDemo;

/**
 * Created by zhy on 16/4/25.
 */
@AnnotationDemo.Table("测试表")
public class TableTest {
    @AnnotationDemo.Column(column = "名字", type = "java.lang.String", size = 12)
    private String name;
    @AnnotationDemo.Column(column = "年龄", type = "java.lang.int", size = 12)
    private int age;

}
