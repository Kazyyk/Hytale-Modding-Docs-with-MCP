---
title: "BuilderActionAppearance"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders.BuilderActionAppearance"
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
public class BuilderActionAppearance extends BuilderActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `appearance` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionAppearance` | `build(BuilderSupport builderSupport)` |
| `@Nonnull public` | `BuilderActionAppearance` | `readConfig(@Nonnull JsonElement data)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `public` | `String` | `getAppearance()` |
