package mytest;

import com.lut.demo.service.IApplyService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

public class ApplyControllerTest {
    @Autowired
    private IApplyService iApplyService;

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void insertapply() {
        iApplyService.insertapply(2,"介绍",new Date(),2);
    }

    @Test
    public void findByuserid() {
        iApplyService.findByuserid(1);
    }

    @Test
    public void findApply() {
        iApplyService.findApply(2);
    }

    @Test
    public void editapplystatus() {
        iApplyService.editapplystatus(2);
    }
}