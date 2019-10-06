### 定义定理

1. $x \rightarrow *, * 可以是x_0, x_0^-,x_0^+, \infty, -\infty, +\infty$

2. 判断选择题,先用定义定理判断,再用结论判断,然后用反证法,最后举反例.

### 关于函数的奇偶性

1. 两函数的乘积的奇偶性符合: 相同是偶,不同是奇
2. 两函数的复合函数的奇偶性符合:有偶则偶,无偶则奇

### 关于有界和无界的充分条件

1. 设$\lim_{x\rightarrow x_0^-} f(x)$存在, 则存在$\delta \gt 0,当-\delta \lt x-x_0 \lt 0时,f(x)$有界.  
对$x\rightarrow x_0^+, x_0$同理有界.

2. 设$\lim_{x\rightarrow \infty} f(x)$存在, 则存在$X \gt 0, 当|x| \gt X是,f(x)$有界.  
对$x\rightarrow \pm\infty$同理有界.

3. 设$f(x)在[a,b]上连续,则f(x)在[a,b]上有界$

4. 设$f(x)在[a,+\infty)上连续, 且\lim_{x\rightarrow +\infty} f(x)存在,则f(x)在[a,+\infty)上有界$.  
同理$[-\infty,a]$有界

5. 设$f(x)在数集U上有最大值(最小值),则f(x)在U有上界(下界)$

6. 有界函数与有界函数和与积均为有界函数

7. 设$\lim_{x\rightarrow *} = \infty,则f(x)在*的去心领域内无界,但其逆不成立$

### 函数极限的定义

$\lim_{x \rightarrow *} f(x) =A \Rightarrow 对任意小\varepsilon \gt 0, 总存在 * 的一个去心领域,使得|f(x)-A| \lt \varepsilon$.

### 函数极限存在的充要条件

$$
\lim_{x \rightarrow x_0} f(x)=A的充要条件是f(x_0^-)=f(x_0^+)=A.
$$

### 数列极限存在的充要条件

$$
\lim_{n \rightarrow \infty} u_n = A的充要条件是\lim_{n \rightarrow \infty} u_{2n} = \lim_{n \rightarrow \infty} u_{2n+1} = A.
$$

### 极限的唯一性定理

若极限存在,则极限必唯一.(若两者子序列极限不同,则极限不存在)

### 存在极限与无穷小的关系

$$
\lim_{x \rightarrow *} f(x)=A的充分必要条件是f(x)-A=\alpha(x),\lim_{x \rightarrow *} \alpha(x)=0
$$

### 极限的保号性

$$
设\lim_{x \rightarrow *} f(x)=A,且A \neq 0, 则存在 * 的一个去心领域,在此领域内, f(x)与A同号.\\
\ \\
设\lim_{x \rightarrow *} f(x)=A,且A \gt 0(A \lt 0), 则存在 * 的一个去心领域,在此领域内, f(x) \gt \frac A 2( f(x) \lt \frac A 2).
$$

### 极限保号性的推论

$$
设存在 * 的一个去心领域,在此领域内,f(x) \ge 0(或 \le 0),  \\
且\lim_{x \rightarrow *} f(x)存在且等于A, 则A \ge 0(或 \le 0).\\
[f(x) \gt 0(或 \lt 0) 仍然成立]
$$

### 无穷小与无穷大的关系

1. 设$\lim_{x \rightarrow *} f(x) = \infty,则 \lim_{x \rightarrow *} \frac 1 {f(x)} = 0$

2. 设$\lim_{x \rightarrow *} f(x) = 0 且f(x) \ne 0,则 \lim_{x \rightarrow *} \frac 1 {f(x)} = \infty$

### 夹逼定理

1) 设在$*$的去心领域内$g(x) \le f(x) \le h(x)$;
2) $\lim_{x \rightarrow *} g(x) = \lim_{x \rightarrow *} h(x) = A,$  
则$\lim_{x \rightarrow *} f(x) = A$

[注]夹逼定理对数列也成立,$A换成 \pm\infty$也成立.

### 单调有界定理

1) 设$u_n$单调增加且有上界$M$,则$\lim_{n \rightarrow \infty} u_n存在且 \le M$;
2) 设$u_n$单调减少且有下界$m$,则$\lim_{n \rightarrow \infty} u_n存在且 \ge m$;

[注]单调有界定对函数极限也成立

### 几个重要极限

$$
\begin{aligned}
&\lim_{x \rightarrow 0} \frac{\sin x}{x} = 1&\\
&\lim_{\varphi(x) \rightarrow 0} \frac{\sin \varphi(x)}{\varphi(x)} = 1,其中\varphi(x) \ne 0&\\
&\lim_{n \rightarrow \infty}\sqrt[n]n = 1\\
&\lim_{n \rightarrow \infty}\sqrt[n]a = 1(a\gt0)\\
&\lim_{x \rightarrow \infty} x^{1/x} = 1\\
&\lim_{x \rightarrow +\infty} x^k e^{-\delta x} = 0(k\gt0, \delta \gt0)指数增长比幂增长快\\
&\lim_{x \rightarrow 0^+} x^k \ln^{\delta} x = 0(k\gt0, \delta \gt0)幂增长比对数增长快\\
&\lim_{x \rightarrow +\infty} x^{-k} \ln^{\delta} x = 0(k\gt0, \delta \gt0)幂增长比对数增长快\\
\end{aligned}
$$

### 几个重要等价无穷小>

$$
\begin{aligned}
&\sin x  \sim  x,& &\tan x  \sim  x\\

&\arcsin x \sim x,& &\arctan x \sim x\\

&1-\cos x  \sim  \frac {x^2} 2\\

&\sec x - 1 =\frac 1{\cos x} -1 \sim \frac {x^2}2\\

&e^x-1 \sim x,& &a^x-1 \sim x\ln a \\

&\ln (1+x) \sim x,& &\log_a (1+x) \sim \frac x{\ln a}\\

&\sqrt {1+x}-1 \sim \frac x2,& &(1+x)^\alpha-1 \sim \alpha x\\
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
6) $\lim_{x \rightarrow *} [u(x)]^n=[\lim_{x \rightarrow *} u(x)]^n=A^n$

[注]  
1 以上法则对数列也成立  
2 零比零极限不能使用除法法则,做分母时$A,B$不能为$0$,其他情况可为$0$.

### 复合函数极限运算法则

定理一 双极限复合定理

设函数$y=f[g(x)]$是由$u=g(x),y=f(u)$复合而成,$y=f[g(x)]$在点$x_0$的某去心领域内有定义,若

$$
\lim_{x \rightarrow x_0} g(x) = u_0,\lim_{u \rightarrow u_0} f(u) =A
$$

且存在$x_0$的某个去心领域有$g(x) \ne u_0$, 则

$$
\lim_{x \rightarrow x_0} f[g(x)]=\lim_{u \rightarrow u_0} f(u)=A
$$

定理二 函数符号与极限符号交换次序定理

设函数$y=f[g(x)]$是由$u=g(x),y=f(u)$复合而成,$y=f[g(x)]$在点$x_0$的某去心领域内有定义,若

$$
\lim_{x \rightarrow x_0} g(x) = u_0
$$

且$f(u)在u=u_0$连续,则

$$
\lim_{x \rightarrow x_0} f[g(x)]=f(\lim_{x \rightarrow x_0} g(x))=f(u_0)

$$

### 等价无穷小替换定理

设$x \rightarrow * 时 \alpha (x) \sim a(x),\beta (x) \sim b(x)$, 则

$$
\lim_{x \rightarrow * } \frac{\alpha (x) \delta (x)}{\beta (x) \gamma (x)} = \lim_{x \rightarrow * } \frac{a(x)\delta (x)}{b(x)\gamma (x)}
$$

[注]  

1) 上式的意义是,如果右边极限存在,则左边等于右边,若右边为无穷或其他形式的不存在,
则左边也是无穷或其他形式的的不存.  
2) 整个因式乘除能用等价无穷小替换,加减不能用等价无穷小替换,部分因式乘除不能用等价无穷小替换.

### 等价无穷小的充要条件

$$
当x \rightarrow 0时,\alpha (x) \sim \beta (x)时的充要条件是 \\
\alpha (x) - \beta (x)= o(\beta (x) 或\\
\alpha (x) = \beta (x)+ o(\beta (x))\\
$$

### 洛必达法则零比零型

设

1) $\lim_{x \rightarrow *} f(x)=0, \lim_{x \rightarrow *} g(x)=0$;
2) $f(x),g(x)在 * 的去心领域内可导,且g'(x) \ne 0$
3) $\lim_{x \rightarrow *} [ \frac {f'(x)}{g'(x)}] = A(或\infty),A$是实数,包括0.

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

[注]  
使用洛必达法则求导后如果极限不存在(非无穷的)或不知道,  
并不能确定极限不存在, 应该改用其他方法

### 带佩亚诺余项的泰勒公式

设$f(x)在x=x_0处n阶可导$,则有公式

$$
f(x)=f(x_0)+f'(x_0)(x-x_0)+\frac 1{2!} f''(x_0)(x-x_0)^2+\cdots +
\frac 1{n!} f^{(n)}(x_0)(x-x_0)^n + o((x-x_0)^n)
$$

### 在零处展开的佩亚诺余项泰勒公式

$$
\begin{aligned}
&e^x=1+x+\frac{1}{2!} x^2 + \frac{1}{3!}x^3+...\\

&(1+x)^\alpha=1+\alpha x + \frac{\alpha(\alpha-1)}{2!}x^2 + \frac{\alpha(\alpha-1)(\alpha-2)}{3!}x^3+...\\

&\frac{1}{1-x}=1+x+x^2+x^3+...\\

&\frac{1}{1+x} = 1-x+x^2-x^3+...\\

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
\int_0^1 f(x)dx = \lim_{n\rightarrow \infty} \frac{1}{n}\sum_{i=1}^n f(\frac{i}{n})\\
 = \lim_{n\rightarrow \infty} \frac{1}{n}\sum_{i=0}^{n-1} f(\frac{i}{n})
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

### 函数在$(a, b)内,[a,b]上$连续的定义

函数$f(x)在(a,b)$内每一点都连续,则称$f(x)在(a,b)$内连续.  
若在开区间$(a,b)$内连续且$x=a处右连续,在x=b处左连续,则称f(x)在[a,b]上连续$

### 第一类间断点-可去间断点定义

函数$f(x),在x=x_0的去心领域内有定义$,满足以下条件之一

1) $\lim_{x \rightarrow x_0}$存在, 但$f(x_0)$无定义
2) $\lim_{x \rightarrow x_0}$存在, 但与$f(x_0)$不相等

### 第一类间断的-跳跃间断点定义

