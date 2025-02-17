package Feb.Inheritence;

public class SuperKeyword {
    public static void main(String[] args) {

        Mother m=new Mother(2000);
        m.Money(200);

        Daughter d=new Daughter();
        System.out.println(d.Father(200));

        m.Food(false);
        d.Food(true);


        System.out.println(d.Brother(10));
        System.out.println(d.Father(500));



    }

}


class Mother {
    int moneyAvailable;
    public Mother(int moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

     Mother(){
         System.out.println("I am DC");
    }

    void Food(boolean hungry) {
        if (hungry) {
            System.out.println("Eat food already kept on dining table");
        } else {
            System.out.println("No requirement of Food");
        }
    }
        void Money(int needMoney){
            this.moneyAvailable=moneyAvailable-needMoney;
            System.out.println(this.moneyAvailable);
    }
}
class Daughter extends Mother implements i1{

    @Override
    public int Brother(int needMoney) {

        System.out.println(super.moneyAvailable);

        if (super.moneyAvailable==0){
            System.out.println("No money is left with mother");
        }
        else{
            super.moneyAvailable=moneyAvailable-needMoney;
        }
        return super.moneyAvailable;
    }

    @Override
    public int Father(int GiveMoney) {
        return GiveMoney;
    }
}

interface i1{
    int Brother(int needMoney);

    int Father(int GiveMoney);

}