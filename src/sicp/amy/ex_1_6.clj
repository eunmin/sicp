(ns sicp.amy.ex-1-6)

(def 문제
  "Alyssa가 새로만든 new-if 프로시저로 제곱근 구할 때 어떤 일이 일어나는 지 설명하라.")

(defn new-if "if를 따라한 new-if" [predicate then-clause else-clause]
  (cond predicate then-clause
        :else else-clause))

(defn abs "절대값을 리턴한다" [a]
  (if (< a 0) (- a) a))

(defn squares "인자를 제곱한다" [a]
  (* a a))

(defn average "평균값 구한다" [a b]
  (float (/ (+ a b) 2)))

(defn good-enough "참 값에 충분히 가까운지" [guess x]
  (< (abs (- (squares guess) x)) 0.001))

(defn improve "참 제곱근에 더 까까운 값 구하기" [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter "제곱근 구하기" [guess x]
  (if (good-enough guess x)
      guess
      (sqrt-iter (improve guess x) x)))

; ; new-if 일 때,
; 일반 프로시저는 인자 먼저 계산법(applicative order)에 따르므로
; sqrt-iter 프로시저안에 else문 sqrt-iter를 evaluation하려다가 무한루프에 빠져 StackOverflowError 발생함.
; sicp.amy.ex-1-6=> (sqrt-iter 1 2)
; StackOverflowError   clojure.lang.Numbers$DoubleOps.multiply (Numbers.java:611)

; ; if 일 때,
; if문은 conditional expression으로 조건이 참이면 else-clause를 실행하거나 evaluation하지 않으므로 정상결과 출력함.
; sicp.amy.ex-1-6=> (sqrt-iter 1 2)
; 1.4142156862745097

(def 답
  "
  sicp.amy.ex-1-6=> (sqrt-iter 1 2)
  StackOverflowError   clojure.lang.Numbers$DoubleOps.multiply (Numbers.java:611)
  ")
