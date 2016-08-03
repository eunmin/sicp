(ns sicp.amy.ex-1-4)

(def 문제
  "엮은식의 연산자 자리에 복잡한 식이 다시 와도 앞에서 밝힌 규칙에 따라 식의 값을 구할 수 있다.
   다음 프로시저에 인자를 주고 어떻게 계산되는 지 밝혀보라.")

(defn a-plus-abs-b [a b]
  ((if (> b 0) + -) a b))

; ; 양수일 때
; ; step1. a b값에 인자 대입
; (a-plus-abs-b 3 5
;   ((if (> 5 0) + -) 3 5))
; ; step2. b(=5)는 0보다 크므로, +
; (a-plus-abs-b 3 5
;   (+ 3 5))
; ; step3. (+ 3 5) 연산
; 8
;
; ; 음수일 때
; ; step1. a b값에 인자 대입
; (a-plus-abs-b 3 -5
;   ((if (> -5 0) + -) 3 -5))
; ; step2. b(=-5)는 0보다 작으므로, -
; (a-plus-abs-b 3 -5
;   (- 3 -5))
; ; step3. (- 3 -5) 연산
; 8
(def 답
  "
  sicp.amy.ex-1-4=> (a-plus-abs-b 3 5)
  8
  sicp.amy.ex-1-4=> (a-plus-abs-b 3 -5)
  8
  ")
