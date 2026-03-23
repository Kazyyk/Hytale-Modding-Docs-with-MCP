# ScriptedBrushPage

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.ui | Extends: InteractiveCustomUIPage<FileBrowserEventData>

public class ScriptedBrushPage extends InteractiveCustomUIPage<FileBrowserEventData>

Concrete implementation extending `InteractiveCustomUIPage<FileBrowserEventData>`.

## Fields

- browser | ServerFileBrowser | final ServerFileBrowser field.

## Constructors

- ScriptedBrushPage(@Nonnull PlayerRef playerRef) | Creates a new ScriptedBrushPage instance.

## Methods

- handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull FileBrowserEventData data) | void | public method.
- handleBrushSelection(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull String brushName) | void | private method.

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, FileBrowserEventData data)
  private void handleBrushSelection(Ref<EntityStore> ref, Store<EntityStore> store, String selectedPath, boolean isSearchResult)

Fields:
private final ServerFileBrowser browser
