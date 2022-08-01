package com.juaracoding.testcase;

public class Weapon {
	int ammo;
	Weapon(){
		this.ammo = 30;
	}
	public int shoot() {
		if(this.ammo > 0) {
			this.ammo -= 1;
		}
			
		return this.ammo;
	}
	public int reload() {
		this.ammo = 30;
		return this.ammo;
	}
	public void checkAmmo() {
		System.out.println(this.ammo);
		
	}

}