函数$f(x),在x=x_0的去心领域内有定义$,在$x=x_0$的左极限和右极限都存在  
但不相等,此时不论$f(x_0)$是否存在.

### 第二类间断点

函数$f(x),在x=x_0的去心领域内有定义$, 左极限和右极限至少有一个不存在.

### 连续函数的四则运算

连续函数的和差积商也是连续函数,即

设$u(x),v(x)在x=x_0$处连续,则四则运算后所得的函数在$x=x_0$处也连续,除法要求分母不为$0$.

### 复合函数的连续性

设$f(u)在u=u_0$处连续,$g(x)在x=x_0处连续且g(x_0)=u_0, 那么f(g(x)) 在x=x_0$处连续.

### 基本初等函数和初等函数在他们的定义域上都是连续的

初等函数是基本初等函数有限次的有理运算和有限次函数复合所产生

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

存在, 则$f(x) 在x=x_0$处可导,且极限是函数$f(x)$在该点的导数,  
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
\Delta y=\mathrm{d}y+o(\Delta x),\Delta y=f'(x_0)\Delta x+o(\Delta x)\\
\Delta y-\mathrm{d}y=\frac 12 f''(\xi)(\Delta x)^2, \xi 介于x_0和x_0+\Delta x 之间
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

### 一阶微分形式的不变形

不论$u$是自变量还是中间变量均有$\mathrm{d}y=f'(u)\mathrm{d}u$

### 基本初等函数的导数

$$
\begin{aligned}
&(C)'=0&                          &(x^\alpha)'=\alpha x^{\alpha -1} \\
&(\sqrt x)' = \frac1{2\sqrt x}&   &(\frac 1x)'=-\frac 1{x^2} \\
&(e^x)' = e^x&                    &(a^x)'=a^x\ln a \\
&(\ln x)' = \frac{1}{x}&          &(log_ax)' = \frac{1} {x\ln a} \\
&(\sin x)' = \cos x&              &(\cos x)' = -\sin x \\
&(\tan x)' =\sec^2x=\frac{1}{\cos^2 x}& &(\cot x)'=-\csc^2x=-\frac{1}{\sin^2 x}\\
&(\sec x)' = \sec x \tan x&         &(\csc x)' = -\csc x \cot x\\
&(\arcsin x)' = \frac{1}{\sqrt{1-x^2}}&     &(\arccos x)'=-\frac{1}{\sqrt{1-x^2}} \\
&(\arctan x)' = \frac{1}{1+x^2}&    &(\mathrm{arccot} x)' = -\frac{1}{1+x^2}\\
\end{aligned}
$$

### 基本初等函数的微分

$$
\begin{aligned}
&\mathrm{d}(C)=0& &\mathrm{d}(x^\alpha)=\alpha x^{\alpha-1} \mathrm{d}x\\
&\mathrm{d}(\sqrt x) = \frac1{2\sqrt x}\mathrm{d}x& &\mathrm{d}(\frac 1x)=-\frac 1{x^2} \mathrm{d}x\\
&\mathrm{d}(e^x) = e^x\mathrm{d}x& &\mathrm{d}(a^x)=a^x\ln a \mathrm{d}x\\
&\mathrm{d}(\ln x) = \frac{1}{x}\mathrm{d}x& &\mathrm{d}(log_ax) = \frac{1} {x\ln a} \mathrm{d}x\\
&\mathrm{d}(\sin x) = \cos x\mathrm{d}x& &\mathrm{d}(\cos x) = -\sin x \mathrm{d}x\\
&\mathrm{d}(\tan x) =\sec^2x\mathrm{d}x& &\mathrm{d}(\cot x)=-\csc^2x\mathrm{d}x\\
&\mathrm{d}(\sec x) = \sec x \tan x\mathrm{d}x& &\mathrm{d}(\csc x) = -\csc x \cot x\mathrm{d}x\\
&\mathrm{d}(\arcsin x) = \frac{1}{\sqrt{1-x^2}}\mathrm{d}x& &\mathrm{d}(\arccos x)=-\frac{1}{\sqrt{1-x^2}} \mathrm{d}x\\
&\mathrm{d}(\arctan x) = \frac{1}{1+x^2}\mathrm{d}x& &\mathrm{d}(\mathrm{arccot} x) = -\frac{1}{1+x^2}\mathrm{d}x\\
\end{aligned}
$$

### 变限积分求导公式

设$f$为连续函数,$\varphi_1(x),\varphi_2(x)$均可导,则

$$
(\int_{\varphi_1(x)}^{\varphi_2(x)}f(t)dt)' = f(\varphi_2(x))\varphi'_2(x)-f(\varphi_1(x))\varphi'_1(x)
$$

### $n$阶导数运算法则

设$u,v均n阶$可导,则有

$$
\begin{aligned}
&(u \pm v)^{(n)} = u^{(n)} \pm v^{(n)}\\
&(Cu)^{(n)} = Cu^{(n)}\\
&(uv)^{(n)}=u^{(n)}v+n\cdot u^{(n-1)}v'+C_n^2 u^{(n-2)}v'' +\cdots + uv^{(n)}
\end{aligned}
$$

### 常见初等函数$n$阶导数公式

$$
\begin{aligned}
&(\sin \alpha x)^{(n)} = \alpha^n\sin (\frac{n\pi}{2} + \alpha x)\\
&\ \\
&(\cos \alpha x)^{(n)} = \alpha^n\cos ( \frac{n\pi}{2}+\alpha x)\\
\ \\
&[\ln(1+ \alpha x)]^{(n)} = (-1)^{n-1}\frac{ (n-1)!}{(1+  \alpha x)^{n}}  \alpha^n\\
&((1+x)^\alpha)^{(n)} = \alpha(\alpha-1)\cdots(\alpha-n+1)(1+x)^{\alpha-n}\\
&((1+x)^n)^{(n)} = n!,(n 为正整数)\\
&((1+x)^n)^{(m)}=0,(m \gt n,n和m均为正整数)
\end{aligned}
$$

### 参数方程求导公式

设$x=x(t), y=y(t)$均可导且$x'(t) \ne 0$

$$
\begin{aligned}
&y'_x=\frac{y'_t}{x'_t}\\
&y''_x=\frac{y''_{t}x'_t-x''_{t}y'_t}{x'^3_t}\\
\end{aligned}
$$

### 隐函数求导

$设y=f(x)有方程F(x,y)=0确定$, 对$F(x,y)=0$两边对$x$求导,解出$\frac{\mathrm{d}y}{\mathrm{d}x}$.  
对$\frac{\mathrm{d}y}{\mathrm{d}x}$的再求导,可得二阶导数.

### 幂指函数求导公式

$$
[u^v]'=u^v(\frac{v}{u}u'+\ln(u)v')
$$

### 反函数求导公式

$$
\begin{aligned}
&\frac {dx}{dy}=\frac 1{\frac {dy}{dx}}\\
&\varphi '(y)=\frac 1{f'(x)}\\
&\varphi ''(y)=-\frac {f''(x)}{(f'(x))^3}\\
\end{aligned}
$$

### 极值定义

设$f(x) 在x=x_0$的某领域内有定义,如果存在一个领域$U(x_0), 当x\in U(x_0)$有:

$$f(x) \ge f(x_0)$$  

则称$x=x_0为f(x)$的一个极小值.  
同理定义极大值$f(x) \le f(x_0)$.

### 最值定义

设$f(x)在区间I上有定义$,如果存在$x_0 \in I, 对于一切x \in I$有

$$f(x)\ge f(x_0)$$

则称$f(x_0)为f(x)在I$上的最小值.  
同理定义最大值($f(x)\le f(x_0)$)

### 单调性判定

设$f(x)在区间I有f'(x)\ge 0$,且不在任意子区间上取等号,则$f(x)在区间I$上是(严格)单调递增的.  
同理判定(严格)单调递减($f'(x)\le 0$,且不在任意子区间上取等号)

### 可导点极值的必要条件

设$f(x)在x=x_0$处取得极值,且$f'(x_0)$存在,则$f'(x_0)=0$

### 极值第一充分条件

设$f(x)在x=x_0$处连续,在$x=x_0$的某去心领域内可导,

1) 若在$x=x_0的左侧领域内f'(x) \gt 0,在右侧领域f'(x) \lt 0, 则f(x_0)$为极大值.
2) 若在$x=x_0的左侧领域内f'(x) \lt 0,在右侧领域f'(x) \gt 0, 则f(x_0)$为极小值.

[注] $f(x) 在x=x_0$左右领域导数都存在且在该点取得极值$\nRightarrow$左右领域导数反号.

### 极值的第二充分条件

设$f(x)在x=x_0$处存在二阶导数,$f'(x_0)=0, f''(x_0) \ne 0$, 那么

1) 若$f''(x_0) \lt 0$,则$f(x_0)$为极大值.
2) 若$f''(x_0) \gt 0$,则$f(x_0)$为极小值.

### 凹凸性判定定理

设$f(x)在区间I有f''(x)\ge 0$,且不在任意子区间上取等号,则$f(x)在区间I$上是凹的.  
同理判定凸的($f''(x)\le 0$且不在任意子区间上取等号)

### 二阶可导点处拐点的必要条件

设点$(x_0, f(x_0))是y=f(x)$的拐点且$f''(x_0)$存在,则$f''(x_0)=0$

### 拐点的充分条件

设$f(x)在x=x_0$处连续,在$x=x_0$的某去心领域二阶可导,  
并且在$x=x_0$的左右领域$f''(x_0)$反号, 则点$(x_0, f(x_0))$是曲线的拐点.

[注] 若$f''(x_0)=0, f'''(x_0) \gt 0$, 则该点是拐点且左凸右凹, 反之$f'''(x_0) \lt 0$左凹右凸.

### 曲率和曲率半径计算公式

