---
title: "BuilderActionPlaySound"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders.BuilderActionPlaySound"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "audiovisual"
  - "builders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders`

```java
public class BuilderActionPlaySound extends BuilderActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `AssetHolder` | `soundEventId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionPlaySound` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionPlaySound` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `String` | `getSoundEventId(@Nonnull BuilderSupport support)` |
| `public` | `int` | `getSoundEventIndex(@Nonnull BuilderSupport support)` |
