; 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
;(произведение чисел от 1 до n)
extern printf
extern scanf
section .data
    msg     db      "Enter the number: ",0
    fmt     dq      "%d",10,0
    res     dq      "T = %d, Factorial = %d",10,0
section .bss
    resalt  resq    64
section .text
        global main
main:
push   rbp
mov    rbp,rsp
   sub    rsp,0x30

   mov    DWORD[rbp-0x8],0x0
   mov    DWORD[rbp-0xc],0x1
   lea    rax,[msg]        
   mov    rcx,rax
   call   printf
   lea    rax,[rbp-0x10]
   mov    rdx,rax
   lea    rax,[fmt]        
   mov    rcx,rax
   call   scanf
   mov    DWORD [rbp-0x4],0x1
   jmp    jloop
iloop:
   mov    eax,DWORD [rbp-0x4]
   add    DWORD [rbp-0x8],eax
   mov    eax,DWORD [rbp-0xc]
   imul   eax,DWORD [rbp-0x4]
   mov    DWORD [rbp-0xc],eax
   add    DWORD [rbp-0x4],0x1
jloop:
   mov    eax,DWORD [rbp-0x10]
   cmp    DWORD [rbp-0x4],eax
   jle    iloop
   mov    edx,DWORD [rbp-0xc]
   mov    eax,DWORD [rbp-0x8]
   mov    r8d,edx
   mov    edx,eax
   lea    rax,[res]       
   mov    rcx,rax
   call   printf
   mov    eax,0x0
   add    rsp,0x30
leave
ret