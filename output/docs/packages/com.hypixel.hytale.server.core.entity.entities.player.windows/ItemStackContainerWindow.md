---
title: "ItemStackContainerWindow"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.windows"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.windows.ItemStackContainerWindow"
api_surface: false
extends: "Window"
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
public class ItemStackContainerWindow extends Window implements ItemContainerWindow
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `JsonObject` | `windowData` |
| `private final` | `ItemStackItemContainer` | `itemStackItemContainer` |
| `private` | `EventRegistration` | `eventRegistration` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `JsonObject` | `getData()` |
| `@Override public` | `boolean` | `onOpen0(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `onClose0(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override @Nonnull public` | `ItemContainer` | `getItemContainer()` |
