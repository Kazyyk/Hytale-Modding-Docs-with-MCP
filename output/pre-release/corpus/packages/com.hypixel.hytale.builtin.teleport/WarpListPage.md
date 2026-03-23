# WarpListPage

Type: class | Package: com.hypixel.hytale.builtin.teleport | Extends: InteractiveCustomUIPage<WarpListPage.WarpListPageEventData>

public class WarpListPage extends InteractiveCustomUIPage<WarpListPage.WarpListPageEventData>

## Fields

- private static final String PAGE_UI_FILE
- private final Consumer<String> callback
- private final Map<String, Warp> warps
- private String searchQuery
- ObjectArrayList<String> warps
- int i
- String selector
- String warp
- Player playerComponent
- UICommandBuilder commandBuilder
- UIEventBuilder eventBuilder
- static final String KEY_WARP
- static final String KEY_SEARCH_QUERY
- public static final BuilderCodec<WarpListPage.WarpListPageEventData> CODEC
- private String warp
- private String searchQuery

## Constructors

- public WarpListPage(@Nonnull PlayerRef playerRef, Map<String, Warp> warps, Consumer<String> callback)

## Methods

- private void buildWarpList(@Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder)
- public void build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull WarpListPage.WarpListPageEventData eventData)
- public String getWarp()
- public String getSearchQuery()

## Inner Types

- `WarpListPage.WarpListPageEventData`

## Related Types

- Warp

Also in this package: TeleportPlugin, Warp, WarpComponent, WarpListPageEventData, WarpMarkerProvider

Complete API:
  private void buildWarpList(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, WarpListPage.WarpListPageEventData eventData)

Fields:
private static final String PAGE_UI_FILE
private final Consumer<String> callback
private final Map<String,Warp> warps
private String searchQuery
