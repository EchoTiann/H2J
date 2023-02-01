public class Armor extends Ltem{

    int ac;
    public static void main(String[] args) {
        Armor armor = new Armor();
        armor.ac = 10;
        armor.price = 350;
        armor.name = "锁子甲";
        System.out.println(armor.toString());
    }

    @Override
    public String toString() {
        return ac +"" + price + "" + name;
    }
}
