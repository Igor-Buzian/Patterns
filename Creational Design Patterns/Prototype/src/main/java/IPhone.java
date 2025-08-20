public class IPhone {
    private int price;
    private String name;
    private String description;
    private String imageUrl;

    public IPhone(int price, String name, String description, String image) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.imageUrl = image;
    }

    @Override
    public IPhone clone() {
        return new IPhone(price, name, description, imageUrl);
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price +
                ", description='" + description + "', imageUrl='" + imageUrl + "'}";
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
