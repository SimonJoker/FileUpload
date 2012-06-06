package jscon.com.vo;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: shuyue@cn.ibm.com
 * Date: 12-6-6
 * Time: 下午1:24
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String user_id;
    private String usernick;
    private Date date;
    private String email;
    private String tags;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsernick() {
        return usernick;
    }

    public void setUsernick(String usernick) {
        this.usernick = usernick;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public String toString()
    {
         return "ID:"+user_id+", nickname:"+usernick+", date:"+
                 date+", email:"+email+", tags:"+tags;
    }
}
