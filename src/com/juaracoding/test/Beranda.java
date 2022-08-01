package com.juaracoding.test;

import org.testng.annotations.Test;

public class Beranda {
	@Test(groups= {"harian"})
	public void menu() {
		System.out.println("test menu");
	}
	@Test (groups= {"harian", "mingguan"})
	public void searchBox() {
		System.out.println("test Search box");
	}
	@Test(groups= {"mingguan"})
	public void aboutUs() {
		System.out.println("test about us");
	}

}
