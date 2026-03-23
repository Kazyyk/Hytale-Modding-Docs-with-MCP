# TradeSlot

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop.barter | Extends: java.lang.Object

public abstract class TradeSlot

Abstract base class for trade slots within a barter shop. A trade slot occupies a position in the shop UI and provides the current trade offer. Subclasses define whether the slot is fixed or drawn from a pool.

Known subclasses: FixedTradeSlot, PoolTradeSlot

Also in this package: BarterEventData, BarterItemStack, BarterPage, BarterShopAsset, BarterShopState, BarterTrade, FixedTradeSlot, PoolTradeSlot, RefreshInterval, ShopInstanceState, WeightedTrade

Complete API:
  public abstract List<BarterTrade> resolve(Random var1)
  public abstract int getSlotCount()

Fields:
public static final CodecMapCodec<TradeSlot> CODEC
public static final TradeSlot[] EMPTY_ARRAY
