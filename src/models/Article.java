/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.Date;
import javafx.scene.image.ImageView;

/**
 *
 * @author bensa
 */
public class Article {
    
    private int id,id_emp;
    private String description,titre;
    Date date; 
    private String img;
    private ImageView image1;

     public ImageView getImage1() {
        return image1;
    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }
     

    public void setImage1(ImageView image1) {
        this.image1 = image1;
    }

    public Article() {
        
    }

    public Article(int id,String titre,String description,Date date , ImageView image1) {
        this.id = id;
        this.titre = titre;
        this.date=date;
        this.description=description;
        this.image1 = image1;

    }
    
    
      public Article(int id,String titre,String description,Date date , ImageView image1,int id_emp) {
        this.id = id;
        this.titre = titre;
        this.date=date;
        this.description=description;
        this.image1 = image1;
        this.id_emp=id_emp;

    }
      public Article(int id,String titre,String description,Date date , String img,int id_emp) {
        this.id = id;
        this.titre = titre;
        this.date=date;
        this.description=description;
        this.img = img;
         this.id_emp=id_emp;
        

    }
        public Article(int id,String titre,String description,Date date , String img) {
        this.id = id;
        this.titre = titre;
        this.date=date;
        this.description=description;
        this.img = img;
        

    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getTitre() {
        return titre;
    }
    
    
    public void setTitre(String titre) {
        this.titre = titre;
    }


    
    
    public void setDate (Date date) {
        this.date = date;
    }
    
    public Date getDate() {
        return date;
    }
    
   
      public String getDescription() {
        return description;
    }
    
    
    public void setDescription(String description) {
        this.description = description;
    }
    
     public void setImg(String img) {
        this.img = img;
    }

     public String getImg() {
        return img;
    }

    @Override
    public String toString() {
        return "Article {" + "id=" + id + ", titre=" + titre + ", description=" + description +""
                + "Date=" + date + "img=" + img +'}';
    }
   
    
    
    
    
}
