(ns sicp.amy.ex-1-8)

(def 문제
  "제곱근 프로시저처럼, 아래식을 써서 세제곱근 프로시저를 짜라.")

(defn abs "절대값을 리턴한다" [a]
  (if (< a 0) (- a) a))

(defn cube "인자를 세제곱한다" [a]
  (* a a a))

(defn good-enough "참 값에 충분히 가까운지" [guess x]
  (< (abs (- (cube guess) x)) 0.001))

(defn improve "참 제곱근에 더 까까운 값 구하기" [guess x]
  (/ (+ (/ x (squares guess))
        (* 2 guess))
     3))

(defn cuberoot-iter "세제곱근 구하기" [guess x]
   (if (good-enough guess x)
       guess
       (cuberoot-iter (improve guess x)
                      x)))

(defn cuberoot [x]
  (cuberoot-iter 1.0 x))

(def 답
  "
  sicp.amy.ex-1-8=> (cuberoot 9)
  2.0801035255095734
  sicp.amy.ex-1-8=> (cuberoot 27)
  3.0000005410641766
  sicp.amy.ex-1-8=> (cuberoot 64)
  4.000017449510739
  ")
