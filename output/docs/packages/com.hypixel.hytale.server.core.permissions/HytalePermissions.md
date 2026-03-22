---
title: "HytalePermissions"
kind: "class"
package: "com.hypixel.hytale.server.core.permissions"
fqcn: "com.hypixel.hytale.server.core.permissions.HytalePermissions"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "permissions"
---

**Package:** `com.hypixel.hytale.server.core.permissions`

```java
public class HytalePermissions
```

Class in the permissions subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `NAMESPACE` | `String` | Static final String field. |
| `COMMAND_BASE` | `String` | Static final String field. |
| `ASSET_EDITOR` | `String` | Static final String field. |
| `ASSET_EDITOR_PACKS_CREATE` | `String` | Static final String field. |
| `ASSET_EDITOR_PACKS_EDIT` | `String` | Static final String field. |
| `ASSET_EDITOR_PACKS_DELETE` | `String` | Static final String field. |
| `BUILDER_TOOLS_EDITOR` | `String` | Static final String field. |
| `EDITOR_BRUSH_USE` | `String` | Static final String field. |
| `EDITOR_BRUSH_CONFIG` | `String` | Static final String field. |
| `EDITOR_PREFAB_USE` | `String` | Static final String field. |
| `EDITOR_PREFAB_MANAGE` | `String` | Static final String field. |
| `EDITOR_SELECTION_USE` | `String` | Static final String field. |
| `EDITOR_SELECTION_CLIPBOARD` | `String` | Static final String field. |
| `EDITOR_SELECTION_MODIFY` | `String` | Static final String field. |
| `EDITOR_HISTORY` | `String` | Static final String field. |
| `FLY_CAM` | `String` | Static final String field. |
| `WORLD_MAP_COORDINATE_TELEPORT` | `String` | Static final String field. |
| `WORLD_MAP_MARKER_TELEPORT` | `String` | Static final String field. |
| `UPDATE_NOTIFY` | `String` | Static final String field. |
| `MODS_OUTDATED_NOTIFY` | `String` | Static final String field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `fromCommand(@Nonnull String name)` | `String` | static public method. |
| `fromCommand(@Nonnull String name, @Nonnull String subCommand)` | `String` | static public method. |
