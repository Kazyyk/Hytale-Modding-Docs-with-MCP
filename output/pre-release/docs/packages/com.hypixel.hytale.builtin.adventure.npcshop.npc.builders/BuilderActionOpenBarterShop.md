---
title: "BuilderActionOpenBarterShop"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcshop.npc.builders"
fqcn: "com.hypixel.hytale.builtin.adventure.npcshop.npc.builders.BuilderActionOpenBarterShop"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcshop"
  - "npc"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcshop.npc.builders`

```java
public class BuilderActionOpenBarterShop extends BuilderActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `AssetHolder` | `shopId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull public` | `Action` | `build(BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionOpenBarterShop` | `readConfig(JsonElement data)` |
| `public` | `String` | `getShopId(BuilderSupport support)` |
