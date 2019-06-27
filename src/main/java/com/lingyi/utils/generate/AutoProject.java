package com.lingyi.utils.generate;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class AutoProject {
    @Test
    public void testAutoEnvironmental() {

        GlobalConfig gg=new GlobalConfig();
        gg.setActiveRecord(true)
                .setAuthor("lixiaodong")
                .setOutputDir("D:\\ideaWorkspace\\lingyi2\\src\\main\\java")
                .setFileOverride(true)
                .setIdType(IdType.AUTO)
                .setServiceName("%sService")
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setSwagger2(true);

        DataSourceConfig db=new DataSourceConfig();
        db.setUrl("jdbc:mysql://www.lixiaodong.club:3306/lingyi2");
        db.setDriverName("com.mysql.jdbc.Driver");
        db.setUsername("root");
        db.setPassword("LingYi01@Nb");
        db.setDbType(DbType.MYSQL);

        StrategyConfig sc = new StrategyConfig();
        sc.setCapitalMode(true).setNaming(NamingStrategy.underline_to_camel);

        PackageConfig pc = new PackageConfig();
        pc.setParent("com.lingyi")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("bean")
                .setXml("mapper");

        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(gg).setDataSource(db).setStrategy(sc).setPackageInfo(pc).execute();
    }
}
