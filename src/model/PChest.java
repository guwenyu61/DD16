package model;

/**
 * Chest object on the map.
 *
 * @author Jiayao
 * @version 1.0.0
 */
public class PChest extends PCellContent {
    private int item_id, x, y;
    private PItem item;
    private ItemIO itemio;

    /**
     * Initialize a chest model of play
     * @param id
     */
    public PChest(String id) {
        item_id = Integer.parseInt(id);
        itemio = new ItemIO();
        item = itemio.getPItem(item_id);
        type = "CHEST";
    }

    /**
     * Get the item of a chest
     * @return PItem
     */
    public PItem getItem() {
        return item;
    }

    /**
     * Remove the item from the chest
     */
    public void removeItem() {
        item = null;
    }
}
