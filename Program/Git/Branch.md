# Branch
  ## 1.创建一个分支：git checkout -b dev
      需要注意的是：这一条命令实际上相当于两条git branch dev，git checkout dev
  ## 2.查看当前分支：git branch
  ## 3.切换分支：git checkout master
  ## 4.合并指定分支到当前分支：git merge
      需要注意的是：通常，合并分支时，如果可能，Git会用Fast forward模式，但这种模式下，删除分支后，会丢掉分支信息。如果要强制禁用Fast forward模式，Git就会在merge时生成一个新的commit，这样，从分支历史上就可以看出分支信息。
      实例：git merge --no-ff -m "merge with no-ff" dev
  ## 5.删除指定分支 git branch -d dev
  ## 6.查看分支的合并日志：git log --graph --pretty=oneline --abbrev-commit
  ## 7.对bug的修复操作：
      1.首先将当前正在开发的内容保存一下，但不是提交：执行一下git stash保存当前操作
      2.然后回到要修改bug的分支，并创建一个新的分支，修改完成后，合并到原先的分支，然后删除修改的分支。
      3.再次回到刚才开发的分支，git stash list可以查看一下当前stash区域内的内容，然后通过git stash apply来恢复，并且通过git stash drop删除，也可以通过git stash pop 来一次实现上面两个步骤。
  ## 8.强行删除一个分支：git branch -D dev
