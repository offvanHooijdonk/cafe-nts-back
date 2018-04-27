package by.nts.cafe.service.model;

import java.util.Objects;

public class HallModel {
    private String id;
    private String name;

    public HallModel() {
    }

    public HallModel(String id, String name) {
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
        if (!(o instanceof HallModel)) return false;
        HallModel hallModel = (HallModel) o;
        return Objects.equals(id, hallModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
