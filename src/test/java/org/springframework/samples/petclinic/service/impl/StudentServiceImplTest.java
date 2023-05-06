package org.springframework.samples.petclinic.service.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.samples.petclinic.dao.mapper.CET4Mapper;
import org.springframework.samples.petclinic.service.IStudy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {StudentServiceImpl.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentServiceImplTest {
    @MockBean
    private CET4Mapper cET4Mapper;

    @MockBean
    private IStudy iStudy;

    @Autowired
    private StudentServiceImpl studentServiceImpl;

    /**
     * Method under test: {@link StudentServiceImpl#isGraduated(Integer, Integer)}
     */
    @Test
    public void testIsGraduated() {
        when(iStudy.isFinishedStudy(Mockito.<Integer>any())).thenReturn(true);
        assertFalse(studentServiceImpl.isGraduated(3, 1));
        verify(iStudy).isFinishedStudy(Mockito.<Integer>any());
    }

    /**
     * Method under test: {@link StudentServiceImpl#isGraduated(Integer, Integer)}
     */
    @Test
    public void testIsGraduated2() {
        when(iStudy.isFinishedStudy(Mockito.<Integer>any())).thenReturn(false);
        assertFalse(studentServiceImpl.isGraduated(3, 1));
        verify(iStudy).isFinishedStudy(Mockito.<Integer>any());
    }

    /**
     * Method under test: {@link StudentServiceImpl#isGraduated(Integer, Integer)}
     */
    @Test
    public void testIsGraduated3() {
        when(iStudy.isFinishedStudy(Mockito.<Integer>any())).thenReturn(true);
        assertFalse(studentServiceImpl.isGraduated(null, 1));
    }

    /**
     * Method under test: {@link StudentServiceImpl#isGraduated(Integer, Integer)}
     */
    @Test
    public void testIsGraduated4() {
        when(cET4Mapper.getCertificate(anyInt())).thenReturn(true);
        when(iStudy.isFinishedStudy(Mockito.<Integer>any())).thenReturn(true);
        assertTrue(studentServiceImpl.isGraduated(3, 4));
        verify(cET4Mapper).getCertificate(anyInt());
        verify(iStudy).isFinishedStudy(Mockito.<Integer>any());
    }

    /**
     * Method under test: {@link StudentServiceImpl#isGraduated(Integer, Integer)}
     */
    @Test
    public void testIsGraduated5() {
        when(cET4Mapper.getCertificate(anyInt())).thenReturn(false);
        when(iStudy.isFinishedStudy(Mockito.<Integer>any())).thenReturn(true);
        assertFalse(studentServiceImpl.isGraduated(3, 4));
        verify(cET4Mapper).getCertificate(anyInt());
        verify(iStudy).isFinishedStudy(Mockito.<Integer>any());
    }

    /**
     * Method under test: {@link StudentServiceImpl#isGraduated(Integer, Integer)}
     */
    @Test
    public void testIsGraduated6() {
        when(cET4Mapper.getCertificate(anyInt())).thenReturn(true);
        when(iStudy.isFinishedStudy(Mockito.<Integer>any())).thenReturn(true);
        assertFalse(studentServiceImpl.isGraduated(3, null));
    }
}

