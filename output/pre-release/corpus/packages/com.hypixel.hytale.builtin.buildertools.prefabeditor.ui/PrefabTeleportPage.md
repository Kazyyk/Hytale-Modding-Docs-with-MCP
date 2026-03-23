# PrefabTeleportPage

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.ui | Extends: InteractiveCustomUIPage

public class PrefabTeleportPage extends InteractiveCustomUIPage<PrefabTeleportPage.PageData>

Custom UI page for teleporting a player to a loaded prefab within a prefab edit session. Lists all loaded prefabs with fuzzy search filtering. On selection, calculates the center of the prefab bounding box, queries the chunk heightmap for a safe Y coordinate, and teleports the player above the prefab.

## Fields

- prefabEditSession | PrefabEditSession | The active edit session to browse prefabs from.
- searchQuery | String | Current search filter.

## Constructor


public PrefabTeleportPage(@Nonnull PlayerRef playerRef, @Nonnull PrefabEditSession prefabEditSession)

## Methods

- build(Ref<EntityStore>, UICommandBuilder, UIEventBuilder, Store<EntityStore>) | void | Builds the teleport page with search input and prefab list.
- handleDataEvent(Ref<EntityStore>, Store<EntityStore>, PageData) | void | Handles search query updates and prefab selection. On selection, teleports the player to the prefab center.

### PageData (class)

Codec-backed data class with `searchQuery` and `prefabUuid` fields.

## See Also

- PrefabEditorExitConfirmPage
- PrefabEditorLoadSettingsPage
