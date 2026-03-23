# PoolTradeSlot

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop.barter | Extends: TradeSlot

public class PoolTradeSlot extends TradeSlot

A trade slot that randomly selects its current trade from a weighted pool of `WeightedTrade` entries. On each refresh cycle, a new trade is drawn from the pool. Used for rotating or randomized shop inventories.

Also in this package: BarterEventData, BarterItemStack, BarterPage, BarterShopAsset, BarterShopState, BarterTrade, FixedTradeSlot, RefreshInterval, ShopInstanceState, TradeSlot, WeightedTrade

Complete API:
  public int getPoolSlotCount()
  public WeightedTrade[] getTrades()
  public List<BarterTrade> resolve(Random random)
  public int getSlotCount()
  private static int selectWeightedIndex(List<WeightedTrade> trades, Random random)
  public String toString()

Fields:
public static final BuilderCodec<PoolTradeSlot> CODEC
protected int slotCount
protected WeightedTrade[] trades
