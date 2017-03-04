# carlabboard

- simple 10 item board
- spring boot, jpa-hibernate, h2db, embedded tomcat, jsp, jstl, react-native
- OneToOne Mapping, Bi-directional

## spring-boot-hibernate

```
- 개발모드로 실행: gradle bootRun
- war 파일 생성: gradle clean build (build/libs/carlabboard-0.0.1-SNAPSHOT.war)
- war 파일 실행: java -jar build/libs/carlabboard-0.0.1-SNAPSHOT.war
- 서버로 war 파일 복사: scp build/libs/carlabboard-0.0.1-SNAPSHOT.war root@xxx.xxx.xxx.xxx:~
```

## react-native

```
- cd mobile/carlabboard
- npm install
- react-native run-ios or react-native run-android
```

## react-native 개발환경 설치 안되었다면 아래 순서로 설치 (mac 기준)
 
```
- Homebrew install
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

brew install watchman
brew install flow

node js 설치

npm install -g react-native-cli

react-native run-ios

안드로이드 개발을 위해서는 안드로이드 sdk 셋팅 후 기기 연결 뒤
react-native run-android
```


## react-native 개발 중 캐시 비우기 (참고).
> watchman watch-del-all && rm -fr $TMPDIR/react-* & npm start --reset-cache (캐시 지우기)


