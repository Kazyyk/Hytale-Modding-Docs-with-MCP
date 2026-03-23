---
title: "BuilderActionPlayAnimation"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders.BuilderActionPlayAnimation"
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
public class BuilderActionPlayAnimation extends BuilderActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `NPCAnimationSlot` | `slot` |
| `protected final` | `StringHolder` | `animationId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ActionPlayAnimation` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionPlayAnimation` | `readConfig(@Nonnull JsonElement data)` |
| `@Override protected` | `void` | `runLoadTimeValidationHelper0(String configName, @Nonnull NPCLoadTimeValidationHelper loadTimeValidationHelper, ExecutionContext context, List<String> errors)` |
| `public` | `NPCAnimationSlot` | `getSlot()` |
| `@Nullable public` | `String` | `getAnimationId(@Nonnull BuilderSupport support)` |
