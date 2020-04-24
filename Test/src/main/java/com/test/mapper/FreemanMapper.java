package com.test.mapper;

import com.test.entity.FreemanEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface FreemanMapper {
	/**
	 * 查看所有入驻自由人
	 * @return 所有入驻自由人
	 */
	List<FreemanEntity> findAllFreeman();

	/**
	 * 查看指定id的自由人
	 * @param userId 自由人的userId
	 * @return 自由人实体
	 */
	FreemanEntity findById(Integer userId);

	/**
	 * 删除指定自由人
	 * @param userId 自由人的userId
	 * @return 是否成功
	 */
	Integer removeById(Integer userId);

	/**
	 * 修改自由人的信息
	 * @param freemanEntity
	 * @return
	 */
	Integer updateInfo(FreemanEntity freemanEntity);

	/**
	 * 添加入驻自由人
	 * @param freemanEntity 自由人实体对象
	 * @return 是否成功
	 */
	Integer addFreeman(FreemanEntity freemanEntity);

	/**
	 *
	 * @param freemanEntity
	 * @return
	 */
	List<FreemanEntity> queryByName(FreemanEntity freemanEntity);

	/**
	 * 修改个人状态
 	 * @param userId
	 * @return
	 */
	Integer updateStatus(Integer userId,Integer userStatus);
}
