public class Hero {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    float getHp() {
        return hp;
    }

    float getArmor() {
        return armor;
    }

    void legendary() {
        System.out.println("你已经超越神了");
    }

    void recovery(float blood) {
        hp += blood;
    }

    void addSpeed(int speed) {
        moveSpeed += speed;
    }

    void keng() {
        System.out.println("太坑了！");
    }

}