$$
\begin{aligned}
曲率k&=\frac{|y''|}{(\sqrt{1+(y')^2})^{3}}\\
\ \\
曲率参数式&=\frac {|y''_t x'_t-x''_t y'_t|}{(\sqrt{(x'_t)^2+(y'_t)^2})^{3}}\\
\ \\
曲率半径R&=\frac{(\sqrt{1+(y')^2})^{3}}{|y''|}

\end{aligned}
$$

### 费马定理

设$f(x)在x=x_0的某领域内有定义, f(x_0)是f(x)的一个极值, 有设f'(x_0)存在$  
则$f'(x_0)=0$

### 罗尔定理

设$f(x)在[a,b]上连续, 在(a,b)上可导,且f(a)=f(b)$,则  
至少存在一点$\xi \in (a,b),使得f'(\xi)=0$

[注] 罗尔定$\xi实际上就是f(x)$的极值点.

### 拉格朗日中值定理

设$f(x)在[a,b]上连续, 在(a,b)上可导$,则  
至少存在一点$\xi \in (a,b),使得f(b)-f(a)=f'(\xi)(b-a)$.

[注] 其他形式:  
$f(x)=f(x_0)+f'(\xi)(x-x_0), \xi 介于x,x_0 之间$  
$f(x)=f(x_0)+f'(x_0+\theta(x-x_0))(x-x_0), 0 \lt \theta \lt 1$

### 柯西中值定理

设$f(x),g(x)在[a,b]上连续, 在(a,b)上可导,且g'(x) \ne 0$,则  
至少存在一点$\xi \in (a,b)$,使得

$$\frac {f(b)-f(a)}{g(b)-g(a)}=\frac{f'(\xi)}{g'(\xi)}$$

### 泰勒中值定理-拉格朗日余项

设$f(x)在[a,b]内有n阶连续导数,在(a,b)内有直到n+1阶导数, x \in[a,b], x_0 \in [a,b]$  
是任意两点,则至少存在一点$\xi,介于x,x_0$之间,使得

$$
f(x)=f(x_0)+ \frac 1{1!}f'(x_0)(x-x_0)+\frac 1{2!}f''(x_0)(x-x_0)^2+\cdots+\frac {f^{(n)}(x_0)}{n!}(x-x_0)^n+R_n(x)\\
其中R_n(x)=\frac{f^{(n+1)}(\xi)}{(n+1)!}(x-x_0)^{n+1}称为拉格朗日余项
$$

### 佩亚诺余项泰勒公式

设$f(x)在x=x_0处具有n阶导数$,$x为x_0$处充分小的领域内任意一点,则有

$$
f(x)=f(x_0)+ \frac 1{1!}f'(x_0)(x-x_0)+\frac 1{2!}f''(x_0)(x-x_0)^2+\cdots+\frac {f^{(n)}(x_0)}{n!}(x-x_0)^n+R_n(x)\\
其中R_n(x)=o((x-x_0)^{n})称为佩亚诺余项
$$

### 拉格朗日余项和佩亚诺余项泰勒公式比较

1) 条件不同
2) 余项表达不同
3) 拉格朗日余项可用于闭区间上不等式的证明  
佩亚诺余项仅能用于领域内讨论极限问题

### 原函数与不定积分

设$F'(x)=f(x), x \in(a,b)$,则称$F(x)为f(x)的一个原函数$,  
若$F(x)是f(x)的一个原函数,则F(x)+C$也是$f(x)$的原函数.  
不定积分的一般表达式

$$
\int f(x)\mathrm{d} x=F(x)+C,(C是任意常数)
$$

### 定积分

设$f(x)在[a,b]$有定义,若左侧极限

$$
\lim_{\lambda \rightarrow 0} \sum_{i=1}^{n} f(\xi_i)\Delta x_i=\int_a^b f(x)dx
$$

存在,即为定积分.

### 定积分存在定理

1) 设$f(x)在[a,b]上连续,则\int_a^b f(x)\mathrm dx$存在.
2) 设$f(x)在[a,b]上有界,且只有有限个间断点(可以在端点处),则\int_a^b f(x)\mathrm dx$存在.

### 原函数存在定理

设$f(x)在[a,b]上连续,则在[a,b]上必存在原函数$  

[注]

1. 若$f(x)在[a,b]上有跳跃间断点x_0 \in(a,b),则f(x)在[a,b]$上一定不存在原函数.
2. 若$f(x)$不连续,则原函数是否存在与定积分是否存在各不相干.

### 变上限函数求导

设$f(x)在[a,b]上连续$, 则

$$
(\int_a^x f(t)\mathrm dt)'_x = f(x), x \in [a,b]
$$

可知$\int_a^x f(t)\mathrm dt是f(x)$的一个原函数,从而不定积分

$$
\int f(x)\mathrm dx = \int_a^x f(t)\mathrm dt + C
$$

#### 牛顿-莱布尼兹定理

$$
\int_a^b f(x)dx = F(x)\mid_a^b = F(b)-F(a)
$$

### 不定积分性质

设以下所涉及的函数均连续

$$
\begin{aligned}
&(\int f(x)\mathrm dx)' = f(x)&      &\mathrm d \int f(x) \mathrm dx = f(x) \mathrm dx\\
&\int f'(x)\mathrm dx = f(x) + C&  &\int \mathrm df(x) = f(x) + C\\
&\int f(x) \pm g(x) \mathrm dx = \int f(x) \mathrm dx \pm \int  g(x) \mathrm dx&\\
&\int kf(x) \mathrm dx = k\int f(x) \mathrm dx,(k \ne 0)&

\end{aligned}
$$

### 定积分的性质

设以下涉及的函数在讨论区间均可积,则有

$$
\begin{aligned}
&\int_a^b f(x) \mathrm dx = - \int_b^a f(x) \mathrm dx\\
&\int_a^a f(x) \mathrm dx = 0\\
&\int_a^b [f(x) \pm g(x)] \mathrm dx = \int_a^b f(x) \mathrm dx \pm \int_a^b g(x) \mathrm dx\\
&\int_a^b kf(x) \mathrm dx = k\int_a^b f(x) \mathrm dx, (k为常数)\\
&\int_a^b f(x) \mathrm dx = \int_a^c f(x) \mathrm dx + \int_c^b f(x) \mathrm dx\\
\end{aligned}
$$

### 定积分比较定理

$$
若f(x) \le g(x), a \le b, 则 \int_a^b f(x) \mathrm dx \le \int_a^b g(x) \mathrm dx\\
\ \\
若f(x)与g(x)在[a,b]上连续,f(x) \le g(x),\\
且至少有一点x_1, a \le x_1 \le b, 使f(x_1) \lt g(x_1),则\\
\int_a^b f(x) \mathrm dx \lt \int_a^b g(x) \mathrm dx\\
$$

### 积分中值定理

设$f(x)在[a,b]上连续, 则至少存在一点\xi \in (a,b)$,使得

$$
\int_a^b f(x) \mathrm dx = f(\xi)(b-a).
$$

### 基本积分公式积分

$$
\begin{aligned}
&\int a \mathrm dx = ax+C&               &\int x^n\mathrm dx=\frac{x^{n+1}}{n+1}+C,(n \ne -1)\\
&\int \frac 1 x \mathrm dx=\ln |x| +C\\
&\int e^x\mathrm dx = e^x+C&             &\int a^x\mathrm dx=\frac{a^x}{\ln a} + C\\
&\int\sin x\mathrm dx = -\cos x+C&       &\int\cos x\mathrm dx=\sin x+C\\
&\int\tan x\mathrm dx = -\ln |\cos x|+C& &\int\cot x\mathrm dx=\ln |\sin x|+C\\
&\int\sec x\mathrm dx = \ln|\sec x + \tan x|+C&   &\int\csc x\mathrm dx=\ln |\csc x - \cot x|+C\\
&\int \sec^2 x\mathrm dx=\tan x +C&               &\int\csc^2x\mathrm dx=-cotx +C\\
&\int \sec x \tan x\mathrm dx=\sec x +C&               &\int \csc x \mathrm{cot} x\mathrm dx=-\csc x +C\\
&\int\frac 1{\sqrt{1-x^2}}\mathrm dx=\arcsin x+C& &\int\frac{1}{\sqrt{a^2-x^2}}\mathrm dx=\arcsin \frac xa+C\\
&\int\frac 1{\sqrt{x^2-a^2}}\mathrm dx=\ln{|x+\sqrt{x^2-a^2}|}+C& &\int\frac 1{\sqrt{x^2+a^2}}\mathrm dx=\ln{(x+\sqrt{x^2+a^2})}+C\\
&\int\frac 1{1+x^2}\mathrm dx=\arctan x+C& &\int\frac{1}{a^2+x^2}\mathrm dx=\frac 1a \arctan \frac xa + C\\
&\int\frac 1{x^2-a^2}\mathrm dx=\frac 1{2a}\ln |\frac{x-a}{x+a}|+C& &\int\frac 1{x^2-1}\mathrm dx=\frac 1{2}\ln |\frac{x-1}{x+1}|+C \\
\end{aligned}
$$

### 第一换元积分法(凑微分)

$$
\int f(\varphi(x)) \varphi'(x)\mathrm dx = \int f(\varphi(x)) \mathrm d \varphi(x)
$$

### 第二换元积分法

$$
\int f(x) \mathrm dx =\int f(\varphi(t))  \varphi'(t)\mathrm dt,\ (x=\varphi(t))\\
再取反函数t=\varphi^{-1}(x)带入右式
$$

### 定积分换元积分

定积分换元积分上下限要跟着变,不必代换成原变量

### 分部积分法

$$
\int u(x) \mathrm d v(x) = u(x)v(x)-\int v(x) \mathrm d u(x)\\
\int u(x) v'(x) \mathrm dx = u(x)v(x)-\int v(x)u'(x) dx
$$

### 无穷区间上的反常积分

设$f(x)在[a,+\infty)上连续$,称

$$
\int_a^{+\infty} f(x) \mathrm dx = \lim_{b \rightarrow +\infty} \int_a^{b} f(x) \mathrm dx
$$

为$f(x)在[a,+\infty)$上的反常积分,若右边极限存在,称此反常积分收敛,否则称此反常积分发散.  
同理定义下限和上下限(拆成两个)都为为无穷的情形.

### 无界函数的反常积分

设$f(x)在[a,b)$上连续,且$\lim_{x \rightarrow b^-} f(x) = \infty$,称

$$
\int_a^b f(x) \mathrm dx = \lim_{b \rightarrow \beta} \int_a^{\beta} f(x) \mathrm dx
$$

为$f(x)在[a,b)$的反常积分(也称暇积分),若右边极限存在则收敛,反之发散.  
同理下限为奇点和上限下限都为奇点(拆成两部分)的情形.

若奇点在区间内部,则应该按奇点拆分成两个暇积分.

### 反常积分积分区间关于原点对称

反常积分奇偶性关于原点对称,性质同普通积分,但要求在某半区间收敛,否则是发散的.

### 定积分的运用

1. 当求面积时,积分函数在积分区间有$f(x)\lt 0$时,  
需要分段积分, 函数$f(x)\lt 0$的段函数要取反转换成正值.

1. 当求旋转体体时,对非单调函数(反函数有两个),  
则要拆分成两个函数,积分后相减.

### 曲线与$x$轴面积公式两种($y$轴取反函数同理)

$$
S=\int_a^b f(x) dx, (y=f(x)\ge 0)\\
\ \\

S=\int_{t1}^{t2}y(t)x'(t)dt, (y=y(t)\ge 0, x=x(t))
$$

### 极坐标曲边扇形面积

$$
S=\frac 12 \int_{\theta1}^{\theta2}r^2(\theta) d\theta, r=r(\theta)\\
$$

### 弧微分三种

$$
ds=\sqrt{1+(y')^2}dx,y=y(x)\\
ds=\sqrt{(x')^2+(y')^2}dt, y=y(t), x=x(t)\\
ds=\sqrt{r^2+(r')^2}d\theta,r=r(\theta)
$$

### 弧长公式三种

$$
L=\int_a^b\sqrt{1+(y')^2}dx ,y=y(x)\\
L=\int_{t_1}^{t_2}\sqrt{(x_t')^2+(y_t')^2}dt, y=y(t), x=x(t)\\
L=\int_{\theta_1}^{\theta_2} \sqrt{r^2(\theta)+(r')^2}d\theta,r=r(\theta)\\
$$

### 曲线绕$x$轴旋转体积

$$
V=\pi\int_a^b y^2(x)dx, y=y(x)
$$

### 曲线绕$y$轴旋转体积(注意非单调函数要拆分)

$$
\begin{aligned}
&V=\pi \int_{y_1}^{y_2} x^2(y)dy, x=x(y) \\
\ \\
&V=2\pi\int_a^b xy(x)dx, y=y(x)\ge 0,\\
\end{aligned}
$$

### 截面面积已知的体积(关键是寻找恰当的截面面积公式)

$$
V= \int_a^b S(x) dx
$$

### 曲线绕$x$轴旋转体侧面积两种

$$
\begin{aligned}
S_x=2\pi\int_a^b|y|\sqrt{1+y'^2}dx,y=y(x)\\

S_t=2\pi\int_{t_1}^{t_2}|y|\sqrt{x_t'^2+y_t'^2}dt, x=x(t),y=y(t)\\
\end{aligned}
$$

### 函数的平均值

$$
\overline f =\frac 1 {(b-a)}\int_a^bf(x)dx
$$

### 密度均匀形心质心公式

$$
密度均匀为1的薄片y=f(x)是薄片上边界曲线,\\
可利用对称性计算出其中一个坐标 \\
横坐标x=\frac {\int_a^b  xf(x)dx}{\int_a^b  f(x)dx}\\
\ \\
纵坐标y=\frac {\frac 12 \int_a^b  f^2(x)dx}{\int_a^b  f(x)dx}\\
\ \\
若点密度是关于x的函数,则上面所以被积函数要乘以密度函数
$$

### 偏导数的概念

二元函数的偏导数就是固定一个变量,关于另一个变量的一元函数的导数.

### 二元函数全微分和可微的概念

若二元函数在某点的全增量$\Delta z = f(x+\Delta x, y+\Delta y) - f(x,y)$  
可表示为$\Delta z = A\Delta x + B\Delta y + o (\sqrt{(\Delta x)^2 + (\Delta y)^2})$  
其中$A,B仅与x,y有关$, 则称$z=f(x,y)在点(x,y)$可微,且全微分为  
$\mathrm dz = A\Delta x + B\Delta y$

### 二元可微的必要条件

若函数$z=f(x,y)在(x,y)处可微$, 则在该点的偏导数存在且

$$
\mathrm dz = \frac {\partial z}{\partial x}\mathrm dx + \frac{\partial z} {\partial y}\mathrm dy
$$

### 二元函数可微的充分条件

如果函数$z=f(x,y)在(x,y)处偏导数 \frac {\partial z}{\partial x},\frac{\partial z} {\partial y}连续$,  
则$z=f(x,y)在(x,y)处$可微.

### 多元函数连续可导可微关系

1) 多元函数可导$\nRightarrow$连续
2) 多元函数可微$\Rightarrow$连续,可导
3) 多元函数可微$\nRightarrow$一阶偏导数连续
4) 一阶偏导数连续$\Rightarrow$多元函数可微

### 多元复合函数求导法则

$$
1. 多元函数与一元函数复合 \\

u = \varphi(t), v = \psi(t)\\
z=f(\varphi(t),\psi(t))\\
\frac {\mathrm dz} {\mathrm dt}= \frac{\partial z}{\partial u} \frac{\mathrm du}{\mathrm dt} + \frac{\partial z}{\partial v} \frac{\mathrm dv}{\mathrm dt}\\
\ \\
2. 多元函数与多元函数复合\\
u = \varphi(x,y), v = \psi(x,y)\\
z=f(\varphi(x,y),\psi(x,y))\\
\frac {\partial z} {\partial x}= \frac{\partial z}{\partial u} \frac{\partial u}{\partial x} + \frac{\partial z}{\partial v} \frac{\partial v}{\partial x}\\
$$

### 多元函数全微分形式的不变性

无论是自变量还是中间变量,多元函数的全微分具有同样的形式

### 混合偏导数与求导次序无关

若两二阶混合偏导数连续,则相等.  
先求出二阶混导,再观察是否连续.

### 隐函数求导公式

$$
F(x,y)=0, \frac{\mathrm dy}{\mathrm dx} = - \frac{F'_x}{F'_y}(F'_y \ne 0)\\
F(x,y,z)=0, \frac {\partial z} {\partial x} = - \frac{F'_x}{F'_z},\frac {\partial z} {\partial y} = - \frac{F'_y}{F'_z}(F'_z \ne 0)
$$

### 多元函数取得极值的必要条件

若二元函数在某点取得极值,则在该点的两个偏导数为零.

### 二元函数极值定理

1) $AC-B^2 \gt 0是极值,A \gt 0时取极小值,A \lt 0时取极大值$
2) $AC-B^2 \lt 0无极值$
3) $AC-B^2 = 0$时不确定,一般要用定义证明

### 拉格朗日数乘法

函数$z=f(x,y)在\varphi(x,y)=0下$求极值,构造拉格朗日函数  
$F(x,y,\lambda)=f(x,y)+\lambda \varphi(x,y)$, 求三元函数的驻点是可能的极值点.

$$
\frac{\partial F}{\partial x}=\frac{\partial f}{\partial x} + \lambda \frac{\partial \varphi}{\partial x}=0\\
\ \\
\frac{\partial F}{\partial y}=\frac{\partial f}{\partial y} + \lambda \frac{\partial \varphi}{\partial y}=0\\
\ \\
\frac{\partial F}{\partial \lambda} = \varphi(x,y)=0

$$

### 二重积分几何意义

底面为积分区域$D$的垂直于$xoy$平面的曲顶柱体体积

### 二重积分的性质

1 比较定理

如果在$D上, f(x,y) \le g(x,y),则\iint \limits_D f(x,y)d\sigma \le \iint \limits_D g(x,y)d\sigma$.

2 估值定理

设$M,m是连续函数f(x,y)$在闭区域$D$上的最大值与最小值,$S表示D的面积$,则

$$
mS \le \iint \limits_D f(x,y)d\sigma \le MS
$$

3 中值定理

设$f(x,y)$是闭区域$D$上的连续函数, $S表示D的面积$,则在$D上至少存在一点(\xi, \eta)$使得

$$
\iint \limits_D f(x,y)d\sigma = f(\xi, \eta)S
$$

### 线性微分方程解的结构

1 二阶线性齐次微分方程的通解结构

$y=C_1y_1(x)+C_2y_2(x)$  
$其中y_1(x),y_2(x)是两个线性无关的解,C_1,C_2是任意常数$.

2 非齐次通解结构$=$对应齐次通解$+$非齐次特解

3 解的叠加原理

(一)$若y_1^*(x)和y_2^*(x)分别是$  
$y'' + P(x)y'+Q(x)y=f_1(x)$与
$y'' + P(x)y'+Q(x)y=f_2(x)$  
的特解,  
那么$y_1^*(x)+y_2^*(x)$就是
$y'' + P(x)y'+Q(x)y=f_1(x) + f_2(x)$的一个特解

(二)若$y_1(x),y_2(x)$均是齐次方程的解,则它们的任意线性组合也是齐次解,如$y_1(x)+y_2(x),2y_1(x)$等.

以上结论可以推广到$n$阶.

### 二阶常系数线性齐次微分方程及特征方程

$$
y''+py'+qy=f(x)\\
\lambda^2+p\lambda+q=0
$$

### 二常线非齐特解-多项式

$$
y''+py'+y=f(x) \\
f(x)=ax^2+bx+c,\\
特解:y^*=x^k(cx^2+dx+f),\\
k=\begin{cases}
0, 0不是特征根\\
1, 0是单根\\
2, 0是二重根
\end{cases}\\
\ \\

$$

### 微分方程特解-指数函数

$$
f(x)=e^{ax},\\
y^*=Cx^ke^{ax},\\
k=\begin{cases}
0, a不是特征根\\
1, a是单根\\
2, a是二重根
\end{cases}\\
\ \\
$$

### 微分方程特解-多项式-指数函数

$$
f(x)=e^{ax}(bx+c),\\
y^*=x^ke^{ax}(Dx+C),\\
k=\begin{cases}
0, a不是特征根\\
1, a是单根\\
2, a是二重根
\end{cases}\\ \\
\ \\
$$

### 微分方程特解-多项式-指数函数-三角函数

$$
f(x)=e^{ax}(H_{n1}(x)\cos bx+L_{n2}(x)\sin bx),\\
 y^*=x^ke^{ax}(M_n(x)\cos {bx}+F_n(x)\sin bx),\\
 n=\max(n1,n2)\\
k=\begin{cases}
0, a\pm ib不是特征根\\
1, a\pm ib 是特种根\\
\end{cases}
$$

### 微分方程特解-三角函数

$$
f(x)=\sin x\\
y^*=x^k(A\cos {x}+B\sin x),\\
k=\begin{cases}
0, \pm i不是特征根\\
1, \pm i 是特种根\\
\end{cases}

$$

### 变量可分离微分方程

$$
g(y)dy=f(x)dx\\
\Rightarrow \int g(y)dy = \int f(x)dx
$$

### 齐次微分方程

$$
\frac{dy}{dx}=f(\frac yx)\\
\ \\

u=\frac yx,y=ux,\\
 \frac{dy}{dx} = u+x\frac{du}{dx}\\
\ \\
\int \frac 1{f(u)-u} du = \int \frac 1x dx
$$

### 一阶线性微分方程及其解

$$
y'+p(x)y=q(x), (x'+p(y)x=q(y)) \\
u=e^{\int p(x)dx}\\
yu=\int q(x)u(x)dx+C

$$

### 可降阶的高阶微方程

$$

y^{(n)} = f(x) \\

\Rightarrow y^{(n-1)} = \int f(x) dx +C_1 \\

\Rightarrow y^{(n-2)} = \int [\int f(x) dx +C_1]dx + C_2 \\

\Rightarrow \cdots

$$

### 不显含$y$的微分方程

$$
y''=f(x,y') \\
y'=p,y''=\frac {dp}{dx}\\
\frac {dp}{dx}=f(x,p)
$$

### 二阶齐次常系数微分方程特解

1. 双根$C_1 e^{r_1x}+C_2 e^{r_2x}$
2. 重根$(C_1+C_2x)e^{rx}$
3. 复根$e^{ax}(C_1 \cos bx+C_2 \sin bx)$

### 不显含$x$的微分方程

$$
y''=f(y,y') \\
y'=p,y''=\frac {dp}{dy} \frac {dy}{dx}=p\frac {dp}{dy}\\
p\frac {dp}{dy}=f(y,p)
$$

### 行列式的定义

1) $n$阶行列式是所有取自不同行不同列$n$个元素乘积的代数和.  
2) 逆序数为行标的逆序数与列标的逆序数之和
3) 行(列)逆序数为行(列)下标后面元素比当前元素小的元素的个数之和

$$
\begin{vmatrix}
a_{11}&a_{12}\\
a_{21}&a_{22}\\
\end{vmatrix}
=a_{11}a_{22}-a_{12}a_{21}
$$

### 行列式的性质

1. $|A^\intercal |=|A|$
2. 两行(或列)互换位置,行列式的值变号
3. 两行(或列)相等,行列式的值为$0$
4. 两行(或列)成比例,行列式的值为$0$
5. 某行(或列)全为$0$,行列式的值为$0$
6. 某行(或列)有公因式$k$, 可把$k$提出行列式记号外.  
(亦即用数$k$乘行列式等于用$k$乘它的某行(或列))
7. 若某行(或列)是两个元素之和,则可把行列式拆成两个行列式之和:  
$|\alpha_1+\beta,\alpha_2|=|\alpha_1,\alpha_2|+|\beta,\alpha_2|$
8. 把某行(或列)的$k$倍加到另一行(或列),行列式的值不变

### 行列式按行(列)展开定理

$n$阶行列式的值等于它任何一行(列)元素,与其对应代数余子式乘积之和.

### 余子式和代数余子式

元素$a_{ij}$的余子式$M_{ij}$是去掉第$i$行和第$j$列剩下的元素构成的$n-1$阶行列式.  
元素$a_{ij}$的代数余子式$A_{ij}=(-1)^{i+j}M_{ij}$.

### 三角形行列式的值

1 主对角形三角行列式的值等于主对角线上元素的乘积

2 副对角形三角行列式的值等于$(-1)^{n(n-1)/2}$与副对角线上的元素的乘积

3 主对角线是从左上到右下,副对角线反之.

### 特殊的拉普拉斯分块展开式

1 主对角形

$$
\left|
  \begin{matrix}
   A & C  \\
   O & B  
  \end{matrix}
\right| =
\left|
  \begin{matrix}
   A & O  \\
   C & B  
  \end{matrix}
  \right|=
|A||B|\\
$$

2 副对角形行列式的值为

$$
(-1)^{mn}|A||B|,(m,n为A,B的阶)
$$

### 范德蒙行列式的值

$$
\left|
 \begin{matrix}
   1 & 1 & 1 \\
   2 & 3 & 4 \\
   2^2 & 3^2 & 4^2
  \end{matrix}
  \right|=(4-2)(4-3)(3-2)=2
$$

### $n$阶方阵行列式公式

$$
\begin{aligned}
&|A^\intercal |=|A|\\
&|kA|=k^n|A|\\
&|AB|=|A||B|\\
&|A^2|=|A|^2\\
&|A^*|=|A|^{n-1}\\
&|A^{-1}|=|A|^{-1}\\
&\prod_{i=1}^n \lambda_i=|A|(\lambda_i是特征值)\\
&AA^*=|A|E(A^*是伴随矩阵)\\
&A^*A=|A|E(A^*是伴随矩阵)\\
\end{aligned}
$$

### 代数余子式的性质

行列式的任一行(列)的元素与另一行(列)的代数余子式的乘积之和为$0$.

### 矩阵的概念

1. 矩阵是一个$m行n列$的表格.
2. 元素全为零的叫零矩阵.
3. 行数和列数相等的矩阵式是<u>同型</u>矩阵
4. 两同型矩阵所有元素都相等,则两矩阵<u>相等</u>

### 矩阵的运算的定义

1. 加法,是指两同型矩阵相加,等于把对应位置的元素相加
2. 数乘,是指数与矩阵的乘法,等于把矩阵中每个元素与数相乘
3. 矩阵乘法,矩阵$A$的列数等于矩阵$B$的行数才能相乘,  
$A$的$i$行和$B$的$j$列的内积,作为乘积的第$i$行第$j$列的元素.
4. 矩阵转置是指把矩阵的行列互换

### 矩阵加法运算法则

$$
\begin{aligned}
&A+B=B+A(交换律)\\
&(A+B)+C=A+(B+C)(结合律)\\
&A+O=A\\
&A+(-A)=O
\end{aligned}
$$

### 矩阵数乘法则

$$
\begin{aligned}
&k(mA)=(km)A\\
&(km)A=m(kA)\\
&(k+m)A=kA+mA\\
&k(A+B)=kA+kB\\
&1A=A\\
&0A=O
\end{aligned}
$$

### 矩阵乘法法则

$$
\begin{aligned}
&(AB)C=A(BC)\\
&A(B+C)=AB+AC\\
&(B+C)A=BA+CA
\end{aligned}
$$

### 矩阵乘法的特殊情况

1 矩阵乘法没有交换律,一般情况下$AB\ne BA$  
  满足交换律的情况:  
  (1) 设A , B 至少有一个为零矩阵,则A , B 可交换;

  (2) 设A , B 至少有一个为单位矩阵, 则A , B可交换;

  (3) 设A , B 至少有一个为数量矩阵, 则A , B可交换;

  (4) 设A , B 均为对角矩阵,则A , B 可交换;  

  (6) 设$A^*$是A的伴随矩阵,则$A^*$与A可交换;

  (7) 设A可逆,则A 与其逆矩阵$A^{-1}$可交换;

  (8) $A^n,A^m$相乘可交换;

2 $AB=0\nRightarrow A=0或者B=0$  

3 矩阵乘法没有消除律$AB=B 且B\ne 0\nRightarrow A=E$

### 矩阵转置运算法则

$$
\begin{aligned}
&(A\pm B)^\intercal =A^\intercal \pm B^\intercal \\
&(kA)^\intercal =kA^\intercal \\
&(AB)^\intercal =B^\intercal A^\intercal \\
&(A^\intercal )^\intercal =A
\end{aligned}
$$

### 伴随矩阵的运算法则

$$
\begin{aligned}
&AA^*=A^*A& &A^*A=|A|E&\\
&A^*=|A|A^{-1},(A可逆)\\
&(A^*)^{-1}=(A^{-1})^*& &(A^{-1})^*=\frac A{|A|}(|A|\ne 0)&\\
&(A^*)^\intercal =(A^\intercal )^*\\
&(kA)^*=k^{n-1}A^*\\
&|A^*|=|A|^{n-1}\\
&(A^*)^*=|A|^{n-2}A(n\ge2)\\
&(AB)^*=B^*A^*(A,B均可逆)
\end{aligned}
$$

### 方阵幂的运算法则

$$
\begin{aligned}
&(A^k)^l=A^{kl}\\
&A^kA^l=A^{k+l}
\end{aligned}
$$

### 特殊方阵

1. 单位矩阵E,主对角线元素全为1,其余全为0的矩阵
2. 数量阵,数k与单位矩阵E的乘积
3. 对角阵,除主对角线上的元素外,其余都为0的矩阵
4. 上三角矩阵,元素都在主对角线及以上,主对角线以下的元素都为零
5. 下三角矩阵,元素都在主对角线及以下,主对角线以上的元素都为零
6. 对称矩阵,$A^\intercal =A,即a_{ij}=a_{ji}$
7. 反对称矩阵,$A^\intercal =-A,即a_{ij}=-a_{ji}, a_{ii}=0$
8. 正交矩阵,$AA^\intercal =A^\intercal A=E,即A^\intercal =A^{-1}$
9. 初等矩阵,单位矩阵经过一次初等变换所得到的矩阵
10. 伴随矩阵$A^*$,$A$中所以元素由其代数余子式替换,再<u>转置</u>.

### 可逆矩阵主要定理

定理1 若$n$阶矩阵$A$可逆,则$A$的逆矩阵唯一  
定理2 $A可逆\Leftrightarrow |A| \ne 0$

### 矩阵$A$可逆的<u>充分必要</u>条件

$n$阶矩阵$A$可逆  
$\Longleftrightarrow$ 存在$n$阶矩阵$B$,使得$AB(或BA)=E$(定义)  
$\Longleftrightarrow$$|A|\ne 0, 或秩r(A)=n,或A$的列(行)向量线性无关  
$\Longleftrightarrow$齐次方程组$Ax=0$只有零解.  
$\Longleftrightarrow$对任意$b, 非齐次线性方程组Ax=b$总有唯一解.  
$\Longleftrightarrow$矩阵$A$的特征值全不为$0$.

### 逆矩阵的运算性质

$$
\begin{aligned}
&(kA)^{-1}=\frac 1k A^{-1}(k\ne0)\\
&(AB)^{-1}=B^{-1}A^{-1}\\
&(A^2)^{-1}=(A^{-1})^2\\
&(A^\intercal )^{-1}=(A^{-1})^\intercal \\
&(A^{-1})^{-1}=A\\
&|A^{-1}|=\frac 1{|A|}
\end{aligned}
$$

### 求逆矩阵的方法

方法一 用公式

$$
A^{-1}=\frac 1 {|A|} A^*
$$

方法二 初等行变换法 $(A|E) \longrightarrow (E|A^{-1})$  
方法三 用定义 $AB(或BA)=E, A^{-1}=B$
方法四 用分块矩阵
方法五 用初等矩阵法则

### 矩阵的初等变换

1. 某行(列)乘以非零常数
2. 互换某两行(列)的位置
3. 某行(列)的$k$倍加到另一行(列)

### 等价矩阵

矩阵$A$经过有限次初等变换变成$B$, 则$A$与$B$等价.

等价矩阵是同型矩阵.

等价矩阵具有反身性,对称性,传递性.

$A$与$B$等价$\Longleftrightarrow r(A)=r(B)$

$A$与$B$等价$\Longrightarrow |A|=k|B|,k\ne 0$

### 初等矩阵的性质

1. 初等矩阵的转置仍是初等矩阵
2. 初等矩阵均是可逆矩阵,且其逆矩阵仍是同一类型的初等矩阵.
3. $A$左乘初等矩阵$P$,所得$PA$相当于对$A$做一次和$P$相同的初等行变换,  
右乘初等矩阵,相当于做对应的初等列变换
4. 当$A$可逆时,$A$可做一系列初等行变换变成单位矩阵.

### 初等矩阵的逆矩阵

1 倍乘

$$
\left[
 \begin{matrix}
   1 & 0 & 0 \\
   0 & k & 0 \\
   0 & 0 & 1
  \end{matrix}
\right]^{-1}
=
\left[
 \begin{matrix}
   1 & 0 & 0 \\
   0 & \frac 1k & 0 \\
   0 & 0 & 1
  \end{matrix}
\right]

$$

2 换行

$$
\left[
 \begin{matrix}
   0 & 1 & 0 \\
   1 & 0 & 0 \\
   0 & 0 & 1
  \end{matrix}
\right]^{-1}
=
\left[
 \begin{matrix}
   0 & 1 & 0 \\
   1 & 0 & 0 \\
   0 & 0 & 1
  \end{matrix}
\right]\\

$$

3 倍加

$$
\left[
 \begin{matrix}
   1 & 0 & 0 \\
   0 & 1 & 0 \\
   0 & k & 1
  \end{matrix}
\right]^{-1}
=
\left[
 \begin{matrix}
   1 & 0 & 0 \\
   0 & 1 & 0 \\
   0 & -k & 1
  \end{matrix}
\right]
$$

### 求矩阵秩的主要方法

定理1 经初等变换矩阵的秩不变.  
定理2 如果$A$可逆,则$r(AB)=r(B),r(BA)=r(B)$

### 矩阵秩的概念

若矩阵中所有$r$阶子式不为零,且所有$r+1$子式(如果存在)均为零,  
则称矩阵的秩为$r$.零矩阵的秩规定为0.

在$m\times n$的矩阵中任取$k$行和$k$列,位于这些行和列的交点上的$k^2$个元素按原来的次序所组成的$k$阶方阵的行列式,叫做A的一个$k$阶子式

### 矩阵秩的充要条件

$r(A)=r \Longleftrightarrow 矩阵A$中的非零子式的最高阶数是$r$  
$r(A) \lt r \Longleftrightarrow A$中每一个$r$阶子式全为$0$  
$r(A) \ge r \Longleftrightarrow A$中有$r$阶子式不为$0$  

$r(A)=0 \Longleftrightarrow A=O$  
$A \neq O \Longleftrightarrow r(A) \ge 1$

若$A$是$n$阶矩阵  
$r(A)=n \Longleftrightarrow |A| \neq 0 \Longleftrightarrow A可逆$  
$r(A)\lt n \Longleftrightarrow |A| = 0 \Longleftrightarrow A不可逆$

矩阵秩的公式

$r(A)=r(A^\intercal )$

$r(A^\intercal A)=r(A)$

$r(kA)=r(A),(k\ne 0)$

$r(A-B)=r(B-A),(k\ne 0)$

$r(A+B) \le r(A)+r(B)$

$r(AB)\le \min(r(A),r(B)), r(A)\ge r(AB), r(B)\ge r(AB)$

若$A_{m\times n}B_{n\times s}=O, 则r(A)+r(B)\le n$

$r(A_{m\times n}) \le \min(m,n)$

分块矩阵$r\left( \begin{matrix} A&O\\ O&B \end{matrix} \right)=r(A)+r(B)$

### 分块矩阵的运算

1 分开矩阵的加法,等于把对应位置的子矩阵相加  

2 分开矩阵的乘法,先对整体做矩阵乘法,再对各个子块做矩阵乘法,如:  
$A(\alpha_1,\alpha_2,\alpha_3) \Leftrightarrow (A\alpha_1,A\alpha_2,A\alpha_3),A是n阶方阵,\alpha_i是n维列向量$

3 分块矩阵的转置,先对整体做转置,再把各个位置上的子矩阵转置,如:  
$[A|b]^\intercal=\begin{bmatrix} A^\intercal\\b^\intercal\end {bmatrix}$

4 主对角分块矩阵的幂,等于把各个位置的子矩阵做幂运算  

5 主对角分块对角矩阵的逆, 等于各个分块取逆运算

$$
\left[ \begin{matrix} A&O\\ O&B \end{matrix} \right]^{-1}=
\left[ \begin{matrix} A^{-1}&O\\ O&B^{-1} \end{matrix} \right]\\
$$

6 副对角分块矩阵的逆,等于各个分块取逆运算,再交换位置

$$
\left[ \begin{matrix} O&B \\A&O  \end{matrix} \right]^{-1}=
\left[ \begin{matrix} O&A^{-1}  \\B^{-1}&O\\ \end{matrix} \right]\\
$$

### 矩阵乘法与方程组的关系

设$A是m \times n的矩阵,B是 n \times s的矩阵$

若$AB=O$,则$B$的列向量是齐次方程组$Ax=0$的解.

若$AB=C$,  
则$AB$的列向量(即$C$的列向量)可由$A$的列向量线性表达,  
则$AB$的行向量(即$C$的行向量)可由$B$的行向量线性表达.

### 向量的定义

1 $n$个数所构成的有序数组称为$n$为向量.  
2 所有分量为$0$的向量称为零向量,记为$0$.

### 向量的运算法则

1 向量相等,等于所以分量都相等.  
2 向量加法 $\alpha+\beta=(a_1+b_1,a_2+b_2,\cdots,a_n+b_n)$  
3 向量数乘 $k\alpha=(ka_1,ka_2,\cdots,ka_n)$ 

4 向量内积 $(\alpha,\beta)=a_1b_1+a_2b_2+\cdots+a_nb_n$  
若两向量内积为零,则称这两向量<u>正交</u>  
向量内积的开方$\sqrt {(\alpha,\beta)}$,称为向量的长度

5 向量加法和数乘满足分配律,交换律,结合律(和矩阵加法数乘相同).  

### 向量的内积运算法则  

$$
\begin{aligned}
&(\alpha,\beta) = (\beta,\alpha)\\
&k(\alpha,\beta)=(k\alpha,\beta)\\
&(k\alpha,\beta)=(\alpha,k\beta)\\
&(\alpha+\beta,\gamma)=(\alpha,\gamma)+(\beta,\gamma)\\
&(\alpha,\alpha) \ge 0(等号成立当且仅当\alpha是零向量)\\
\end{aligned}
$$

### 等价向量组

1 如果两个向量组可以相互线性表出,则称这两个向量组等价.  
2 等价向量组具有传递性,对称性,反身性.  
3 向量组的任意两个极大线性无关组是等价向量组.  
4 等价向量组具有相同的秩,但秩相等的向量组不一定等价.

### 向量组的线性相关的概念

1 向量组线性相关是指存在不全为零的数使得$k_1\alpha_1+\cdots+k_s\alpha_s=0$  
2 含有零向量,相等向量,坐标成比例的向量的向量组都是线性相关的  
3 梯形向量组定是线性无关的

### 向量线性表出的概念

1 能线性表出的向量必须是同纬度的向量  
2 一个向量是其他向量的线性组合

### 向量组线性相关的充要条件

$n$维向量组$\alpha_1,\alpha_2,\cdots,\alpha_s$线性相关

$\Longleftrightarrow$
齐次方程组$(\alpha_1,\alpha_2,\cdots,\alpha_s)\left[\begin{matrix} x_1\\ x_2 \\ \vdots \\ x_s\end{matrix} \right]=0$有<u>非零解</u>.

$\Longleftrightarrow r(\alpha_1,\alpha_2,\cdots,\alpha_s) \lt s$.

$\Longleftrightarrow$ 至少有一个向量,可由其余向量线性表出.

### 向量组线性相关推论

1) $n个n维向量组\alpha_1,\alpha_2,\cdots,\alpha_n$线性相关  
$\Longleftrightarrow |\alpha_1,\alpha_2,\cdots,\alpha_n|=0$.

2) $n+1个n$维向量必线性相关.

3) 如果$\alpha_1,\alpha_2,\cdots,\alpha_r$线性相关,  
那么$\alpha_1,\alpha_2,\cdots,\alpha_r, \alpha_{r+1},\cdots,\alpha_s$必线性相关.  
(即向量组中有一子向量组线性相关,则整个向量组线性相关)  
(或即向量组线性相关,加入新向量后扩大的向量组仍线性相关)

4) 设有两个$n$维向量组$(I)(\alpha_1,\alpha_2,\cdots,\alpha_s),(II)(\beta_1,\beta_2,\cdots,\beta_t)$,  
如果$(I)$能由$(II)$线性表出,且$s\gt t$,则$\alpha_1,\alpha_2,\cdots,\alpha_s$必线性相关.  
(即若个数多的项向量组能由个数少的向量组线性表出,则多的项组必线性相关)

5) 推论 若$n$维向量组$(\alpha_1,\alpha_2,\cdots,\alpha_s)$可由$(\beta_1,\beta_2,\cdots,\beta_t)$线性表出,  
且$(\alpha_1,\alpha_2,\cdots,\alpha_s)$线性无关,则$s\le t$.  
(即一个线性无关的向量组能由另一个向量组线性表出,则另一个向量组向量个数必大于等于线性无关组的)

