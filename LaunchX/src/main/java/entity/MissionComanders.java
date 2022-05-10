package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MissionComanders {
    @Id
    @Column(name = "idMC")
    private int idMc;
    @Basic
    @Column(name = "nameMC")
    private String nameMc;
    @Basic
    @Column(name = "mission")
    private String mission;

    public int getIdMc() {
        return idMc;
    }

    public void setIdMc(int idMc) {
        this.idMc = idMc;
    }

    public String getNameMc() {
        return nameMc;
    }

    public void setNameMc(String nameMc) {
        this.nameMc = nameMc;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissionComanders that = (MissionComanders) o;

        if (idMc != that.idMc) return false;
        if (nameMc != null ? !nameMc.equals(that.nameMc) : that.nameMc != null) return false;
        if (mission != null ? !mission.equals(that.mission) : that.mission != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMc;
        result = 31 * result + (nameMc != null ? nameMc.hashCode() : 0);
        result = 31 * result + (mission != null ? mission.hashCode() : 0);
        return result;
    }
}
