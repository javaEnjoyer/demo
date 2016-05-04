package annotation;

import java.lang.annotation.*;

/**
 * Created by zhy on 16/4/25.
 */
public class AnnotationDemo {
    /*
        自定义注解:
            使用@interface自定义注解时,继承Java.lang.annotation.Annotation接口.
            被定义的注解不能再继承其他的注解或接口.注解中的每一个方法实际上相当于声明配置参数.
            其中的方法的名称就是参数的名称,方法不能有任何的参数和throws语句,方法的返回值就是参数的类型(返回值类型只能是基本数据类型 class
            String enum Annotation),同时可以使用default关键字来声明参数的默认值.
     */

    /**
     * 自定义注解
     */
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Table{
        String value();
    }

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Column{
        /*
            列名
         */
        String column() default "";
        /*
            类型
         */
        String type() default "";
        /*
            大小
         */
        int size() default 0;

    }


}
