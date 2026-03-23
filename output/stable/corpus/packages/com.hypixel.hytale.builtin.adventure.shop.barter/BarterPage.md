# BarterPage

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop.barter | Extends: java.lang.Object

public class BarterPage

Manages a single page of trades within a barter shop UI. Handles page lifecycle (open, close, tick), trade slot rendering, stock refresh timing, and purchase transaction processing. Integrates with the custom UI system via `CustomPageLifetime` and event bindings.

Also in this package: BarterEventData, BarterItemStack, BarterShopAsset, BarterShopState, BarterTrade, FixedTradeSlot, PoolTradeSlot, RefreshInterval, ShopInstanceState, TradeSlot, WeightedTrade

Complete API:
  private boolean isTradeValid(BarterTrade trade)
  private String getSafeItemId(String itemId)
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, BarterPage.BarterEventData data)
  private void updateAfterTrade(Ref<EntityStore> ref, Store<EntityStore> store, int tradedIndex)
  private int countItemsInContainer(ItemContainer container, String itemId)
  private void removeItemsFromContainer(ItemContainer container, String itemId, int amount)
  private void refreshUI(Ref<EntityStore> ref, Store<EntityStore> store)
  private Message getRefreshTimerText(BarterShopState barterState, Instant gameTime)

Fields:
private final BarterShopAsset shopAsset
