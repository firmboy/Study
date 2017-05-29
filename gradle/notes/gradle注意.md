# 使用gradle应该注意的地方
## 1.通过命令行给为gradle设置JVM的参数非常不推荐
## 2.gradle执行多个task
```
a.从命令行顺序输入多个命令就能顺序执行这也命令和这些命令的依赖，并且每个命令只执行一次
b.可以通过-x选项将依赖中要执行的task去除掉
c.通过--continue选项可以讲出现错误的task忽略掉，但是依赖处错误的task的task将不会执行，因为不安全
d.在命令行中不一定要将task的名字全部输入，只有能唯一确定这个task就可以，还可以通过多个单词的大小写来确定这个单词
e.可以通过-b选项选择要执行的build文件，当使用-b选项时，setting.gradle文件将不会被使用
f.-p选项是指定要执行的文件夹的目录，在多项目的创建时，要使用-p选项，而不是-b选项,但是前面要加上-q：gradle -q -p subdir hello
```
## 3.获取build的详细信息
### a.gradle tasks 和加上--all选项的区别：不加all则只会显示那些指明个分组的task，加上all之后就会显示所有的task，所以没有指明分组的task叫做hidden task
### b.gradle -q projects 会显示子项目的信息
### c.gradle -q help  --task libs这样会显示libs这个task的详细信息
### 
