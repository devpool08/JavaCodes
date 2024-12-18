package G_GenericsJava;


public class gen6 implements gen5<Integer> {
    private  int  i;

    @Override
    public void add(Integer item) {
        i=item;
    }

    @Override
    public Integer get() {
        return 0;
    }


    public static void main(String[] args) {

    }

}
