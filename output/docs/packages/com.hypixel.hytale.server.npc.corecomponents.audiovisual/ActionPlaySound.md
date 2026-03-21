---
title: "ActionPlaySound"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.audiovisual"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.audiovisual.ActionPlaySound"
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
public class ActionPlaySound extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `int` | `soundEventIndex` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ActionPlaySound(@Nonnull BuilderActionPlaySound builderActionPlaySound, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
