# BarterShopState

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop.barter | Extends: java.lang.Object

public class BarterShopState

Runtime state for an active barter shop instance. Tracks current stock levels, refresh timers, and per-player purchase limits. Each NPC with a shop creates its own `BarterShopState` that persists across player interactions.

Also in this package: BarterEventData, BarterItemStack, BarterPage, BarterShopAsset, BarterTrade, FixedTradeSlot, PoolTradeSlot, RefreshInterval, ShopInstanceState, TradeSlot, WeightedTrade

Complete API:
  public static void initialize(Path dataDirectory)
  public static BarterShopState get()
  public static void load()
  public static void save()
  public static void shutdown()
  private static Instant calculateNextScheduledRestock(Instant gameTime, int intervalDays, int restockHour)
  public BarterShopState.ShopInstanceState getOrCreateShopState(BarterShopAsset asset, Instant gameTime)
  public void checkRefresh(BarterShopAsset asset, Instant gameTime)
  public int[] getStockArray(BarterShopAsset asset, Instant gameTime)
  public BarterTrade[] getResolvedTrades(BarterShopAsset asset, Instant gameTime)
  public boolean executeTrade(BarterShopAsset asset, int tradeIndex, int quantity, Instant gameTime)

Fields:
private static final HytaleLogger LOGGER
private static BarterShopState instance
private static Path saveDirectory
public static final BuilderCodec<BarterShopState.ShopInstanceState> SHOP_INSTANCE_CODEC
public static final BuilderCodec<BarterShopState> CODEC
private final Map<String,BarterShopState.ShopInstanceState> shopStates
