package cn.ypj.wowsrankbackend.entity;

import lombok.Data;

@Data
public class RankSolo {
    private int maxFragsByMain; // 主炮最多摧毁敌舰的次数
    private int hitsByAtba; // 高射炮击中次数
    private int shotsByMain; // 主炮发射次数
    private int maxFragsByMainVehicle; // 主炮摧毁敌舰次数最多的舰船ID
    private int maxFragsByTpdVehicle; // 鱼雷摧毁敌舰次数最多的舰船ID
    private int shipsSpotted; // 发现敌舰的数量
    private int maxScoutingDamage; // 最高侦察伤害值
    private int premiumExp; // 高级账户获得的经验总数
    private int droppedCapturePoints; // 摧毁敌方占领点的数量
    private int maxFragsVehicle; // 摧毁敌舰次数最多的舰船ID
    private int maxFragsByDbomb; // 深水炸弹摧毁敌舰次数最多的舰船ID
    private int controlCapturedPoints; // 控制的占领点数量
    private int maxPremiumExpVehicle; // 高级账户经验最多的舰船ID
    private int maxPlanesKilled; // 最多击落敌方飞机的数量
    private int maxExpVehicle; // 经验值最多的舰船ID
    private int battlesCount; // 总战斗次数
    private int planesKilled; // 击落的敌方飞机数量
    private int fragsByTpd; // 鱼雷摧毁敌舰次数
    private int maxShipsSpotted; // 发现敌舰数量最多的舰船ID
    private int maxFragsByRam; // 通过撞击摧毁敌舰的最大次数
    private int maxTotalAgroVehicle; // 承受敌方火力最多的舰船ID
    private int maxFragsByRamVehicle; // 通过撞击摧毁敌舰最多的舰船ID
    private int maxPlanesKilledVehicle; // 击落敌方飞机数量最多的舰船ID
    private int maxDamageDealtVehicle; // 造成伤害最多的舰船ID
    private int maxFragsByDbombVehicle; // 深水炸弹摧毁敌舰次数最多的舰船ID
    private int survived; // 存活的场次
    private int scoutingDamage; // 侦察伤害总数
    private int maxShipsSpottedVehicle; // 发现敌舰数量最多
    private int fragsByAtba; // 高射炮摧毁敌舰次数
    private int controlDroppedPoints; // 丢失控制的占领点数量
    private int maxDamageDealt; // 最大单场造成伤害
    private int maxFragsByTpd; // 鱼雷最多摧毁敌舰次数
    private int maxPremiumExp; // 单场最高高级账户经验
    private int hitsByTpd; // 鱼雷击中次数
    private int maxFragsByAtba; // 高射炮最多摧毁敌舰次数
    private int tpdAgro; // 鱼雷吸引敌方火力的次数
    private int maxScoutingDamageVehicle; // 侦察伤害最高的舰船ID
    private int teamControlCapturedPoints; // 团队共同控制的占领点数量
    private int wins; // 胜利场次
    private int losses; // 失败场次
    private int hitsByMain; // 主炮击中次数
    private int winAndSurvived; // 胜利且存活的场次
    private int damageDealt; // 造成的总伤害
    private int fragsByMain; // 主炮摧毁敌舰次数
    private int teamControlDroppedPoints; // 团队失去控制的占领点数量
    private int maxFrags; // 单场最多击杀次数
    private int exp; // 总获得经验值
    private int maxExp; // 单场最高经验值
}
