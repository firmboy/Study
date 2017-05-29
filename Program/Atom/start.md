
# Start Atom

  ## 1.下载地址：https://atom.io/，下载对应的版本

  ## 2.介绍一下Atom，如果使用过sublime的请跳过，这是一个github项目组开发的编辑器，最大的特点就是，能够通过安装插件和主题。

  ## 3.下面介绍一下我认为的核心，packages和themes这两个部件，介绍一个安装格式化json数据的插件pretty json

    a.第一种方式安装，因为国内网络的原因，不建议使用，但是还是要介绍一下
    开启Atom之后，win下输入shift+ctrl+p打开命令行，然后输入svo按下回车键
    就开启了atom的设置界面，我们点击左侧的Install，然后在输入框输入pretty json，
    注意要选择安装packages而不是themes，搜索出来后，点击install就可以了。
    b.第二种方式是通过atom自带的apm命令，不建议使用，还是网络的原因，我测试的
    是很慢，使用这种方式的前提是你配置了apm的path。不懂的小白，我再这里在解释一下
    找到atom的安装目录，找到里面的bin目录，将这个目录配置到环境变量path中，具体过程百度。配置完成后，打开cmd窗口，然后输入apm install pretty json等待就可以了。友情提示很慢。
    c.现在介绍最后一种，也是安装最快的一种，但是有点小麻烦。前提，已安装了git。
    现在说一下git的安装。下载地址：https://git-scm.com/downloads 注意对应系统
    。下载完成后直接安装就好，全部是默认，因为现在说别的也不懂。安装完成后，找到
    系统盘的用户下面找到.atom这个文件夹，然后进入packages这个文件夹。打开我们的Atom，然后和第一种一样去搜索pretty json,搜索到之后，点击进去，找到view on
    Atom.io这个按钮，点击，会在浏览器打开一个页面，点击Repo，找到这个插件对应的github仓库，然后点击clone or download复制地址。然后在我们刚才打开的.atom文件夹下面的packages中右键选择Git Bash Here 在打开的窗口输入
    git clone 复制的地址,回车即可。
    下载完成后，进入这个文件夹中，然后右键，选择Git Bash Here ，输入命令npm install，如果你没见过npm这个命令，说明你还没有认识Node.js。可以先了解一下Node.js后再来使用Atom，因为Atom就是通过Node.js实现的。最后一种方式是最快的，但是了解的东西有点多。
  ## 4.themes这个模块就是设置我们的Atom的ui界面的，他的安装和packages是一样的就不做介绍了。
  ## 5.安装nodejs的一键运行，下载script包即可
