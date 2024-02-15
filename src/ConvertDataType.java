public class ConvertDataType {
    static short methodOne(long l)
    {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);//Dari sini 0.25 hilang dikarenakan byte tidak menyimpan nilai dibelakang koma
        System.out.println(b);
    }

}
