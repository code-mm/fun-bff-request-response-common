package com.bdlbsc.common.api;

public interface IMAPI {

    // 获取最近消息列表
    String IM_GET_MESSAGE_LIST= "im/get/message/list";
    // 获取房间类型
    String IM_GET_ROOM_TYPE = "im/get/room/type";
    // 获取房间人员列表
    String IM_GET_ROOM_MEMBER = "im/get/room/member";
    // 获取房间聊天历史内容
    String IM_GET_ROOM_MESSAGE_CONTENT = "im/get/room/message/content";

}
