public class MyObject {
    private String name;

    public MyObject(String name) {
        this.name = name;
        System.out.println("Created object: " +  this.name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing object: " +  this.name);
    }
}
