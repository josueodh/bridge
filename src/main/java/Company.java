public abstract class Company {

    protected Search search;

    protected float totalAccountValue;

    public Company(float totalAccountValue){
        this.totalAccountValue = totalAccountValue;
    }

    public void setSearch(Search search){
        this.search = search;
    }

    public void setTotalAccountValue(float totalAccountValue){
        this.totalAccountValue = totalAccountValue;
    }

    public abstract float calcTotal();
}
