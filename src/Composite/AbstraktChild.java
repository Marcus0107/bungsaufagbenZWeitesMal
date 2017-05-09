package Composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marcus on 09.05.2017.
 */
public class AbstraktChild
{
    List<BugTrackerEntity> childs;

    public AbstraktChild()
    {
        childs = new LinkedList<>();
    }

    public void addChild(BugTrackerEntity child)
    {
        childs.add(child);
    }

    public List<BugTrackerEntity> getChilds()
    {
        return childs;
    }

    /*public int getTotalEstimation()
    {
        int totalEstimation = 0;
        for (BugTrackerEntity bugTrackerEntity : childs)
        {
            totalEstimation += bugTrackerEntity.getEstimation();
        }
        return totalEstimation;
    }*/
}
