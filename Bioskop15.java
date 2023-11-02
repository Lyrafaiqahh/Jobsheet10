public class Bioskop15 {
    public static void main(String[] args) {
        String [][] penonton = new String[4][2];
        penonton[0][0] = "Amiin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        // nomer 3
        penonton [3][1] = "Hana";

        // nomer 4
        System.out.println("-------nomer 4---------");
        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);
        // nomer 4

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        // nomer 5 for loop
        System.out.println("-------nomer 5---------");
        System.out.println(penonton.length);
        for (int i = 0; i< penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length);
        }
        // nomer 10 for loop
        System.out.println("-------nomer 10---------");
        System.out.println("Penonton pada baris ke-3: ");
        for (int i =0; i< penonton[2].length; i++){
            System.out.println(penonton[2][i]);
        }
        //  for loop


        // nomer 6 foreach loop
        System.out.println("-------nomer 6---------");
        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }
        // nomer 11 foreach loop
        System.out.println("-------nomer 11---------");
        System.out.println("Penonton pada baris ke-3: ");
        for (String i : penonton[2]) {
            System.out.println(i);
        }
        // nomer 12  tampilkan nama penonton untuk setiap baris
        System.out.println("-------nomer 12---------");
        for (int i = 0; i < penonton.length; i++){
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", \n", penonton[i]));
        }
        // foreach loop
    }
}