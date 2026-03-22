---
title: "PrefabLoadingState"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.PrefabLoadingState"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "prefab-editor"
  - "loading"
  - "progress"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor`

```java
public class PrefabLoadingState
```

Tracks the progress of a prefab loading operation through multiple phases. Provides progress percentage calculation, status messages with translatable keys, error accumulation, and timing information. Used by both the loading and cancellation workflows to report state to the UI.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `setTotalPrefabs(int)` | `void` | Sets the total number of prefabs to load. |
| `setPhase(Phase)` | `void` | Advances to a new loading phase. |
| `onPrefabLoaded(Path)` | `void` | Records that a prefab file was loaded. |
| `onPrefabPasted(Path)` | `void` | Records that a prefab was pasted into the world. |
| `addError(String)` | `void` | Adds an error with a translation key. |
| `addError(String, String)` | `void` | Adds an error with details. |
| `getCurrentPhase()` | `Phase` | Returns the current phase. |
| `getProgressPercentage()` | `float` | Returns progress [0.0, 1.0] based on phase and prefab counts. |
| `getStatusMessage()` | `Message` | Returns a translatable status message for the current phase. |
| `hasErrors()` | `boolean` | Whether any errors have been recorded. |
| `getErrors()` | `List<LoadingError>` | Returns all errors. |
| `isShuttingDown()` | `boolean` | Whether in a cancellation/shutdown phase. |
| `isShutdownComplete()` | `boolean` | Whether shutdown is complete. |
| `markComplete()` | `void` | Sets the phase to COMPLETE. |
| `getElapsedTimeMillis()` | `long` | Returns elapsed time since loading started. |

## Inner Types

### Phase (enum)

Loading phases with associated translation keys.

| Constant | Description |
|---|---|
| `INITIALIZING` | Initial setup. |
| `CREATING_WORLD` | Creating the editor world. |
| `LOADING_PREFABS` | Loading prefab files from disk. |
| `PASTING_PREFABS` | Pasting prefabs into the world. |
| `FINALIZING` | Finalizing the session. |
| `COMPLETE` | Loading complete. |
| `ERROR` | An error occurred. |
| `CANCELLING` | User-initiated cancellation. |
| `SHUTTING_DOWN_WORLD` | Shutting down the editor world. |
| `DELETING_WORLD` | Deleting the editor world files. |
| `SHUTDOWN_COMPLETE` | Cancellation complete. |

### LoadingError (record)

| Field | Type | Description |
|---|---|---|
| `translationKey` | `String` | Localization key for the error. |
| `details` | `String` | Additional details, or null. |

## See Also

- [PrefabEditSessionManager](PrefabEditSessionManager.md)
