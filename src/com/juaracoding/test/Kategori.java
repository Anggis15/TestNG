package com.juaracoding.test;

import org.testng.annotations.Test;

public class Kategori {
	@Test(groups= {"harian", "mingguan"})
	public void elektronik() {
		System.out.println("test elektronik");
	}
	@Test(groups= {"harian"})
	public void letestProduct() {
		System.out.println("test produk terbaru");
	}

}
