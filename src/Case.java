/**
 * Created by Andre Cowie 14862344 on 16/03/2016.
 */
public class Case implements Comparable<Case>{
    private Integer dollarsInside;
    private boolean open;
    private boolean selected;

    public Case(){
        setDollarsInside(0);
        setOpen(false);
        setSelected(false);
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Integer getDollarsInside() {
        return dollarsInside;
    }

    public void setDollarsInside(Integer dollarsInside) {
        this.dollarsInside = dollarsInside;
    }

    @Override
    public String toString() {
        return " " + dollarsInside + ",";
    }

    @Override
    public int compareTo(Case o) {
        if(this.getDollarsInside()> o.getDollarsInside()){
            return 1;
        } else{
            return -1;
        }
    }
}
