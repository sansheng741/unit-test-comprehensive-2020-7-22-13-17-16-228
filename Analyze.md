###XAXB测试用例

answer: [1,2,3,4]


input:  [1,2,3,4]

Guess  

output: 4A0B  

==================

input:  [5,6,7,8]

Guess  

output: 0A0B  

==================

input:  [1,6,5,9]

Guess  

output: 1A0B

==================

input:  [6,5,7,1]

Guess  

output: 0A1B

==================

input:  [4,3,2,1]

Guess  

output: 0A4B  

==================

input:  [1,2,4,3]

Guess  

output: 2A2B  

==================

###生成答案测试用例


given  
GenerateAnswer类

when  
generate

then  
生成的数字个数为4个

==================

given  
GenerateAnswer类

when  
generate

then  
生成的数字值在0~9之间

==================

given  
GenerateAnswer类

when  
generate

then  
生成的数字个数为4个且值在0~9之间

###输入合法性校验测试用例

given

[1,2,3,4]

when
check

then
true

=============
given
[1,2,3,4,5]

when
check

then
false

=============

given
[-1,2,3,4]

when
check

then
false


###流程控制测试用例
given
从控制台输入4个数字[1,2,3,4]
when  
判断是否合法

then
true

====================

given

when  


then
true

====================






   