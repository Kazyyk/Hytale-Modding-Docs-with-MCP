---
title: "IAttitudeProvider"
kind: "interface"
package: "com.hypixel.hytale.server.npc.blackboard.view.attitude"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.attitude.IAttitudeProvider"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "blackboard"
  - "view"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.attitude`

```java
public interface IAttitudeProvider
```

Defines the contract for IAttitudeProvider operations. Determines the attitude of one entity toward another based on role context.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `static final` | `int` | `OVERRIDE_PRIORITY` | `0` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `Attitude` | `getAttitude(@Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nonnull Ref<EntityStore> var3, @Nonnull ComponentAccessor<EntityStore> var4)` |
