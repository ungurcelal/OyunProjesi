package com.example.projeoyun2;

public class oyunClass {
    String oyunAdi;
    String oyunTur;
    String oyunPuan;
    String oyunYil;
    int oyunPoster;
    String youtubeUrl;
    String aciklama;

    public oyunClass(String oyunAdi, String oyunTur, String oyunPuan, String oyunYil, int oyunPoster, String youtubeUrl, String aciklama) {
        this.oyunAdi = oyunAdi;
        this.oyunTur = oyunTur;
        this.oyunPuan = oyunPuan;
        this.oyunYil = oyunYil;
        this.oyunPoster = oyunPoster;
        this.youtubeUrl = youtubeUrl;
        this.aciklama = aciklama;
    }

    public String getOyunAdi() {
        return oyunAdi;
    }

    public void setOyunAdi(String oyunAdi) {
        this.oyunAdi = oyunAdi;
    }

    public String getOyunTur() {
        return oyunTur;
    }

    public void setOyunTur(String oyunTur) {
        this.oyunTur = oyunTur;
    }

    public String getOyunPuan() {
        return oyunPuan;
    }

    public void setOyunPuan(String oyunPuan) {
        this.oyunPuan = oyunPuan;
    }

    public String getOyunYil() {
        return oyunYil;
    }

    public void setOyunYil(String oyunYil) {
        this.oyunYil = oyunYil;
    }

    public int getOyunPoster() {
        return oyunPoster;
    }

    public void setOyunPoster(int oyunPoster) {
        this.oyunPoster = oyunPoster;
    }

    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    public void setYoutubeUrl(String youtubeUrl) {
        this.youtubeUrl = youtubeUrl;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
