package JavaSergeyClass;


public class HW6_8 {
    public static void main(String[] args) {
        String[][] array = {{"Privet", "vsem", "kto"}, {"izycheat", "yazik", "programirovanie"}, {"java"}};
        int quat =0;
        for (int i=0; i<array.length; i++) {
            String[] subarray = array[i];
                for (int j=0; j<subarray.length; j++){
                    if (subarray[j].indexOf('e') > -1) {
                        quat++;
                        System.out.println(subarray[j]);

                    }
                }
            }
        System.out.println(quat);
        }
    }

