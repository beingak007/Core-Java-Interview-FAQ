package in.collections;
enum Color
{
    Red,Blue,Green;
    public void info()
    {
        System.out.println("Univ. Color");
    }

}
class EnumerationDemo8
{
    public static void main(String[] arr)
    {
        Color b[]=Color.values();
        for(Color b1:b)
        {
            b1.info();
        }
    }
}