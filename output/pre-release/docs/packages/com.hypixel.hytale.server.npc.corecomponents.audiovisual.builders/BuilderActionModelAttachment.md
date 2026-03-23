---
title: "BuilderActionModelAttachment"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders.BuilderActionModelAttachment"
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
public class BuilderActionModelAttachment extends BuilderActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `StringHolder` | `slot` |
| `protected final` | `StringHolder` | `attachment` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionModelAttachment` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull public` | `BuilderActionModelAttachment` | `readConfig(@Nonnull JsonElement data)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `public` | `String` | `getSlot(@Nonnull BuilderSupport support)` |
| `public` | `String` | `getAttachment(@Nonnull BuilderSupport support)` |
