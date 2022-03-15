/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author glori
 */
public class DVD {
    private String title;
    private String releasedDate;
    private int mpaa;
    private String director;
    private String studio;
    private String userRating;
    
    public DVD(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public String getReleasedDate() {
        return releasedDate;
    }
    public void setReleasedDate(String releasedDate) {
        this.releasedDate = releasedDate;
    }
    
    public int getMpaa() {
        return mpaa;
    }
    public void setMpaa(int mpaa) {
        this.mpaa = mpaa;
    }
    
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    
    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }
    
    public String getUserRating() {
        return userRating;
    }
    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }
}
