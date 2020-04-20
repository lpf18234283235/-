package  com.test.service.impl;

import com.test.entity.CompanyEntity;
import com.test.entity.MainEntity;
import com.test.exception.UpdateException;
import com.test.mapper.CompanyMapper;
import com.test.service.CompanyService;
import com.test.service.MainService;
import com.test.service.impl.CompanyServiceImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;










@Service
public class CompanyServiceImpl
		implements CompanyService
{
	@Autowired
	CompanyMapper companyMapper;
	@Autowired
	MainService mainService;

	public CompanyEntity selectById(Integer userId) { return this.companyMapper.findById(userId); }


	public List<CompanyEntity> selectList() { return this.companyMapper.findAllCompany(); }

	/**
	 * 添加入驻公司
	 * @param companyEntity
	 * @param openId
	 */
	@Transactional
	public void insert(CompanyEntity companyEntity, String openId) {
		Integer userId = this.mainService.findIdByOpenId(openId);
		companyEntity.setUserId(userId);
		this.companyMapper.addCompany(companyEntity);
		MainEntity mainEntity = new MainEntity();
		mainEntity.setUserImage(companyEntity.getUserImage());
		mainEntity.setUserType("1");
		mainEntity.setMainId(userId);
		mainEntity.setInTime(new Date());
		mainEntity.setUserAddress(companyEntity.getAddress());
		mainEntity.setUserStatus("1");
		this.mainService.replaceById(mainEntity);
	}

	public void update(CompanyEntity companyEntity, String openId) {
		Integer userId = mainService.findIdByOpenId(openId);
		companyEntity.setUserId(userId);
		companyMapper.updateCompany(companyEntity);
	}




	public int deleteByIds(Integer[] userIds) { return this.companyMapper.removeByIds(userIds).intValue(); }



	public int deleteById(Integer userId) { return this.companyMapper.removeByid(userId).intValue(); }




	public List<CompanyEntity> selectListByIds(ArrayList[] list) { return null; }
}
