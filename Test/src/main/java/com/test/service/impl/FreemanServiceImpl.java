package  com.test.service.impl;

import com.test.entity.FreemanEntity;
import com.test.entity.MainEntity;
import com.test.exception.UpdateException;
import com.test.mapper.FreemanMapper;
import com.test.service.FreemanService;
import com.test.service.MainService;
import com.test.service.impl.FreemanServiceImpl;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;











@Service
public class FreemanServiceImpl
		implements FreemanService
{
	@Autowired
	private FreemanMapper freemanMapper;
	@Autowired
	private MainService mainService;

	public FreemanEntity selectById(Integer userId) { return this.freemanMapper.findById(userId); }



	public List<FreemanEntity> selectList() { return this.freemanMapper.findAllFreeman(); }







	@Transactional
	public void insert(FreemanEntity freemanEntity, String openId) {
		Integer userId = this.mainService.findIdByOpenId(openId);
		freemanEntity.setUserId(userId);
		System.err.println(freemanEntity);
		System.err.println(openId);
		System.err.println(userId);
		this.freemanMapper.addFreeman(freemanEntity);
		MainEntity mainEntity = new MainEntity();
		mainEntity.setInTime(new Date());
		mainEntity.setMainId(userId);
		mainEntity.setUserImage(freemanEntity.getUserImage());
		mainEntity.setUserType("3");
		mainEntity.setUserAddress(freemanEntity.getAddress());
		mainEntity.setUserStatus("1");

		this.mainService.replaceById(mainEntity);
	}

	/**
	 * 修改用户个人信息
	 * @param freemanEntity 用户实体对象
	 */
	public void update(FreemanEntity freemanEntity,String openId) {
		Integer userId=mainService.findIdByOpenId(openId);
		freemanEntity.setUserId(userId);
		freemanMapper.updateInfo(freemanEntity);
	}


	public int deleteByIds(Integer[] userIds) { return 0; }



	public int deleteById(Integer userId) { return this.freemanMapper.removeById(userId).intValue(); }

	@Override
	public void updateStatus(String openId, Integer userStatus) {
		Integer userId=mainService.findIdByOpenId(openId);
		freemanMapper.updateStatus(userId,userStatus);

	}
}
