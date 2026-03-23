---
title: "ScriptedBrushPage"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.ui"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.ui.ScriptedBrushPage"
api_surface: false
extends: "InteractiveCustomUIPage<FileBrowserEventData>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "builder-tools"
  - "ui"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes.ui`

```java
public class ScriptedBrushPage extends InteractiveCustomUIPage<FileBrowserEventData>
```

Concrete implementation extending `InteractiveCustomUIPage<FileBrowserEventData>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `browser` | `ServerFileBrowser` | final ServerFileBrowser field. |

## Constructors

| Constructor | Description |
|---|---|
| `ScriptedBrushPage(@Nonnull PlayerRef playerRef)` | Creates a new ScriptedBrushPage instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull FileBrowserEventData data)` | `void` | public method. |
| `handleBrushSelection(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull String brushName)` | `void` | private method. |
