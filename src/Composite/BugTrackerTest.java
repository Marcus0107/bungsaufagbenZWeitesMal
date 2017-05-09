package Composite;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marcus on 09.05.2017.
 */
public class BugTrackerTest
{
    @Test
    public void testIT()
    {
        BugTracker bugTracker = new BugTracker("All Projects");
        bugTracker.addChild(new Bug("First Bug",2));

        Bug minor = new Bug("First Minor",1);
        Bug subTask = new Bug("First Sub Task",1);
        Bug subTaks2 = new Bug("Second Sub Task",1);

        minor.addChild(subTask);
        minor.addChild(subTaks2);

        Comment firstComment = new Comment("This is bullshit");

        subTaks2.addChild(firstComment);

        Comment overallComment = new Comment("Nice Projects");
        Comment reply =new Comment("Thank you, we are working hard");
        overallComment.addChild(reply);

        bugTracker.addChild(overallComment);

        int overall =bugTracker.getTotalEstimation();
        System.out.println("Overall we have bugs with " + overall+ " hours of fixing time");
    }
}