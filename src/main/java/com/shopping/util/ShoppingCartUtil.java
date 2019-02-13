package com.shopping.util;

import java.util.UUID;

import org.springframework.util.StringUtils;

/**
 * The Class ShoppingCartUtil.
 */
public class ShoppingCartUtil {

    public static boolean checkForValidUUID(String uuidString) {
	if (null != UUID.fromString(uuidString)) {
	    return true;
	}
	return false;
    }

    public static boolean checkForNotNullAndEmpty(String param) {
	if (!StringUtils.isEmpty(param)) {
	    return true;
	}
	return false;
    }
}
