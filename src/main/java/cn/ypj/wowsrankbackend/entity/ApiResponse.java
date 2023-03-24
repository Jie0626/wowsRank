package cn.ypj.wowsrankbackend.entity;

import lombok.Data;

import java.util.List;

@Data
public class ApiResponse {

    private String status;

    private List<PlayerData> data;

}
