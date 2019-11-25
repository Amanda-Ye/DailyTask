public class RichAndStranger {
    public static void main(String[] args) {
        int stranger = 30 * 10;  //以万元为单位（每天10万元）
        int rich = 0;    //以分为单位（1，2，4，8，...）
        int day = 1;    //两人彼此交换给钱30天
        for(int i = 0;i < 30;i++){
            rich += day;
            day *= 2;
        }
        System.out.print(stranger + " " + rich);
        System.out.println();
    }
}
