package Composite;

/**
 * Created by Marcus on 09.05.2017.
 */
public class Comment extends AbstraktChild implements BugTrackerEntity
{
    String comment;

    public Comment(String comment)
    {
        this.comment = comment;
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
