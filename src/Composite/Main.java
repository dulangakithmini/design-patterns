package Composite;

public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("French Crêpes", "Made from flour, milk and eggs, these are closest counterparts to English pancakes, and can be served sweet or savoury.", 100, false));
        pancakeHouseMenu.add(new MenuItem("Scotch Pancakes", "Made with flour, eggs, sugar, milk, salt and cream of tartar.", 120, false));
        pancakeHouseMenu.add(new MenuItem("Spaghetti", "With garlic and cheese", 200, true));

        dinerMenu.add(new MenuItem("Burger", "With extra chese and meat", 700, false));
        dinerMenu.add(new MenuItem("Sandwitch", "With extra cheese", 500, true));

        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Cupcake", "With creamy icing", 250, true));
        dessertMenu.add(new MenuItem("Icecream", "Blueberry", 200, true));

        cafeMenu.add(new MenuItem("Cream of potato soup", "With creamy chopped potatoes", 550, true));
        cafeMenu.add(new MenuItem("Cauliflower salad", "With spicy ingrdients", 600, true));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
