package cn.ypj.wowsrankbackend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class PlayerData {
    private long spa_id;
    private String name;
    private boolean hidden;
    private Statistics  statistics;
}

@Data
class Statistics {
    @JsonProperty("clan")
    private Stat clan;

    @JsonProperty("pvp")
    private Stat pvp;

    @JsonProperty("club")
    private Stat club;

    @JsonProperty("rank_solo")
    private Stat rank_solo;
}
@Data
class Stat {

    private long premium_exp;

    private int frags;

    private int battles_count;

    private long exp;

    private int wins;
}
