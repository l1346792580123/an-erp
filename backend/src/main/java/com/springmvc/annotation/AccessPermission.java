package com.springmvc.annotation;

/**
 * 系统权限，配置注解和拦截器进行权限检查
 * @see PermissionRequired
 * @see com.springmvc.interceptor.AccessPermissionInterceptor
 */
public enum AccessPermission {

    // 货品
    PRODUCT_ADD("PRODUCT@ADD"), PRODUCT_UPDATE("PRODUCT@UPDATE"),
    PRODUCT_REMOVE("PRODUCT@REMOVE"), PRODUCT_CATEGORY("PRODUCT@CATEGORY"),

    // 物料
    MATERIAL_ADD("MATERIAL@ADD"), MATERIAL_UPDATE("MATERIAL@UPDATE"),
    MATERIAL_REMOVE("MATERIAL@REMOVE"), MATERIAL_CATEGORY("MATERIAL@CATEGORY"),

    // 订单
    ORDER_ADD("ORDER@ADD"), ORDER_UPDATE("ORDER@UPDATE"),
    ORDER_REMOVE("ORDER@REMOVE"), ORDER_AUDIT("ORDER@AUDIT"),
    ORDER_PRODUCE("ORDER@PRODUCE"), ORDER_DELIVERY("ORDER@DELIVERY"),
    ORDER_CANCEL("ORDER@CANCEL"),

    // 客户
    CLIENT_ADD("CLIENT@ADD"), CLIENT_UPDATE("CLIENT@UPDATE"),
    CLIENT_REMOVE("CLIENT@REMOVE"),

    // 生产
    PRODUCTION_DRAW_ADD("PRODUCTION@DRAW_ADD"), PRODUCTION_DRAW_UPDATE("PRODUCTION@DRAW_UPDATE"),
    PRODUCTION_DRAW_REMOVE("PRODUCTION@DRAW_REMOVE"), PRODUCTION_DRAW_AUDIT("PRODUCTION@DRAW_AUDIT"),
    PRODUCTION_RETURN_ADD("PRODUCTION@RETURN_ADD"), PRODUCTION_RETURN_UPDATE("PRODUCTION@RETURN_UPDATE"),
    PRODUCTION_RETURN_REMOVE("PRODUCTION@RETURN_REMOVE"), PRODUCTION_RETURN_AUDIT("PRODUCTION@RETURN_AUDIT"),

    // 货品库存
    PRODUCT_INSTOCK_ADD("PRODUCT_STOCK@INSTOCK_ADD"), PRODUCT_INSTOCK_UPDATE("PRODUCT_STOCK@INSTOCK_UPDATE"),
    PRODUCT_INSTOCK_REMOVE("PRODUCT_STOCK@INSTOCK_REMOVE"), PRODUCT_INSTOCK_AUDIT("PRODUCT_STOCK@INSTOCK_AUDIT"),
    PRODUCT_INSTOCK_FINISH("PRODUCT_STOCK@INSTOCK_FINISH"),
    PRODUCT_OUTSTOCK_ADD("PRODUCT_STOCK@OUTSTOCK_ADD"), PRODUCT_OUTSTOCK_UPDATE("PRODUCT_STOCK@OUTSTOCK_UPDATE"),
    PRODUCT_OUTSTOCK_REMOVE("PRODUCT_STOCK@OUTSTOCK_REMOVE"), PRODUCT_OUTSTOCK_AUDIT("PRODUCT_STOCK@OUTSTOCK_AUDIT"),
    PRODUCT_OUTSTOCK_FINISH("PRODUCT_STOCK@OUTSTOCK_FINISH"),

    // 物料库存
    MATERIAL_INSTOCK_ADD("MATERIAL_STOCK@INSTOCK_ADD"), MATERIAL_INSTOCK_UPDATE("MATERIAL_STOCK@INSTOCK_UPDATE"),
    MATERIAL_INSTOCK_REMOVE("MATERIAL_STOCK@INSTOCK_REMOVE"), MATERIAL_INSTOCK_AUDIT("MATERIAL_STOCK@INSTOCK_AUDIT"),
    MATERIAL_INSTOCK_FINISH("MATERIAL_STOCK@INSTOCK_FINISH"),
    MATERIAL_OUTSTOCK_ADD("MATERIAL_STOCK@OUTSTOCK_ADD"), MATERIAL_OUTSTOCK_UPDATE("MATERIAL_STOCK@OUTSTOCK_UPDATE"),
    MATERIAL_OUTSTOCK_REMOVE("MATERIAL_STOCK@OUTSTOCK_REMOVE"), MATERIAL_OUTSTOCK_AUDIT("MATERIAL_STOCK@OUTSTOCK_AUDIT"),
    MATERIAL_OUTSTOCK_FINISH("MATERIAL_STOCK@OUTSTOCK_FINISH"),

    // 仓库
    WAREHOUSE_ADD("WAREHOUSE@ADD"), WAREHOUSE_UPDATE("WAREHOUSE@UPDATE"),
    WAREHOUSE_REMOVE("WAREHOUSE@REMOVE"),

    // 采购
    SUPPLIER_ADD("PURCHASE@SUPPLIER_ADD"), SUPPLIER_UPDATE("PURCHASE@SUPPLIER_UPDATE"),
    SUPPLIER_REMOVE("PURCHASE@SUPPLIER_REMOVE"),

    // 成本
    STOCK_COST("COST@STOCK_COST"),

    // 研发
    DEVELOPMENT_DRAW_ADD("DEVELOPMENT@DRAW_ADD"), DEVELOPMENT_DRAW_UPDATE("DEVELOPMENT@DRAW_UPDATE"),
    DEVELOPMENT_DRAW_REMOVE("DEVELOPMENT@DRAW_REMOVE"), DEVELOPMENT_DRAW_AUDIT("DEVELOPMENT@DRAW_AUDIT"),
    DEVELOPMENT_RETURN_ADD("DEVELOPMENT@RETURN_ADD"), DEVELOPMENT_RETURN_UPDATE("DEVELOPMENT@RETURN_UPDATE"),
    DEVELOPMENT_RETURN_REMOVE("DEVELOPMENT@RETURN_REMOVE"), DEVELOPMENT_RETURN_AUDIT("DEVELOPMENT@RETURN_AUDIT"),

    // 用户
    ADMIN_ADD("ADMIN@ADD"), ADMIN_UPDATE("ADMIN@UPDATE"),
    ADMIN_REMOVE("ADMIN@REMOVE"), ADMIN_ROLE("ADMIN@ROLE");

    public final String permission;

    AccessPermission(String permission) {
        this.permission = permission;
    }
}
