# PrefabSavePage

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefablist | Implements: UIPage

public class PrefabSavePage implements UIPage

UI page for saving prefabs. Manages the save dialog state including file name input, directory selection, and save confirmation.

Also in this package: Action, AssetPrefabFileProvider, PageData, PrefabPage, SearchResult

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, PrefabSavePage.PageData data)
  private Vector3i getPlayerAnchor(Ref<EntityStore> ref, Store<EntityStore> store, boolean usePlayerAnchor)

Fields:
private static final Message MESSAGE_SERVER_BUILDER_TOOLS_PREFAB_SAVE_NAME_REQUIRED
private static final Message MESSAGE_PACK_REQUIRED
private final AssetPackSaveBrowser packBrowser
private boolean initialized
