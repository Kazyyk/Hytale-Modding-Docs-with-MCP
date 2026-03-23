# PageData

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefablist

protected static class PageData

Codec-backed data container for `PrefabSavePage` events. Contains the prefab name, save flags, and asset pack browser data.

Also in this package: Action, AssetPrefabFileProvider, PrefabPage, PrefabSavePage, SearchResult

Fields:
public static final String NAME
public static final String ENTITIES
public static final String EMPTY
public static final String OVERWRITE
public static final String FROM_CLIPBOARD
public static final String USE_PLAYER_ANCHOR
public static final String CLEAR_SUPPORT
public static final BuilderCodec<PrefabSavePage.PageData> CODEC
public PrefabSavePage.Action action
public String name
public boolean entities
public boolean empty
public boolean overwrite
public boolean fromClipboard
public boolean usePlayerAnchor
public boolean clearSupport
public final AssetPackSaveBrowserEventData packBrowserData
