package org.cyjr.enums;

import java.util.HashMap;
import java.util.Map;

/** 
* @ClassName: BorrowTypeEnum 
* @Description: 标类型枚举
* @author liyongfu@tomcat360.com
* @date 2016年10月10日 下午7:47:14 
* @copyright 浙江雄猫软件开发有限公司 
*/
public enum BorrowTypeEnum {
	/**
	 * 标类型1
	 */
	BIAOTYPE1(1,"标类型1"),
	
	/**
	 * 标类型2
	 */
	BIAOTYPE2(2,"标类型2"),
	
	/**
	 * 标类型3
	 */
	BIAOTYPE3(3,"标类型3");
	
	
	
	private Integer value;

    private String message;

    private BorrowTypeEnum(Integer value, String message) {
        this.value = value;
        this.message = message;
    }

    public Integer getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public static BorrowTypeEnum getByValue(Integer value) {
        if (value != null) {
            for (BorrowTypeEnum enu : values()) {
                if (enu.value.equals(value)) {
                    return enu;
                }
            }
        }
        return null;
    }
    
    public static Map<String, String> enumToMap() {
        Map<String, String> map = new HashMap<String, String>();
        for (BorrowTypeEnum enu : values()) {
            map.put(enu.value + "", enu.message);
        }
        return map;
    }
}
