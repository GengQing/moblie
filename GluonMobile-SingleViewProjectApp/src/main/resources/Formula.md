### 多项式展开公式

$$
\begin{aligned}
a^n-b^n&=(a-b)[a^{n-1}+a^{n-2}b+a^{n-3}b^2+\cdots+b^{n-1}]\\

a^3-b^3&=(a-b)(a^2+ab+b^2)\\

a^3+b^3&=(a+b)(a^2-ab+b^2)\\

(a+b)^n&=\sum_{r=0}^n C_n^r a^{n-r}b^r=C_n^0a^n+C_n^1a^{n-1}b+C_n^2a^{n-2}b^2+\cdots+C_n^nb^n
\end{aligned}
$$

### 三角函数公式

$$
\begin{aligned}

&\sin(\pi + a) = -\sin a\\

&\sin(\pi - a) = \sin a\\

&\cos(\pi + a) = -\cos a\\

&\cos(\pi - a) = -\cos a\\

\end{aligned}
$$

### 三角函数转换口诀

$$
奇变偶不变(\frac{\pi}{2}的奇偶倍数)(n\frac{\pi}{2} \pm a),符号看象限,\\
\sin x \ge 0, x\in[0,\pi],即一二象限为正值,三四象限为负值 \\

\ \\
\cos x \ge 0, x\in[-\frac{\pi}{2},\frac{\pi}{2}], 即一四象限为正值, 二三象限为负值\\

$$

### 特殊三角函数值=

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

### 排列组合公式=

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

<a href="https://wenku.baidu.com/view/bdccfc868762caaedd33d440.html">图形</a>

$$
\begin{aligned}
&函数& &定义域& &值域& &单调性& &必过点&\\
&y=a^x(a \gt 0 \And a \ne 1)& &x \in (-\infty,+\infty)& & y \in (0,+\infty)& &a \gt 1\nearrow , 0 \lt a \lt 1\searrow& &(0,1)&\\
&y=\log_a x(a \gt 0 \And a \ne 1)& &x \in (0,+\infty)& &y \in (-\infty,+\infty)& &a \gt 1\nearrow , 0 \lt a \lt 1\searrow&\\
&y=x^\mu&\\

\end{aligned}

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

### 肯定型幂指函数极限

$$
\lim f(x)存在且为A(A\gt0)\\
\lim g(x)存在且为B\\
那么\lim f(x)^{g(x)}=A^B\\

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

### 一阶导数只包含y,求二阶导数

$$
\frac {dy}{dx} =f(y)\\

\frac {d^2y}{dx^2} =\frac {d}{dx}(\frac {dy}{dx})\\
=\frac {d}{dy}(f(y))\frac {dy}{dx}\\
=f'(y)f(y)
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
\begin{aligned}
&\int_0^{\frac \pi 2} f(\sin x)dx=\int_0^{\frac \pi 2}f(\cos x)dx\\

&\int_0^{\frac \pi 2} \sin^nxdx =
\begin{cases}
\frac {(n-1)!!} {n!!} \cdot \frac \pi2 (n为偶数）\\ \ \\ \ \\
\frac {(n-1)!!} {n!!} (n为奇数)\\
\end{cases} \  \\

&\int_0^{\frac \pi 2}\cos^nxdx =
\begin{cases}
\frac {(n-1)!!} {n!!} \cdot \frac \pi2 (n为偶数）\\
\ \\
\ \\

\frac {(n-1)!!} {n!!} (n为奇数)\\
\end{cases}
\  \\
&\int_0^{\pi} xf(\sin x)dx = \frac{\pi}{2} \int_0^{\pi} f(\sin x)dx
\ \\
\ \\
&\int_0^{\pi} \sin^{n}xdx=2\int_0^{\frac {\pi} 2}\sin^{n}xdx\\
\ \\
&\int_0^{\pi} \cos^{n}xdx=
\begin{cases}
2\int_0^{\frac {\pi} 2}\cos^{n}xdx,(n为偶数)\\
0,(n为偶数)
\end{cases}
\end{aligned}

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
\int_a^{+\infty} \frac 1 {x^p}dx\ (a>0) \Leftrightarrow p>1, \\
\ \\
\int_a^{+\infty} \frac 1{x\ln^p x}dx\ (a>1)\Leftrightarrow p>1 \\
\ \\
\int_a^{+\infty}x^ke^{-\lambda x}dx\ (k>0) \Leftrightarrow \lambda>0 \\
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

V=\pi \int_{y_1}^{y_2} x^2(y)dy, x=x(y)\\
V=2\pi\int_a^b xy(x)dx, y=y(x)\ge 0\\

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
\overline A=\frac 1 {(b-a)}\int_a^bf(x)dx
$$

### 密度均匀薄片上边界曲线$y=f(x)$形心质心公式

$$
可利用对称性计算出坐标为区间中点\\

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
$$

反常积分必须满足在右半区间收敛的条件

### 二重积分区间原点对称性质

$$
\iint f(x,y)dxdy=
\begin{cases}
2\iint f(x,y)dxdy, \in D_1
,
f(-x,-y)=f(x,y)\\
0, f(-x,-y)=-f(x,y)
\end{cases}
$$

### 二重积分区间关于$y$轴对称性质

$$
\iint f(x,y)dxdy=
\begin{cases}
2\iint f(x,y)dxdy, \in D_R, f(-x,y)=f(x,y)\\
0,f(-x,y)=-f(x,y)
\end{cases}
$$

### 二重积分区间关于$x$轴对称性质

$$
\iint f(x,y)dxy=
\begin{cases}
2\iint f(x,y)dxdy, \in D_U, f(x,-y)=f(x,y)\\
0,f(x,-y)=-f(x,y)
\end{cases}

$$

### 二重积分区间关于$y=x$对称

$$
\iint f(x,y)dxdy=\iint f(y,x)dxdy
$$

### 二重积分区间关于$y=x$对称且$f(x,y)=f(y,x)$

$$
\iint_{D_{11}} f(x,y)dxdy=\iint_{D_{12}} f(y,x)dxdy
$$

### 函数多项式商的极限

$$
\lim_{f(x) \rightarrow \infty} \frac {a_0 f(x)^m+a_1 f(x)^{m-1}+\cdots+ a_m}{b_0 f(x)^n+b_1 f(x)^{n-1}+\cdots +b_n}=
\begin{cases}
0,当 n \gt m \\
\frac {a_0} {b_0}, 当n=m\\
\infty, 当 n \lt m
\end{cases}
$$

### 无穷小的运算

有限个无穷小的和差是也是无穷小.

有限个无穷小的乘积是也是无穷小.

常数与无穷小的乘积是无穷小.

有界函数与无穷小的乘积是无穷小.

### 分段函数分段点连续求导数极限定理

$x=x_0$是分段函数的分段点,
若  
$(1)f(x)$在$x_0$处连续,  
$(2)f(x)$在$x_0$的某领域内可导,  
$(3)\lim_{x \rightarrow x_0} f'(x)$存在(左右导数都存在且相等).  
则

$$
f'(x_0)=\lim_{x \rightarrow x_0} f'(x)
$$

