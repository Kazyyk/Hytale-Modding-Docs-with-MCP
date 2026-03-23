---
title: "ParticleSpawnCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.particle.commands"
fqcn: "com.hypixel.hytale.server.core.asset.type.particle.commands.ParticleSpawnCommand"
api_surface: false
extends: "AbstractTargetPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "particle"
  - "commands"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.particle.commands`

```java
public class ParticleSpawnCommand extends AbstractTargetPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `RequiredArg<ParticleSystem>` | `particleSystemArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)` |

## Inner Types

- `ParticleSpawnCommand.ParticleSpawnPageCommand`
