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

### 函数极限的定义

$\lim_{x \rightarrow *} f(x) =A \Rightarrow 对任意小\varepsilon \gt 0, 总存在 * 的一个去心领域,使得|f(x)-A| \lt \varepsilon$.

### 函数极限存在的充要条件

$$
\lim_{x \rightarrow x_0} f(x)=A的充要条件是f(x_0^-)=f(x_0^+)=A.
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

### 利用积分和式求极限

$设f(x)在[0,1]$上连续则:

$$
\begin{aligned}
\int_0^1 f(x)dx = \lim_{n\rightarrow \infty} \frac{1}{n}\sum_{i=1}^n f(\frac{i}{n})\\
 = \lim_{n\rightarrow \infty} \frac{1}{n}\sum_{i=0}^{n-1} f(\frac{i}{n})
 \end{aligned}
$$

### 函数在一点处连续的定义

设函数$f(x)在x=x_0某领域内有定义$, 且有

$$
\lim_{x \rightarrow x_0} f(x) = f(x_0)
$$

则称$f(x)在x=x_0$处连续.

### 函数在一点左连续和右连续

设函数$f(x)在x=x_0左侧某领域x_0-\delta \lt x \le x_0内有定义$, 且有

$$
\lim_{x \rightarrow x_0^-} f(x) = f(x_0)
$$

则称$f(x)在x=x_0$处左连续, 同理定义右连续.

### 函数在$(a, b)内,[a,b]上$连续

函数$f(x)在(a,b)$内每一点都连续,则称f(x)在(a,b)内连续.  
若在开区间内连续且$x=a处右连续,在x=b处左连续,则称f(x)在[a,b]上连续$

### 第一类间断点-可去间断点

函数$f(x),在x=x_0的去心领域内有定义$

1) $\lim_{x \rightarrow x_0}$存在, 但$f(x_0)$无定义
2) $\lim_{x \rightarrow x_0}$存在, 但与$f(x_0)$不相等

### 第一类间断的-跳跃间断点

函数$f(x),在x=x_0的去心领域内有定义$,在$x=x_0$的左极限和右极限都存在  
但不相等,此时不论$f(x_0)$是否存在.

### 第二类间断点

函数$f(x),在x=x_0的去心领域内有定义$, 左极限和右极限至少有一个不存在.

### 连续函数的四则运算

设$u(x),v(x)在x=x_0$处连续,则四则运算后所得的函数在$x=x_0$处也连续,除法要求分明不为0.

### 复合函数的连续性

设$f(u)在u=u_0$处连续,$g(x),在x=x_0处连续且g(x_0)=u_0, 那么f(g(x)) 在x=x_0$处连续.

### 基本初等函数和初等函数在他们的定义域上都是连续的

### 闭区间上连续函数的性质

设$f(x)在[a,b]$上连续,则具有以下性质

1) $f(x)在[a,b]$上有界(有界性定理)
2) $f(x)在[a,b]$上有最大值$M$和最小值$m$(最值定理)
3) 设$m \le u \le M 或(f(a) \le u \le f(b)), 则至少存在一点\xi \in [a,b], 使得f(\xi)=u$(介值定理)
4) 设$f(a)f(b) \lt 0, 则至少存在一点\xi \in (a,b), 使得f(\xi)=0$(零点定理)

### 导数的定义

设$f(x)在x=x_0$的某领域有定义, 如果

$$
\lim_{x \rightarrow x_0} \frac{f(x)-f(x_0)}{x-x_0}
$$

存在, 则$f(x), 在x=x_0$处可导,且极限函数在该点的导数,  
同理可定义左导数($x \rightarrow x_0^-$)和右导数($x \rightarrow x_0^+$).

### 微分的定义

设$f(x)在x=x_0$的某领域$U(x_0)$内有定义, 并设$x_0+\Delta x \in U(x_0)$, 如果

$$
\Delta y=f(x_0+\Delta x)-f(x_0)=A\Delta x +o(\Delta x)
$$

其中$A与\Delta x$无关,则称函数在该点可微.记$\Delta x=\mathrm{d}x,\mathrm{d}y=A\Delta x=A\mathrm{d}x$

### 可导与连续的关系

函数在某点可导,则必在该点连续, 反之不真

### 左右导数与可导的关系

函数在某点可导的充要条件是:函数在该点的左右导数都存在且相等

### 导数的几何意义

函数在某点的导数即为函数曲线在该点切线的斜率,切线方程:

$$
y-f(x_0)=f'(x_0)(x-x_0)
$$

### 一元函数可导与可微的关系

可导即可微,可微即可导且

$$
\mathrm{d}y=f'(x)\mathrm{d}x
$$

### 函数微分与函数增量的关系

$$
\Delta y=\mathrm{d}y+o(\Delta x),\Delta y=f'(x_0)+o(\Delta x)\\
\Delta y-\mathrm{d}y=\frac 12 f''(\xi)(\Delta x)^2, \xi 介域x_0和x_0+\Delta x 之间
$$

### 导数与微分的运算法则

设以下涉及的函数都可导,则有

$$
\begin{aligned}
&(u\pm v)' = u' \pm v',& &\mathrm{d}(u\pm v)=\mathrm{d}u \pm \mathrm{d}v\\
&(Cv)'=Cv',& &\mathrm{d}(Cv)=C\mathrm{d}v\\
&(uv)' = u'v+uv',& &\mathrm{d}(uv)=u\mathrm{d}v+v\mathrm{d}u\\
&(\frac uv)'=\frac{vu'-uv'}{v^2}(v\neq 0),&
&\mathrm{d}(\frac uv)=\frac{v\mathrm{d}u-u\mathrm{d}v}{v^2}(v\neq 0)\\
&(uvw)'=u'vw+uv'w+uvw'\\
&[f(\varphi (x))]' = f'(\varphi (x)) \cdot \varphi '(x)& & \frac {\mathrm{d}y}{\mathrm{d}x} =  \frac {\mathrm{d}y}{\mathrm{d}u}  \cdot \frac {\mathrm{d}u}{\mathrm{d}x}
\end{aligned}
$$
