package March.Mutilthreading;

public class Threads {
    public static void main(String[] args) {

        Thread t= Thread.currentThread();

        System.out.println(t);

        for (int i=1;i<5;i++){
            System.out.println(t.getName()+"------>>>"+t.getPriority());

            try {
                Thread.sleep(3000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }


    }
}
