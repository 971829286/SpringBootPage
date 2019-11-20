package com.springboot.domian;

public class richan_log {
    String id;
    String application_number;
    String DataFrom;
    String richanlog;
    String entryid;
    String title;
    String createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplication_number() {
        return application_number;
    }

    public void setApplication_number(String application_number) {
        this.application_number = application_number;
    }

    public String getDataFrom() {
        return DataFrom;
    }

    public void setDataFrom(String dataFrom) {
        DataFrom = dataFrom;
    }

    public String getRichanlog() {
        return richanlog;
    }

    public void setRichanlog(String richanlog) {
        this.richanlog = richanlog;
    }

    public String getEntryid() {
        return entryid;
    }

    public void setEntryid(String entryid) {
        this.entryid = entryid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "richan_log{" +
                "id='" + id + '\'' +
                ", application_number='" + application_number + '\'' +
                ", DataFrom='" + DataFrom + '\'' +
                ", richanlog='" + richanlog + '\'' +
                ", entryid='" + entryid + '\'' +
                ", title='" + title + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}
