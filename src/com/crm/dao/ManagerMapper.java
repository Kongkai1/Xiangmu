package com.crm.dao;

import java.util.List;

import com.crm.pojo.Customer;
import com.crm.pojo.FenYe;

public interface ManagerMapper {
	//��ѯ������
	Integer selectManagerCount(FenYe fenye);
	//��������ҳ��ѯ
	List<Customer> selectManager(FenYe fenye);

}
