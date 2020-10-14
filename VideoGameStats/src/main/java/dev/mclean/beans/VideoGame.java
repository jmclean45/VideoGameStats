package dev.mclean.beans;

public class VideoGame {

	private int id;
	private String title;
	private boolean handheld;
	private int maxplayers;
	private boolean multiplatform;
	private boolean online;
	private String genres;
	private boolean licensed;
	private String publishers;
	private boolean sequel;
	private int reviewScore;
	private float sales;
	private float usedPrice;
	private String releaseConsole;
	private String releaseRating;
	private String releaseReRelease;
	private int releaseYear;
	private float lengthAllPlayStylesAverage;
	private float lengthAllPlayStylesLeisure;
	private float lengthAllPlayStylesMedian;
	private int lengthAllPlayStylesPolled;
	private float lengthAllPlayStylesRushed;
	private float lengthCompletionistsAverage;
	private float lengthCompletionistsLeisure;
	private float lengthCompletionistsMedian;
	private int lengthCompletionistsPolled;
	private float lengthCompletionistsRushed;
	private float lengthMainExtrasAverage;
	private float lengthMainExtrasLeisure;
	private float lengthMainExtrasMedian;
	private int lengthMainExtrasPolled;
	private float lengthMainExtrasRushed;
	private float lengthMainStoryAverage;
	private float lengthMainStoryLeisure;
	private float lengthMainStoryMedian;
	private int lengthMainStoryPolled;
	private float lengthMainStoryRushed;
	
