  # Command

  ## 1.设置自己提交代码的名字和邮箱
       git config --global user.name “”
       git config --global user.email ""
  ## 2.git init : 初始化一个git仓库
  ## 3.git add : 向git仓库新添加一个文件
  ## 4.git Command -m : 将刚刚执行的操作提交到仓库中
      需要注意的是：-m 这个参数是不能随便省略 后面添加的是这次提交的一个说明
  ## 5.git status : 查看当前git仓库的状态，可以看到被修改的文件，未提交的修改
  ## 6.git diff :对于某一个具体的文件可以查看修改的详细信息
  ## 7.git log : 查看git操作的历史记录
      需要注意的是：显示在一行的话要加上--pretty=oneline
  ## 8.git reset --hard HEAD^ 或者--hard HEAD~1 ：这是用来恢复到当前版本的前1个版本
      需要注意的是：-- hard 后面还可以跟某一个具体的commit的id
      通过这个id，我们就可以恢复到那个操作的时候
  ## 9.git reflog : 显示每一次的操作的id
  ## 10.git checkout -- test.js :将新最近的修改消除，前提是没有执行add命令
      需要注意的是：如果修改完之后执行了add命令，那么可以通过git reset HEAD
      test.js来讲刚才的add操作就取消了，然后再执行checkout命令就恢复了
  ## 11.git rm:删除一个文件的时候使用，现在本地删除，然后执行rm命令再提交就可以了
  ## 12.git push origin master：将本地的主分支提提交到远程仓库
  ## 13.git remote rename <旧名称> <新名称>：将远程推送的仓库的名字修改
