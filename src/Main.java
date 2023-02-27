public class Main {
    public static void main(String[] args) {

        Student st = new Student("Johnny", "12R");
        Student st2 = new Student("Simone", "12R");
        Student st3 = new Student("Charlene", "12L");


        DynamicStudent ds = new DynamicStudent();

        ds.insert(st, 0);
        ds.insert(st2, 0);
        ds.insert(st3);

        System.out.println(ds);
        System.out.println();

        // now delete
        ds.delete(st);
        System.out.println(ds);


    }
}