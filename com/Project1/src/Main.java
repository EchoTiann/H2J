public class Main {
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        System.out.println(garen.name + " 当前的血量是 " +garen.hp);
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        System.out.println("回血1000");
        garen.recovery(1000.0f);
        System.out.println("现在的血量是:" + garen.hp);

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
        teemo.recovery(30.0f);

        Ltem blood = new Ltem();
        blood.name = "血瓶";
        blood.price = 50;

        Ltem shoe = new Ltem();
        shoe.name = "草鞋";
        shoe.price = 300;

        Ltem sword = new Ltem();
        sword.name = "长剑";
        sword.price = 350;
    }
}