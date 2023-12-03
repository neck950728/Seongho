package com.ham.len.purchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ham.len.commons.Pager;
import com.ham.len.factoryStorage.FactoryStorageVO;
import com.ham.len.materialProduct.MaterialProductVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PurchaseService {

	@Autowired
	private PurchaseDAO purchaseDAO;
	
	public List<PurchaseVO> getList(Pager pager)throws Exception{
		List<PurchaseVO> test =  purchaseDAO.getList(pager);
		for(PurchaseVO purchaseVO : test) {
			// log.info("{}", purchaseVO.getCodeName());
		}
		return purchaseDAO.getList(pager);
	}
	
	public List<FactoryStorageVO> getList2()throws Exception{
		return purchaseDAO.getList2();
	}

	public List<MaterialProductVO> getList3()throws Exception{
		return purchaseDAO.getList3();
	}
	
	
	public int setAdd(PurchaseVO purchaseVO)throws Exception{
		int result= purchaseDAO.setAdd(purchaseVO);
		return result;
	}
	
	public PurchaseVO getDetail(PurchaseVO purchaseVO)throws Exception{
		
		return purchaseDAO.getDetail(purchaseVO);
	}
	
	public int setUpdate(PurchaseVO purchaseVO)throws Exception{
		
		return purchaseDAO.setUpdate(purchaseVO);
	}
	
	public int setDelete(PurchaseVO  purchaseVO)throws Exception{
		return purchaseDAO.setDelete(purchaseVO);
	}
	
}
