|# SICP 릴레이 문제 풀이

## 읽기표

| 목차 | 김은민 | 오광수 | 곽윤도 | 전다영글 | 이민선 | 김세시나 |
| ---- | ------ | ------ | ------ | -------- | ------ | -------- |
|1.1 프로그램 짤 때 바탕이 되는 것                                       |   |   |   |   |   |   |
|1.1.1 식                                                                |   |   |   |   |   |   |
|1.1.2 이름과 환경                                                       |   |   |   |   |   |   |
|1.1.3 엮은식(combination)을 계산하는 방법                               |   |   |   |   |   |   |
|1.1.4 묶음 프로시저(compound procedure)                                 |   |   |   |   |   |   |
|1.1.5 맞바꿈 계산법(substitution model)으로 프로시저를 실행하는 방법    |   |   |   |   |   |   |
|1.1.6 조건 식과 술어(predicate)                                         |   |   |   |   |   |   |
|1.1.7 연습 : 뉴튼 법(newton method)으로 제곱근 찾기                     |   |   |   |   |   |   |
|1.1.8 블랙박스처럼 간추린 프로시저                                      |   |   |   |   |   |   |
|1.2 프로시저와 프로세스                                                 |   |   |   |   |   |   |
|1.2.1 되돌거나(recursion) 반복하는(iteration) 프로세스                  |   |   |   |   |   |   |
|1.2.2 여러 갈래로 되도는 프로세스                                       |   |   |   |   |   |   |
|1.2.3 프로세스가 자라나는 정도                                          |   |   |   |   |   |   |
|1.2.4 거듭제곱                                                          |   |   |   |   |   |   |
|1.2.5 최대 공약수                                                       |   |   |   |   |   |   |
|1.2.6 연습 : 소수 찾기                                                  |   |   |   |   |   |   |
|1.3 차수 높은 프로시저(higher-order procedure)로 요약하는 방법          |   |   |   |   |   |   |
|1.3.1 프로시저를 인자로 받는 프로시저                                   |   |   |   |   |   |   |
|1.3.2 lambda로 나타내는 프로시저                                        |   |   |   |   |   |   |
|1.3.3 일반적인 방법을 표현하는 프로시저                                 |   |   |   |   |   |   |
|1.3.4 프로시저를 만드는 프로시저                                        |   |   |   |   |   |   |
|2.1 데이터 요약데이터 간추리기, 데이터 내용 감추기                      |   |   |   |   |   |   |
|2.1.1 연습 : 유리수를 위한 산술 연산                                    |   |   |   |   |   |   |
|2.1.2 요약의 경계(abstraction barrier)                                  |   |   |   |   |   |   |
|2.1.3 데이터란 무엇인가?                                                |   |   |   |   |   |   |
|2.1.4 집중 과제 : 구간 산술 연산 만들기                                 |   |   |   |   |   |   |
|2.2 계층 구조 데이터와 닫힘 성질                                        |   |   |   |   |   |   |
|2.2.1 차례열의 표현 방법                                                |   |   |   |   |   |   |
|2.2.2 계층 구조                                                         |   |   |   |   |   |   |
|2.2.3 공통 인터페이스로써 차례열의 쓰임새                               |   |   |   |   |   |   |
|2.2.4 연습 : 그림 언어                                                  |   |   |   |   |   |   |
|2.3 글자기호 데이터                                                     |   |   |   |   |   |   |
|2.3.1 따옴표 연산                                                       |   |   |   |   |   |   |
|2.3.2 연습 : 글자 식의 미분(symbolic differentiation)                   |   |   |   |   |   |   |
|2.3.3 연습 : 집합을 나타내는 방법                                       |   |   |   |   |   |   |
|2.3.4 연습 : 허프만 인코딩 나무                                         |   |   |   |   |   |   |
|2.4 요약된 데이터의 표현 방식이 여러 가지일 때                          |   |   |   |   |   |   |
|2.4.1 복소수 표현                                                       |   |   |   |   |   |   |
|2.4.2 타입을 표시한 데이터                                              |   |   |   |   |   |   |
|2.4.3 데이터 중심 프로그래밍과 덧붙임 성질                              |   |   |   |   |   |   |      
|2.5 일반화된 연산 시스템                                                |   |   |   |   |   |   |
|2.5.1 일반화된 산술 연산                                                |   |   |   |   |   |   |        
|2.5.2 타입이 다른 데이터를 엮어 쓰는 방법                               |   |   |   |   |   |   |                 
|2.5.3 연습 : 기호 식 대수                                               |   |   |   |   |   |   |
|3.1 덮어쓰기와 갇힌 상태(local state)                                   |   |   |   |   |   |   |                    
|3.1.1 갇힌 상태변수(local state variable)                               |   |   |   |   |   |   |            
|3.1.2 덮어쓰기가 있어서 좋은 점                                         |   |   |   |   |   |   |   
|3.1.3 덮어쓰기를 끌어들인 대가                                          |   |   |   |   |   |   |               
|3.2 환경 계산법                                                         |   |   |   |   |   |   |    
|3.2.1 계산 규칙                                                         |   |   |   |   |   |   |
|3.2.2 간단한 프로시저 계산하기                                          |   |   |   |   |   |   |    
|3.2.3 물체에 상태를 넣어두는 곳, 변수 일람표                            |   |   |   |   |   |   |                  
|3.2.4 안쪽 정의                                                         |   |   |   |   |   |   |
|3.3 변형 가능한 데이터로 프로그래밍하기                                 |   |   |   |   |   |   |        
|3.3.1 변형 가능한 리스트                                                |   |   |   |   |   |   |  
|3.3.2 큐                                                                |   |   |   |   |   |   |   
|3.3.3 표                                                                |   |   |   |   |   |   |
|3.3.4 디지털 회로 시뮬레이터                                            |   |   |   |   |   |   |                    
|3.3.5 관계 알리기(constraint propagation)                               |   |   |   |   |   |   |                                 
|3.4 병행성竝行性 : 시간은 중요하다                                       |   |   |   |   |   |   |                          
|3.4.1 병행 시스템에서 시간의 성질본질                                   |   |   |   |   |   |   |                              
|3.4.2 병행성을 다스리는 방법                                            |   |   |   |   |   |   |                    
|3.5 스트림                                                              |   |   |   |   |   |   |   
|3.5.1 스트림과 (계산을) 미룬 리스트                                     |   |   |   |   |   |   |                            
|3.5.2 무한 스트림(infinite stream)                                      |   |   |   |   |   |   |                           
|3.5.3 스트림 패러다임                                                   |   |   |   |   |   |   |             
|3.5.4 스트림과 셈미룸 계산법                                            |   |   |   |   |   |   |                   
|3.5.5 모듈로 바라본 함수와 물체                                         |   |   |   |   |   |   |                       