### 向量组线性无关的推论

如果$n为向量组(\alpha_1,\alpha_2,\cdots,\alpha_s)$线性无关,  
(1) 那么它的延伸组$\left(\begin{matrix} \alpha_1\\ \beta_1 \end{matrix} \right), \cdots$必线性无关,  
即矩阵的列向量线无关,增加任意个行向量后,列序列仍线无关;  
即方程组只有零解,增加任意个方程后,方程组仍只有零解.

(2) 它的任意子向量组必线性无关.

### 向量可被线性表出的充分必要条件

$n$维向量$\beta可由\alpha_1,\alpha_2,\cdots,\alpha_m$线性表出  
$\Longleftrightarrow$非齐次方程组$x_1\alpha_1+\cdots+x_m\alpha_m=\beta$有解.  
$\Longleftrightarrow 秩r(\alpha_1,\alpha_2,\cdots,\alpha_m)=r(\alpha_1,\alpha_2,\cdots,\alpha_m,\beta)$

### 线性无关向量组线性表出定理

定理一 若向量组$(\alpha_1,\alpha_2,\cdots,\alpha_s)$线性无关,而向量组$\alpha_1,\alpha_2,\cdots,\alpha_s, \beta)$  
线性相关,则$\beta$可由$(\alpha_1,\alpha_2,\cdots,\alpha_s)$线性表出,且表示法唯一.

