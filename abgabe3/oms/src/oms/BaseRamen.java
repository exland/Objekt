package oms;

enum RamenToppings{See_Food, Roasted_Pork, Fish_Cake, Spicy_Ground_Pork }

abstract class BaseRamen {

    private String name_;
    private String dashi_;
    private String Noodle_;
    private RamenToppings topping_;
    double price_;


    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getDashi_() {
        return dashi_;
    }

    public void setDashi_(String dashi_) {
        this.dashi_ = dashi_;
    }

    public String getNoodle_() {
        return Noodle_;
    }

    public void setNoodle_(String noodle_) {
        Noodle_ = noodle_;
    }

    public RamenToppings getTopping_() {
        return topping_;
    }

    public void setTopping_(RamenToppings topping_) {
        this.topping_ = topping_;
    }

    public double getPrice_() {
        return price_;
    }

    public void setPrice_(double price_) {
        this.price_ = price_;
    }

    public BaseRamen(String name_, String dashi_, String noodle_, RamenToppings topping_, double price_) {
        this.name_ = name_;
        this.dashi_ = dashi_;
        Noodle_ = noodle_;
        this.topping_ = topping_;
        this.price_ = price_;
    }
}
