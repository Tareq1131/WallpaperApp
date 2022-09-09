package com.tareq.android.wallpaperapp.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Src implements Serializable {

	@SerializedName("small")
	private String small;

	@SerializedName("original")
	private String original;

	@SerializedName("large")
	private String large;

	@SerializedName("tiny")
	private String tiny;

	@SerializedName("medium")
	private String medium;

	@SerializedName("large2x")
	private String large2x;

	@SerializedName("portrait")
	private String portrait;

	@SerializedName("landscape")
	private String landscape;

	public void setSmall(String small){
		this.small = small;
	}

	public String getSmall(){
		return small;
	}

	public void setOriginal(String original){
		this.original = original;
	}

	public String getOriginal(){
		return original;
	}

	public void setLarge(String large){
		this.large = large;
	}

	public String getLarge(){
		return large;
	}

	public void setTiny(String tiny){
		this.tiny = tiny;
	}

	public String getTiny(){
		return tiny;
	}

	public void setMedium(String medium){
		this.medium = medium;
	}

	public String getMedium(){
		return medium;
	}

	public void setLarge2x(String large2x){
		this.large2x = large2x;
	}

	public String getLarge2x(){
		return large2x;
	}

	public void setPortrait(String portrait){
		this.portrait = portrait;
	}

	public String getPortrait(){
		return portrait;
	}

	public void setLandscape(String landscape){
		this.landscape = landscape;
	}

	public String getLandscape(){
		return landscape;
	}
}