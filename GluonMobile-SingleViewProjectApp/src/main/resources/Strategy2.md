### 抽象矩阵已知几个矩阵的行列式求另一个矩阵的行列式

通常这几个矩阵都有一定的加减逆矩的关系,  
解题依据原理是$|AB|=|A||B|,|A^{-1}|= \frac 1 {|A|}$.

若包含$E$,可尝试拆$E=A^{-1}A$.

设$C$是被求矩阵,  
1 尝试将$C$写成已知行列式的矩阵的乘积,  
2 $C$左乘右乘已知行列式的矩阵后,可先求积行列式,再求$|C|$,  
3 使用分配律,特殊情况交换律,有限穷尽尝试方法1和2

### 定积分极坐标转直角坐标

第一步 写出变量关系

$$
r^2=x^2+y^2\\
\tan \theta=\frac y x \\
r \cos \theta=x\\
r \sin \theta=y\\
rdrd\theta=dxdy
$$

第二步 转换被积函数为以下形式

$$
\iint f(r,\theta)drd\theta=\iint F(r\cos \theta, r\sin \theta, \tan \theta, r)rdrd\theta
$$

第三步 把变量关系带入上式,转换成直角系

$$
\iint F(x, y,\frac y x,\sqrt{x^2+y^2})dxdy
$$

第四步 依据变量关系将积分区间的$4$边界函数转换成直角坐标函数

$\theta$积分区间等式转换,如  

$$
\begin{aligned}
&0 \le \theta \le \frac {\pi} 4\\
\Rightarrow &\theta=0,\theta=\frac {\pi} 4\\
\Rightarrow &\tan \theta=0, \tan\theta= 1\\
\Rightarrow &\frac y x=0, \frac y x= 1\\
\Rightarrow &y=0,  y = x\\
\end{aligned}
$$

$r$积分区间转换,如

$$
\begin{aligned}
&0 \le r \le \frac 1 {\cos \theta}\\
\Rightarrow &r=0, r = \frac 1 {\cos \theta}\\
\Rightarrow &r=0, r\cos  \theta= 1\\
\Rightarrow &r=0, r\cos  \theta= 1\\
\Rightarrow &\sqrt{x^2+y^2}=0, x= 1\\
\Rightarrow &(x=0\&y=0), x= 1\\
\end{aligned}
$$

直角坐标积分区间上下限为

$$
x=0,x=1\\
y=0,y=x\\
$$

### 已知实对称矩阵一个特征向量求其正交矩阵

实对称矩阵的特征向量单位正交化后仍是特征向量.

以三阶对称矩阵为例,  
若$\alpha_1=(a_{11},a_{12},a_{13})^T$为对称矩阵的特征向量,  
设第二个特征向量是$(x_1,x_2,x_3)$,  
正交$\alpha_1$,则有方程:

$$
a_{11}x_1+a_{12}x_2+a_{13}x_3=0
$$

解得一个解$\alpha_2=(a_{21},a_{22},a_{23})^T$,

设第三个特征向量$(y_1,y_2,y_3)$, 正交$\alpha_1,\alpha_2$得方程组:

$$
a_{11}y_1+a_{12}y_2+a_{13}y_3=0\\
a_{11}y_1+a_{12}y_2+a_{13}y_3=0
$$

解得一个解$\alpha_3$,  
最后将$\alpha_1,\alpha_2,\alpha_3$单位化,组成正交矩阵.

### 根据特征值特征向量求参数

设$A$是三阶矩阵,根据

$A\alpha=\lambda \alpha$

每个分量相等,可得三个方程,可求解三个未知量,  
未知量可以在$A$中,$\alpha$中及是$\lambda$

### 微分方程构造辅助函数法

