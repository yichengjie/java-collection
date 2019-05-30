注意事项：
       由于使用mybatis-plus-generate版本号为2.3.3,导致生成的代码依赖mybatis-plus-suppor,
      但是3.x的mybatis-plus包结构有调整，所以需要手动修改import，执行2/3/4步骤


1.新建Application.java,这里需要注意需要加上@MapperScan("com.yicj.mybatis2.mapper")
    package com.yicj.mybatis2;

	import org.mybatis.spring.annotation.MapperScan;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	
	@SpringBootApplication
	@MapperScan("com.yicj.mybatis2.mapper")
	public class Application {
	
		public static void main(String[] args) {
			SpringApplication.run(Application.class, args) ;
		}
	}
2. 修改XXXMapper.java文件中的import
           原：  import com.baomidou.mybatisplus.mapper.BaseMapper;
   ==>import com.baomidou.mybatisplus.core.mapper.BaseMapper ;
3. 修改XXXService.java文件中的import
         原：    import com.baomidou.mybatisplus.service.IService;
   ==> import com.baomidou.mybatisplus.extension.service.IService;
4. 修改XXXServiceImpl.java文件中的import
         原：    import com.baomidou.mybatisplus.service.impl.ServiceImpl;
   ==> import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;