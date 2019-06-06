### 多项式展开公式

$$
\begin{aligned}
a^n-b^n&=(a-b)[a^{n-1}+a^{n-2}b+a^{n-3}b^2+\cdots+b^{n-1}]\\

a^3-b^3&=(a-b)(a^2+ab+b^2)\\

a^3+b^3&=(a+b)(a^2-ab+b^2)\\

(a+b)^n&=\sum_{r=0}^n C_n^r a^{n-r}b^r=C_n^0a^n+C_n^1a^{n-1}b+C_n^2a^{n-2}b^2+\cdots+C_n^nb^n
\end{aligned}
$$

### 三角函数公式,奇变偶不变,符号看象限

$$
(n\frac{\pi}{2} \pm a)\\

\sin(\pi + a) = -\sin a\\

\sin(\pi - a) = \sin a\\

\cos(\pi + a) = -\cos a\\

\cos(\pi - a) = -\cos a\\

\sin x \ge 0, x\in[0,\pi],即在第一和第二象限为正值,第三四象限为负值 \\

\cos x \ge 0, x\in[0,\pi/2] ,[\frac{3\pi}{2},2\pi], 即一和四象限为正值, 二三象限为负值\\
$$

### 特殊三角函数值

$$
\begin{aligned}
&\sin(0) = 0& &\sin(\frac {\pi}6)=\frac12& &\sin(\frac {\pi}4)=\frac{\sqrt2}2& &\sin(\frac {\pi}3)=\frac{\sqrt3}2&
&\sin(\frac {\pi}2)=1&\\
&\cos(0) = 1& &\cos(\frac {\pi}6)=\frac{\sqrt3}2& &\cos(\frac {\pi}4)=\frac{\sqrt2}2& &\cos(\frac {\pi}3)=\frac12&
&\cos(\frac {\pi}2)=0&\\
&\tan(0) = 0& &\tan(\frac {\pi}6)=\frac{\sqrt3}3& &\tan(\frac {\pi}4)=1&  &\tan(\frac {\pi}3)=\sqrt3& 
&\tan(\frac {\pi}2)=+\infty&\\
\end{aligned}
$$

### 三角函数和差乘积

$$
\sin x + \cos x = \sqrt 2\sin(x+\frac {\pi}{4})
$$

### 排列组合公式

$$
C_n^k=\frac{n*(n-1)\cdots(n-k+1)}{k!}\\
\ \\
C_n^k=C_n^{n-k}\\
\ \\
C_5^3=\frac{5\times4\times3}{3\times2\times1}\\
\ \\
C_n^0=1 \\
C_n^n=1

$$

### 不等式公式

$$
\frac{a+b}{2} \ge \sqrt{ab}\\
\ \\
\frac {a_1+\ldots + a_n}{n} \ge \sqrt[n]{a_1 \times \ldots \times a_n}\\
\ \\
x \ge \sin x (x\ge0)\\
\ \\
|x| \gt |\sin x|(x\neq0)\\

$$

### 不等式两边乘以负数, 不等号变号

$$
a>b \Rightarrow -a<-b
$$

### 两边同号时取倒数, 不等号变号

$$
a>b>0 \Rightarrow \frac1a<\frac1b\\
\ \\
a \lt b \lt 0 \Rightarrow \frac1a>\frac1b
$$

### 基本初等函数

$$
y=x^{\mu} \\

y=a^x,(a>0 \& a \neq 1) \\

y=\log_a x,(a > 0 \& a \neq 1);  a=e,y=\ln x\\

y=\sin x, x\in (-\infty,+\infty),y\in[-1,-1], f(-x)=-f(x), f(x+2\pi)=f(x) \\

y=\arcsin x, x \in [-1,1], y \in[-\frac \pi 2, \frac\pi 2]
$$

### 基本初等函数公式

$$
\log_a x = \frac {\ln x} {\ln a}\\
a^{m+n}=a^m a^n\\
a^{mn}=(a^m)^n=(a^n)^m\\
a^{m-n}=\frac {a^m}{a^n}

