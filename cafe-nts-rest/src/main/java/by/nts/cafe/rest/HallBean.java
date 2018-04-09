package by.nts.cafe.rest;

import java.util.Objects;

public class HallBean {
    private String id;
    private String name;

    public HallBean() {
    }

    public HallBean(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HallBean)) return false;
        HallBean hallBean = (HallBean) o;
        return Objects.equals(id, hallBean.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
