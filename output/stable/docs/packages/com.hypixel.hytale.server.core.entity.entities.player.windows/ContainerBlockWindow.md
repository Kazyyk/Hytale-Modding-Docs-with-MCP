---
title: "ContainerBlockWindow"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.windows"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.windows.ContainerBlockWindow"
api_surface: false
extends: "BlockWindow"
implements: ["ItemContainerWindow"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "entities"
  - "player"
  - "windows"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.windows`

```java
public class ContainerBlockWindow extends BlockWindow implements ItemContainerWindow
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `JsonObject` | `windowData` |
| `private final` | `ItemContainer` | `itemContainer` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `JsonObject` | `getData()` |
| `@Override public` | `boolean` | `onOpen0(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `onClose0(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override @Nonnull public` | `ItemContainer` | `getItemContainer()` |
| `@Override public` | `void` | `handleAction(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull WindowAction action)` |
