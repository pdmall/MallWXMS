package com.utils;

import java.util.Comparator;

import com.yang.model.Store;

/**
 * 比较器
 * @author a55660000
 *
 */
public class MyComprator implements Comparator<Store>{


	@Override
	public int compare(Store o1, Store o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getsDistance()-o2.getsDistance());
	}

}
