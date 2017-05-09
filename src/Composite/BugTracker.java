package Composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marcus on 09.05.2017.
 */
public class BugTracker extends AbstraktChild implements BugTrackerEntity
{
    List<AbstraktChild> abstraktChild;
    final String name;

    public BugTracker(String name)
    {
        this.name = name;
        abstraktChild = new LinkedList<>();
    }

    @Override
    public int getEstimation()
    {
        return 0;
    }

    @Override
    public int getTotalEstimation(){
        int totalEstimation = 0;
        for (BugTrackerEntity bugTrackerEntity : childs)
        {
            totalEstimation += bugTrackerEntity.getEstimation();
        }
        return totalEstimation;
    }
}
