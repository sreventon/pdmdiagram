package com.cql.tool.pdmdiagram;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class PDMDiagram {

    private Graphics2D graphics2D;
    private List<ActivityNode> activityNodes;
    private List<Relation> relations;


    public PDMDiagram()
    {
        activityNodes = new LinkedList<ActivityNode>();
        relations = new LinkedList<Relation>();
        buildDiagramImage();
    }

    public PDMDiagram(List<ActivityNode> nodes)
    {
        activityNodes = nodes;
        relations = new LinkedList<Relation>();
        buildDiagramImage();
    }

    public PDMDiagram(List<ActivityNode> nodes, List<Relation> relations)
    {
        activityNodes = nodes;
        this.relations = relations;
        buildDiagramImage();
    }

    public void buildDiagramImage()
    {
        //TODO build and cache an image based on default values
    }

    public static class ActivityNode
    {
        private String name;
        private Integer duration;
        private Integer ES, EF, LS, LF;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public Integer getES() {
            return ES;
        }

        public void setES(Integer ES) {
            this.ES = ES;
        }

        public Integer getEF() {
            return EF;
        }

        public void setEF(Integer EF) {
            this.EF = EF;
        }

        public Integer getLS() {
            return LS;
        }

        public void setLS(Integer LS) {
            this.LS = LS;
        }

        public Integer getLF() {
            return LF;
        }

        public void setLF(Integer LF) {
            this.LF = LF;
        }
    }

    public static class Relation
    {
        private String from;
        private String to;
        private Integer lag;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public Integer getLag() {
            return lag;
        }

        public void setLag(Integer lag) {
            this.lag = lag;
        }

    }
}