定理二 $n$个线性无关的$n$向量组能线性表出任意一个$n$向量.

### 极大线性无关组和秩的概念

设向量组$S=\alpha_1, \alpha_2\cdots, \alpha_s$中有一部分组$a_1,a_2,\cdots,a_r, 1 \le r \le s$,满足条件

1 $a_1,a_2,\cdots,a_r$线性无关.  
2 再添加任一向量$\beta \in S$,则向量组$a_1,a_2,\cdots,a_r,\beta$必线性相关  
 (或向量组$S$中每一个向量均可由此部分组线性表示);  
则称$a_1,a_2,\cdots,a_r$是$S$的一个极大线性无关组.

极大线性无关组的所含向量的个数即为向量组的秩

a) 只有一个零向量构成的向量组没有极大线性无关组  
b) 一个线性无关组的极大线性无关组是该向量组本身,秩为向量组个数  
c) 向量组的极大线性无关组一般不唯一,但极大线性无关组的向量个数是一样的.  

### 关于向量组的秩的定理

1) 若向量组$(I)(\alpha_1,\alpha_2,\cdots,\alpha_s)$可由$(II)(\beta_1,\beta_2,\cdots,\beta_t)$线性表出,  
则$r(I)\le r(II)$.
2) 推论 如果向量组$(I)和(II)$等价,那么$r(I)= r(II)$.
3) (三秩相等定理)矩阵的秩=矩阵的行秩(行向量组的秩)=矩阵的列秩(列向量组的秩).
4) 经初等变换向量组的秩不变.

