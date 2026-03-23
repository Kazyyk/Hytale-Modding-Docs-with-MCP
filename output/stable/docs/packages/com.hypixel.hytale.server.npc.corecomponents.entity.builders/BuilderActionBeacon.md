---
title: "BuilderActionBeacon"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.builders.BuilderActionBeacon"
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
public class BuilderActionBeacon extends BuilderActionBase
```

NPC action builder: Send Beacon Message.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `double` | `range` |
| `protected` | `double` | `expirationTime` |
| `protected` | `int` | `sendCount` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionBeacon` | `build(@Nonnull BuilderSupport builderSupport)` |
| `` | `return new` | `ActionBeacon(this, builderSupport)` |
| `@Override public` | `String` | `getShortDescription()` |
| `@Override public` | `String` | `getLongDescription()` |
| `@Override public` | `void` | `registerTags(@Nonnull Set<String> tags)` |
| `@Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `` | `public String` | `getMessage(@Nonnull BuilderSupport support)` |
| `` | `public double` | `getRange()` |
| `` | `public int[]` | `getTargetGroups(@Nonnull BuilderSupport support)` |
| `` | `public double` | `getExpirationTime()` |
| `` | `public int` | `getSendCount()` |
| `` | `public int` | `getTargetToSendSlot(@Nonnull BuilderSupport support)` |
