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