$$

### 三角函数的周期

$$

f(x)=A\sin(Bx+C)+D, T=\frac {2\pi} B
$$

### 泰勒公式

$$
e^x=1+x+\frac{1}{2!} x^2 + \frac{1}{3!}x^3+...\\

(1+x)^a=1+ax + \frac{a(a-1)}{2!}x^2 + \frac{a(a-1)(a-2)}{3!}x^3+...\\

\frac{1}{1-x}=1+x+x^2+x^3+...\\

\frac{1}{1+x} = 1-x+x^2-x^3+...\\

\ln (1-x) = -x-\frac{1}{2}x^2- \frac{1}{3}x^3 + \cdots\\

\ln (1+x) = x-\frac{1}{2}x^2+ \frac{1}{3}x^3 + \cdots\\

\tan x=x+\frac{x^3}{3}+\cdots\\

\arctan x=x-\frac{x^3}{3}+\cdots\\

\sin x=x-\frac{1}{3!}x^3+\cdots\\

\cos x=1-\frac{1}{2!}x^2+\frac{1}{4!}x^4+\cdots\\
$$

### 补充重要极限

$$
\lim_{n \rightarrow \infty}\sqrt[n]n = 1\\
\lim_{n \rightarrow \infty}\sqrt[n]a = 1(a\gt0)\\
\lim_{x \rightarrow +\infty} x^k e^{-\delta x} = 0(k\gt0, \delta \gt0)\\
\lim_{x \rightarrow 0^+} x^k \ln^{\delta} x = 0(k\gt0, \delta \gt0)
$$

### 肯定型幂指函数极限

$$
\lim f(x)存在且为A(A\gt0)\\
\lim g(x)存在且为B\\
那么\lim f(x)^{g(x)}=A^B\\

$$

### 等价无穷小

$$
\sin x  \sim  x, \tan x  \sim  x\\

\arcsin x \sim x, \arctan x \sim x\\

1-\cos x  \sim  \frac {x^2} 2\\

\sec x - 1 =\frac 1{\cos x} -1 \sim \frac {x^2}2\\

e^x-1 \sim x, a^x-1 \sim x\ln a \\

\ln (1+x) \sim x, \log_a (1+x) \sim \frac x{\ln a}\\

\sqrt {1+x}-1 \sim \frac x2, (1+x)^a-1 \sim ax\\
$$

### 导数公式

$$
\begin{aligned}
&(c)'=0&                          &(x^a)'=ax^{a-1} \\
&(\sqrt x)' = \frac1{2\sqrt x}&   &(\frac 1x)'=-\frac 1{x^2} \\
&(e^x)' = e^x&                    &(a^x)'=a^x\ln a \\
&(\ln x)' = \frac{1}{x}&          &(log_ax)' = \frac{1} {x\ln a} \\
&(\sin x)' = \cos x&              &(\cos x)' = -\sin x \\
&(\tan x)' =\sec^2x=\frac{1}{\cos^2 x}& &(\cot x)'=-\csc^2x=-\frac{1}{\sin^2 x}\\
&(\sec x)' = \sec x \tan x&         &(\csc x)' = -\csc x \cot x\\
&(\arcsin x)' = \frac{1}{\sqrt{1-x^2}}&     &(\arccos x)'=-\frac{1}{\sqrt{1-x^2}} \\
&(\arctan x)' = \frac{1}{1+x^2}&    &(arccot x)' = -\frac{1}{1+x^2}\\
\end{aligned}

$$

### 导数微分关系

$$
dy=f'(x)\Delta x = f'(x)dx\\
\Delta y - dy = \frac 12 f''(\xi)(\Delta x)^2


$$

### 导数四则运算

$$
(u\pm v)' = u' \pm v'\\
(Cv)'=Cv'\\
(uv)' = u'v+uv'\\
(\frac uv)'=\frac{u'v-uv'}{v^2}(v\neq 0)\\
(uvw)'=u'vw+uv'w+uvw'\\
$$

