public class Main {
    public static void main(String[] args) {
        sort();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    public static int[] list = {5,8,1,6,4,7,8,2,6,12};
    public static void sort(){
        int pos;
        int x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos>0 && x < list[pos - 1]){
                list[pos] = list[pos -1];
                pos--;
            }
            list[pos] = x;
        }
    }
}