	public VideoGame(int id, String title, boolean handheld, int maxplayers, boolean multiplatform, boolean online,
			String genres, boolean licensed, String publishers, boolean sequel, int reviewScore, float sales,
			float usedPrice, String releaseConsole, String releaseRating, String releaseReRelease, int releaseYear,
			float lengthAllPlayStylesAverage, float lengthAllPlayStylesLeisure, float lengthAllPlayStylesMedian,
			int lengthAllPlayStylesPolled, float lengthAllPlayStylesRushed, float lengthCompletionistsAverage,
			float lengthCompletionistsLeisure, float lengthCompletionistsMedian, int lengthCompletionistsPolled,
			float lengthCompletionistsRushed, float lengthMainExtrasAverage, float lengthMainExtrasLeisure,
			float lengthMainExtrasMedian, int lengthMainExtrasPolled, float lengthMainExtrasRushed,
			float lengthMainStoryAverage, float lengthMainStoryLeisure, float lengthMainStoryMedian,
			int lengthMainStoryPolled, float lengthMainStoryRushed) {
		super();
		this.id = id;
		this.title = title;
		this.handheld = handheld;
		this.maxplayers = maxplayers;
		this.multiplatform = multiplatform;
		this.online = online;
		this.genres = genres;
		this.licensed = licensed;
		this.publishers = publishers;
		this.sequel = sequel;
		this.reviewScore = reviewScore;
		this.sales = sales;
		this.usedPrice = usedPrice;
		this.releaseConsole = releaseConsole;
		this.releaseRating = releaseRating;
		this.releaseReRelease = releaseReRelease;
		this.releaseYear = releaseYear;
		this.lengthAllPlayStylesAverage = lengthAllPlayStylesAverage;
		this.lengthAllPlayStylesLeisure = lengthAllPlayStylesLeisure;
		this.lengthAllPlayStylesMedian = lengthAllPlayStylesMedian;
		this.lengthAllPlayStylesPolled = lengthAllPlayStylesPolled;
		this.lengthAllPlayStylesRushed = lengthAllPlayStylesRushed;
		this.lengthCompletionistsAverage = lengthCompletionistsAverage;
		this.lengthCompletionistsLeisure = lengthCompletionistsLeisure;
		this.lengthCompletionistsMedian = lengthCompletionistsMedian;
		this.lengthCompletionistsPolled = lengthCompletionistsPolled;
		this.lengthCompletionistsRushed = lengthCompletionistsRushed;
		this.lengthMainExtrasAverage = lengthMainExtrasAverage;
		this.lengthMainExtrasLeisure = lengthMainExtrasLeisure;
		this.lengthMainExtrasMedian = lengthMainExtrasMedian;
		this.lengthMainExtrasPolled = lengthMainExtrasPolled;
		this.lengthMainExtrasRushed = lengthMainExtrasRushed;
		this.lengthMainStoryAverage = lengthMainStoryAverage;
		this.lengthMainStoryLeisure = lengthMainStoryLeisure;
		this.lengthMainStoryMedian = lengthMainStoryMedian;
		this.lengthMainStoryPolled = lengthMainStoryPolled;
		this.lengthMainStoryRushed = lengthMainStoryRushed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isHandheld() {
		return handheld;
	}

	public void setHandheld(boolean handheld) {
		this.handheld = handheld;
	}

	public int getMaxplayers() {
		return maxplayers;
	}

	public void setMaxplayers(int maxplayers) {
		this.maxplayers = maxplayers;
	}

	public boolean isMultiplatform() {
		return multiplatform;
	}

	public void setMultiplatform(boolean multiplatform) {
		this.multiplatform = multiplatform;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public boolean isLicensed() {
		return licensed;
	}

	public void setLicensed(boolean licensed) {
		this.licensed = licensed;
	}

	public String getPublishers() {
		return publishers;
	}

	public void setPublishers(String publishers) {
		this.publishers = publishers;
	}

	public boolean isSequel() {
		return sequel;
	}

	public void setSequel(boolean sequel) {
		this.sequel = sequel;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public float getSales() {
		return sales;
	}

	public void setSales(float sales) {
		this.sales = sales;
	}

	public float getUsedPrice() {
		return usedPrice;
	}

	public void setUsedPrice(float usedPrice) {
		this.usedPrice = usedPrice;
	}

	public String getReleaseConsole() {
		return releaseConsole;
	}

	public void setReleaseConsole(String releaseConsole) {
		this.releaseConsole = releaseConsole;
	}

	public String getReleaseRating() {
		return releaseRating;
	}

	public void setReleaseRating(String releaseRating) {
		this.releaseRating = releaseRating;
	}

	public String getReleaseReRelease() {
		return releaseReRelease;
	}

	public void setReleaseReRelease(String releaseReRelease) {
		this.releaseReRelease = releaseReRelease;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public float getLengthAllPlayStylesAverage() {
		return lengthAllPlayStylesAverage;
	}

	public void setLengthAllPlayStylesAverage(float lengthAllPlayStylesAverage) {
		this.lengthAllPlayStylesAverage = lengthAllPlayStylesAverage;
	}

	public float getLengthAllPlayStylesLeisure() {
		return lengthAllPlayStylesLeisure;
	}

	public void setLengthAllPlayStylesLeisure(float lengthAllPlayStylesLeisure) {
		this.lengthAllPlayStylesLeisure = lengthAllPlayStylesLeisure;
	}

	public float getLengthAllPlayStylesMedian() {
		return lengthAllPlayStylesMedian;
	}

	public void setLengthAllPlayStylesMedian(float lengthAllPlayStylesMedian) {
		this.lengthAllPlayStylesMedian = lengthAllPlayStylesMedian;
	}

	public int getLengthAllPlayStylesPolled() {
		return lengthAllPlayStylesPolled;
	}

	public void setLengthAllPlayStylesPolled(int lengthAllPlayStylesPolled) {
		this.lengthAllPlayStylesPolled = lengthAllPlayStylesPolled;
	}

	public float getLengthAllPlayStylesRushed() {
		return lengthAllPlayStylesRushed;
	}

	public void setLengthAllPlayStylesRushed(float lengthAllPlayStylesRushed) {
		this.lengthAllPlayStylesRushed = lengthAllPlayStylesRushed;
	}

	public float getLengthCompletionistsAverage() {
		return lengthCompletionistsAverage;
	}

	public void setLengthCompletionistsAverage(float lengthCompletionistsAverage) {
		this.lengthCompletionistsAverage = lengthCompletionistsAverage;
	}

	public float getLengthCompletionistsLeisure() {
		return lengthCompletionistsLeisure;
	}

	public void setLengthCompletionistsLeisure(float lengthCompletionistsLeisure) {
		this.lengthCompletionistsLeisure = lengthCompletionistsLeisure;
	}

	public float getLengthCompletionistsMedian() {
		return lengthCompletionistsMedian;
	}

	public void setLengthCompletionistsMedian(float lengthCompletionistsMedian) {
		this.lengthCompletionistsMedian = lengthCompletionistsMedian;
	}

	public int getLengthCompletionistsPolled() {
		return lengthCompletionistsPolled;
	}

	public void setLengthCompletionistsPolled(int lengthCompletionistsPolled) {
		this.lengthCompletionistsPolled = lengthCompletionistsPolled;
	}

	public float getLengthCompletionistsRushed() {
		return lengthCompletionistsRushed;
	}

	public void setLengthCompletionistsRushed(float lengthCompletionistsRushed) {
		this.lengthCompletionistsRushed = lengthCompletionistsRushed;
	}

	public float getLengthMainExtrasAverage() {
		return lengthMainExtrasAverage;
	}

	public void setLengthMainExtrasAverage(float lengthMainExtrasAverage) {
		this.lengthMainExtrasAverage = lengthMainExtrasAverage;
	}

	public float getLengthMainExtrasLeisure() {
		return lengthMainExtrasLeisure;
	}

	public void setLengthMainExtrasLeisure(float lengthMainExtrasLeisure) {
		this.lengthMainExtrasLeisure = lengthMainExtrasLeisure;
	}

	public float getLengthMainExtrasMedian() {
		return lengthMainExtrasMedian;
	}

	public void setLengthMainExtrasMedian(float lengthMainExtrasMedian) {
		this.lengthMainExtrasMedian = lengthMainExtrasMedian;
	}

	public int getLengthMainExtrasPolled() {
		return lengthMainExtrasPolled;
	}

	public void setLengthMainExtrasPolled(int lengthMainExtrasPolled) {
		this.lengthMainExtrasPolled = lengthMainExtrasPolled;
	}

	public float getLengthMainExtrasRushed() {
		return lengthMainExtrasRushed;
	}

	public void setLengthMainExtrasRushed(float lengthMainExtrasRushed) {
		this.lengthMainExtrasRushed = lengthMainExtrasRushed;
	}

	public float getLengthMainStoryAverage() {
		return lengthMainStoryAverage;
	}

	public void setLengthMainStoryAverage(float lengthMainStoryAverage) {
		this.lengthMainStoryAverage = lengthMainStoryAverage;
	}

	public float getLengthMainStoryLeisure() {
		return lengthMainStoryLeisure;
	}

	public void setLengthMainStoryLeisure(float lengthMainStoryLeisure) {
		this.lengthMainStoryLeisure = lengthMainStoryLeisure;
	}

	public float getLengthMainStoryMedian() {
		return lengthMainStoryMedian;
	}

	public void setLengthMainStoryMedian(float lengthMainStoryMedian) {
		this.lengthMainStoryMedian = lengthMainStoryMedian;
	}

	public int getLengthMainStoryPolled() {
		return lengthMainStoryPolled;
	}

	public void setLengthMainStoryPolled(int lengthMainStoryPolled) {
		this.lengthMainStoryPolled = lengthMainStoryPolled;
	}

	public float getLengthMainStoryRushed() {
		return lengthMainStoryRushed;
	}

	public void setLengthMainStoryRushed(float lengthMainStoryRushed) {
		this.lengthMainStoryRushed = lengthMainStoryRushed;
	}

	@Override
	public String toString() {
		return "VideoGame [id=" + id + ", title=" + title + ", handheld=" + handheld + ", maxplayers=" + maxplayers
				+ ", multiplatform=" + multiplatform + ", online=" + online + ", genres=" + genres + ", licensed="
				+ licensed + ", publishers=" + publishers + ", sequel=" + sequel + ", reviewScore=" + reviewScore
				+ ", sales=" + sales + ", usedPrice=" + usedPrice + ", releaseConsole=" + releaseConsole
				+ ", releaseRating=" + releaseRating + ", releaseReRelease=" + releaseReRelease + ", releaseYear="
				+ releaseYear + ", lengthAllPlayStylesAverage=" + lengthAllPlayStylesAverage
				+ ", lengthAllPlayStylesLeisure=" + lengthAllPlayStylesLeisure + ", lengthAllPlayStylesMedian="
				+ lengthAllPlayStylesMedian + ", lengthAllPlayStylesPolled=" + lengthAllPlayStylesPolled
				+ ", lengthAllPlayStylesRushed=" + lengthAllPlayStylesRushed + ", lengthCompletionistsAverage="
				+ lengthCompletionistsAverage + ", lengthCompletionistsLeisure=" + lengthCompletionistsLeisure
				+ ", lengthCompletionistsMedian=" + lengthCompletionistsMedian + ", lengthCompletionistsPolled="
				+ lengthCompletionistsPolled + ", lengthCompletionistsRushed=" + lengthCompletionistsRushed
				+ ", lengthMainExtrasAverage=" + lengthMainExtrasAverage + ", lengthMainExtrasLeisure="
				+ lengthMainExtrasLeisure + ", lengthMainExtrasMedian=" + lengthMainExtrasMedian
				+ ", lengthMainExtrasPolled=" + lengthMainExtrasPolled + ", lengthMainExtrasRushed="
				+ lengthMainExtrasRushed + ", lengthMainStoryAverage=" + lengthMainStoryAverage
				+ ", lengthMainStoryLeisure=" + lengthMainStoryLeisure + ", lengthMainStoryMedian="
				+ lengthMainStoryMedian + ", lengthMainStoryPolled=" + lengthMainStoryPolled
				+ ", lengthMainStoryRushed=" + lengthMainStoryRushed + "]";
	}
	
	

}
