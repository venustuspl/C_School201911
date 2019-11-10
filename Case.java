import java.time.LocalDate;

public class Case {

    private String user;
    private String email;
    private LocalDate createDt;

    public Case(String user, String email, LocalDate createDt) {
        this.user = user;
        this.email = email;
        this.createDt = createDt;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDate createDt) {
        this.createDt = createDt;
    }

    public boolean isOlderThan2Weeks(){
        if (this.getCreateDt().isBefore(LocalDate.now().minusDays(14)))
            return true;
        else
            return false;
    }

}
