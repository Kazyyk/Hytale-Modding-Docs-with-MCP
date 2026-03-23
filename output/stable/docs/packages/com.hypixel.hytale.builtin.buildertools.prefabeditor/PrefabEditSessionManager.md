---
title: "PrefabEditSessionManager"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.PrefabEditSessionManager"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "prefab-editor"
  - "session"
  - "manager"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor`

```java
public class PrefabEditSessionManager
```

Manages the lifecycle of prefab edit sessions. Handles creating editor worlds (flat or void generation), loading prefab files, pasting them into the world, teleporting the player, providing the prefab selector tool, and cleanup on cancellation. Listens to `AddPlayerToWorldEvent` and `PlayerReadyEvent` to manage post-teleport setup. Tracks active sessions, in-progress loads, and which prefab files are currently being edited (to prevent concurrent edits).

## Constants

| Field | Type | Value | Description |
|---|---|---|---|
| `NOON_TIME` | `float` | `0.5F` | Noon time fraction for editor worlds. |
| `DEFAULT_NEW_WORLD_ZERO_COORDINATE_BLOCK_NAME` | `String` | `"Rock_Stone"` | Block used at origin in flat editor worlds. |
| `DEFAULT_ENVIRONMENT` | `String` | `"Zone1_Sunny"` | Default environment for editor worlds. |
| `DEFAULT_CHUNK_ENVIRONMENT` | `String` | `"Env_Zone1_Plains"` | Default chunk environment. |
| `PREFAB_EDITING_WORLD_NAME_PREFIX` | `String` | `"prefabEditor-"` | World name prefix for editor worlds. |
| `DEFAULT_GRASS_TINT_HEX` | `String` | `"#5B9E28"` | Default grass tint hex color. |

## Key Methods

| Method | Return Type | Description |
|---|---|---|
| `isEditingAPrefab(UUID)` | `boolean` | Whether the player has an active edit session. |
| `getPrefabEditSession(UUID)` | `PrefabEditSession` | Returns the active session for a player. |
| `getActiveEditSessions()` | `Map<UUID, PrefabEditSession>` | Returns all active sessions. |
| `loadPrefabAndCreateEditSession(Ref, Player, PrefabEditorCreationSettings, Store, Consumer)` | `CompletableFuture<Void>` | Creates an editor world, loads and pastes prefabs, and teleports the player. |
| `exitEditSession(Ref, World, PlayerRef, Store)` | `void` | Exits a session, returning the player to their original world. |
| `cleanupCancelledSession(UUID, String, Consumer)` | `CompletableFuture<Void>` | Cleans up a cancelled loading session. |
| `updatePathOfLoadedPrefab(Path, Path)` | `void` | Updates tracking when a prefab file is renamed. |
| `populateActiveEditSession(UUID, PrefabEditSession)` | `void` | Restores a session from deserialization. |
| `populatePrefabsBeingEdited(Path)` | `void` | Marks a prefab file as being edited. |
| `scheduleAnchorEntityRecreation(PrefabEditSession)` | `void` | Schedules anchor entity recreation after deserialization. |

## See Also

- [PrefabEditSession](PrefabEditSession.md)
- [PrefabEditorCreationSettings](PrefabEditorCreationSettings.md)
- [PrefabLoadingState](PrefabLoadingState.md)
