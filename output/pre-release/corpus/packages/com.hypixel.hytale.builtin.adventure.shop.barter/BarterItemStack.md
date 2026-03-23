# BarterItemStack

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop.barter | Extends: java.lang.Object

public class BarterItemStack

Represents an item stack within the barter trading system. Holds an item ID string and a quantity (minimum 1). Provides a `BuilderCodec` for JSON deserialization with validation.

Also in this package: BarterEventData, BarterPage, BarterShopAsset, BarterShopState, BarterTrade, FixedTradeSlot, PoolTradeSlot, RefreshInterval, ShopInstanceState, TradeSlot, WeightedTrade

Complete API:
  public String getItemId()
  public int getQuantity()
  public String toString()

Fields:
public static final BuilderCodec<BarterItemStack> CODEC
protected String itemId
protected int quantity
