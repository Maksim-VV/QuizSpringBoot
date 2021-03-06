package com.vasiliska.students.QuizSpringBoot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DataReaderImpTest {

    @Autowired
    DataReaderImp dataReaderImp;

    @Test
    public void dataTest() {
        assertEquals(dataReaderImp.readData().size(), 6);
    }
}