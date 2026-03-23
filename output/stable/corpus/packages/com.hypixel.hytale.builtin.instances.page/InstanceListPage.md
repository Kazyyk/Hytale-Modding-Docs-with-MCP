# InstanceListPage

Type: class | Package: com.hypixel.hytale.builtin.instances.page | Extends: InteractiveCustomUIPage<InstanceListPage.PageData>

public class InstanceListPage extends InteractiveCustomUIPage<InstanceListPage.PageData>

Custom UI page for browsing and selecting game instances. Uses a `ServerFileBrowser` configured in asset-pack mode under `Server/Instances` with directory navigation, search, and a terminal directory predicate that checks for an `instance.bson` file.

Provides two actions: **Spawn** (creates a new instance world and teleports the player) and **Load** (loads an existing instance for editing and teleports to its spawn point). Uses `InstancesPlugin` for instance asset resolution, spawning, and loading.

## Inner Types

### Action


public static enum Action

- Select | Selects an instance in the list (handled internally).
- Load | Loads the selected instance for editing.
- Spawn | Spawns a new instance of the selected type.

### PageData


public static class PageData

Codec-serialized event data with instance, action, file, search query, and search result fields.

Also in this package: Action, Action, ConfigureInstanceBlockPage, PageData, PageData

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, InstanceListPage.PageData data)
  private boolean isInstance(Path path)
  private void load(Ref<EntityStore> ref, Store<EntityStore> store)
  private void spawn(Ref<EntityStore> ref, Store<EntityStore> store)
  private String getInstanceNameFromVirtualPath(String virtualPath)
  private void updateSelection(String virtualPath)

Fields:
private static final String ASSET_PACK_SUB_PATH
private String selectedInstance
private final ServerFileBrowser browser
