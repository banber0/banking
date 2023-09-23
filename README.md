﻿# banking
# 实验一
#构造函数：
public Account(double bal)：在创建对象bal时用初始余额 ( )初始化帐户。Account
public Customer(String f, String l) 提供的名字 ( f) 和姓氏 ( l) 初始化对象


#方法
public static void main(String[] args)：这是程序的入口点，执行开始的地方。
public double getBalance()：该方法返回账户当前余额。
public boolean deposit(double amount)：此方法允许您将指定amount的资金存入帐户。它会根据存款金额增加余额并返回true以指示存款成功。
public boolean withdraw(double amount)amount：此方法允许您从帐户中提取指定的金额。在允许提款之前，它会检查帐户是否有足够的余额。如果有足够的资金，则会amount从余额中扣除并返回true。否则返回false提示资金不足，提币不成功。
public String getFirstName()：此方法返回客户的名字。
public String getLastName()：此方法返回客户的姓氏。
public Account getAccount()：此方法返回客户的关联银行帐户。
public void setAccount(Account acct)：此方法允许您为客户设置关联的银行账户。您可以使用此方法将特定帐户链接到客户对象。
#创建客户并且连链接账户


customer = new Customer("Liu", "zexu")：这里Customer创建了一个名为“Liu”和姓氏“zexu”的新对象。
customer.setAccount(new Account(500.00))：Account创建一个初始余额为 500.00 的对象，然后使用该setAccount方法与客户关联。
#打印


System.out.println("Withdraw 150.00:" + account.withdraw(150.00))
System.out.println("Withdraw 22.50:" + account.deposit(22.50))
System.out.println("Withdraw 47.62:" + account.withdraw(47.62))
System.out.println("Withdraw 400.00:" + account.withdraw(400.00))
System.out.println("Customer[" + customer.getLastName() + "，" + customer.getFirstName() + "] has a balance of " + account.getBalance())
