
public class StringPractice {
    String name = "John Doe";

    public static void main(String[] args) {
        StringPractice sp = new StringPractice();
        System.out.println("Name " + sp.name);
        System.out.println("Length of name " + sp.name.length());
        System.out.println("Upper case " + sp.name.toUpperCase());
        System.out.println("Lower case " + sp.name.toLowerCase());
        System.out.println("First character " + sp.name.charAt(0));
        System.out.println("Substring " + sp.name.substring(0, 4));
        System.out.println("Index of 'o' " + sp.name.indexOf('o'));
        System.out.println("Last index of 'o' " + sp.name.lastIndexOf('o'));
        System.out.println("\nString concatenation: " + sp.name.concat(" is a student."));
        String parts[] = sp.name.split(" ");
        System.out.println("Split example: " + parts[0]);
        System.out.println("Split example: " + parts[1]);
        StringPractice sp2 = new StringPractice();
        sp2.name = new String("John Doe");
        System.out.println("sp name :" + sp.name);
        System.out.println("sp2 name :" + sp2.name);
        System.out.println("Comparing strings with '==': " + (sp.name == sp2.name));
        System.out.println("Comparing strings with 'equals()': " + sp.name.equals(sp2.name));
    }

}
