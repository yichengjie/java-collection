package ${bussiPackage}.${entityPackage}.service.impl;

import ${entityPackage}.entity.${entityName};
import ${entityPackage}.mapper.${entityName}Mapper;
import ${entityPackage}.service.I${entityName}Service;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: ${tableVo.ftlDescription}
 * @author： jeecg-boot
 * @date：   ${.now?string["yyyy-MM-dd"]}
 * @version： V1.0
 */
@Service
public class ${entityName}ServiceImpl extends ServiceImpl<${entityName}Mapper, ${entityName}> implements I${entityName}Service {

}
