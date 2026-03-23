---
title: "InteractionTarget"
kind: "enum"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.util"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.util.InteractionTarget"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "interaction"
  - "util"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.util`

```java
public enum InteractionTarget
```

Enumeration with values: `USER`, `OWNER`, `TARGET`.

## Enum Constants

| Constant | Description |
|---|---|
| `USER` | Enumeration constant. |
| `OWNER` | Enumeration constant. |
| `TARGET` | Enumeration constant. |

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getEntity(InteractionContext ctx, Ref<EntityStore> ref)` | `Ref<EntityStore>` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `toProtocol()` | `com.hypixel.hytale.protocol.InteractionTarget` | Instance method. |
