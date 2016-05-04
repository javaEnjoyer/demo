package annotation;

import java.lang.reflect.Field;

/**
 * 注解解释器
 *      注解并不会影响代码的运行，
 *      因此必须配合解析器使用，
 *      否则注解和注释也没什么具体的区别了。
 *      使用Java反射API中的 AnnotatedElement 接口可以方便进行注解的解析。
 */
public class AnnotationUtil{
    public static void parse(Class<?> target) {
        AnnotationDemo.Table table = target.getAnnotation(AnnotationDemo.Table.class);
        System.out.println("数据库表名: " + table.value());

        Field[] fields = target.getDeclaredFields();
        for (Field field : fields) {
            AnnotationDemo.Column column = field.getAnnotation(AnnotationDemo.Column.class);
            System.out.println("列名: " + column.column() +
                    ",数据类型" + column.type() +
                    ",数据大小" + column.size());
        }

    }

}