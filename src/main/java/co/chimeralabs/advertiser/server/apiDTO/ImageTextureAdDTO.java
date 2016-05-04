package co.chimeralabs.advertiser.server.apiDTO;

import co.chimeralabs.advertiser.server.model.Ad;

public class ImageTextureAdDTO {
	private String advertiserId;
	private String adId;
	private String adResourceIdentifier;
	private String adResourceFormat;
	private String errorMsg = "";
	
	public ImageTextureAdDTO(){

	}

	public String getAdvertiserId() {
		return advertiserId;
	}

	public void setAdvertiserId(String advertiserId) {
		this.advertiserId = advertiserId;
	}

	public String getAdId() {
		return adId;
	}

	public void setAdId(String adId) {
		this.adId = adId;
	}

	public ImageTextureAdDTO(Ad ad){
		this.adResourceIdentifier = ad.getAdResourceIdentifier();
		this.adResourceFormat = ad.getAdResourceFormat();
		this.adId = ad.getAdId().toString();
		this.advertiserId = ad.getAdGroup().getCampaign().getAdvertiser().getAdvertiserId().toString();
	}

	public String getAdResourceIdentifier() {
		return adResourceIdentifier;
	}

	public void setAdResourceIdentifier(String adResourceIdentifier) {
		this.adResourceIdentifier = adResourceIdentifier;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getAdResourceFormat() {
		return adResourceFormat;
	}

	public void setAdResourceFormat(String adResourceFormat) {
		this.adResourceFormat = adResourceFormat;
	}
	
}
