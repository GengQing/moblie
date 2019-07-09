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

### 一阶微分形式的不变形

不论$u$是自变量还是中间变量均有$\mathrm{d}y=f'(u)\mathrm{d}u$

### 基本初等函数的导数

$$
\begin{aligned}
&(C)'=0&                          &(x^a)'=ax^{a-1} \\
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
&\mathrm{d}(C)=0& &\mathrm{d}(x^a)=ax^{a-1} \mathrm{d}x\\
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
(\int_{\varphi_1(x)}^{\varphi_2(x)}f(t)dt)' = f(\varphi_1(x))\varphi'_1(x)-f(\varphi_2(x))\varphi'_2(x)
$$

### $n$阶导数运算法则

设$u,v均n阶$可导,则有

$$
\begin{aligned}
&(u \pm v)^{(n)} = u^{(n)} \pm v^{(n)}\\
&(Cu)^{(n)} = Cu^{(n)}\\
&(uv)^{(n)}=u^{(n)}v+C_n^1 u^{(n-1)}v'+C_n^2 u^{(n-2)}v'' +\cdots + uv^{(n)}
\end{aligned}
$$

### 常见初等函数$n$阶导数公式

$$
\begin{aligned}
&(\sin ax)^{(n)} = a^n\sin (ax + \frac{n\pi}{2})\\
&\ \\
&(\cos ax)^{(n)} = a^n\cos (ax + \frac{n\pi}{2})\\
\ \\
&(\ln(1+x))^{(n)} = \frac{(-1)^{n-1} (n-1)!}{(1+x)^{n}}\\
&((1+x)^a)^{(n)} = a(a-1)\cdots(a-n+1)(1+x)^{a-n}\\
&((1+x)^n)^{(n)} = n!,(n 为正整数)\\
&((1+x)^n)^{(m)}=0,(m \gt n,n和m均为正整数)
\end{aligned}
$$

### 参数方程求导公式

设$x(t), y(t)$均可导且$x'(t) \ne 0$

$$
x=x(t), y=y(t)\\
y'_x=\frac{y'_t}{x'_t}\\
y''_x=\frac{x'_ty''_{tt}-x''_{tt}y'_t}{x'^3_t}\\

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
\frac {dx}{dy}=\frac 1{\frac {dy}{dx}}\\
\varphi '(y)=\frac 1{f'(x)}\\
\varphi ''(y)=-\frac {f''(x)}{(f'(x))^3}\\
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

设$f(x)在区间I有f'(x)\ge 0$,且不在任意子区间上取等号,则$f(x)在区间I$上是严格单调递增的.  
同理判定严格单词递减($f'(x)\le 0$,且不在任意子区间上取等号)

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
并且在$x=x_0$的左右领域$f''(0)$反号,则点$(x_0, f(x_0))$是曲线的拐点.

[注] 若$f''(x_0)=0, f'''(x_0) \gt 0,$,则该点是拐点且左凸右凹, 反之$f'''(x_0) \lt 0$左凹右凸.

### 曲率和曲率半径计算公式

$$
曲率k=\frac{|y''|}{[1+(y')^2]^{\frac 3 2}}\\
\ \\
曲率半径R=\frac{[1+(y')^2]^{\frac 3 2}}{|y''|}
$$

### 费马定理

设$f(x)在x=x_0的某领域内有定义, f(x_0)是f(x)的一个极大值, 有设f'(x_0)存在$  
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

设$f(x),g(x)在[a,b]上连续, 在(a,b)上可导,且g'(\xi) \ne 0$,则  
至少存在一点$\xi \in (a,b)$,使得

$$\frac {f(b)-f(a)}{g(b)-g(a)}=\frac{f'(\xi)}{g'(\xi)}$$

### 拉格朗日余项泰勒定理

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

[注] 若$f(x)在(a,b)上有跳跃间断点,则f(x)在[a,b]上一定不存在原函数$.  
若$f(x)$不连续,则原函数是否存在与定积分是否存在各不相干.

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
$$

