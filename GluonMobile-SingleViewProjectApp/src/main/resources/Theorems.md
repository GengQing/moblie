### 定义定理

1. $x \rightarrow *, * 可以是x_0, x_0^-,x_0^+, \infty, -\infty, +\infty$

2. 判断选择题,先用定义定理判断,再用结论判断,然后用反证法,最后举反例.

### 关于函数的奇偶性

1. 两函数的乘积的奇偶性符合:正(偶)负(奇)数乘积的正负性
2. 两函数的复合函数的奇偶性符合:其中一个偶函数就是偶函数,否则是奇函数

### 关于有界和无界的充分条件

1. 设$\lim_{x\rightarrow x_0^-} f(x)$存在, 则存在$\delta \gt 0,当-\delta \lt x-x_0 \lt 0时,f(x)$有界.  
对$x\rightarrow x_0^+, x_0$同理有界.

2. 设$\lim_{x\rightarrow \infty} f(x)$存在, 则存在$X \gt 0, 当|X| \gt 0是,f(x)$有界.  
对$x\rightarrow \pm\infty$同理有界.

3. 设$f(x)在[a,b]上连续,则f(x)在[a,b]上有界$

4. 设$f(x)在[a,+\infty]上连续, 且\lim_{x\rightarrow +\infty} f(x)存在,则f(x)在[a,+\infty]上有界$.  
同理$[-infty,a]$有界

5. 设$f(x)在数集U上有最大值(最小值),则f(x)在U有上界(下界)$

6. 有界函数与有界函数和与积均为有界函数

7. 设$\lim_{x\rightarrow *} = \infty,则f(x)在*的去心领域内无界,但其逆不成立$

### 函数极限存在的充要条件

$$
\lim_{x \rightarrow x_0} f(x)=A的充要条件是f(x_0^-)=f(x_0^+)
$$

### 数列极限存在的冲要条件

$$
\lim_{n \rightarrow \infty} u_n = A的冲要条件是\lim_{n \rightarrow \infty} u_{2n} = \lim_{n \rightarrow \infty} u_{2n+1}
$$

### 极限的唯一性

若极限存在,则极限必唯一

### 存在极限与无穷小的关系

$$
\lim_{x \rightarrow *} f(x)=A的冲要条件是f(x)-A=\alpha(x),\lim_{x \rightarrow *} \alpha(x)=0
$$

### 极限的保号性

$$
设\lim_{x \rightarrow *} f(x)=A,且A \neq 0, 则存在 * 的一个去心领域,在此领域内, f(x)与A同号
$$

### 极限保号性的推论

$$
设存在 * 的一个去心领域,在此领域内,f(x) \ge 0(或 \le 0), 且\lim_{x \rightarrow *} f(x)存在且等于A, 则A \ge 0(或 \le 0).\\
[f(x) \gt 0(或 \lt 0) 仍然成立]
$$

### 无穷小与无穷大的关系

1. 设$\lim_{x \rightarrow *} f(x) = \infty,则 \lim_{x \rightarrow *} \frac 1 {f(x)} = 0$

1. 设$\lim_{x \rightarrow *} f(x) = 0 且f(x) \ne 0,则 \lim_{x \rightarrow *} \frac 1 {f(x)} = \infty$
