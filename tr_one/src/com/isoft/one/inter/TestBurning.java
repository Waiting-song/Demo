package com.isoft.one.inter;

public class TestBurning {

     public static void main(String[] args)
     {
    	 //1. �ӿ� ָ�� ʵ����   2. �ӿڲ��ܱ�ʵ����
    	 // 1. final �������ܱ�����   2.final ���� ���ܱ���д override
    	 final String dbUserName="root";
    	 
    	 
    	 ISpringBurning burning = new ShanXiPerson ();
    	 burning.collectMoney();
    	 burning.goToSuperMarket();
    	 burning.goToPark();
    	 burning.parpareWork();
    	 burning.goHome();
     }
}
