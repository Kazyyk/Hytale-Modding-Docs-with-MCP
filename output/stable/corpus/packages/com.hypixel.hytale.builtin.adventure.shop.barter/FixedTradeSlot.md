# FixedTradeSlot

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop.barter | Extends: TradeSlot

public class FixedTradeSlot extends TradeSlot

A trade slot that always offers the same fixed trade. The trade does not rotate or change on refresh. Used for essential or permanent shop offerings.

Also in this package: BarterEventData, BarterItemStack, BarterPage, BarterShopAsset, BarterShopState, BarterTrade, PoolTradeSlot, RefreshInterval, ShopInstanceState, TradeSlot, WeightedTrade

Complete API:
  public BarterTrade getTrade()
  public List<BarterTrade> resolve(Random random)
  public int getSlotCount()
  public String toString()

Fields:
public static final BuilderCodec<FixedTradeSlot> CODEC
protected BarterTrade trade