## 문제표


## 순서

- 김은민 todd `1.1 진행중`
- 오광수 andy
- 곽윤도 lester
- 전다영글 hogle
- 이민선 joony
- 김세시나 amy


## 문제 풀고 올리는 방법

### leiningen 설치
```bash
brew install leiningen
==> Downloading https://homebrew.bintray.com/bottles/leiningen-2.6.1.el_capitan.bottle.tar.gz
######################################################################## 100.0%
==> Pouring leiningen-2.6.1.el_capitan.bottle.tar.gz
==> Caveats
Dependencies will be installed to:
  $HOME/.m2/repository
To play around with Clojure run `lein repl` or `lein help`.

Bash completion has been installed to:
  /usr/local/etc/bash_completion.d

zsh completion has been installed to:
  /usr/local/share/zsh/site-functions
==> Summary
🍺  /usr/local/Cellar/leiningen/2.6.1: 8 files, 14.7M
```

### 프로젝트 clone
```
git clone https://github.com/eunmin/sicp.git
```

### 문제 풀어서 올리는 방법

- `연습문제 1.1`를 푼다고 하면 `src/sicp/ex_1_1.clj` 파일을 만들고 아래와 같은 형식으로 파일을 작성합니다.

```clojure
(ns sicp.ex-1-1)

(def 문제
  "두 숫자를 인자로 받아 두 값을 덧셈하여 내놓는 프로시저를 정의하라.")

;; 아래에 자유롭게 연습 문제 코드를 작성합니다.
(defn add [x y]
  (+ x y))
```

- 파일명은 _이고 `ns` 옆에 붙는 것은 - 인 것에 주의하세요.
- 서술형 문제인 경우 주석 `;; ` 뒤에 작성합니다.

### 문제 실행해 보기

- 프로젝트 최상위 폴더에서 아래와 같이 명령어를 입력해 REPL을 실행합니다.
```bash
lein repl
```

- 내가 작성한 연습문제를 로딩합니다.
```bash
user=> (ns sicp.ex-1-1)
sicp.ex-1-1=> (load "ex_1_1")
sicp.ex-1-1=> (add 1 2)
3
sicp.ex-1-1=>
```

- 파일을 고치고 다시 실행하려면 다시 로드 합니다.
```bash
sicp.ex-1-1=> (load "ex_1_1")
sicp.ex-1-1=> (add3 1 2)
6
sicp.ex-1-1=>
```

### 문제 파일을 다 작성하면 커밋 후 Push 하고 단톡방에 다했다고 메시지를 남깁니다.

## Scheme과 Clojure가 다른점

책은 Scheme으로 설명하고 있는데요. Clojure와 다른 부분들은 여기에 계속 남기겠습니다.

### 이름 붙이는 법

#### 일반 값
- Scheme
```scheme
(define size 2)
```
- Clojure
```clojure
(def size 2)
```

#### 프로시저 값
- Scheme
```scheme
(define (square x) (* x x))
```
- Clojure
```clojure
(defn square [x] (* x x))
```
