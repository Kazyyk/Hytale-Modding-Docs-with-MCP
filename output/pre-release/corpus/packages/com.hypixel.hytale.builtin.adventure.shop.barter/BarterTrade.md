# BarterTrade

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop.barter | Extends: java.lang.Object

public class BarterTrade

Represents a single trade offer: an input cost (one or more `BarterItemStack` items the player must provide) and an output reward (one or more `BarterItemStack` items the player receives). Provides a codec for JSON serialization.

Also in this package: BarterEventData, BarterItemStack, BarterPage, BarterShopAsset, BarterShopState, FixedTradeSlot, PoolTradeSlot, RefreshInterval, ShopInstanceState, TradeSlot, WeightedTrade

Complete API:
  public BarterItemStack getOutput()
  public BarterItemStack[] getInput()
  public int getMaxStock()
  public String toString()

Fields:
public static final BuilderCodec<BarterTrade> CODEC
protected BarterItemStack output
protected BarterItemStack[] input
protected int maxStock
