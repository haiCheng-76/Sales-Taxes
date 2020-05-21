# 简介

### 项目说明

基于SpringCloud微服务框架完成一个税费计算模块，使用了如下组件：
* Eureka:注册中心
* Feign: HTTP请求调用框架
* Ribbon:客户端负载均衡工具

### 模块说明

* eureka-server: 注册中心
* goods-server: 商品服务，对商品的新增，获取等
* calculate-server: 税费计算服务
* commo-server: 工具包

### 演示
* 演示地址：http://120.79.180.167:8765/
* 注册中心地址：http://120.79.180.167:8761/

### 本地启动
启动顺序：eureka-server > goods-server > calculate-server 
* 注册中心地址：http://127.0.0.1:8761/
* 主页：http://127.0.0.1:8765/

![img](./img/coding.png)

### 测试结果
* 第一组数据
![img](./img/input1.png)
* 第二组数据
![img](./img/input2.png)
* 第三组数据
![img](./img/input3.png)

### 原题
Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt. Import duty is an additional sales tax applicable on all imported goods at a rate of 5%, with no exemptions.
When I purchase items I receive a receipt which lists the name of all the items and their price (including tax), finishing with the total cost of the items, and the total amounts of sales taxes paid.  The rounding rules for sales tax are that for a tax rate of n%, a shelf price of p contains (np/100 rounded up to the nearest 0.05) amount of sales tax.
Write an application that prints out the receipt details for these shopping baskets... 
#### INPUT
###### Input 1
* 1 book at 12.49
* 1 music CD at 14.99
* 1 chocolate bar at 0.85

###### Input 2
* 1 imported box of chocolates at 10.00
* 1 imported bottle of perfume at 47.50

##### Input 3
* 1 imported bottle of perfume at 27.99
* 1 bottle of perfume at 18.99
* 1 packet of headache pills at 9.75
* 1 box of imported chocolates at 11.25
#### OUTPUT
##### Output 1
* 1 book: 12.49
* 1 music CD: 16.49
* 1 chocolate bar: 0.85
* Sales Taxes: 1.50
* Total: 29.83

##### Output 2
* 1 imported box of chocolates: 10.50
* 1 imported bottle of perfume: 54.65
* Sales Taxes: 7.65
* Total: 65.15

##### Output 3
* 1 imported bottle of perfume: 32.19
* 1 bottle of perfume: 20.89
* 1 packet of headache pills: 9.75
* 1 box of imported chocolates: 11.85
* Sales Taxes: 6.70
* Total: 74.68

### 拓展点
1. 税率的独立配置，避免重启服务
2. 加入熔断器，避免对接口的狂刷（接口保护）
