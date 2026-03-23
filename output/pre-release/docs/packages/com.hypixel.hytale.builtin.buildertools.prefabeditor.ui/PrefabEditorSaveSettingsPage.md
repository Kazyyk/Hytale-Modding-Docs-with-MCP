---
title: "PrefabEditorSaveSettingsPage"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor.ui"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.ui.PrefabEditorSaveSettingsPage"
api_surface: false
extends: "InteractiveCustomUIPage"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "prefab-editor"
  - "ui"
  - "page"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor.ui`

```java
public class PrefabEditorSaveSettingsPage extends InteractiveCustomUIPage<PrefabEditorSaveSettingsPage.PageData>
```

Custom UI page for saving prefab data back to disk. Provides checkboxes for save options (entities, empty blocks, overwrite existing, clear support values) and an integrated prefab browser with fuzzy search for selecting which prefabs to save. Includes a saving progress overlay with error reporting. Read-only prefabs are automatically redirected to the server prefabs directory.

## Constants

| Field | Type | Value | Description |
|---|---|---|---|
| `PROGRESS_UPDATE_INTERVAL_MS` | `long` | `100` | Minimum milliseconds between progress UI updates. |

## Fields

| Field | Type | Description |
|---|---|---|
| `prefabEditSession` | `PrefabEditSession` | The active edit session. |
| `isSaving` | `boolean` | Whether a save operation is in progress. |
| `browserSearchQuery` | `String` | Current search query in the prefab browser. |
| `selectedPrefabUuids` | `Set<UUID>` | UUIDs of prefabs selected in the browser. |

## Constructor

```java
public PrefabEditorSaveSettingsPage(@Nonnull PlayerRef playerRef, @Nonnull PrefabEditSession prefabEditSession)
```

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(Ref<EntityStore>, UICommandBuilder, UIEventBuilder, Store<EntityStore>)` | `void` | Constructs the save settings form, browser, and saving progress overlays. |
| `handleDataEvent(Ref<EntityStore>, Store<EntityStore>, PageData)` | `void` | Handles Save, Cancel, SelectAll, SelectEdited, OpenBrowser, BrowserSearch, BrowserTogglePrefab, BrowserSelectAll, ConfirmBrowser, CancelBrowser, and BackFromSaving actions. |

## Inner Types

### Action (enum)

| Constant | Description |
|---|---|
| `Save` | Execute save with current settings. |
| `Cancel` | Close without saving. |
| `SelectAll` | Select all loaded prefabs for saving. |
| `SelectEdited` | Select only dirty prefabs. |
| `OpenBrowser` | Open the prefab browser overlay. |
| `BrowserSearch` | Filter prefabs by search query. |
| `BrowserTogglePrefab` | Toggle selection of a single prefab. |
| `BrowserSelectAll` | Select all prefabs in browser. |
| `ConfirmBrowser` | Apply browser selection. |
| `CancelBrowser` | Close browser without applying. |
| `BackFromSaving` | Return to main form after a save attempt. |

### PageData (class)

Codec-backed data class with fields for save options (prefabsToSave, entities, empty, overwrite, clearSupport), browser search, and prefab UUID.

## See Also

- [PrefabEditorExitConfirmPage](PrefabEditorExitConfirmPage.md)
- [PrefabEditorLoadSettingsPage](PrefabEditorLoadSettingsPage.md)
