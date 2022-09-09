package com.tareq.android.wallpaperapp.models;


import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CuratedApiResponse implements Serializable {

	@SerializedName("next_page")
	private String nextPage;

	@SerializedName("per_page")
	private int perPage;

	@SerializedName("page")
	private int page;

	@SerializedName("photos")
	private List<Photo> photos;

	public void setNextPage(String nextPage){
		this.nextPage = nextPage;
	}

	public String getNextPage(){
		return nextPage;
	}

	public void setPerPage(int perPage){
		this.perPage = perPage;
	}

	public int getPerPage(){
		return perPage;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setPhotos(List<Photo> photos){
		this.photos = photos;
	}

	public List<Photo> getPhotos(){
		return photos;
	}
}