### 施密特正交规范化

设$\alpha_1,\alpha_2,\alpha_3$线性无关,其正交规范化步骤如下:  

1 先将$\alpha_1,\alpha_2,\alpha_3$正交化

$\beta_1=\alpha_1$  
$\beta_2=\alpha_2-k_{21}\beta_1$  
$\beta_3=\alpha_3-k_{31}\beta_1-k_{32}\beta_2$  

其中

$$
k_{ij}=\frac {(\alpha_i,\beta_j)}{(\beta_j,\beta_j)}\\
\  \\
k_{21}=\frac {(\alpha_2,\beta_1)}{(\beta_1,\beta_1)}\\
$$

2 再将$\beta_1,\beta_2,\beta_3$单位化 

$\gamma_1 = \frac {\beta_1}{|\beta_1|}$,$\gamma_2 = \frac {\beta_2}{|\beta_2|}$, $\gamma_3 = \frac {\beta_3}{|\beta_3|}$  

则$\gamma_1,\gamma_2,\gamma_3$是正交规范向量组.

### 正交矩阵的概念

若$n$阶矩阵$A$满足$AA^\intercal =A^\intercal A=E$,则$A$是正交矩阵.

若$A$是正交矩阵,则行列式$|A|=1或-1$.

### 正交矩阵的充要条件

