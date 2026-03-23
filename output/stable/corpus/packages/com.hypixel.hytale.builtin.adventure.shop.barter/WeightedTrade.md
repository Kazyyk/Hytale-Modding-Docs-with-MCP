# WeightedTrade

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop.barter | Extends: java.lang.Object

public class WeightedTrade

A `BarterTrade` paired with a weight value for use in `PoolTradeSlot` random selection. Higher weights increase the probability of this trade being selected during a refresh cycle.

Also in this package: BarterEventData, BarterItemStack, BarterPage, BarterShopAsset, BarterShopState, BarterTrade, FixedTradeSlot, PoolTradeSlot, RefreshInterval, ShopInstanceState, TradeSlot

Complete API:
  public double getWeight()
  public BarterItemStack getOutput()
  public BarterItemStack[] getInput()
  public int[] getStockRange()
  public boolean hasStockRange()
  public int getStockMin()
  public int getStockMax()
  public int resolveStock(Random random)
  public BarterTrade toBarterTrade(Random random)
  public BarterTrade toBarterTrade()
  public String toString()

Fields:
public static final BuilderCodec<WeightedTrade> CODEC
public static final WeightedTrade[] EMPTY_ARRAY
protected double weight
protected BarterItemStack output
protected BarterItemStack[] input
protected int[] stockRange
