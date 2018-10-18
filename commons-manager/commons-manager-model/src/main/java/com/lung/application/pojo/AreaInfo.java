package com.lung.application.pojo;

public class AreaInfo {
    private Long area_id;

    private Long area_code;

    private Long parent_code;

    private String full_name;

    private String name;

    private String frist_spell;

    private Integer area_level;

    public Long getArea_id() {
        return area_id;
    }

    public void setArea_id(Long area_id) {
        this.area_id = area_id;
    }

    public Long getArea_code() {
        return area_code;
    }

    public void setArea_code(Long area_code) {
        this.area_code = area_code;
    }

    public Long getParent_code() {
        return parent_code;
    }

    public void setParent_code(Long parent_code) {
        this.parent_code = parent_code;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name == null ? null : full_name.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFrist_spell() {
        return frist_spell;
    }

    public void setFrist_spell(String frist_spell) {
        this.frist_spell = frist_spell == null ? null : frist_spell.trim();
    }

    public Integer getArea_level() {
        return area_level;
    }

    public void setArea_level(Integer area_level) {
        this.area_level = area_level;
    }
}