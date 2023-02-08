package com.project1;

public class Standings {

    /**
     * 击杀
     */
    protected Integer kill;
    /**
     * 死亡
     */
    protected Integer die;
    /**
     * 助攻
     */
    protected Integer assist;
    /**
     * 金钱
     */
    protected Float money;
    /**
     * 补刀
     */
    protected Integer knife;
    /**
     * 攻速
     */
    protected Float attackSpeed;
    /**
     * 击杀语音
     */
    protected String killVoice;
    /**
     * 被杀语音
     */
    protected String dieVoice;

    @Override
    public String toString() {
        return "com.project1.Standings{" +
                "击杀=" + kill +
                ", 死亡=" + die +
                ", 助攻=" + assist +
                ", 金钱=" + money +
                ", 补刀=" + knife +
                ", 攻速=" + attackSpeed +
                ", 击杀语音='" + killVoice + '\'' +
                ", 死亡语音='" + dieVoice + '\'' +
                '}';
    }

    public Standings(Integer kill, Integer die, Integer assist, Float money, Integer knife, Float attackSpeed, String killVoice, String dieVoice) {
        this.kill = kill;
        this.die = die;
        this.assist = assist;
        this.money = money;
        this.knife = knife;
        this.attackSpeed = attackSpeed;
        this.killVoice = killVoice;
        this.dieVoice = dieVoice;
    }
}
