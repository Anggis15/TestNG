package com.juaracoding.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test {
	int shoot1;
	int shoot2;
	Weapon weapon;
	@BeforeSuite
	public void setUp() {
		this.shoot1 = 10;
		this.shoot2 = 35;
		weapon = new Weapon();
	}
	@Test
	public void testNembak1() {
		for(int i = 1; i < this.shoot1;i++) {
		weapon.shoot();
		}
		assertEquals(weapon.shoot(),20);
	}
	@Test
	public void testNembak2() {
		for(int i =0;i < this.shoot2; i++) {
		weapon.shoot();
		}
		assertEquals(weapon.shoot(),0);
	}

}
