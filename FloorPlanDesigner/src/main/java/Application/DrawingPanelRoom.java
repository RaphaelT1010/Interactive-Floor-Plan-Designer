package Application;
import javax.swing.*;
import javax.swing.text.Segment;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanelRoom {
    private Color color;
    private List<DrawingPanelSegment> wallSegments;

    private Point startPoint;
    private Point endPoint;

    public DrawingPanelRoom(Color color){
        this.color = color;
        this.wallSegments = new ArrayList<>();
    }

    public void setStartingPoint(Point startPoint){
        this.startPoint = startPoint;
    }

    public Point getStartingPoint(){
        return startPoint;
    }

    public void setEndingPoint(Point endPoint){
        this.endPoint = endPoint;
    }

    public Point getEndingPoint(){
        return endPoint;
    }

    public int getWidth(){
        return endPoint.x - startPoint.x;
    }

    public int getHeight(){
        return endPoint.y - startPoint.y;
    }





}