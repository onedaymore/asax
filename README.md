# asax
x
rabbitMQ windows
1、erl8.3
2、rabbitMQ
3、切到安装目录rabbitmq-plugins enable rabbitmq_management 安装 RabbitMQWeb的管理插件
4、rabbitmqctl.bat list_users 查看用户列表
5、rabbitmqctl.bat add_user anday4 andayfour@163.com 新建用户
6、rabbitmqctl.bat set_user_tags anday4 administrator 授权
6-1、rabbitmqctl.bat set_permissions -p / anday4 ".*" ".*" ".*" 授权
=======
访问地址：http://127.0.0.1:15672/
