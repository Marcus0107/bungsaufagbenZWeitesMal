package Composite;

/**
 * Created by Marcus on 09.05.2017.
 */
public class Bug extends AbstraktChild implements BugTrackerEntity
{
    final String description;
    final int estimateHours;

    public Bug(String description, int estimate)
    {
        this.description = description;
        this.estimateHours = estimate;
    }

    @Override
    public int getEstimation()
    {
        return estimateHours;
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
