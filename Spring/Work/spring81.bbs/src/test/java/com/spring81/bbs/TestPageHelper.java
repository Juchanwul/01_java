package com.spring81.bbs;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.spring81.bbs.common.PagingHelper;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestPageHelper {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void test01_paging() {

        // 총 레코드 : 1000
        // 현재 페이지 : 1
        // 페이지당 레코드 수(rowPerBlock) : 10
        // 블록당 출력할 페이지 수(page per block) : 10

        int totalRecord = 1000;
        int curPage = 1;

        PagingHelper paging = new PagingHelper(totalRecord, curPage);

        // ListNo
        assertEquals(paging.getListNo(), 1000);

        // totalPage
        assertEquals(paging.getTotalPage(), 100);

        // firstPage
        assertEquals(paging.getFirstPage(), 1);

        // prevLink
        assertEquals(paging.getPrevLink(), 0);

        // totalfirstPage
        assertEquals(paging.getTotalFirstPage(), 1);

        // lastPage
        assertEquals(paging.getLastPage(), 10);

        // nextPage
        assertEquals(paging.getNextLink(), 11);

        // totallastPage
        assertEquals(paging.getTotalLastPage(), 100);

        // endRecord
        assertEquals(paging.getEndRecord(), 10);

        // startRecord
        assertEquals(paging.getStartRecord(), 1);

        // pageLinks
        assertArrayEquals(paging.getPageLinks(), new int[] {1,2,3,4,5,6,7,8,9,10});
    }
    @Test
    public void test02_paging() {
        
        // 총 레코드 : 1000
        // 현재 페이지 : 26
        // 페이지당 레코드 수(rowsPerBlock) : 20
        // 블록당 출력할 페이지 수(page per block) : 15
        
        int totalRecord = 1000;
        int curPage = 26;
        PagingHelper paging = new PagingHelper(totalRecord, curPage);

        // ListNo
        assertEquals(paging.getListNo(), 750); // 1000 - 20*(26-1) +1

        // totalPage
        assertEquals(paging.getTotalPage(), 100);

        // firstPage
        assertEquals(paging.getFirstPage(), 21);

        // prevLink
        assertEquals(paging.getPrevLink(), 20);

        // totalfirstPage
        assertEquals(paging.getTotalFirstPage(), 1);

        // lastPage
        assertEquals(paging.getLastPage(), 30);

        // nextPage
        assertEquals(paging.getNextLink(), 31);

        // totallastPage
        assertEquals(paging.getTotalLastPage(), 100);

        // startRecord
        assertEquals(paging.getStartRecord(), 251);

        // endRecord
        assertEquals(paging.getEndRecord(), 260);

        // pageLinks
        assertArrayEquals(paging.getPageLinks(), new int[] {21,22,23,24,25,26,27,28,29,30});
        
    }
}
