import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);
        Cat one = applicationContext.getBean("cat", Cat.class);
        Cat two = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean.getMessage());
        System.out.println(bean == bean2);
        System.out.println(one == two);
    }
}