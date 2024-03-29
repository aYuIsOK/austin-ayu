package com.ayu.austin.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 业务类型枚举
 */
@Getter
@ToString
@AllArgsConstructor
public enum BusinessCode {

    COMMON_SEND("send", "普通发送"),

    RECALL("recall", "撤回消息");


    /** code 关联着责任链的模板 */
    private String code;

    /** 类型说明 */
    private String description;


}