---
title: "BuilderActionNotify"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.builders.BuilderActionNotify"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "corecomponents"
  - "entity"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity.builders`

```java
public class BuilderActionNotify extends BuilderActionBase
```

NPC action builder: Directly notifies a target NPC with a beacon message.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `double` | `expirationTime` |
| `protected` | `String` | `usedTargetSlot` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `void` | `registerTags(@Nonnull Set<String> tags)` |
| `@Nonnull public` | `Action` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `ActionNotify(this, builderSupport)` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `` | `public String` | `getMessage(@Nonnull BuilderSupport support)` |
| `` | `public double` | `getExpirationTime()` |
| `` | `public int` | `getUsedTargetSlot(@Nonnull BuilderSupport support)` |
