# PrefabEditorExitConfirmPage

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor.ui | Extends: InteractiveCustomUIPage

public class PrefabEditorExitConfirmPage extends InteractiveCustomUIPage<PrefabEditorExitConfirmPage.PageData>

Custom UI page displayed when a player attempts to exit a prefab edit session while unsaved changes exist. Presents options to confirm exit (discarding changes), cancel, or save and exit. Lists all dirty prefabs with display names and tooltip paths.

## Fields

- prefabEditSession | PrefabEditSession | The active prefab edit session.
- world | World | The world in which the session operates.
- dirtyPrefabs | List<PrefabEditingMetadata> | List of prefabs with unsaved modifications.

## Constructor


public PrefabEditorExitConfirmPage(@Nonnull PlayerRef playerRef, @Nonnull PrefabEditSession prefabEditSession, @Nonnull World world, @Nonnull List<PrefabEditingMetadata> dirtyPrefabs)

## Methods

- build(Ref<EntityStore>, UICommandBuilder, UIEventBuilder, Store<EntityStore>) | void | Constructs the exit confirmation UI, populating the warning message and dirty prefab list.
- handleDataEvent(Ref<EntityStore>, Store<EntityStore>, PageData) | void | Handles user actions: ConfirmExit exits the session, Cancel closes the page, SaveAndExit opens the save settings page.

## Inner Types

### Action (enum)

Exit confirmation action choices.

- ConfirmExit | Exit without saving.
- Cancel | Return to the editor.
- SaveAndExit | Open the save settings page before exiting.

### PageData (class)

Codec-backed data class for deserializing UI event payloads. Contains a single `action` field of type `Action`.

## See Also

- PrefabEditorSaveSettingsPage
- PrefabTeleportPage
