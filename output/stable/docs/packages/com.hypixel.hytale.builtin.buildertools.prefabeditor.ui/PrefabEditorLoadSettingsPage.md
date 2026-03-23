---
title: "PrefabEditorLoadSettingsPage"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor.ui"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.ui.PrefabEditorLoadSettingsPage"
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
public class PrefabEditorLoadSettingsPage extends InteractiveCustomUIPage<PrefabEditorLoadSettingsPage.PageData>
```

Full-featured custom UI page for configuring and initiating a prefab editing session. Provides dropdowns for root directory, world generation type, environment, stacking axis, alignment method, and row split mode. Includes an integrated file browser supporting both asset pack virtual paths and filesystem paths, a saved configurations system, and a loading progress overlay with cancel support.

## Fields

| Field | Type | Description |
|---|---|---|
| `savedConfigsDropdown` | `List<DropdownEntryInfo>` | Dropdown entries for saved configuration presets. |
| `isLoading` | `boolean` | Whether a prefab load operation is in progress. |
| `loadingCancelled` | `boolean` | Whether the current load was cancelled by the user. |
| `isShuttingDown` | `boolean` | Whether a cancellation shutdown is in progress. |
| `currentLoadingState` | `PrefabLoadingState` | Current loading progress state. |
| `browserRoot` | `Path` | Root directory for the file browser. |
| `browserCurrent` | `Path` | Current directory within the browser. |
| `selectedItems` | `List<String>` | List of selected items for multi-select loading. |
| `assetProvider` | `AssetPrefabFileProvider` | Asset pack file provider for browsing. |

## Constructor

```java
public PrefabEditorLoadSettingsPage(@Nonnull PlayerRef playerRef)
```

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(Ref<EntityStore>, UICommandBuilder, UIEventBuilder, Store<EntityStore>)` | `void` | Builds the complete settings form, browser, and loading overlays. |
| `handleDataEvent(Ref<EntityStore>, Store<EntityStore>, PageData)` | `void` | Routes UI events to the appropriate handler: Load, Cancel, SavePropertiesConfig, ApplySavedProperties, CancelLoading, OpenBrowser, BrowserNavigate, BrowserSearch, ConfirmBrowser, and others. |

## Inner Types

### Action (enum)

All possible UI actions for this page.

| Constant | Description |
|---|---|
| `Load` | Begin loading prefabs with current settings. |
| `OpenSavePropertiesDialog` | Open the save-properties sub-page. |
| `CancelSavePropertiesDialog` | Close the save-properties sub-page. |
| `SavePropertiesConfig` | Persist current settings as a named configuration. |
| `ApplySavedProperties` | Apply a previously saved configuration. |
| `Cancel` | Close the page without loading. |
| `CancelLoading` | Cancel an in-progress load operation. |
| `SavePropertiesNameChanged` | Enables/disables save button based on name input. |
| `OpenBrowser` | Open the file browser overlay. |
| `BrowserNavigate` | Navigate into a directory or select a file. |
| `BrowserRootChanged` | Switch the browser root directory. |
| `BrowserSearch` | Filter browser entries by search query. |
| `AddFolderToList` | Add the current browser path to the selection list. |
| `ConfirmBrowser` | Apply browser selection and return to main form. |
| `CancelBrowser` | Close the browser without applying selection. |

### PageData (class)

Codec-backed data class containing all form fields (root directory, prefab paths, Y level, blocks between prefabs, world gen type, environment, grass tint, stacking axis, alignment, row split mode, recursive, children, entities, world ticking) plus browser event fields.

## See Also

- [PrefabEditorExitConfirmPage](PrefabEditorExitConfirmPage.md)
- [PrefabEditorSaveSettingsPage](PrefabEditorSaveSettingsPage.md)
