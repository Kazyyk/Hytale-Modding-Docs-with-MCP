# PrefabPage

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefablist | Implements: UIPage

public class PrefabPage implements UIPage

UI page for the prefab browser. Manages the file browser state, current directory navigation, search queries, and prefab selection callbacks.

Also in this package: Action, AssetPrefabFileProvider, PageData, PrefabSavePage, SearchResult

Complete API:
  private static List<FileBrowserConfig.RootEntry> buildRootEntries(PrefabStore prefabStore)
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, FileBrowserEventData data)
  private void handleAssetsNavigation(Ref<EntityStore> ref, Store<EntityStore> store, String selectedPath, boolean isSearchResult)
  private void handleRegularNavigation(Ref<EntityStore> ref, Store<EntityStore> store, String selectedPath, boolean isSearchResult)
  private void handlePrefabSelection(Ref<EntityStore> ref, Store<EntityStore> store, Path file, String displayPath)
  private void buildCurrentPath(UICommandBuilder commandBuilder)
  private String getRootDisplayName(Path root)
  private void buildFileList(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void buildAssetsFileList(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)

Fields:
private static final String ASSETS_ROOT_KEY
private final ServerFileBrowser browser
private final BuilderToolsPlugin.BuilderState builderState
private final AssetPrefabFileProvider assetProvider
private boolean inAssetsRoot
private Path assetsCurrentDir
