# gradle安装
## 1.下载gradle的安装文件https://services.gradle.org/distributions/gradle-3.5-all.zip
## 2.讲解压的文件放到/opt/soft文件夹下
## 3.配置环境变量 export GRADLE_HOME=/opt/soft/gradle
                PATH=$PATH:$GRADLE_HOME/bin
## 4.生效环境变量 source /etc/profile
## 5.测试：gradle -v