$A$是正交矩阵  
$\Longleftrightarrow A^\intercal =A^{-1}$  
$\Longleftrightarrow AA^\intercal =E$  
$\Longleftrightarrow A$的列(行)向量组是正交规范向量组.

### 方程组的向量表示

$\alpha_1 x_1+\alpha_1 x_2 +\cdots+ \alpha_n x_2=0$

$\alpha_1 x_1+\alpha_1 x_2 + \cdots+\alpha_n x_2=b$

### 克拉默法则唯一解定理

设有$n$个变量$n$个方程构成的非齐次线性方程组$Ax=b$,  
若系数行列式$|A| \ne 0$,则方程组有唯一解,且  

$$
x_i = \frac {|A_i|}{|A|}, i=1,2,\cdots,n
$$

其中$|A_i|是|A|中第i$列的元素替换乘方程中右边的常数列向量$b$.

### $n$阶齐次线性方程组解的推论

设有$n$个变量$n$个方程构成的齐次线性方程组$Ax=0$,

1) 齐次线性方程组有唯一解的充要条件是$|A|\ne 0$.  
2) 反之,齐次线性方程组有非零解的充要条件是$|A|= 0$.

### 齐次线性方程组的基础解系

设$\xi_1,\xi_2,\cdots,\xi_{n-r}是Ax=0$的解向量,若满足

1) $\xi_1,\xi_2,\cdots,\xi_{n-r}$线性无关.
2) $Ax=0$的任一解向量$\xi$均可由$\xi_1,\xi_2,\cdots,\xi_{n-r}$线性表出.

则称$\xi_1,\xi_2,\cdots,\xi_{n-r}$是$Ax=0$的基础解系.  
其中$r=r(A)$即矩阵$A$的秩,即线性无关向量组的个数为$n-r, n$是变量的个数.

基础解系是齐次方程组的解向量的极大无关组.

### 齐次线性方程组解的性质

齐次线性方程组一定有解,至少有零解.

若$\xi_1,\xi_2$是齐次线性方程组的解,  
则$k\xi_,k_1\xi_1+k_2\xi_2$仍是齐次线性方程组的解,$k$是任意常数.

同理,齐次线性方程组的解的任意线性组合仍是齐次线性方程组的解.

### 齐次线性方程组只有零解的充要条件

$A_{m\times n}x=0$只有零解  
$\Longleftrightarrow A$ 列向量线性无关.  
$\Longleftrightarrow r(A)=n$.

### 齐次线性方程组有非零解的充要条件

$A_{m\times n}x=0$有非零解  
$\Longleftrightarrow A$ 列向量线性相关.  
$\Longleftrightarrow r(A) \lt n$列数.

### 齐次线性方程组的通解

1 齐次线性方程组基础解系的个数为$n-r(A)$  
2 通解 $k_1\xi_1+k_2\xi_2+\cdots+k_{n-r}\xi_{n-r}$  
3 基础解系求法  

1. 利用初等行变换(换行/倍加/倍乘)不改变线性方程组的解,将$A$作初等变换化成阶梯形矩阵,得阶梯形方程组  
2. 阶梯形方程中每一行的第一个系数不为零的$r$个未知变量,称为独立未知量,而后的$n-r$个未知量,称为自由未知量.
3. 将自由未知量分别赋予下列$n-r$组值  
$[1,0,\cdots,0]^\intercal ,[0,1,\cdots,0]^\intercal , \cdots, [0,0,\cdots,1]^\intercal$  
带入方程,求出相应的独立未知量,并得到$n-r$个解.
4. 最后基础解系为  
$\xi_1=[d_{11},d_{12},\cdots,d_{1r},1,0,\cdots,0]^\intercal$  
$\xi_2=[d_{21},d_{22},\cdots,d_{2r},0,1,\cdots,0]^\intercal$  
$\cdots$  
$\xi_{n-r}=[d_{n-r1},d_{n-r2},\cdots,d_{n-rr},0,0,\cdots,1]^\intercal$  

### 非齐次方程组的解的性质

设$\eta_1,\eta_2是Ax=b$的两个解,$\xi$是对应齐次方程组$Ax=0$的解,$\xi是Ax=c$的解,则

1 $A(k_1\eta_1+k_2\eta_2)=(k_1+k_2)b$,其中$(k_1+k_2)=0$时$k_1\eta_1+k_2\eta_2$是齐次解,$(k_1+k_2)=1$是非齐次解,同理3个解.  
2 $A(\eta_1+k\xi)=b$,即齐次解与非齐次解的和仍旧是非齐次解  
3 $A(\eta_1+\xi)=b+c$

### 非齐次方程组有解的充要条件

$Ax=b$有解  
$\Longleftrightarrow b 可由A$的列向量线性表出.  
$\Longleftrightarrow r(A)=r(A|b)$

$Ax=b$有唯一解  
$\Longleftrightarrow r(A)=r(A|b)=n$,$n$是$A$的列数.  
$\Longleftrightarrow A的列向量(\alpha_1,\cdots,\alpha_n)线性无关,(\alpha_1,\cdots,\alpha_n,b)$线性相关.  
$\Longleftrightarrow b 可由A$的列向量线性表出,且表示法唯一.

### 非齐次方程组无解的充要条件

$Ax=b$无解  
$\Longleftrightarrow b 不能由A$的列向量线性表出.  
$\Longleftrightarrow r(A) \ne r(A|b)(r(A)+1=r(A|b))$

### 非齐次方程组通解的结构

非齐次方程组的通解$=$对应的齐次方程组的通解$+$一个非齐次方程组的特解

### 非齐次方程组的通解的求解步骤

1. 写出增广矩阵$(A|b)$.
2. 通过初等<u>行变换</u>将增广矩阵化为阶梯形矩阵.
3. 求出对应齐次方程组的通解.
4. 再求一个非齐次特解,一般将自由未知量均取零带入非齐次方程组,求的独立未知量.
5. 通解等于齐次通解加非齐次特解

### 特征值和特征向量

$A$是$n$阶方阵,如果对于数$\lambda$,存在非零向量$\alpha$,使得  
$A\alpha=\lambda\alpha$
成立,则称$\lambda是A$的特征值,$\alpha$是$A$对应$\lambda$的特征向量.

$|\lambda E-A|\alpha=0$是特征方程,$|\lambda E-A|$是特征多项式,  
$\lambda E-A$是特征矩阵.

### 矩阵与其特征值的关系

1 特征值的和等于矩阵的迹(即主对角线上元素的和).

2 特征值的乘积等于矩阵的行列式.

3 若矩阵可相似对角化,则非零特征值的个数等于矩阵的秩.

4 实对称矩阵非零特征值的个数等于矩阵的秩

5 矩阵的特征值个数(包括重根)等于其阶数

### 求特征值和特征向量的方法

方法一 特征方程法

1. 根据$|\lambda E-A|=0$,求出全部特征值$\lambda_i$.
2. 再根据$(\lambda_i E-A)x=0$,求出对应$\lambda_i$的特征向量,  
基础解系即为线性无关的特征向量,通解即为全部特征向量(除零向量).

方法二 定义法

凡是满足$A\alpha=\lambda\alpha$的$\lambda,\alpha(\alpha\ne 0)$  
即为$A$的特征值和特征向量,一般用于抽象矩阵.

当$|A|=0$时有特征值$\lambda=0$.因为对$Ax=0的任意非零解\alpha 使得A\alpha=0\alpha$

### 相似矩阵的定义

$A是n$矩阵,存在可逆矩阵$P$使得$P^{-1}AP=B$,则$A$相似于$B$,记为$A\sim B$.  
若$A$相似于对角矩阵,则称$A$可以相似对角化.

### 矩阵可相似对角化的充分必要条件

$n$矩阵$A$可相似对角化  
$\Longleftrightarrow$ $A有n$线性无关的的特征向量.  
$\Longleftrightarrow A$的每一个$r_i$重特征值对应线性无关的特征向量的个数等于该特征值的重数$r_i$.

### 矩阵可相似对角化的充分条件
  
若$n$阶矩阵$A$有$n$个互不相同的特征值,则矩阵$A$可相似于对角矩阵.

设$\alpha_1,\alpha_2,\cdots,\alpha_n$是对应于特征值$\lambda_1,\lambda_2,\cdots,\lambda_n$的特征向量,  
取$P=[\alpha_1,\alpha_2,\cdots,\alpha_n]$,则有

