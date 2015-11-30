package kennewickpractice.com.golfscorecard;

/**
 * Created by Ken on 11/28/2015.
 */
public class Hole {
    private String mLabel;
    private int mStrokeCount;

    public Hole(String label, int strokeCount) {
        mLabel = label;
        mStrokeCount = strokeCount;
    }

    public String getLabel() {
        return mLabel;
    }

    public void setLabel(String mLabel) {
        this.mLabel = mLabel;
    }

    public int getStrokeCount() {
        return mStrokeCount;
    }

    public void setStrokeCount(int mStrokeCount) {
        this.mStrokeCount = mStrokeCount;
    }
}
