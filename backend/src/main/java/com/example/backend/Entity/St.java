package com.example.backend.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "st")
public class St {
    @Id
    private String _id;
    private String  name;
    private String adress;
    private String mobile;

    public St(String _id, String name, String adress, String mobile) {
        this._id = _id;
        this.name = name;
        this.adress = adress;
        this.mobile = mobile;
    }

    public St() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getadress() {
        return adress;
    }

    public void setadress(String adress) {
        this.adress = adress;
    }

    public String getmobile() {
        return mobile;
    }

    public void setmobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "St{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