证明的形式$G(\xi,f(\xi),f'(\xi))=0$.

(1) 用$x$替换$\xi$,要证明的结论变为微分方程  

$$G(x,f(x),f'(x))=0$$

(2) 求解一阶微分方程得到的通解必含一个常数$C$.  

(3) 将解变形为$g(x,f(x))=C$,则  

$$
F(x)=g(x,f(x))
$$
即为构造得辅助函数.

### 可导与不可导乘积定理

若$g(x)在x=a$处可导,$\phi(x)在x=a$连续但不可导,则  
当$g(a)\ne 0$,$g(x)\phi(x)$在$x=a$处不可导;  
当$g(a)=0$,$g(x)\phi(x)$在$x=a$处可导,且$(g(x)\phi(x))'=g'(a)\phi(a)$.

### 导函数的零点存在性

设一下所提到的导数存在,则有结论(罗尔定理可证):  
如果$f(x)有k(k\ge 2)$个零点,则$f'(x)至少有(k-1)个零点,f''(x)至少有(k-2)个零点\cdots f^{(n)}至少有(k-n)个零点$

### 至多零点定理

设一下所提到的导数存在(罗尔定理反证法):  
如果$f'(x)$没有零点,则$f(x)$至多有1个零点  
如果$f'(x)$至多有1个零点,则$f(x)$至多有2个零点  
$cdots$
如果$f'(x)$至多有k个零点,则$f(x)$至多有$k+1$个零点.

### 导函数存在连续定理

设$F(x)在x=a$处连续,在$a$空心零领域可导且

$$
\lim_{x \rightarrow a}F'(x)=A
$$

则$F'(a)=A$,即$F'(a)存在且F'(x)在x=a$连续.

### 分段函数导数

设分段函数  
$f(x)=g(x),当x\ne x_0,$  
$f(x)=A, 当x=x_0$,  
且$f(x)在x=x_0$处连续,$f'(x)=g'(x)$,则  
若$\lim_{x \rightarrow a}f'(x)=A \Rightarrow f'(a)=A,f'(a)存在且f'(x)在x=a$连续.  
若$\lim_{x \rightarrow a}f'(x) 不存在,则f'(x)在x=a$不连续(不论$f'(x_0)$是否存在).  

### 连续与绝对值连续

$f(x)连续\Rightarrow |f(x)|连续$,反过来不一定成立.

### 特殊奇函数

$\ln(x+\sqrt{1+x^2})$是奇函数.

### 拐点非极值点定理

设函数可导,则函数的拐点比不是极值点.  

若函数在某点不可导,则该点有可能即是极值点又是拐点.

### 凸函数定理

在闭区间上连续,开区间上可导,闭区间上是凸函数或$f''(x)\le 0且任意子区间不全0$,  
若$f(a)=f(b)=0$,则$f(x)\gt 0 x \in(a,b)$开区间.

### 物理公式

做功=力$\times$距离:$W=Fs$,  
重力做功$W=mgh$.  

液体压强:$P=\rho g h$,  
压力=压强$\times$面积,  
液体压力$F=PS=\rho g hS$

### 求抽取容器液体做功

即求克服重力做功

设高度方向为$y$轴,水平方向为$x$轴.

$$
\begin{aligned}
面积S&=\pi x^2\\
体积\mathrm dV&=S\mathrm dy=\pi x^2 \mathrm dy\\
质量\mathrm dm&=\rho \mathrm dV=\rho \pi x^2\mathrm dy\\
重力\mathrm dG&=g\mathrm dm=g\rho \pi x^2\mathrm dy\\
做功\mathrm dW&=h\mathrm dG=\rho gh(y) \pi x^2\mathrm dy\\
W_{1/2}&=\int_{y_1}^{y_2} \rho gh(y) \pi x^2\mathrm dy\\
W &= 2W_{1/2}
\end{aligned}
$$

$h(y)是做功高度,是跟y相关$的函数$h(y)=y+C$

容器切面曲线$x是关于y$的函数,可以是一条曲线,也可以是两条曲线组成,  
当时两条曲线时组成时,$x$则是分段函数.

[注] 容器切面关于$y$轴对称时,按一侧计算出值后,总功 $=一半\times 2$  
[注] 根据对称性找质心,则$功=总质量\times质心移动高度$

### 液体侧压力

[注] 微面积是垂直微面积$x \mathrm dy$, 关于$y$轴对称建模

$$
\begin{aligned}
dF&=\rho gh(y) \mathrm dS\\
dF&=\rho gh(y) x\mathrm dy\\
F_{1/2}&=\int_{y_1}^{y_2} \rho gh(y) x\mathrm dy\\
F &= 2_{1/2}
\end{aligned}
$$