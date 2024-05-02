public class main {
    public static void main(String[] args) {

    StudentClass[] students = {
            new StudentClass("A", 55),
            new StudentClass("B", 90),
            new StudentClass("C", 60),
            new StudentClass("D", 75),
    };
    for(StudentClass jsd: students){
        if(jsd.grade>=60){
            System.out.println(jsd.name);
        }
    }


}
}
