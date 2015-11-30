package co.chimeralabs.advertiser.server.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="ad_group")
public class AdGroup implements Serializable{
	private static final long serialVersionUID = -5498033954327208834L;
	
	@Id
	@GeneratedValue
	private Long adGroupId;
	
	private String name;
	
	@Column(name="bid")
	private Double bid;

	/** Todo
	 * Targeting relations is going to be many to many
	 */
	
	@ManyToOne
	@JoinColumn(name="campaign_id")
	private Campaign campaign;
	
	@OneToMany(mappedBy="adGroup", fetch=FetchType.LAZY, cascade={CascadeType.ALL})
	@Fetch(value=FetchMode.SUBSELECT)
	private List<Ad> advertisements;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAdGroupId() {
		return adGroupId;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public List<Ad> getAdvertisements() {
		return advertisements;
	}

	public void setAdvertisements(List<Ad> advertisements) {
		this.advertisements = advertisements;
	}

	public Double getBid() {
		return bid;
	}

	public void setBid(Double bid) {
		this.bid = bid;
	}

	public void setAdGroupId(Long adGroupId) {
		this.adGroupId = adGroupId;
	}
	
}