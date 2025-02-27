package Feb.GenricClass;

    class Test <T> {

        T obj;

        Test(T obj) {
            this.obj = obj;
        }

        T getObject() {
            return this.obj;
        }

        public static void main(String[] args) {

            System.out.println("------------------------>>>>>>>>>>>");


            Test<String> test= new Test<>("Shubham");
            System.out.println(test.getObject());

            Test<Integer> test1=new Test<>(1234);
            System.out.println(test1.getObject());

            Test<Double> test2=new Test<>(2.586);
            System.out.println(test2.getObject());
        }
    }
