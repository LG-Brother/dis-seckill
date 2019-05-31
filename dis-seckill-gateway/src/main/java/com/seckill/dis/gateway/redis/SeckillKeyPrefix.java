package com.seckill.dis.gateway.redis;


/**
 * 判断秒杀状态的key前缀
 *
 * @author noodle
 */
public class SeckillKeyPrefix extends BaseKeyPrefix {

    public SeckillKeyPrefix(String prefix) {
        super(prefix);
    }

    public SeckillKeyPrefix(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static SeckillKeyPrefix isGoodsOver = new SeckillKeyPrefix("isGoodsOver");
    public static SeckillKeyPrefix seckillPath = new SeckillKeyPrefix(60, "seckillPath");
    // 验证码5分钟有效
    public static SeckillKeyPrefix seckillVerifyCode = new SeckillKeyPrefix(5 * 60, "seckillVerifyCode");
}
