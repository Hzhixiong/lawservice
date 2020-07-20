package mytest;

import com.lut.demo.service.ICaseService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CaseControllerTest {
    @Autowired
    private ICaseService iCaseService;

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void findAll() {
        iCaseService.findAll();
    }

    @Test
    public void findcasebylawyerid() {
        iCaseService.findcasebylawyerid(2);
    }

    @Test
    public void addcase() {
        iCaseService.addcase("标题","介绍","结果","分析",2);
    }

    @Test
    public void deleteByid() {
        iCaseService.deleteByid(2);
    }

    @Test
    public void findBycaseid() {
        iCaseService.findBycaseid(2);
    }
}