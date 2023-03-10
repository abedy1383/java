class khati {
    public static int LinearSearch(int[] data, int key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                 return i;
            }
        }
        return -1;
   }
    public static void main(String[] args) {
        int data[] = {5,4,8,22,56,32,24};
   
        int index = LinearSearch(data, 4);
        if (index>=0) {
            System.out.println("hast dr index : "+index);
        }else{
            System.out.println("dadash sahit ro avaz kn ");
        }
   
   }
}
