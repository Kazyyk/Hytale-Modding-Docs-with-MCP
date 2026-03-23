# BarterShopAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop.barter | Extends: java.lang.Object

public class BarterShopAsset

Asset definition for a barter shop configuration. Loaded from JSON via `BuilderCodec`. Contains the list of trade slots, refresh interval, shop title, and layout parameters. Registered in the asset system and referenced by NPC shop interactions.

Also in this package: BarterEventData, BarterItemStack, BarterPage, BarterShopState, BarterTrade, FixedTradeSlot, PoolTradeSlot, RefreshInterval, ShopInstanceState, TradeSlot, WeightedTrade

Complete API:
  public static AssetStore<String,BarterShopAsset,DefaultAssetMap<String,BarterShopAsset>> getAssetStore()
  public static DefaultAssetMap<String,BarterShopAsset> getAssetMap()
  public String getId()
  public String getDisplayNameKey()
  public RefreshInterval getRefreshInterval()
  public BarterTrade[] getTrades()
  public TradeSlot[] getTradeSlots()
  public boolean hasTradeSlots()
  public int getRestockHour()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,BarterShopAsset> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,BarterShopAsset,DefaultAssetMap<String,BarterShopAsset>> ASSET_STORE
protected AssetExtraInfo.Data extraData
public static final int DEFAULT_RESTOCK_HOUR
protected String id
protected String displayNameKey
protected RefreshInterval refreshInterval
protected BarterTrade[] trades
protected TradeSlot[] tradeSlots
protected Integer restockHour
