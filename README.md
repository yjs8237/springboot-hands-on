# springboot-handson

#### JDK 13 설치(기존에 자바가 설치되어있는경우 삭제하고 진행)
- [sdkman](https://sdkman.io/) - windows => [install git](https://git-scm.com/downloads) , [install zip](https://ranxing.wordpress.com/2016/12/13/add-zip-into-git-bash-on-windows/)
```bash
$ sdk help
$ sdk list java 
$va  sdk install java  12.0.2.j9-adpt
$ sdk list java 
$ java -version
$ sdk list gradle
$ sdk install gradle 5.6.3
$ gradle --version
```


#### intellij 세팅
- Settings > Build, Execution, Deployment > Build Tools > Gradle > gradle jvm 13 설정
- open module settings > jdk 12 설정(C:\Users\USER\.sdkman\candidates\java\12.0.2.hs-adpt) 
- plugin 설치
  - Atom Meterial Icons
  - Lombok
  - Rainbow Brackets
- Font 설치
  - [d2coding font](https://github.com/naver/d2codingfont)
  - intellij font 설정(enable ligature)
- Lombok 관련 세팅
  - Build, Execution, Deployment > Compiler > Annotation Processors > Enable annotation processing 체크

#### intellij 사용법
[Working with source code](https://www.jetbrains.com/help/idea/2019.2/working-with-source-code.html?utm_campaign=IC&utm_content=2019.2&utm_medium=link&utm_source=product)
