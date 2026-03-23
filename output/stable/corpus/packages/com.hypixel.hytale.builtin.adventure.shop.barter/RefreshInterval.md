# RefreshInterval

Type: enum | Package: com.hypixel.hytale.builtin.adventure.shop.barter | Extends: java.lang.Enum<RefreshInterval>

public enum RefreshInterval

Defines the time intervals at which a barter shop refreshes its rotating trade slots. Controls how frequently `PoolTradeSlot` entries re-roll their offered trades.

Also in this package: BarterEventData, BarterItemStack, BarterPage, BarterShopAsset, BarterShopState, BarterTrade, FixedTradeSlot, PoolTradeSlot, ShopInstanceState, TradeSlot, WeightedTrade

Complete API:
  public int getDays()
  public String toString()

Fields:
public static final BuilderCodec<RefreshInterval> CODEC
protected int days
