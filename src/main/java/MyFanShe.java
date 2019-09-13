import java.lang.reflect.Method;
public class MyFanShe {
    private String name ;
    public void setName(String name) {
        System.out.println("aa");
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void say(){}
}
class TestDemo {
    public static void main(String[] args) throws Exception {
         Class cls=Class.forName("MyFanShe");
         Object obj=cls.newInstance();
         Method md=cls.getMethod("setName", String.class);
         md.invoke(obj,"aa");

    }
}