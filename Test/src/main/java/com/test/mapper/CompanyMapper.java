package com.test.mapper;

import com.test.entity.CompanyEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyMapper {
	/**
	 * 查看所有入驻公司
	 * @return 所有公司
	 */
	List<CompanyEntity> findAllCompany();

	/**
	 * 查看指定公司
	 * @param userId 公司的id
	 * @return 公司详情
	 */
	CompanyEntity findById(Integer userId);

	/**
	 * 删除指定公司
	 * @param userId 公司id
	 * @return 是否成功
	 */
	Integer removeByid(Integer userId);

	/**
	 * 修改公司信息
	 * @param companyEntity 公司实体对象
	 * @return 是否成功
	 */
	Integer updateCompany(CompanyEntity companyEntity);

	/**
	 * 添加入驻公司
	 * @param companyEntity 公司实体对象
	 * @return 是否成功
	 */
	Integer addCompany(CompanyEntity companyEntity);

	/**
	 * 删除多个公司信息
	 * @param userIds 公司的ids
	 * @return 是否成功
	 */
	Integer removeByIds(Integer[] userIds);

	/**
	 * 查看指定公司
	 * @param userIds id数组
	 * @return 公司详情
	 */
	List<CompanyEntity> findCompanyByIds(List<Integer> userIds);
}
