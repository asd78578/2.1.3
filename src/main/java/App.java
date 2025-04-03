import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        var bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());

        boolean comparisonBinsHelloWorld = bean1 == bean2;
        System.out.println(comparisonBinsHelloWorld);

        var cat1 = applicationContext.getBean("cat", Cat.class);
        var cat2 = (Cat) applicationContext.getBean("cat", Cat.class);
        System.out.println(cat1);
        System.out.println(cat2);

        boolean comparisonBinsCat = cat1 == cat2;
        System.out.println(comparisonBinsCat);
    }
}