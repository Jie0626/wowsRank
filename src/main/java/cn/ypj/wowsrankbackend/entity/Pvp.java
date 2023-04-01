package cn.ypj.wowsrankbackend.entity;

import lombok.Data;

@Data
public class Pvp{

    //主要数据
    private int battlesCount;               //战斗总数
    private int wins;                       //胜利场数
    private int losses;                     //失败场数
    private int damageDealt;                //总伤害
    private int shipsSpotted;               //船只侦查数
    private int frags;                      //总击杀数
    private int survived;                   //存活的场数
    private int scoutingDamage;             //总侦查伤害
    private int originalExp;                //总经验（无高账加成）
    private int exp;                        //经验（大概是包括所有模式的总经验，虽然没啥用，但留着吧）
    private int artAgro;                    //总潜在伤害
    private int tpdAgro;                    //总鱼雷潜在伤害
    private int winAndSurvived;             //胜利并存活场数
    private int controlDroppedPoints;       //总防御点数
    private int controlCapturedPoints;      //总占领点数
    private int teamControlCapturedPoints;  //团队总占领点数
    private int teamControlDroppedPoints;   //团队总防御点数
    private int planesKilled;               //总飞机击落数

    //最大记录
    private int maxFragsByPlanes;           //最多通过飞机击杀数
    private int maxTotalAgro;               //最多潜在伤害
    private int maxShipsSpotted;            //最多船只侦查数
    private int maxFragsByRam;              //最多冲撞击杀
    private int maxScoutingDamage;          //最大侦查伤害
    private int maxFragsByDbomb;            //最多深水炸弹击杀
    private int maxFragsByMain;             //最多主炮击杀
    private int maxPlanesKilled;            //最多飞机击落
    private int maxDamageDealt;             //最大伤害
    private int maxFragsByTpd;              //最多鱼雷击杀
    private int maxExp;                     //最多经验（无高账加成）
    private int maxFragsByAtba;             //最多副炮击杀数
    private int maxFrags;                   //最多击杀数

    //武器击杀数据
    private int fragsByRam;                 //冲撞击杀数
    private int fragsByTpd;                 //鱼雷击杀数
    private int fragsByPlanes;              //通过飞机击杀数
    private int fragsByDbomb;               //深水炸弹的击杀数
    private int fragsByAtba;                //副炮击杀数
    private int fragsByMain;                //主炮击杀数
    //通过起火或进水击杀 = 总击杀 - 上面的累加

    //武器命中数据
    private int hitsByMain;                 //命中的主炮数
    private int shotsByMain;                //发射的主炮数
    private int hitsBySkip;                 //命中的跳弹数
    private int shotsBySkip;                //发射的跳弹数
    private int hitsByAtba;                 //命中的副炮数
    private int shotsByAtba;                //发射的副炮数
    private int hitsByRocket;               //命中的火箭弹数
    private int shotsByRocket;              //发射的火箭弹数
    private int hitsByBomb;                 //命中的炸弹数
    private int shotsByBomb;                //投掷的炸弹数
    private int hitsByTpd;                  //命中的鱼雷数
    private int shotsByTpd;                 //发射的鱼雷数
    private int hitsByTbomb;                //命中的空袭炸弹数
    private int shotsByTbomb;               //投掷的空袭炸弹数

    //删除的数据
    /*
    "damage_dealt_to_buildings": 0,         对建筑伤害总量
    "max_damage_dealt_to_buildings": 0,     最大对建筑伤害
    "max_premium_exp": 4076,                最大经验（有高账加成）
    "premium_exp": 156963,                  总经验（有高账加成）
    "dropped_capture_points": 0,            ......(什么勾八)
    "capture_points": 0,                    ......(什么勾八)
    "max_suppressions_count": 0,            ......(什么勾八)
    "suppressions_count": 0,                ......(什么勾八)
    "battles_count_0910": 74,               0.9.10版本后战斗场数
    "battles_count_078": 74,                0.7.8版本后战斗场数
    "battles_count_0711": 74,               0.7.11版本后的战斗场数
    "battles_count_512": 74,                0.5.12版本后的战斗场数
    "battles_count_510": 74,                0.5.10版本后的战斗场数
     */

}
