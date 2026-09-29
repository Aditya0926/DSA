package Strings.StringBuilder;

public class changeChar {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("PROGRAMING");
        // sb.append(" World");
        // sb.append(true);
        // System.out.println(sb);
        // sb.insert(5," ");
        // sb.insert(6, "World");
        // System.out.println(sb);
        // sb.delete(5, sb.length());
        sb.deleteCharAt(1);
        System.out.println(sb);
    }
}
