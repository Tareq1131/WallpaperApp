package com.tareq.android.wallpaperapp.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Photo implements Serializable {

	@SerializedName("src")
	private Src src;

	@SerializedName("width")
	private int width;

	@SerializedName("avg_color")
	private String avgColor;

	@SerializedName("alt")
	private String alt;

	@SerializedName("photographer")
	private String photographer;

	@SerializedName("photographer_url")
	private String photographerUrl;

	@SerializedName("id")
	private int id;

	@SerializedName("url")
	private String url;

	@SerializedName("photographer_id")
	private int photographerId;

	@SerializedName("liked")
	private boolean liked;

	@SerializedName("height")
	private int height;

	public void setSrc(Src src){
		this.src = src;
	}

	public Src getSrc(){
		return src;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setAvgColor(String avgColor){
		this.avgColor = avgColor;
	}

	public String getAvgColor(){
		return avgColor;
	}

	public void setAlt(String alt){
		this.alt = alt;
	}

	public String getAlt(){
		return alt;
	}

	public void setPhotographer(String photographer){
		this.photographer = photographer;
	}

	public String getPhotographer(){
		return photographer;
	}

	public void setPhotographerUrl(String photographerUrl){
		this.photographerUrl = photographerUrl;
	}

	public String getPhotographerUrl(){
		return photographerUrl;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setPhotographerId(int photographerId){
		this.photographerId = photographerId;
	}

	public int getPhotographerId(){
		return photographerId;
	}

	public void setLiked(boolean liked){
		this.liked = liked;
	}

	public boolean isLiked(){
		return liked;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}
}