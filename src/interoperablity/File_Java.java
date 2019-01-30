package interoperablity;

public class File_Java {

    public static void main(String[] args) {

        // Calling Kotlin Function
        int resp = TestFile.add(30, 40);
        System.out.println("Resp From KOT CLASS " + resp);

        int arearesp = TestFile.calculatearea(3, 12);
        System.out.println("Resp From KOT CLASS JVMOVERLOADS " + arearesp);
    }

    public static int area(int x, int y) {
        return x * y;
    }
}
