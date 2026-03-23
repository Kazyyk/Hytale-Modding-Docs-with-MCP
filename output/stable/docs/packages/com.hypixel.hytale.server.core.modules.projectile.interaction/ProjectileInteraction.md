---
title: "ProjectileInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.projectile.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.interaction.ProjectileInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: ["BallisticDataProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "projectile"
  - "interaction"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile.interaction`

```java
public class ProjectileInteraction extends SimpleInstantInteraction implements BallisticDataProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ProjectileInteraction>` | `CODEC` |
| `protected` | `String` | `config` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `ProjectileConfig` | `getConfig()` |
| `@Nullable @Override public` | `BallisticData` | `getBallisticData()` |
| `@Nonnull @Override public` | `WaitForDataFrom` | `getWaitForDataFrom()` |
| `@Override public` | `boolean` | `needsRemoteSync()` |
| `@Override protected` | `void` | `firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)` |
| `@Override protected` | `void` | `simulateFirstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)` |
| `@Nonnull @Override protected` | `Interaction` | `generatePacket()` |
| `@Override protected` | `void` | `configurePacket(Interaction packet)` |
