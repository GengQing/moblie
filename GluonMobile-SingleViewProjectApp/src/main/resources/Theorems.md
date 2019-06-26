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

2. 设$\lim_{x \rightarrow *} f(x) = 0 且f(x) \ne 0,则 \lim_{x \rightarrow *} \frac 1 {f(x)} = \infty$

### 夹逼定理

1) 设在*的去心领域内$g(x) \le f(x) \le h(x)$;
2) $\lim_{x \rightarrow *} g(x) = \lim_{x \rightarrow *} h(x) = A,$  
则$\lim_{x \rightarrow *} f(x) = A$

[注]夹逼定理对数列也成立,$A换成 \pm\infty$也成立.

### 单调有界定理

1) 设$u_n$单调增加且有上界$M$,则$\lim_{n \rightarrow \infty} u_n存在且 \le M$;
2) 设$u_n$单调减少且有下界$m$,则$\lim_{n \rightarrow \infty} u_n存在且 \ge m$;

[注]单调有界定对函数极限也成立

### $x \rightarrow 0$时几个重要极限

$$
\begin{aligned}
&\lim_{x \rightarrow 0} \frac{\sin x}{x} = 1\\
&\lim_{\varphi(x) \rightarrow 0} \frac{\sin \varphi(x)}{\varphi(x)} = 1,其中\varphi(x) \ne 0\\
&\lim_{n \rightarrow \infty}\sqrt[n]n = 1\\
&\lim_{n \rightarrow \infty}\sqrt[n]a = 1(a\gt0)\\
&\lim_{x \rightarrow +\infty} x^k e^{-\delta x} = 0(k\gt0, \delta \gt0)\\
&\lim_{x \rightarrow 0^+} x^k \ln^{\delta} x = 0(k\gt0, \delta \gt0)
\end{aligned}
$$

### 几个重要等价无穷小

$$
\begin{aligned}
&\sin x  \sim  x, \tan x  \sim  x\\

&\arcsin x \sim x, \arctan x \sim x\\

&1-\cos x  \sim  \frac {x^2} 2\\

&\sec x - 1 =\frac 1{\cos x} -1 \sim \frac {x^2}2\\

&e^x-1 \sim x, a^x-1 \sim x\ln a \\

&\ln (1+x) \sim x, \log_a (1+x) \sim \frac x{\ln a}\\

&\sqrt {1+x}-1 \sim \frac x2, (1+x)^a-1 \sim ax\\
& x^m+x^k \sim x^m,其中常数 k \gt m \gt 0
\end{aligned}
$$

### 极限的四则运算

设$\lim_{x \rightarrow *} u(x)$存在且等于$A$,
$\lim_{x \rightarrow *} v(x)$存在且等于$B$,  
则下限运算法则成立:  

1) $\lim_{x \rightarrow *} [u(x) \pm v(x)] = \lim_{x \rightarrow *} u(x) + \lim_{x \rightarrow *} v(x) = A \pm B$
2) $\lim_{x \rightarrow *} [u(x)v(x)] = [\lim_{x \rightarrow *} u(x)][\lim_{x \rightarrow *} v(x)] = AB$
3) $\lim_{x \rightarrow *} Cu(x) = C\lim_{x \rightarrow *} u(x)=CA,其中C是常数$
4) $\lim_{x \rightarrow *} [u(x)/v(x)] = [\lim_{x \rightarrow *} u(x)] / [\lim_{x \rightarrow *} v(x)] = A/B, 其中B\ne 0$
5) $\lim_{x \rightarrow *} u(x)=0, 且在 * 的去心领域内k(x)有界,则\lim_{x \rightarrow *} k(x)u(x)=0$

[注]  
1 以上法则对数列也成立  
2 零比零极限不能使用除法法则

### 等价无穷小替换定理

设$x \rightarrow * 时 \alpha (x) \sim a(x),\beta (x) \sim b(x)$, 则

$$
\lim_{x \rightarrow * } \frac{\alpha (x) \delta (x)}{\beta (x) \gamma (x)} = \lim_{x \rightarrow * } \frac{a(x)\delta (x)}{b(x)\gamma (x)}
$$

[注]  

1) 上式的意义是,如果右边极限存在,则左边等于右边,若右边为无穷或其他形式的不存在,
则左边也是无穷或其他形式的的不存.  
2) 整个因式乘除能用等价无穷小替换,加减不能用等价无穷小替换,部分因式乘除不能用等价无穷小替换.

### 等价无穷小的冲要条件

$$
当x \rightarrow 0时,\alpha (x) \sim \beta (x)时的充要条件是: \\
\alpha (x) - \beta (x)= o(\beta (x))
$$

### 洛必达法则零比零型

设

1) $\lim_{x \rightarrow *} f(x)=0, \lim_{x \rightarrow *} g(x)=0$;
2) $f(x),g(x)在 * 的去心领域内可导,且g'(x) \ne 0$
3) $\lim_{x \rightarrow *} [ \frac {f'(x)}{g'(x)}] = A(或\infty)$

则

$$
\lim_{x \rightarrow *} \frac {f(x)}{g(x)} = \lim_{x \rightarrow *} \frac {f'(x)}{g'(x)}
$$

### 洛必达法则无穷比无穷

设

1) $\lim_{x \rightarrow *} f(x)=\infty, \lim_{x \rightarrow *} g(x)=\infty$;
2) $f(x),g(x)在 * 的去心领域内可导,且g'(x) \ne 0$
3) $\lim_{x \rightarrow *} [ \frac {f'(x)}{g'(x)}] = A(或\infty)$

则

$$
\lim_{x \rightarrow *} \frac {f(x)}{g(x)} = \lim_{x \rightarrow *} \frac {f'(x)}{g'(x)}
$$

[注] 使用洛必达法则求导后如果极限不存在(非无穷的)并不能确定极限不存在, 应该改用其他方法

### 带佩亚诺余项的泰勒公式

设$f(x)在x=x_0处n阶可导$,则有公式

$$
f(x)=f(x_0)+f'(x_0)(x-x_0)+\frac 1{2!} f''(x_0)(x-x_0)+\cdots +
\frac 1{n!} f^{(n)}(x_0)(x-x_0)^n + o((x-x_0)^n)
$$

### 在$x=0$处展开的佩亚诺余项泰勒公式

$$
\begin{aligned}
&e^x=1+x+\frac{1}{2!} x^2 + \frac{1}{3!}x^3+...\\

&(1+x)^a=1+ax + \frac{a(a-1)}{2!}x^2 + \frac{a(a-1)(a-2)}{3!}x^3+...\\

&\frac{1}{1-x}=1+x+x^2+x^3+...\\

&\frac{1}{1+x} = 1-x+x^2-x^3+...\\

&\ln (1-x) = -x-\frac{1}{2}x^2- \frac{1}{3}x^3 + \cdots\\

&\ln (1+x) = x-\frac{1}{2}x^2+ \frac{1}{3}x^3 + \cdots\\

&\tan x=x+\frac{x^3}{3}+\cdots\\

&\arctan x=x-\frac{x^3}{3}+\cdots\\

&\sin x=x-\frac{1}{3!}x^3+\cdots\\

&\cos x=1-\frac{1}{2!}x^2+\frac{1}{4!}x^4+\cdots\\
\end{aligned}
$$

### 利用积分和求极限
