package com.lung.application.test.service;

import com.lung.application.test.entity.Resource;
import com.lung.application.test.mapper.ResourceMapper;
import com.lung.application.test.api.IResourceService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * ��Դ�� 服务实现类
 * </p>
 *
 * @author ChinPangLung
 * @since 2018-10-16
 */
@Service
public class IResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {

}