$$
P^{-1}AP=\Lambda=
\begin{bmatrix}
\lambda_1&0&\cdots&0\\
0&\lambda_2&\cdots&0\\
\vdots&\vdots&&\vdots\\
0&0&\cdots&\lambda_n\\
\end{bmatrix}
$$

注意特征向量和特征值排列顺序一致.

### 关于特征值和特征向量的定理

定理1 $\lambda_1 \ne \lambda_2 \Rightarrow A$的对应于$\lambda_1 ,\lambda_2的特征向量\alpha_1,\alpha_2$线性无关.  
即不同特征值的特征向量线性无关.

定理2 $\lambda$是$n$阶矩阵$A$的$r_i$重根,则其对应的线性无关的特征向量的个数$\le r_i$个.  
当其少于$r_i$个时,$A$不能相似对角化.

### 相似矩阵的性质

若$A\sim B$

反身性$A\sim A$,  
对称性$A\sim B \Rightarrow B \sim A$,  
传递性$A\sim B, B\sim C \Rightarrow A\sim C$.

$A^n \sim B^n$

### 两矩阵相似的必要条件

$A\sim B$  $\Rightarrow$

1) $|\lambda E-A|=|\lambda E-B|$特征多项式相同;
2) $r(A)=r(B)$秩相等;  
3) $A,B$具有相同的特征值;
4) $|A|=|B|=\prod_{i=1}^n \lambda_i$行列式相等;  
5) $\sum_{i=1}^n a_{ii}=\sum_{i=1}^n b_{ii}=\sum_{i=1}^n \lambda_i$迹相等;

### 关于实对称矩阵的定理

定理1 实对称矩阵的特征值全部是实数.  
定理2 实对称矩阵属于不同特征值的特征向量相互正交(内积为零).  
定理3 实对称矩阵必相似于对角矩阵,即存在可逆矩阵$P,使P^{-1}AP=\Lambda$  
且必合同于对角矩阵,即存在正交矩阵$Q,使得Q^\intercal AQ=Q^{-1}AQ=\Lambda$.  
定理4 两实对称矩阵相似的充分必要条件是有相同的特征值.

### 实对称矩阵正交相似于对角矩阵的步骤

第一步 解特征根方程$|\lambda E-A|=0$,得全部实数解特征值$\lambda_i,i=1,2,\cdots$.  
第二步 求$(\lambda_i E-A)x=0$的基础解系,若能求的相互正交的基础解系,可免去下一步正交化.  
第三步 将每个$\lambda_i$的特征向量施密特正交化.  
第四步 将全部特征向量单位化.  
第五步 将$n$正交单位化向量合成正交矩阵,则有$Q^\intercal AQ=Q^{-1}AQ=\Lambda$.

### 二次型的矩阵表示

$$
f=[x_1,x_2,\cdots,x_n]A\begin{bmatrix} x_1 \\x_2\\ \vdots \\ x_n \end{bmatrix}=
x^\intercal Ax,(A是对称矩阵)\\
$$

若$r(A)=r \Leftrightarrow r(f)=r$  
$A正定\Leftrightarrow f$正定.

### 二次型的标准型和规范型

若二次型只有平方项没有混合项,则称二次型为标准型,  
若标准型中平方项的系数只有$1,-1,0$,则称二次型为规范型.

### 二次型的必可化为标准型定理

定理一  
对任意$n$元二次型$f=x^\intercal Ax$,必存在正交变换$x=Qy,Q$是正交矩阵,化二次型为标准型,  

$$
f=x^\intercal Ax  = y^\intercal Q^\intercal AQy=\lambda_1 y_1+\lambda_2 y_2+\cdots+\lambda_n y_n
$$

其中$\lambda_1, \cdots \lambda_n是A$的$n$个特征值.  
[注] 正交变换一般只能化为标准型,不能化为规范性,除非特征值只有$1,-1,0$

定理二  
任何二次型都可经过可逆线性变换(配方法)化为标准型.

### 两矩阵合同的定义

设$A,B$是两个$n$阶方阵,若存在可逆矩阵$C$,使得$C^\intercal AC=B$,则称$A合同于B$.

### 惯性定理

二次型的标准型不唯一,但标准型的正平方项数$p$(称为正惯性指数),是唯一确定的,  
负平方项数$q$(称为负惯性指数),是唯一确定的.  
$p+q=r$是二次型对应矩阵的秩,$p-q$称为符号差.

### 实数对称矩阵合同的充分必要条件

实对称矩阵$A$合同于$B$  
$\Longleftrightarrow x^\intercal Ax与x^\intercal Bx$有相同的正负惯性指数.  
(有相同的秩和正惯性指数)

### 矩阵合同的必要条件(判断是否合同)

若矩阵$A$合同于$B \Longrightarrow r(A)=r(B)$,且行列式同号.

### 实对称矩阵合同的充分条件

实对称矩阵合同的充分条件是有相同的特征值.

### 正定二次型正定矩阵的定义

对任意非零向量$x$,恒有$f=x^\intercal Ax \gt 0$,  
则称$f$为正定二次型,对应矩阵$A$为正定矩阵.

### 正定性定理 可逆线性变换不改变二次型的正定性

### 二次型正定的充分必要条件(判断是否正定)

$f=x^{\intercal}Ax$正定  
$\Longleftrightarrow A$的正惯性指数$p=r(A)=n(n是未知量个数)$  
$\Longleftrightarrow A与E$合同  
$\Longleftrightarrow A=D^\intercal D,D$是可逆矩阵  
$\Longleftrightarrow A的全部特征值\lambda \gt 0$  
$\Longleftrightarrow A的全部顺序主子式 \gt 0$(主要方法),即

$$
a_{11} \gt 0,
\begin{vmatrix}
a_{11}&a_{12}\\
a_{21}&a_{22}\\
\end{vmatrix} \gt 0,
\cdots, |A| \gt 0
$$

### 二次型正定的必要条件

若$f=x^\intercal Ax$正定,则

1) $A的主对角元素a_{ii} \gt 0$  
2) 行列式$|A| \gt 0$

补充:正定矩阵一定是实对称矩阵

### 正交变换化二次型为标准型步骤

1) 将二次型表示成矩阵形式$x^\intercal Ax$
2) 求出$A$的全部特征值
3) 求出$A$的特征值对应的特征向量
4) 将重根特征值的特征向量施密特正交化  
或找出两两相互正交的特征根(待定参数法).
5) 可检查不同特征值的特征向量是否正交
6) 将全部特征向量单位化
7) 构造正交矩阵$Q$
8) 令$x=Qy, 则f=\lambda_1 y_1^2+\lambda_2 y_2^2+\cdots+\lambda_n y_n^2$

### 用配方法化二次型为标准型

(1) 若二次型中含有平方项,不妨设$a_{11} \ne 0$,对所有含$x_1$的项完全平方,  
配方后,(平方项可能包含三个$(x_1+x_2+x_3)^2$),其余各项不含$x_1$,  
再配第二个平方项, 直到配成完全平方和.

(2) 若二次型中没有平方项,不妨设$a_{12} \ne 0, 令x_1=y_1+y_2,x_2=y_1-y_2, x_3=y_3,\cdots,x_n=y_n$,  
带入$f$,将其转换成$(1)$情形处理,且有  
$z_i=f_i(y_1,y_2,y_3) \Rightarrow y_i=g_i(z_1,z_2,z_3) \Rightarrow x_i=u_i(z_1,z_2,z_3) \Rightarrow x=Cz$

(3) 配方后,平方项前面的系数即为标准型矩阵对角线元素,  
假若配方后得$5(x_1+x_2+x_3)^2+3(x2+x3)^2$,则令  
$y_1=x_1+x_2+x_3$  
$y_2=x_2+x_3$  
$y_3=x_3$(平方项没有,要补上的))  
解方程组得:  

$$
x_1=a_{11}y_1+a_{12}y_2+a_{13}y_3\\
x_2=a_{21}y_1+a_{22}y_2+a_{23}y_3\\
x_3=a_{31}y_1+a_{32}y_2+a_{33}y_3\\
$$

即$x=Cy,可逆变换C^\intercal AC =diag(5,3,0),其中C$为系数矩阵.

### 特征值转换定理

定理一

设$\lambda$是矩阵$A$的对应特征向量$\alpha$的特征值,  
那么

1 矩阵$f(A)$对有特征向量$\alpha$的和对应特征值$f(\lambda)$.  
$f(x)$是多项式,$f(x)=a_0+a_1x+\cdots+a_nx^n$

2 $A^*$有特征向量$\alpha$和特征值$\frac {|A|} \lambda$

3 $A^{-1}$有特征向量$\alpha$和特征值$\frac 1 \lambda$

4 上面三种情况的线性组合.

### 行列式为零的充分必要条件

$|A|=0$  
$\Longleftrightarrow A$不可逆  
$\Longleftrightarrow Ax=0$有非零解  
$\Longleftrightarrow 0是A$特征值  
$\Longleftrightarrow A$列(行)向量线性相关  

### 相似于对角矩阵推论

若$n$阶矩阵$A$与对角矩阵$diag(\lambda_1,\lambda_2,\cdots, \lambda_n)$相似,  
则$\lambda_1,\lambda_2,\cdots, \lambda_n$是$A$的$n$个特征值.

### 特殊矩阵乘法

1 用对角阵左乘一个矩阵，就是用对角阵的对角元分别乘这个矩阵的对应各行.

2 用对角阵右乘一个矩阵，就是用对角阵的对角元分别乘这个矩阵的对应各列.

3 用初等矩阵左乘一个矩阵A,相等于对A做对应的初等行变化.

4 用初等矩阵右乘一个矩阵A,相等于对A做对应的初等列变化.

5 对角矩阵相乘,把对应对角线上的元素相乘.

6 对角矩阵的逆,把对角元素取倒数.

### 可逆矩阵乘法

$A,B,C均为n阶矩阵,且C=AB$,则  
$C可逆\Longleftrightarrow A和B都可逆$.

推广到$n$个:  
$n$可逆矩阵的乘积仍是可逆矩阵.  
一个可逆矩阵若能分解成$n$方阵的乘积,则这$n$个方阵均可逆.

### 伴随矩阵定理汇总

对称矩阵的伴随矩阵也是对称矩阵.

正交矩阵的伴随矩阵也是正交矩阵.

### 数列极限定理

设${a_n}$为数列, $\lim_{n \rightarrow \infty} \frac {a_{n+1}}{a_n}=q$,  
若$|q|\lt 1 \Rightarrow \lim_{n \rightarrow \infty} a_n =0$;  
若$|q|\gt 1 \Rightarrow \lim_{n \rightarrow \infty} a_n =\infty$;  

$\lim_{n \rightarrow \infty} a_n =0 \Leftrightarrow \lim_{n \rightarrow \infty} |a_n| =0$

收敛数列具有保号性,有界性,唯一性
