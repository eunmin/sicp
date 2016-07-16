# SICP 릴레이 문제 풀이

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