### 复合函数求导

$$
y=f[g(x)],y'(x)=f'(u)g'(x)
$$

### 幂指函数导数

$$
[u^v]'=u^v(u'\frac{v}{u}+v'\ln u)
$$

### 高阶导数

$$
(uv)^{(n)}=u^{(n)}v+C_n^1 u^{(n-1)}v'+C_n^2 u^{(n-2)}v'' +\cdots + uv^{(n)}\\
\ \\
(\sin ax)^{(n)} = a^n\sin (ax +frac{n\pi}{2})\\
\ \\
(\cos ax)^{(n)} = a^n\cos (ax +frac{n\pi}{2})\\
\ \\
(\ln(1+x))^{(n)} = \frac{(-1)^{n-1} (n-1)!}{(1+x)^{n}}\\
((1+x)^a)^{(n)} = a(a-1)\cdots(a-n+1)(1+x)^{a-n}
$$

### 一阶导数只包含y,求二阶导数

$$
\frac {dy}{dx} =f(y)\\

\frac {d^2y}{dx^2} =\frac {d}{dx}(\frac {dy}{dx})\\
=\frac {d}{dy}(f(y))\frac {dy}{dx}\\
=f'(y)f(y)
$$

### 参数方式求导

$$
x=x(t), y=y(t),\\
y'_x=\frac{y'_t}{x'_t}\\
y''_x=\frac{x'_ty''_{tt}-x''_{tt}y'_t}{x'^3_t}
$$

### 反函数求导

$$
\frac {dx}{dy}=\frac 1{\frac {dy}{dx}}\\
\varphi '(y)=\frac 1{f'(x)}\\
\varphi ''(y)=-\frac {f''(x)}{(f'(x))^3}\\
$$

### 极坐标转换成参数方程

$$
r=r(\theta)\\
x=r\cos \theta\\
y=r\sin \theta
$$

### 积分

$$
\begin{aligned}
&\int a dx = ax+C&               &\int x^ndx=\frac{x^{n+1}}{n+1}+C\\
&\int \frac 1 x dx=\ln |x| +C\\
&\int e^xdx = e^x+C&             &\int a^xdx=\frac{a^x}{\ln a} + C\\
&\int\sin xdx = -\cos x+C&       &\int\cos xdx=\sin x+C\\
&\int\tan xdx = -\ln |\cos x|+C& &\int\cot xdx=\ln |\sin x|+C\\
&\int\sec xdx = \ln|\sec x + \tan x|+C&   &\int\csc xdx=\ln |\csc x - \cot x|+C\\
&\int \sec^2 xdx=\tan x +C&               &\int\csc^2xdx=-cotx +C\\
&\int\frac 1{\sqrt{1-x^2}}dx=\arcsin x+C& &\int\frac{1}{\sqrt{a^2-x^2}}dx=\arcsin \frac xa+C\\
&\int\frac 1{\sqrt{x^2-a^2}}dx=\ln{(x+\sqrt{x^2-a^2})}+C& &\int\frac 1{\sqrt{x^2+a^2}}dx=\ln{(x+\sqrt{x^2+a^2})}+C\\
&\int\frac 1{1+x^2}dx=\arctan x+C& &\int\frac{1}{a^2+x^2}dx=\frac 1a \arctan \frac xa + C\\
&\int\frac 1{x^2-a^2}dx=\frac 1{2a}\ln |\frac{x-a}{x+a}|+C \\
\end{aligned}
$$

### 补充积分

$$
\int \sin^2 x dx = \frac12 x- \frac14 \sin 2x +C\\

\int \cos^2 x dx = \frac12 x+ \frac14 \sin 2x +C
$$

### 华里士公式

$$
\int_0^{\frac \pi 2} f(\sin x)dx=\int_0^{\frac \pi 2}f(\cos x)dx\\

\int_0^{\frac \pi 2} \sin^nxdx=\int_0^{\frac \pi 2}\cos^nxdx = 
\begin{cases}
\frac {(n-1)!!} {n!!} \cdot \frac \pi2 (n为偶数）\\
\ \\
\ \\
\frac {(n-1)!!} {n!!} (n为奇数)\\
\end{cases}
\  \\
\int_0^{\pi} xf(\sin x)dx = \frac{\pi}{2} \int_0^{\pi} f(\sin x)dx
\ \\
\ \\
\int_0^{\pi} \sin^{n}xdx=2\int_0^{\frac {\pi} 2}\sin^{n}xdx\\
\ \\
\int_0^{\pi} \cos^{2n}xdx=2\int_0^{\frac {\pi} 2}\cos^{2n}xdx
\ \\
\int_0^{\pi} \cos^{2n-1}xdx=0
$$

### 周期函数积分

$$
\int_a^{a+T} f(x)dx = \int_0^T f(x)dx\\

\int_a^{a+nT} f(x)dx = n\int_0^T f(x)dx
$$

### 变上限积分

$$
\int_0^x f(x-t)dt = \int_0^x f(t)dt
$$

### 无穷反常积分收敛充分条件

$$
\int_a^{+\infty} \frac 1 {x^p}dx \Leftarrow p>1,a>0 \\
\ \\
\int_a^{+\infty} \frac 1{x\ln^p x}dx \Leftarrow p>1, a>1 \\
\ \\
\int_a^{+\infty}x^ke^{-\lambda x}dx \Leftarrow \lambda>0,k>0 \\
$$

### 瑕积分收敛充分条件

$$
\int_a^b \frac 1{(x-a)^p}dx \Leftrightarrow p<1 
$$

### 重要反常积分

$$
\int_{-\infty}^{+\infty}e^{-2x}dx=2\int_{0}^{+\infty}e^{-2x}=\sqrt{\pi}
$$

### 定积分的运用

$$
当积分函数在积分区间有\lt 0时,需要分段\\
积分,函数\lt 0的段函数要取反转换成正值.
$$

### 曲线与$x$轴面积公式两种($y$轴取反函数同理)

$$
S=\int_a^b y dx, (y=y(x)\ge 0)\\
\ \\

S=\int_{t1}^{t2}yx'dt, (y=y(t)\ge 0, x=x(t))
$$

### 极坐标曲边扇形面积

$$
S=\frac 12 \int_{\theta1}^{\theta2}r^2d\theta, r=r(\theta)\\
$$

### 弧微分三种

$$
ds=\sqrt{1+y'^2}dx,y=y(x)\\
ds=\sqrt{x'^2+y'^2}dt, y=y(t), x=x(t)\\
ds=\sqrt{r^2+r'^2}d\theta,r=r(\theta)
$$

### 弧长公式三种

$$
L=\int_a^b\sqrt{1+y'^2}dx ,y=y(x)\\
L=\int_{t_1}^{t_2}\sqrt{x'^2+y'^2}dt, y=y(t), x=x(t)\\
L=\int_{\theta_1}^{\theta_2} \sqrt{r^2(\theta)+r'^2}d\theta,r=r(\theta)\\
$$

### 曲线绕$x$轴旋转体积

$$
V=\pi\int_a^b y^2dx, y=y(x)
$$

### 曲线绕$y$轴旋转体积两种

$$
V=2\pi\int_a^b xydx, y=y(x)\ge 0\\

V=\pi \int_{y_1}^{y_2} x^2dy, x=x(y)
$$

### 截面面积已知的体积(关键是寻找恰当的截面面积公式)

$$
V= \int_a^b S(x) dx
$$

### 曲线绕$x$轴旋转体侧面积两种

$$
S=2\pi\int_a^b|y|\sqrt{1+y'^2}dx,y=y(x)\\

S=2\pi\int_{t1}^{t2}|y|\sqrt{x'^2+y'^2}dt, x=x(t),y=y(t)\\
$$

### 函数的平均值

$$
average=\frac 1 {(b-a)}\int_a^bf(x)dx
$$

### 密度均匀形心质心公式

$$
密度均匀薄片y=f(x)是薄片上边界曲线,\\
可利用对称性计算出其中一个坐标 \\
横坐标x=\frac {\int_a^b xf(x)dx}{\int_a^b f(x)dx}\\
\ \\
纵坐标y=\frac {\frac 12 \int_a^b f^2(x)dx}{\int_a^b f(x)dx}
$$

### 一元积分区间原点对称性质

$$
 \int_{-a}^{a}f(x)dx=
\begin{cases}
2\int_0^af(x)dx,f(-x)=f(x)\\
0,f(-x)=-f(x)\\
\end{cases}
\ \\
\int_{-a+n}^{a+n}f(x-n)dx=\int_{-a}^{a}f(x)dx\\
反常积分必须满足在右半区间收敛的条件
$$

### 二重积分区间原点对称性质

$$
\iint f(x,y)dxdy=
\begin{cases}
2\iint f(x)dxdy, \in D_1,
f(-x,-y)=f(x,y)\\
0, f(-x,-y)=-f(x,y)
\end{cases}
$$

### 二重积分区间关于$y$轴对称性质

$$
\iint f(x,y)dxdy=
\begin{cases}
2\iint f(x,y)dxdy, \in D_1, f(-x,y)=f(x,y)\\
0,f(-x,y)=-f(x,y)
\end{cases}
$$

### 二重积分区间关于$x$轴对称性质

$$
\iint f(x,y)dxy=
\begin{cases}
2\iint f(x,y)dxdy, \in D_1, f(x,-y)=f(x,y)\\
0,f(x,-y)=-f(x,y)
\end{cases}

$$

### 二重积分区间关于$y=x$对称

$$
\iint f(x,y)dxdy=\iint f(y,x)dxdy
$$

### 二阶常系数线性齐次微分方程及特征方程

$$
y''+py'+qy=f(x)\\
\lambda^2+p\lambda+q=0
$$

### 二常线非齐特解-多项式

$$
y''+py'+y=f(x) \\
f(x)=ax^2+bx+c, 特解:y^*=x^k(cx^2+dx+f),
k=\begin{cases}
0, 0不是特征根\\
1, 0是单根\\
2, 0是二重根
\end{cases}\\
\ \\

$$

### 二常线非齐特解-指数函数

$$
f(x)=e^{ax},y^*=Cx^ke^{ax},
k=\begin{cases}
0, a不是特征根\\
1, a是单根\\
2, a是二重根
\end{cases}\\
\ \\
$$

### 二常线非齐特解-多项式和指数函数

$$
f(x)=e^{ax}(bx+c),y^*=x^ke^{ax}(Dx+C),k=\begin{cases}
0, a不是特征根\\
1, a是单根\\
2, a是二重根
\end{cases}\\ \\
\ \\
$$

### 二常线非齐特解-多项式-指数函数-三角函数

$$
f(x)=e^{ax}(H_{n1}(x)\cos bx+L_{n2}(x)\sin bx),\\
 y^*=x^ke^{ax}(M_n(x)\cos {bx}+F_n(x)\sin bx), n=\max(n1,n2)\\
k=\begin{cases}
0, a\pm ib不是特征根\\
1, a\pm ib 是特种根\\
\end{cases}
$$

### 变量可分离微分方程

$$
g(y)dy=f(x)dx \Rightarrow \int g(y)dy = \int f(x)dx
$$

### 齐次微分方程

$$
\frac{dy}{dx}=f(\frac yx)\\

u=\frac yx\\

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

### 不显含$x$的微分方程

$$
y''=f(y,y') \\
y'=p,y''=\frac {dp}{dy} \frac {dy}{dx}=p\frac {dp}{dy}\\
p\frac {dp}{dy}=f(y,p)
$$

### 柯西积分不等式

$$

[\int_a^b f(x)g(x) dx]^2  \le \int_a^b f^2(x)dx \cdot \int_a^b g^2(x)dx

$$
