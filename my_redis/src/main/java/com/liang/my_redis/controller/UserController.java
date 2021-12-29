package com.liang.my_redis.controller;

/**
 * @author 刘亮
 * @date 2021年 12月15日21:50
 */

import com.liang.my_redis.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.data.redis.core.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * 针对jedis客户端中大量api进行了归类封装,将同一类型操作封装为operation接口
 * ValueOperations：简单K-V操作
 * SetOperations：set类型数据操作
 * ZSetOperations：zset类型数据操作
 * HashOperations：针对map类型的数据操作
 * ListOperations：针对list类型的数据操作
 *
 *开启事务
 *redisTemplate.multi();
 *    // do something
 *     关闭事务
 *redisTemplate.exec();
 */
@RestController
@SuppressWarnings("all")
public class UserController {

    @Autowired
    private RedisTemplate redisTemplate;


    @GetMapping("/set")
//    /*每十秒更新数据库数据*/
//    @Scheduled(cron ="*/10 * * * * ?")
    public void set() {
        User users =new User();
        users.setUsersName("张三");
        users.setUsersId(2);
        //存的时候自动序列化
        redisTemplate.opsForValue().set("users", users);
//        redisTemplate.opsForValue().
//        redisTemplate.e
        //ValueOperations：简单K-V操作
//        ValueOperations valueOperations = redisTemplate.opsForValue();

//        valueOperations.set("kk","vv");
    }

    @GetMapping("/get/{key}")
    public User get(@PathVariable("key") String key) {
        //取的时候反序列化
        return (User) redisTemplate.opsForValue().get(key);
    }

    @GetMapping("/string")
    public String stringTest() {
        redisTemplate.opsForValue().set("str", "Hello,World");

        return (String) redisTemplate.opsForValue().get("str");
    }

    @GetMapping("/list")
    public List<String> listTest() {
        ListOperations<String, String> list = redisTemplate.opsForList();
        //存
        list.leftPush("list", "Hello");
        list.leftPush("list", "world");
        list.leftPush("list", "java");
        //取
        List<String> listget = list.range("list", 0, -1);
        return listget;
    }

    @GetMapping("/opsForset")
    public Set<String> testSet() {
        SetOperations setOperations = redisTemplate.opsForSet();
        //不会存储重复
        setOperations.add("set", "Hello");
        setOperations.add("set", "Hello");
        setOperations.add("set", "World");
        setOperations.add("set", "World");
        setOperations.add("set", "Java");
        setOperations.add("set", "Java");
//        Set set = setOperations.members("set");
        return setOperations.members("set");
    }

    @GetMapping("/zset")
    public Set<String> testZset() {
        //有序集合
        ZSetOperations zSetOperations = redisTemplate.opsForZSet();
        zSetOperations.add("zset", "Hello", 2);
        zSetOperations.add("zset", "World", 1);
        zSetOperations.add("zset", "哈哈哈", 1);
        zSetOperations.add("zset", "Java", 3);
        Set set = zSetOperations.range("zset", 0, -1);
        return set;
    }

    @GetMapping("/hash")
    public Map<String, String> testHash() {
        HashOperations<String, String, String> hashOperations = redisTemplate.opsForHash();
        //hashOperations.put("emp", "id", "1");
        //hashOperations.put("emp", "name", "张三");
        Map<String, String> emp = hashOperations.entries("emp");
        System.err.println(emp);
        return emp;
        //System.out.println(hashOperations.get("emp", "id"));
        //System.out.println(hashOperations.get("emp", "name"));
    }

    @GetMapping("insertTp")
    public Object insertTp() throws IOException {
        URL url = null;
        try {
            url = new URL("https://tse1-mm.cn.bing.net/th/id/R-C.88a752fb9098b76ca7a086b1ccab1c06?rik=NFfqX%2fBR4Vfz8w&riu=http%3a%2f%2fup.keaitupian.com%2fpic%2f36%2f4b%2f0c%2f364b0c79962d8ca0ebcf2854d09dd267.jpg&ehk=r5TrPF0qI1w7q%2fwThHSrL3zvBUZZZDnBdhiZ79WIRFA%3d&risl=&pid=ImgRaw&r=0");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        BufferedImage read = ImageIO.read(url);

        redisTemplate.opsForValue().set("img",read);
        Object img = redisTemplate.opsForValue().get("img");
        System.out.println(img.getClass());
        return img;
    }

    public static void main(String[] args) {
        verifyCode("10086");
    }
    //3 验证码校验
    public static void getRedisCode(String phone,String code) {

        //从redis获取验证码
        Jedis jedis = new Jedis("39.108.55.93",6379);
        jedis.auth("wang_zai");
        //验证码key
        String codeKey = "VerifyCode"+phone+":code";
        String redisCode = jedis.get(codeKey);
        //判断
        if(redisCode.equals(code)) {
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
        jedis.close();
    }

    //2 每个手机每天只能发送三次，验证码放到redis中，设置过期时间120
    public static void verifyCode(String phone) {
        //连接redis
        Jedis jedis = new Jedis("39.108.55.93",6379);
        jedis.auth("wang_zai");
        //拼接key
        //手机发送次数key
        String countKey = "VerifyCode"+phone+":count";
        //验证码key
        String codeKey = "VerifyCode"+phone+":code";

        //每个手机每天只能发送三次
        String count = jedis.get(countKey);
        if(count == null) {
            //没有发送次数，第一次发送
            //设置发送次数是1
            jedis.setex(countKey,24*60*60,"1");
        } else if(Integer.parseInt(count)<=2) {
            //发送次数+1
            jedis.incr(countKey);
        } else if(Integer.parseInt(count)>2) {
            //发送三次，不能再发送
            System.out.println("今天发送次数已经超过三次");
            jedis.close();
        }

        //发送验证码放到redis里面
        String vcode = getCode();
        jedis.setex(codeKey,120,vcode);
        jedis.close();
    }

    //1 生成6位数字验证码
    public static String getCode() {
        Random random = new Random();
        String code = "";
        for(int i=0;i<6;i++) {
            int rand = random.nextInt(10);
            code += rand;
        }
        return code;
    }

}

