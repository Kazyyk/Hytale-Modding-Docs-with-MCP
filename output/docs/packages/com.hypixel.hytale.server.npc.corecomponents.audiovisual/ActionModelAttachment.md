---
title: "ActionModelAttachment"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.audiovisual"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.ActionModelAttachment"
api_surface: false
extends: "ActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "audiovisual"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.audiovisual`

```java
public class ActionModelAttachment extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull protected final` | `String` | `slot` |
| `@Nonnull protected final` | `String` | `attachment` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ActionModelAttachment(@Nonnull BuilderActionModelAttachment builder, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `private static` | `void` | `setModelAttachment(@Nonnull Ref<EntityStore> ref, @Nonnull String slot, @Nullable String attachment, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
