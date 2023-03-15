package cn.ypj.wowsrankbackend.entity;

import lombok.Data;

@Data
public class Basic {
    // levelingTier 表示用户在游戏中的等级，用整数表示，例如1代表等级1，2代表等级2等等。
    private int levelingTier;

    // createdAt 表示用户账号的创建时间，通常使用 Unix 时间戳表示，即从 1970 年 1 月 1 日开始计时的秒数。
    private int createdAt;

    // levelingPoints 表示用户在游戏中的经验值，用整数表示，经验值越高，代表用户在游戏中的等级越高。
    private int levelingPoints;

    // karma 表示用户在游戏中的口碑值，用整数表示，口碑值越高代表用户在游戏中表现越好。
    private int karma;

    // lastBattleTime 表示用户最近一次战斗的时间，通常使用 Unix 时间戳表示。
    private int lastBattleTime;
}
