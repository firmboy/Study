# gradle转为maven
## 1.在build.gradle文件中 最上面加入apply plugin:'maven'
## 2.加入下面这个task
```
task writeNewPom {
    pom {
        project {
            inceptionYear '2008'
            licenses {
                license {
                    name 'The Apache Software License, Version 2.0'
                    url 'http://www.apache.org/licenses/LICENSE-2.0.txt'
                    distribution 'repo'
                }
            }
        }
    }.writeTo("$buildDir/pom.xml")
}
```
## 3.在终端运行build
## 4.最终会在build目录中生成pom.xml文件
